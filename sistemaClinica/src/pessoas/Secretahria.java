/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;
import menus.*;

/**
 *
 * @author Prointe
 */
public class Secretahria {
    private static int contadorID = 0;
    private int ID;
    private String nome;
    private String CPF;
    private MenuSecretaria menu = new MenuSecretaria();
    
    // MÉTODOS CONSTRUTORES
    public Secretahria(String nome, String CPF){
        this.ID = ++contadorID;
        this.nome = nome;
        this.CPF = CPF;
    }
    
    public Secretahria(){
        
    }

    // GETTERS E SETTERS
    public int getId() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public MenuSecretaria getMenu() {
        return menu;
    }

    public void setMenu(MenuSecretaria menu) {
        this.menu = menu;
    }
    
    
    
}
