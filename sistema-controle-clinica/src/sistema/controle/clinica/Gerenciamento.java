package sistema.controle.clinica;

import java.text.ParseException;
import java.util.Scanner;
import sistema.controle.clinica.Objects.Secretaria;

public class Gerenciamento {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws ParseException {
        Secretaria secretaria = new Secretaria();
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int acao = 0;

        System.out.print("Deseja entrar com qual tipo de usuário: ");
        usuario = entrada.nextLine();

        while (acao != 3) {
            switch(usuario) {
                case "secretaria":
                    System.out.println("\nAções disponiveis: ");
                    System.out.println("(1) Gerenciar pacientes");
                    System.out.println("(2) Gerenciar consultas");
                    System.out.println("(3) Logout");
                    System.out.print("Deseja gerenciar qual ações: ");
                    acao = entrada.nextInt();
                    
                    switch (acao) {
                        case 1:
                            secretaria.gerenciar_pacientes();
                            break;
                        case 2:
                            secretaria.gerenciar_consultas();
                            break;
                        default:
                            System.out.println("Ação não encontrada. ");
                            break;
                    }
                    
                    break;      
          
            }
            
        }
    }
    
}
