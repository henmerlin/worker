/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import br.net.gvt.efika.worker.model.task.TasksConsumerServiceImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class TasksConsumerServiceImplIT {
    
    public TasksConsumerServiceImplIT() {
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
     * Test of consume method, of class TasksConsumerServiceImpl.
     */
    @Test
    public void testConsume() {
        TasksConsumerServiceImpl instance = new TasksConsumerServiceImpl();
        instance.consume();
    }
    
}
