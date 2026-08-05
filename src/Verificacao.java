public class Verificacao {
    static boolean verificarLogin(Cliente cliente){
        if(cliente.isLogado() == false){
            System.out.println("Efetue o login primeiro!");
            return false;
            
        }
        return true;
    }
}
