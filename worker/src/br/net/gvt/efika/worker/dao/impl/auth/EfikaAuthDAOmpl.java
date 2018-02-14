/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.worker.dao.impl.auth;

import br.net.gvt.efika.worker.dao.factory.FactoryDAO;
import br.net.gvt.efika.worker.dao.http.Urls;
import java.nio.charset.Charset;
import model.dto.input.AuthInput;
import br.net.gvt.efika.worker.util.JacksonMapper;

public class EfikaAuthDAOmpl implements EfikaAuthDAO {

    @Override
    public Boolean verificarCredenciais(AuthInput cred) throws Exception {
        try {
            VerificarCredencialRequest req = new VerificarCredencialRequest();
            req.setLogin(cred.getLogin());
            req.setSenha(cred.getSenha());
            return (Boolean) FactoryDAO.createHttpBooleanDAO().post(Urls.AUTH.getValor(), req);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao consultar Serviço de Autenticação.");
        }

    }

}
