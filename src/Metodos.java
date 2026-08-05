import java.util.Scanner;

public class Metodos {

    public static void login(Cliente cliente){
        if(cliente.getNome() == null){
            throw new RuntimeException("Cadastre-se primeiro!");
        }else{
            cliente.setLogado(true);
        }
    }
    public static void mostrarSaldo(Cliente cliente){
        if(!Verificacao.verificarLogin(cliente));
        System.out.println("Seu saldo é: " + cliente.getSaldo());
    }
    public static void depositar(Cliente cliente){
        Scanner scanner = new Scanner(System.in);
        if(!Verificacao.verificarLogin(cliente)) {
            throw new RuntimeException("Failed auth");
        }else{
            System.out.println("Quanto deseja depositar? ");
            long deposito = scanner.nextLong();
            cliente.depositar(deposito);
        }
    }
    public static void sacar(Cliente cliente){
        Scanner scanner = new Scanner(System.in);
        if(!Verificacao.verificarLogin(cliente)){
            throw new RuntimeException("Failed saque");
        }
        System.out.println("Quanto deseja sacar? ");
        long saque = scanner.nextLong();
        cliente.sacar(saque);
    }
}
