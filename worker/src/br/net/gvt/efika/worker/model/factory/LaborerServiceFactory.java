/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.model.factory;

import model.dto.task.QueueTaskDTO;
import model.enuns.TasksEnum;
import br.net.gvt.efika.worker.model.task.laborer.TaskLaborerAuthServiceImpl;
import br.net.gvt.efika.worker.model.task.laborer.TaskLaborerCadastroServiceImpl;
import br.net.gvt.efika.worker.model.task.laborer.TaskLaborerCertificationServiceImpl;
import br.net.gvt.efika.worker.model.task.laborer.TaskLaborerConfRedeServiceImpl;
import br.net.gvt.efika.worker.model.task.laborer.TaskLaborerOntsDispServiceImpl;
import br.net.gvt.efika.worker.model.task.laborer.TaskLaborerService;
import br.net.gvt.efika.worker.model.task.laborer.TaskLaborerSetOntToOltServiceImpl;

/**
 *
 * @author G0042204
 */
public class LaborerServiceFactory {

    public static TaskLaborerService create(QueueTaskDTO task) throws Exception {

        if (task.getTask() == TasksEnum.AUTH) {
            return new TaskLaborerAuthServiceImpl(task);
        }
        if (task.getTask() == TasksEnum.CERTIFICATION) {
            return new TaskLaborerCertificationServiceImpl(task);
        }
        if (task.getTask() == TasksEnum.CADASTRO) {
            return new TaskLaborerCadastroServiceImpl(task);
        }
        if (task.getTask() == TasksEnum.CONF_REDE) {
            return new TaskLaborerConfRedeServiceImpl(task);
        }
        if (task.getTask() == TasksEnum.ONTS_DISP) {
            return new TaskLaborerOntsDispServiceImpl(task);
        }
        if (task.getTask() == TasksEnum.SET_ONT) {
            return new TaskLaborerSetOntToOltServiceImpl(task);
        }

        throw new Exception("Tarefa não implementada.");
    }

}
