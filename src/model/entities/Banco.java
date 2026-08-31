package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Cliente> clientes = new ArrayList<>();

    public void cadastrar(Cliente cliente){
        clientes.add(cliente);

    }
}
