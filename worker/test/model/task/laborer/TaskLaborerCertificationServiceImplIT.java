/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.task.laborer;

import br.net.gvt.efika.worker.model.task.laborer.TaskLaborerCertificationServiceImpl;
import model.dto.task.QueueTaskDTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import br.net.gvt.efika.worker.util.JacksonMapper;

/**
 *
 * @author G0041775
 */
public class TaskLaborerCertificationServiceImplIT {

    public TaskLaborerCertificationServiceImplIT() {
    }

    @BeforeClass
    public static void setUpClass() {
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
     * Test of processar method, of class TaskLaborerCertificationServiceImpl.
     */
    @Test
    public void testProcessar() throws Exception {
        System.out.println("processar");
        QueueTaskDTO t;
        t = (QueueTaskDTO) new JacksonMapper(QueueTaskDTO.class).deserialize("{  \n"
                + "   \"task\":\"CERTIFICATION\",\n"
                + "   \"input\":{  \n"
                + "      \"type\":\"certification\",\n"
                + "      \"instancia\":\"4133335556\"\n"
                + "   },\n"
                + "   \"executor\":\"G0041775\"\n"
                + "}");
        TaskLaborerCertificationServiceImpl instance = new TaskLaborerCertificationServiceImpl(t);
        instance.processar();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
