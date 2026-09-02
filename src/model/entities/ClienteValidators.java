package model.entities;

import exceptions.CadstroException;
import exceptions.LoginInvalidoException;

public class ClienteValidators {
    private Cliente cliente;

    public void validateNome(String nome){
        int caracteres = 3;
        if(nome.isEmpty() || (nome.length() < caracteres)){
            throw new CadstroException("Caracteres insuficientes.");
        }
    }
    public void validateLogin(String nomeLogin, String senhaLogin) {
        if (nomeLogin == null || senhaLogin == null) {
            throw new LoginInvalidoException("Login invalido");
        }
        if(nomeLogin != cliente.getNome() || senhaLogin != cliente.getSenha()){
            throw new LoginInvalidoException("Login invalido");
        }
    }


}
