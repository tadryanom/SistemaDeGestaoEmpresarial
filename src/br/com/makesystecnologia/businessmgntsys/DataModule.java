/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.makesystecnologia.businessmgntsys;

import java.sql.*;

/**
 *
 * @author tulio
 */
public class DataModule {
    protected Connection con;
    protected String dbUrl;
    protected String userDb;
    protected String passDb;
    protected boolean status;
    
    public DataModule()
    {
        con = null;
        dbUrl = "jdbc:mysql://localhost:3306/businessmgntsys";
        userDb = "businessmgntsys";
        passDb = "pass@123456";
        status = false;
    }
    
    public boolean getStatus()
    {
        return status;
    }
    
    public void setStatus(boolean _status)
    {
        status = _status;
    }
    
    public void conectDb()
    {
        if(!getStatus()) {
            try {
                con = DriverManager.getConnection(dbUrl, userDb, passDb);
                setStatus(true);
                System.out.println("Conectado ao Banco de Dados: "+userDb+"@"+dbUrl);
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);
            }
        }
    }  

    public void desconectDb()
    {
        if(getStatus()) {
            try {
                con.close();
                setStatus(false);
                System.out.println("Desconectado do Banco de Dados!");
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);
            }
        }
    }
    
    public void insertUpdateData(String sqlQuery)
    {
        Statement smt;
        
        if(getStatus()) {
            try {
                smt = con.createStatement();
                smt.executeUpdate(sqlQuery);
                smt.close();
                System.out.println("Operação realizada com sucesso!");
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);
            }
        }        
    }
    
    public ResultSet queryData(String sqlQuery)
    {
        Statement smt;
        ResultSet rs;
        
        if(getStatus()) {
            try {
                smt = con.createStatement();
                rs = smt.executeQuery(sqlQuery);
                smt.close();
                System.out.println("Operação realizada com sucesso!");
                return rs;
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);
            }
        }
        return (null);
    }
    
    public void registeCustomers()
    {
        Clients client; 
        client = new Clients();
    }
}
