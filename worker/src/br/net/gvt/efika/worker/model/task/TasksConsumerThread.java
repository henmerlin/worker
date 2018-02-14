/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.model.task;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.task.QueueTaskDTO;
import br.net.gvt.efika.worker.model.factory.LaborerServiceFactory;

/**
 *
 * @author G0042204
 */
public class TasksConsumerThread implements Runnable {

    private QueueTaskDTO task;

    public TasksConsumerThread(QueueTaskDTO task) {
        this.task = task;
    }

    @Override
    public void run() {
        try {
            LaborerServiceFactory.create(task).executar();
        } catch (Exception ex) {
            Logger.getLogger(TasksConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
