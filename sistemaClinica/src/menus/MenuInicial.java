/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import java.util.Scanner;

public class MenuInicial {
    public void menuPrincipal(){
        String opcao;
        boolean retornado = true;
        
        MenuSecretaria menuSec = new MenuSecretaria();
        MenusMedico menuMed = new MenusMedico();
        
        Scanner entrada = new Scanner(System.in);
        while (retornado){
            System.out.println("+------------------------------------+");
            System.out.println("|         CLÍNICA PURA SAÚDE         |");
            System.out.println("+------------------------------------+");
            System.out.println("|Deseja logar em qual sistema:       |");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Secretaria                      |");
            System.out.println("|(2) Consultório médico              |");
            System.out.println("|                                    |");
            System.out.println("|(0) Sair do menu (encerrar programa)|");
            System.out.println("+------------------------------------+");
            System.out.print(">>> ");
            opcao = entrada.next();

            switch (opcao) {
                case "1" -> retornado = menuSec.menuPrincipal();
                case "2" -> menuMed.menuPrincipal();
                case "0" -> retornado = false;
                default -> System.out.println("Ação não encontrada!"); 

            }
        }
    }
}
