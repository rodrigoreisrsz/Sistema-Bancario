import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        while (true) {
            Menu.mostrarMenu();
            int resposta = scanner.nextInt();
            if (resposta < 1 || resposta > 6) {
                System.out.println("Opção invalida");
            }
            switch (resposta) {
                case 1:
                    cliente.registrarCliente(scanner);
                    break;
                case 2:
                    Metodos.login(cliente);
                    Autenticacao.fazerLogin(scanner, cliente.getNome(), cliente.getSenha());
                    break;
                case 3:
                    Metodos.mostrarSaldo(cliente);
                    break;
                case 4:
                    Metodos.depositar(cliente);
                    break;
                case 5:
                    Metodos.sacar(cliente);
                    break;
                case 6:
                    System.out.println("Volte sempre!");
                    break;
            }if(resposta == 6){
                break;
            }
        }
    }
}
