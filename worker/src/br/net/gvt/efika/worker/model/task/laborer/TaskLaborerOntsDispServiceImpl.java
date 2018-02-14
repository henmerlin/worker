/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.model.task.laborer;

import br.net.gvt.efika.worker.dao.factory.FactoryDAO;
import br.net.gvt.efika.worker.io.swagger.model.GenericRequest;
import br.net.gvt.efika.worker.util.JacksonMapper;
import java.util.List;
import model.dto.input.CertiticationInput;
import model.dto.output.OntsDispResponse;
import model.dto.task.QueueTaskDTO;
import model.enuns.TaskResultState;
import telecom.properties.gpon.SerialOntGpon;

public class TaskLaborerOntsDispServiceImpl extends TaskLaborerAbstract {

    public TaskLaborerOntsDispServiceImpl(QueueTaskDTO task) {
        super(task);
    }

    @Override
    public void processar() {
        CertiticationInput input = (CertiticationInput) task.getInput();
        GenericRequest req = new GenericRequest(input.getInstancia(), input.getCustomer(), task.getExecutor());
        OntsDispResponse resp = new OntsDispResponse();

        try {
            List<SerialOntGpon> cert = FactoryDAO.newCustomerDAO().getOntsDisp(req);
            try {
                System.out.println("RESP ->" + new JacksonMapper(List.class).serialize(cert));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            resp.setOnts(cert);
            resp.setState(TaskResultState.OK);
        } catch (Exception e) {
            resp.setState(TaskResultState.EXCEPTION);
            resp.setExceptionMessage(e.getMessage());
        } finally {
            this.task.setOutput(resp);
        }
    }

}
