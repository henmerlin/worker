/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl.auth;

import model.dto.input.AuthInput;

/**
 *
 * @author G0042204
 */
public interface EfikaAuthDAO {

    public Boolean verificarCredenciais(AuthInput cred) throws Exception;

}