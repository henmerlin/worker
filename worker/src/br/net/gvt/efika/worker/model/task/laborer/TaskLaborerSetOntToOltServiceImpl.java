/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.model.task.laborer;

import br.net.gvt.efika.worker.dao.factory.FactoryDAO;
import br.net.gvt.efika.worker.io.swagger.model.GenericRequest;
import br.net.gvt.efika.worker.util.JacksonMapper;
import fulltest.ValidacaoResult;
import java.util.List;
import model.dto.input.CertiticationInput;
import model.dto.input.SetOntToOltInput;
import model.dto.output.OntsDispResponse;
import model.dto.output.SetOntToOltResponse;
import model.dto.task.QueueTaskDTO;
import model.enuns.TaskResultState;
import telecom.properties.gpon.SerialOntGpon;

public class TaskLaborerSetOntToOltServiceImpl extends TaskLaborerAbstract {

    public TaskLaborerSetOntToOltServiceImpl(QueueTaskDTO task) {
        super(task);
    }

    @Override
    public void processar() {
        SetOntToOltInput input = (SetOntToOltInput) task.getInput();
        GenericRequest req = new GenericRequest(input.getSerial(), input.getCustomer(), task.getExecutor());
        SetOntToOltResponse resp = new SetOntToOltResponse();

        try {
            ValidacaoResult cert = FactoryDAO.newCustomerDAO().setOntToOlt(req);

            resp.setSerial((SerialOntGpon) cert.getResult());
            resp.setState(TaskResultState.OK);
        } catch (Exception e) {
            resp.setState(TaskResultState.EXCEPTION);
            resp.setExceptionMessage(e.getMessage());
        } finally {
            this.task.setOutput(resp);
        }
    }

}
