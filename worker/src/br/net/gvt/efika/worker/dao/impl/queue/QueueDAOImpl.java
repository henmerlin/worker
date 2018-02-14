/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.dao.impl.queue;

import br.net.gvt.efika.worker.dao.factory.FactoryDAO;
import br.net.gvt.efika.worker.dao.http.Urls;
import br.net.gvt.efika.worker.request.RequestFactory;
import model.dto.task.PendingTasksResponseDTO;
import model.dto.task.QueueTaskDTO;

public class QueueDAOImpl implements QueueDAO {

    @Override
    public PendingTasksResponseDTO consumePendingTasks() throws Exception {

        return (PendingTasksResponseDTO) FactoryDAO.createHttpPendingTaskResponseDAO().post(Urls.QUEUE.getValor() + "consumePendingTasks", RequestFactory.queueRequest());
    }

    @Override
    public QueueTaskDTO completeTask(QueueTaskDTO task) throws Exception {

        return (QueueTaskDTO) FactoryDAO.createHttpQueueTaskDAO().post(Urls.QUEUE_COMPLETE_TASK.getValor(), task);
    }

}
