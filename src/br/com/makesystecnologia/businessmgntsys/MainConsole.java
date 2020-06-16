/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.makesystecnologia.businessmgntsys;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tulio
 */
public class MainConsole {
    public static void main(String[] args)
    {
        DataModule dm = new DataModule();
        List<Clients> clientList = new ArrayList<Clients>();
        
        dm.selectClients(clientList);
        
        for (Clients client: clientList) {
            System.out.println("|    "+client.getId()+"     |    "+client.getName()+"\n");
        }
        
        for (Clients client: clientList) {
            if (client.getId() == 5) {
                client.setName("Tulio A. M. Mendes Jr.");
                dm.updateClients(client);
            }
        }
        
        for (Clients client: clientList) {
            System.out.println("|    "+client.getId()+"     |    "+client.getName()+"\n");
        }
    }
}
