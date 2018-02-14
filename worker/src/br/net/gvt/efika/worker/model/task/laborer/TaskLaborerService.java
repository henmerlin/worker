/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.model.task.laborer;

import model.dto.task.QueueTaskDTO;

/**
 *
 * @author G0041775
 */
public interface TaskLaborerService {

    public QueueTaskDTO executar() throws Exception;

}
