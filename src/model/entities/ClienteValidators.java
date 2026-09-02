package model.entities;

import exceptions.CadstroException;
import exceptions.LoginInvalidoException;

public class ClienteValidators {
    public void validateNome(String nome){
        int caracteres = 3;
        if(nome.isEmpty() || (nome.length() < caracteres)){
            throw new CadstroException("Caracteres insuficientes.");
        }
    }
//    public void validateLogin(Cliente cliente){
//        if(cliente.getNome() == null ||  cliente.getSenha() == null){
//            throw new LoginInvalidoException("Login invalido");
//        }



}
