/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

import br.net.gvt.efika.worker.model.factory.FactoryService;

/**
 *
 * @author G0042204
 */
public class Worker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryService.createTasksConsumerService().consume();
    }

}
