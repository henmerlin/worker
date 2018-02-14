/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import br.net.gvt.efika.worker.util.JacksonMapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class JacksonMapperIT {

    public JacksonMapperIT() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of deserialize method, of class JacksonMapper.
     */
    @Test
    public void testDeserialize() throws Exception {
        System.out.println("deserialize");
        String string = "{\"teste\": \"oi\"}";
        JacksonMapper<Teste> instance = new JacksonMapper(Teste.class);
        Teste expResult = new Teste("oi");
        Object result = instance.deserialize(string);
        assertEquals(expResult, result);
    }

    /**
     * Test of serialize method, of class JacksonMapper.
     */
    @Test
    public void testSerialize() throws Exception {
        System.out.println("serialize");
        JacksonMapper<Teste> instance = new JacksonMapper(Teste.class);
        Teste expResult = new Teste("oi");
        String result = instance.serialize(expResult);
        System.out.println("result:" + result);
        System.out.println(!result.isEmpty());
    }

}
