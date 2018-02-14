/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.model.factory;

import br.net.gvt.efika.worker.model.task.TasksConsumerService;
import br.net.gvt.efika.worker.model.task.TasksConsumerServiceImpl;

/**
 *
 * @author G0042204
 */
public class FactoryService {

    public static TasksConsumerService createTasksConsumerService() {
        return new TasksConsumerServiceImpl();
    }
//    
//    public static TaskLaborerService createTaskLaborerService(){
//        return new TaskLaborerFulltestServiceImpl();
//    }

}
