import java.util.Scanner;
import java.util.UUID;

public class Cliente {

    private long saldo = 0;
    private String nome;
    private String senha;
    private UUID uuid;
    private boolean logado = false;


    void registrarCliente(Scanner scanner) {
        System.out.println("Digite seu nome: ");
        this.nome = scanner.next();

        System.out.println("Digite seu senha: ");
        this.senha = scanner.next();

        this.uuid = UUID.randomUUID();

        System.out.println("Registrado com sucesso. Bem vindo " + nome);

    }
    void depositar(long valor){
        this.saldo += valor;
        System.out.println("Deposito concluído! Novo saldo: " + this.saldo);
    }
    boolean sacar(long valor){
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
