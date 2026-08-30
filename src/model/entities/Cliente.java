package model.entities;

import exceptions.LoginInvalidoException;

import java.util.Scanner;
import java.util.UUID;

public class Cliente {

    private long saldo = 0;
    private String nome;
    private String senha;
    private UUID uuid;
    private boolean logado = false;


   public void registrarCliente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.uuid = uuid.randomUUID();

    }

    public void login(String nome, String senha) {
       if(getNome() == null || getSenha() == null){
           throw new LoginInvalidoException("Login invalido");
       }
        if (!nome.equals(getNome()) || !senha.equals(getSenha())) {
            throw new LoginInvalidoException("Login invalido");
        }
        else{
            this.logado = true;
            System.out.println("Login efetuado.");
        }

    }
    public void depositar(long valor){
        this.saldo += valor;
        System.out.println("Deposito concluído! Novo saldo: " + this.saldo);
    }
    public boolean sacar(long valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente!");
            return false;
        }
        this.saldo -= valor;
        System.out.println("Saque efetuado! Novo saldo: " + this.saldo);
        return true;

    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}
