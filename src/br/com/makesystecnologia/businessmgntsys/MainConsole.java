/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.makesystecnologia.businessmgntsys;

/**
 *
 * @author tulio
 */
public class MainConsole {
    public static void main(String[] args)
    {
        DataModule dm = new DataModule();
        
        if (dm.getLogin("abc", "123")) {
                System.out.println("Logado com sucesso!");
        } else {
            System.out.println("Usuário e senha inválido!");
        }
    }
}
