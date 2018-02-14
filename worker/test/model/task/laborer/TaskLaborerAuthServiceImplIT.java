/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.task.laborer;

import br.net.gvt.efika.worker.model.task.laborer.TaskLaborerAuthServiceImpl;
import mock.QueueTaskMock;
import model.dto.task.QueueTaskDTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class TaskLaborerAuthServiceImplIT {
    
    public TaskLaborerAuthServiceImplIT() {
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
     * Test of processar method, of class TaskLaborerAuthServiceImpl.
     */
    @Test
    public void testExecutar() {
        System.out.println("executar");
        TaskLaborerAuthServiceImpl instance = new TaskLaborerAuthServiceImpl(QueueTaskMock.mock());
        QueueTaskDTO executar = instance.executar();
        System.out.println("end");
    }
    
}
