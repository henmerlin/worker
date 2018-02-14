/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.model.task.laborer;

import br.net.gvt.efika.worker.dao.factory.FactoryDAO;
import model.dto.task.QueueTaskDTO;
import br.net.gvt.efika.worker.model.entity.QueueTaskMirror;

/**
 *
 * @author G0042204
 */
public abstract class TaskLaborerAbstract implements TaskLaborerService {

    protected QueueTaskDTO task;

    public TaskLaborerAbstract(QueueTaskDTO task) {
        this.task = task;
    }

    public void finalizar() {
        try {
            FactoryDAO.createQueueDAOMirrorImpl().save(new QueueTaskMirror(FactoryDAO.createQueueDAO().completeTask(this.task)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract void processar();

    @Override
    public QueueTaskDTO executar() {
        this.processar();
        this.finalizar();
        return this.task;
    }

}
