/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.model.entity;

import model.dto.task.QueueTaskDTO;
import org.mongodb.morphia.annotations.Entity;

/**
 *
 * @author G0042204
 */
@Entity("queue_task_mirror")
public class QueueTaskMirror{
    
    private QueueTaskDTO task;

    public QueueTaskMirror() {
    }

    public QueueTaskMirror(QueueTaskDTO task) {
        this.task = task;
    }

    public QueueTaskDTO getTask() {
        return task;
    }

    public void setTask(QueueTaskDTO task) {
        this.task = task;
    }
    
    
    
    
    
}
