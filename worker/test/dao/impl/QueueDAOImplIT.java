/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import br.net.gvt.efika.worker.dao.impl.queue.QueueDAOImpl;
import java.util.List;
import model.dto.task.QueueTaskDTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class QueueDAOImplIT {

    public QueueDAOImplIT() {
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
     * Test of consumePendingTasks method, of class QueueDAOImpl.
     */
    @Test
    public void testConsumePendingTasks() throws Exception {
        System.out.println("consumePendingTasks");
        QueueDAOImpl instance = new QueueDAOImpl();
        List<QueueTaskDTO> expResult = null;
        List<QueueTaskDTO> result = instance.consumePendingTasks().getTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completeTask method, of class QueueDAOImpl.
     */
    @Test
    public void testCompleteTask() throws Exception {
        System.out.println("completeTask");
        QueueTaskDTO task = null;
        QueueDAOImpl instance = new QueueDAOImpl();
        QueueTaskDTO expResult = null;
        QueueTaskDTO result = instance.completeTask(task);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
