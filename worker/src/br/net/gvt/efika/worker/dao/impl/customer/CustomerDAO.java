/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.dao.impl.customer;

import br.net.gvt.efika.model.certification.CustomerCertificationDTO;
import fulltest.ValidacaoResult;
import br.net.gvt.efika.worker.io.swagger.model.GenericRequest;
import java.util.List;
import telecom.properties.gpon.SerialOntGpon;

/**
 *
 * @author G0042204
 */
public interface CustomerDAO {

    public CustomerCertificationDTO certify(GenericRequest input) throws Exception;

    public ValidacaoResult certifyRede(GenericRequest input) throws Exception;

    public List<SerialOntGpon> getOntsDisp(GenericRequest input) throws Exception;

    public ValidacaoResult setOntToOlt(GenericRequest input) throws Exception;

}
