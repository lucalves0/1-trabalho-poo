/*package menus;

import pessoas.*;
import java.util.Scanner;

public class MenuInicial {
    public void menuPrincipal(Medico MED, Secretaria SEC){
        String opcao;
        boolean retornado = true;
        
        // MenuSecretaria menuSec = new MenuSecretaria();
        MenusMedico menuMed = new MenusMedico();
        MenuMensagens menuMsg = new MenuMensagens();
        
        Scanner entrada = new Scanner(System.in);
        while (retornado){
            System.out.println("+------------------------------------+");
            System.out.println("|         CLINICA PURA SAUDE         |");
            System.out.println("+------------------------------------+");
            System.out.println("|Deseja logar em qual sistema:       |");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Secretaria                      |");
            System.out.println("|(2) Consultorio medico              |");
            System.out.println("|(3) Gerenciamento de Mensagens      |");
            System.out.println("|                                    |");
            System.out.println("|(0) Sair do menu (encerrar programa)|");
            System.out.println("+------------------------------------+");
            System.out.print(">>> ");
            opcao = entrada.nextLine();
            
            switch (opcao) {
                // case "1" -> menuSec.menuPrincipal(SEC);
                case "2" -> menuMed.menuPrincipal(MED);
                case "3" -> menuMsg.menuPrincipal();
                case "0" -> retornado = false;
                default -> System.out.println("Acao nao encontrada!"); 

            }
        }
    }
}
*/