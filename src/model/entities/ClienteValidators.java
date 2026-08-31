package model.entities;

import exceptions.CadstroException;

public class ClienteValidators {
    public void validateNome(Cliente cliente){
        int caracteres = 3;
        if(cliente.getNome().isEmpty() || (cliente.getNome().length() < caracteres)){
            throw new CadstroException("Caracteres insuficientes.");
        }
    }
}
