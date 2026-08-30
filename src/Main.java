import exceptions.CadstroException;
import exceptions.LoginInvalidoException;

import model.entities.Cliente;
import model.entities.Cliente;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        while(true){
            Menu.mostrarMenu();
            System.out.println("Digite a opção: ");
            int opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    try {
                        scanner.nextLine();
                        System.out.println("Digite o nome: ");
                        String nome = scanner.nextLine();
                        System.out.println("Digite a senha: ");
                        String senha = scanner.nextLine();
                        cliente.registrarCliente(nome, senha);
                        System.out.println("Registrado com sucesso. Bem vindo " + nome);
                        break;
                    }catch (CadstroException e){
                        System.out.println("Erro: " + e.getMessage() + " tente novamente.");
                        break;
                    }

                case 2:
                    try {
                        scanner.nextLine();
                        System.out.println("Digite o nome: ");
                        String nomeLogin = scanner.nextLine();
                        System.out.println("Digite a senha: ");
                        String senhaLogin = scanner.nextLine();
                        cliente.login(nomeLogin, senhaLogin);
                        break;
                    } catch (LoginInvalidoException e) {
                        System.out.println("Erro: " + e.getMessage() + " tente novamente.");
                        break;
                    }
                case 3:
            }
        }



    }
}
