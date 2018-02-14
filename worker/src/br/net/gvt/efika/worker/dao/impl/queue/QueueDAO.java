/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.dao.impl.queue;

import model.dto.task.PendingTasksResponseDTO;
import model.dto.task.QueueTaskDTO;

/**
 *
 * @author G0042204
 */
public interface QueueDAO {

    public PendingTasksResponseDTO consumePendingTasks() throws Exception;

    public QueueTaskDTO completeTask(QueueTaskDTO task) throws Exception;

}
