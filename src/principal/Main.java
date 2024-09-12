package principal;

import interfaces.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String args[]){
        
        // Criação da Factory, que será fechada ao clicar em "SAIR"
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBCLIENT");
        new JanelaStart(emf).setVisible(true);
    }
}