import exceptions.CadstroException;
import exceptions.LoginInvalidoException;

import exceptions.OperacaoInvalidaException;
import model.entities.Banco;
import model.entities.Cliente;
import model.entities.Cliente;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
       // Cliente cliente = new Cliente();

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
                        Cliente cliente = new Cliente(nome, senha);
                        banco.cadastrar(cliente);
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
                        //banco.login(nomeLogin, senhaLogin);
                        break;
                    } catch (LoginInvalidoException e) {
                        System.out.println("Erro: " + e.getMessage() + " tente novamente.");
                        break;
                    }
                case 3:
                    try{
                       // cliente.mostrarSaldo();
                        break;
                    }catch(LoginInvalidoException e){
                        System.out.println("Erro: " + e.getMessage());
                        break;
                    }
                case 4:
                    try{
                        System.out.println("Digite o valor do déposito: ");
                        double valor = scanner.nextDouble();
                        //cliente.depositar(valor);
                        break;

                    }catch(OperacaoInvalidaException e){
                        System.out.println("Erro: " + e.getMessage());
                        break;
                    }catch (LoginInvalidoException e){
                        System.out.println("Erro: " + e.getMessage());
                        break;
                    }

            }
        }



    }
}
