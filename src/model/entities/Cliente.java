package model.entities;

import exceptions.CadstroException;
import exceptions.LoginInvalidoException;
import exceptions.OperacaoInvalidaException;

import java.util.Scanner;
import java.util.UUID;

public class Cliente {
Scanner scanner = new Scanner(System.in);
    private double saldo;
    private String nome;
    private String senha;
    private UUID uuid;
    private boolean logado = false;


   public void registrarCliente(String nome, String senha) {
       int caracteres = 3;
       if(nome.isEmpty() || (nome.length() < caracteres)){
            throw new CadstroException("Caracteres insuficientes.");
       }
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
    public void mostrarSaldo(){
       if(isLogado() == false){
           throw new LoginInvalidoException("Efetue o login");
       }
       if(getSaldo() <= 0){
           System.out.println("Saldo nulo ou negativo");
       }
        System.out.println("Saldo atual: " + getSaldo());

    }

    public void depositar(){
        double valor;
       if(isLogado() != true){
           throw new LoginInvalidoException("Efetue o login");
       }else{
           System.out.println("Digite o valor do déposito: ");
           valor = scanner.nextDouble();
           if(valor <= 0){
               throw new OperacaoInvalidaException("Não é possivel depositar um valor nulo ou negativo");
           }
       }
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
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
