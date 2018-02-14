/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.model.task.laborer;

import br.net.gvt.efika.model.certification.CustomerCertificationDTO;
import br.net.gvt.efika.worker.dao.factory.FactoryDAO;
import br.net.gvt.efika.worker.io.swagger.model.GenericRequest;
import br.net.gvt.efika.worker.util.JacksonMapper;
import fulltest.ValidacaoResult;
import model.dto.input.CertiticationInput;
import model.dto.output.ConfRedeResponse;
import model.dto.task.QueueTaskDTO;
import model.enuns.TaskResultState;

public class TaskLaborerConfRedeServiceImpl extends TaskLaborerAbstract {

    public TaskLaborerConfRedeServiceImpl(QueueTaskDTO task) {
        super(task);
    }

    @Override
    public void processar() {
        CertiticationInput input = (CertiticationInput) task.getInput();
        GenericRequest req = new GenericRequest(input.getInstancia(), input.getCustomer(), task.getExecutor());
        ConfRedeResponse resp = new ConfRedeResponse();

        try {
            ValidacaoResult cert = FactoryDAO.newCustomerDAO().certifyRede(req);
            try {
                System.out.println("RESP ->" + new JacksonMapper(CustomerCertificationDTO.class).serialize(cert));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            resp.setTabRede(cert);
            resp.setState(TaskResultState.OK);
        } catch (Exception e) {
            resp.setState(TaskResultState.EXCEPTION);
            resp.setExceptionMessage(e.getMessage());
        } finally {
            this.task.setOutput(resp);
        }
    }

}
