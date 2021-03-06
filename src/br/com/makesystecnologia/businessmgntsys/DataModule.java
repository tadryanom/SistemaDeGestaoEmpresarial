/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.makesystecnologia.businessmgntsys;

import java.sql.*;
import java.util.List;

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
    
    private Statement smt;
    
    public DataModule()
    {
        con = null;
        dbUrl = "jdbc:mysql://localhost:3306/businessmgntsys";
        userDb = "businessmgntsys";
        passDb = "pass@123456";
        status = false;
    }
    
    public DataModule(String _dbUrl, String _user, String _pass)
    {
        con = null;
        dbUrl = _dbUrl;
        userDb = _user;
        passDb = _pass;
        status = false;
    }
    
    public DataModule(String _host, int _port, String _db, String _user, String _pass)
    {
        con = null;
        dbUrl = "jdbc:mysql://"+_host+":"+String.valueOf(_port)+"/"+_db;
        userDb = _user;
        passDb = _pass;
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
    
    public void connectDb()
    {
        if(!this.getStatus()) {
            try {
                con = DriverManager.getConnection(dbUrl, userDb, passDb);
                this.setStatus(true);
                System.out.println("Conectado ao Banco de Dados: "+userDb+"@"+dbUrl);
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
    }  

    public void desconnectDb()
    {
        if(this.getStatus()) {
            try {
                con.close();
                this.setStatus(false);
                System.out.println("Desconectado do Banco de Dados!");
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
    }
    
    public void updateData(String sqlQuery)
    {
        if(this.getStatus()) {
            try {
                smt = con.createStatement();
                smt.executeUpdate(sqlQuery);
                smt.close();
                System.out.println("Operação 'updateData' realizada com sucesso!");
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }        
    }
    
    public ResultSet queryData(String sqlQuery)
    {
        ResultSet rs;
        
        if(this.getStatus()) {
            try {
                smt = con.createStatement();
                rs = smt.executeQuery(sqlQuery);
                System.out.println("Operação 'queryData' realizada com sucesso!");
                return rs;
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        return (null);
    }
    
    public int insertClients(String _name, int _age, String _addr, int _rg, int _cpf, boolean _status, int _wallet, double _walletBal)
    {
        String sql;
        ResultSet rs;
        int id = 0;
        
        this.connectDb();
        
        sql = "INSERT INTO CLIENTS VALUES(";
        sql += String.valueOf(id);
        sql += ",'"+_name+"'";
        sql += ","+String.valueOf(_age);
        sql += ",'"+_addr+"'";
        sql += ","+String.valueOf(_rg);
        sql += ","+String.valueOf(_cpf);
        sql += ","+String.valueOf(_status);
        sql += ","+String.valueOf(_wallet);
        sql += ","+String.valueOf(_walletBal);
        sql += ",null);";
        
        this.updateData(sql);

        rs = this.queryData("SELECT LAST_INSERT_ID() AS ID;");
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    id = rs.getInt("ID");
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
        
        return id;
    }
    
    public void insertClients(Clients client)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "INSERT INTO CLIENTS VALUES(";
        if (client.getId() != 0) sql += String.valueOf(client.getId());
        else sql += String.valueOf(0);
        sql += ",'"+client.getName()+"'";
        sql += ","+String.valueOf(client.getAge());
        sql += ",'"+client.getAddress()+"'";
        sql += ","+String.valueOf(client.getRg());
        sql += ","+String.valueOf(client.getCpf());
        sql += ","+String.valueOf(client.getStatus());
        sql += ","+String.valueOf(client.getWalletId());
        sql += ","+String.valueOf(client.getWalletBallance());
        sql += ",null);";
        
        this.updateData(sql);

        rs = this.queryData("SELECT LAST_INSERT_ID() AS ID;");
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    client.setId(rs.getInt("ID"));
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public int insertEmployees(String _name, int _age, String _addr, int _rg, int _cpf, boolean _status, String _office, String _desc, double _sal)
    {
        String sql;
        ResultSet rs;
        int id = 0;
        
        this.connectDb();
        
        sql = "INSERT INTO EMPLOYEES VALUES(";
        sql += String.valueOf(id);
        sql += ",'"+_name+"'";
        sql += ","+String.valueOf(_age);
        sql += ",'"+_addr+"'";
        sql += ","+String.valueOf(_rg);
        sql += ","+String.valueOf(_cpf);
        sql += ","+String.valueOf(_status);
        sql += ",'"+_office+"'";
        sql += ",'"+_desc+"'";
        sql += ","+String.valueOf(_sal);
        sql += ",null);";
        
        this.updateData(sql);

        rs = this.queryData("SELECT LAST_INSERT_ID() AS ID;");
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    id = rs.getInt("ID");
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
        
        return id;
    }
    
    public void insertEmployees(Employees employee)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "INSERT INTO EMPLOYEES VALUES(";
        if (employee.getId() != 0) sql += String.valueOf(employee.getId());
        else sql += String.valueOf(0);
        sql += "'"+employee.getName()+"'";
        sql += ","+String.valueOf(employee.getAge());
        sql += ",'"+employee.getAddress()+"'";
        sql += ","+String.valueOf(employee.getRg());
        sql += ","+String.valueOf(employee.getCpf());
        sql += ","+String.valueOf(employee.getStatus());
        sql += ",'"+employee.getOffice()+"'";
        sql += ",'"+employee.getDescription()+"'";
        sql += ","+String.valueOf(employee.getSalary());
        sql += ",null);";
        
        this.updateData(sql);

        rs = this.queryData("SELECT LAST_INSERT_ID() AS ID;");
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    employee.setId(rs.getInt("ID"));
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public int insertOperators(String _name, int _age, String _addr, int _rg, int _cpf, boolean _status, String _user, String _pass)
    {
        String sql;
        ResultSet rs;
        int id = 0;
        
        this.connectDb();
        
        sql = "INSERT INTO OPERATORS VALUES(";
        sql += String.valueOf(id);
        sql += ",'"+_name+"'";
        sql += ","+String.valueOf(_age);
        sql += ",'"+_addr+"'";
        sql += ","+String.valueOf(_rg);
        sql += ","+String.valueOf(_cpf);
        sql += ","+String.valueOf(_status);
        sql += ",'"+_user+"'";
        sql += ",'"+_pass+"'";
        sql += ",null);";
        
        this.updateData(sql);

        rs = this.queryData("SELECT LAST_INSERT_ID() AS ID;");
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    id = rs.getInt("ID");
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
        
        return id;
    }
    
    public void insertOperators(Operators operator)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "INSERT INTO OPERATORS VALUES(";
        if (operator.getId() != 0) sql += String.valueOf(operator.getId());
        else sql += String.valueOf(0);
        sql += "'"+operator.getName()+"'";
        sql += ","+String.valueOf(operator.getAge());
        sql += ",'"+operator.getAddress()+"'";
        sql += ","+String.valueOf(operator.getRg());
        sql += ","+String.valueOf(operator.getCpf());
        sql += ","+String.valueOf(operator.getStatus());
        sql += ",'"+operator.getUser()+"'";
        sql += ",'"+operator.getPassword()+"'";
        sql += ",null);";
        
        this.updateData(sql);

        rs = this.queryData("SELECT LAST_INSERT_ID() AS ID;");
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    operator.setId(rs.getInt("ID"));
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public int insertProducts(String _name, String _desc, int _amount, double _price, int _height, int _width, int _weight, boolean _status)
    {
        String sql;
        ResultSet rs;
        int id = 0;
        
        this.connectDb();
        
        sql = "INSERT INTO PRODUCTS VALUES(";
        sql += String.valueOf(id);
        sql += ",'"+_name+"'";
        sql += ",'"+_desc+"'";
        sql += ","+String.valueOf(_amount);
        sql += ","+String.valueOf(_price);
        sql += ","+String.valueOf(_height);
        sql += ","+String.valueOf(_width);
        sql += ","+String.valueOf(_weight);
        sql += ","+String.valueOf(_status);
        sql += ",null);";
        
        this.updateData(sql);
        
        rs = this.queryData("SELECT LAST_INSERT_ID() AS ID;");
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    id = rs.getInt("ID");
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
        
        return id;
    }
    
    public void insertProducts(Products product)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "INSERT INTO PRODUCTS VALUES(";
        if (product.getId() != 0) sql += String.valueOf(product.getId());
        else sql += String.valueOf(0);
        sql += "'"+product.getName()+"'";
        sql += ",'"+product.getDescription()+"'";
        sql += ","+String.valueOf(product.getAmount());
        sql += ","+String.valueOf(product.getPrice());
        sql += ","+String.valueOf(product.getHeight());
        sql += ","+String.valueOf(product.width);
        sql += ","+String.valueOf(product.weight);
        sql += ","+String.valueOf(product.getStatus());
        sql += ",null);";
        
        this.updateData(sql);
        
        rs = this.queryData("SELECT LAST_INSERT_ID() AS ID;");
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    product.setId(rs.getInt("ID"));
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public void selectClients(Clients client)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "SELECT * FROM CLIENTS";
        sql += " WHERE ID = "+String.valueOf(client.getId());
        sql += ";";
        
        rs = this.queryData(sql);
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    client.setName(rs.getString("NAME"));
                    client.setAge(rs.getInt("AGE"));
                    client.setAddress(rs.getString("ADDRS"));
                    client.setRg(rs.getInt("RG"));
                    client.setCpf(rs.getInt("CPF"));
                    client.setStatus(rs.getBoolean("STATUS"));
                    client.setWalletId(rs.getInt("WALLET_ID"));
                    client.setWalletBallance(rs.getDouble("WALLET_BALLANCE"));
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public void selectClients(List<Clients> clientList)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "SELECT * FROM CLIENTS;";
        
        rs = this.queryData(sql);
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    Clients client = new Clients();
                    client.setId(rs.getInt("ID"));
                    client.setName(rs.getString("NAME"));
                    client.setAge(rs.getInt("AGE"));
                    client.setAddress(rs.getString("ADDRS"));
                    client.setRg(rs.getInt("RG"));
                    client.setCpf(rs.getInt("CPF"));
                    client.setStatus(rs.getBoolean("STATUS"));
                    client.setWalletId(rs.getInt("WALLET_ID"));
                    client.setWalletBallance(rs.getDouble("WALLET_BALLANCE"));
                    clientList.add(client);
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public void selectEmployees(Employees employee)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "SELECT * FROM EMPLOYEES";
        sql += " WHERE ID = "+String.valueOf(employee.getId());
        sql += ";";
        
        rs = this.queryData(sql);
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    employee.setName(rs.getString("NAME"));
                    employee.setAge(rs.getInt("AGE"));
                    employee.setAddress(rs.getString("ADDRS"));
                    employee.setRg(rs.getInt("RG"));
                    employee.setCpf(rs.getInt("CPF"));
                    employee.setStatus(rs.getBoolean("STATUS"));
                    employee.setOffice(rs.getString("OFFICE"));
                    employee.setDescription(rs.getString("DESCRIPTION"));
                    employee.setSalary(rs.getDouble("SALARY"));
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public void selectEmployees(List<Employees> employeeList)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "SELECT * FROM EMPLOYEES;";
        
        rs = this.queryData(sql);
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    Employees employee = new Employees();
                    employee.setId(rs.getInt("ID"));
                    employee.setName(rs.getString("NAME"));
                    employee.setAge(rs.getInt("AGE"));
                    employee.setAddress(rs.getString("ADDRS"));
                    employee.setRg(rs.getInt("RG"));
                    employee.setCpf(rs.getInt("CPF"));
                    employee.setStatus(rs.getBoolean("STATUS"));
                    employee.setOffice(rs.getString("OFFICE"));
                    employee.setDescription(rs.getString("DESCRIPTION"));
                    employee.setSalary(rs.getDouble("SALARY"));
                    employeeList.add(employee);
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public void selectOperators(Operators operator)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "SELECT * FROM OPERATORS";
        sql += " WHERE ID = "+String.valueOf(operator.getId());
        sql += ";";
        
        rs = this.queryData(sql);
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    operator.setName(rs.getString("NAME"));
                    operator.setAge(rs.getInt("AGE"));
                    operator.setAddress(rs.getString("ADDRS"));
                    operator.setRg(rs.getInt("RG"));
                    operator.setCpf(rs.getInt("CPF"));
                    operator.setStatus(rs.getBoolean("STATUS"));
                    operator.setUser(rs.getString("USER"));
                    operator.setPassword(rs.getString("PASS"));
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public void selectOperators(List<Operators> operatorList)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "SELECT * FROM OPERATORS;";
        
        rs = this.queryData(sql);
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    Operators operator = new Operators();
                    operator.setId(rs.getInt("ID"));
                    operator.setName(rs.getString("NAME"));
                    operator.setAge(rs.getInt("AGE"));
                    operator.setAddress(rs.getString("ADDRS"));
                    operator.setRg(rs.getInt("RG"));
                    operator.setCpf(rs.getInt("CPF"));
                    operator.setStatus(rs.getBoolean("STATUS"));
                    operator.setUser(rs.getString("USER"));
                    operator.setPassword(rs.getString("PASS"));
                    operatorList.add(operator);
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public void selectProducts(Products product)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "SELECT * FROM PRODUCTS";
        sql += " WHERE ID = "+String.valueOf(product.getId());
        sql += ";";
        
        rs = this.queryData(sql);
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    product.setName(rs.getString("NAME"));
                    product.setDescription(rs.getString("DESCRIPTION"));
                    product.setAmount(rs.getInt("AMOUNT"));
                    product.setPrice(rs.getDouble("PRICE"));
                    product.setHeight(rs.getInt("HEIGHT"));
                    product.setWidth(rs.getInt("WIDTH"));
                    product.setWeight(rs.getInt("WEIGHT"));
                    product.setStatus(rs.getBoolean("STATUS"));
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public void selectProducts(List<Products> productList)
    {
        String sql;
        ResultSet rs;
        
        this.connectDb();
        
        sql = "SELECT * FROM PRODUCTS;";
        
        rs = this.queryData(sql);
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    Products product = new Products();
                    product.setId(rs.getInt("ID"));
                    product.setName(rs.getString("NAME"));
                    product.setDescription(rs.getString("DESCRIPTION"));
                    product.setAmount(rs.getInt("AMOUNT"));
                    product.setPrice(rs.getDouble("PRICE"));
                    product.setHeight(rs.getInt("HEIGHT"));
                    product.setWidth(rs.getInt("WIDTH"));
                    product.setWeight(rs.getInt("WEIGHT"));
                    product.setStatus(rs.getBoolean("STATUS"));
                    productList.add(product);
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
    }
    
    public void updateClients(int _id, String _name, int _age, String _addr, int _rg, int _cpf, boolean _status, int _wallet, double _walletBal)
    {
        String sql;
        
        this.connectDb();
        
        sql = "UPDATE CLIENTS SET";
        sql += " NAME = '"+_name+"'";
        sql += ",AGE = "+String.valueOf(_age);
        sql += ",ADDRS = '"+_addr+"'";
        sql += ",RG = "+String.valueOf(_rg);
        sql += ",CPF = "+String.valueOf(_cpf);
        sql += ",STATUS = "+String.valueOf(_status);
        sql += ",WALLET_ID = "+String.valueOf(_wallet);
        sql += ",WALLET_BALLANCE = "+String.valueOf(_walletBal);
        sql += " WHERE ID = "+String.valueOf(_id);
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void updateClients(Clients client)
    {
        String sql;
        
        this.connectDb();
        
        sql = "UPDATE CLIENTS SET";
        sql += " NAME = '"+client.getName()+"'";
        sql += ",AGE = "+String.valueOf(client.getAge());
        sql += ",ADDRS = '"+client.getAddress()+"'";
        sql += ",RG = "+String.valueOf(client.getRg());
        sql += ",CPF = "+String.valueOf(client.getCpf());
        sql += ",STATUS = "+String.valueOf(client.getStatus());
        sql += ",WALLET_ID = "+String.valueOf(client.getWalletId());
        sql += ",WALLET_BALLANCE = "+String.valueOf(client.getWalletBallance());
        sql += " WHERE ID = "+String.valueOf(client.getId());
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void updateEmployees(int _id, String _name, int _age, String _addr, int _rg, int _cpf, boolean _status, String _office, String _desc, double _sal)
    {
        String sql;
        
        this.connectDb();
        
        sql = "UPDATE EMPLOYEES SET";
        sql += " NAME = '"+_name+"'";
        sql += ",AGE = "+String.valueOf(_age);
        sql += ",ADDRS = '"+_addr+"'";
        sql += ",RG = "+String.valueOf(_rg);
        sql += ",CPF = "+String.valueOf(_cpf);
        sql += ",STATUS = "+String.valueOf(_status);
        sql += ",OFFICE = '"+_office+"'";
        sql += ",DESCRIPTION = '"+_desc+"'";
        sql += ",SALARY = "+String.valueOf(_sal);
        sql += " WHERE ID = "+String.valueOf(_id);
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void updateEmployees(Employees employee)
    {
        String sql;
        
        this.connectDb();
        
        sql = "UPDATE EMPLOYEES SET";
        sql += " NAME = '"+employee.getName()+"'";
        sql += ",AGE = "+String.valueOf(employee.getAge());
        sql += ",ADDRS = '"+employee.getAddress()+"'";
        sql += ",RG = "+String.valueOf(employee.getRg());
        sql += ",CPF = "+String.valueOf(employee.getCpf());
        sql += ",STATUS = "+String.valueOf(employee.getStatus());
        sql += ",OFFICE = '"+employee.getOffice()+"'";
        sql += ",DESCRIPTION = '"+employee.getDescription()+"'";
        sql += ",SALARY = "+String.valueOf(employee.getSalary());
        sql += " WHERE ID = "+String.valueOf(employee.getId());
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void updateOperators(int _id, String _name, int _age, String _addr, int _rg, int _cpf, boolean _status, String _user, String _pass)
    {
        String sql;
        
        this.connectDb();
        
        sql = "UPDATE OPERATORS SET";
        sql += " NAME = '"+_name+"'";
        sql += ",AGE = "+String.valueOf(_age);
        sql += ",ADDRS = '"+_addr+"'";
        sql += ",RG = "+String.valueOf(_rg);
        sql += ",CPF = "+String.valueOf(_cpf);
        sql += ",STATUS = "+String.valueOf(_status);
        sql += ",USER = '"+_user+"'";
        sql += ",PASS = '"+_pass+"'";
        sql += " WHERE ID = "+String.valueOf(_id);
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void updateOperators(Operators operator)
    {
        String sql;
        
        this.connectDb();
        
        sql = "UPDATE OPERATORS SET";
        sql += " NAME = '"+operator.getName()+"'";
        sql += ",AGE = "+String.valueOf(operator.getAge());
        sql += ",ADDRS = '"+operator.getAddress()+"'";
        sql += ",RG = "+String.valueOf(operator.getRg());
        sql += ",CPF = "+String.valueOf(operator.getCpf());
        sql += ",STATUS = "+String.valueOf(operator.getStatus());
        sql += ",USER = '"+operator.getUser()+"'";
        sql += ",PASS = '"+operator.getPassword()+"'";
        sql += " WHERE ID = "+String.valueOf(operator.getId());
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void updateProducts(int _id, String _name, String _desc, int _amount, double _price, int _height, int _width, int _weight, boolean _status)
    {
        String sql;
        
        this.connectDb();
        
        sql = "UPDATE PRODUCTS SET";
        sql += " NAME = '"+_name+"'";
        sql += ",DESCRIPTION = '"+_desc+"'";
        sql += ",AMOUNT = "+String.valueOf(_amount);
        sql += ",PRICE = "+String.valueOf(_price);
        sql += ",HEIGHT = "+String.valueOf(_height);
        sql += ",WIDTH = "+String.valueOf(_width);
        sql += ",WEIGHT = "+String.valueOf(_weight);
        sql += ",STATUS = "+String.valueOf(_status);
        sql += " WHERE ID = "+String.valueOf(_id);
        sql += ";";
        
        this.updateData(sql);    
        this.desconnectDb();
    }
    
    public void updateProducts(Products product)
    {
        String sql;
        
        this.connectDb();
        
        sql = "UPDATE PRODUCTS SET";
        sql += " NAME = '"+product.getName()+"'";
        sql += ",DESCRIPTION = '"+product.getDescription()+"'";
        sql += ",AMOUNT = "+String.valueOf(product.getAmount());
        sql += ",PRICE = "+String.valueOf(product.getPrice());
        sql += ",HEIGHT = "+String.valueOf(product.getHeight());
        sql += ",WIDTH = "+String.valueOf(product.getWidth());
        sql += ",WEIGHT = "+String.valueOf(product.getWeight());
        sql += ",STATUS = "+String.valueOf(product.getStatus());
        sql += " WHERE ID = "+String.valueOf(product.getId());
        sql += ";";
        
        this.updateData(sql);    
        this.desconnectDb();
    }
    
    public void deleteClients(int _id)
    {
        String sql;
        
        this.connectDb();
        
        sql = "DELETE FROM CLIENTS";
        sql += " WHERE ID = "+String.valueOf(_id);
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void deleteClients(Clients client)
    {
        String sql;
        
        this.connectDb();
        
        sql = "DELETE FROM CLIENTS";
        sql += " WHERE ID = "+String.valueOf(client.getId());
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void deleteEmployees(int _id)
    {
        String sql;
        
        this.connectDb();
        
        sql = "DELETE FROM EMPLOYEES";
        sql += " WHERE ID = "+String.valueOf(_id);
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void deleteEmployees(Employees employee)
    {
        String sql;
        
        this.connectDb();
        
        sql = "DELETE FROM EMPLOYEES";
        sql += " WHERE ID = "+String.valueOf(employee.getId());
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void deleteOperators(int _id)
    {
        String sql;
        
        this.connectDb();
        
        sql = "DELETE FROM OPERATORS";
        sql += " WHERE ID = "+String.valueOf(_id);
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void deleteOperators(Operators operator)
    {
        String sql;
        
        this.connectDb();
        
        sql = "DELETE FROM OPERATORS";
        sql += " WHERE ID = "+String.valueOf(operator.getId());
        sql += ";";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void deleteProducts(int _id)
    {
        String sql;
        
        this.connectDb();
        
        sql = "DELETE FROM CLIENTS";
        sql += " WHERE ID = "+String.valueOf(_id);
        sql += ";";
        
        this.updateData(sql);    
        this.desconnectDb();
    }
    
    public void deleteProducts(Products product)
    {
        String sql;
        
        this.connectDb();
        
        sql = "DELETE FROM CLIENTS";
        sql += " WHERE ID = "+String.valueOf(product.getId());
        sql += ";";
        
        this.updateData(sql);    
        this.desconnectDb();
    }
    
    public void createTableClients()
    {
        String sql;
        
        this.connectDb();
        
        sql = "CREATE TABLE CLIENTS (";
        sql += "ID INT(12) UNSIGNED AUTO_INCREMENT PRIMARY KEY,";
        sql += "NAME VARCHAR(100) NOT NULL,";
        sql += "AGE INT(3) UNSIGNED,";
        sql += "ADDRS VARCHAR(100),";
        sql += "RG VARCHAR(50),";
        sql += "CPF VARCHAR(50),";
        sql += "STATUS TINYINT(1),";
        sql += "WALLET_ID INT(12) UNSIGNED,";
        sql += "WALLET_BALLANCE DOUBLE,";
        sql += "REGS_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP";
        sql += ");";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void createTableEmployees()
    {
        String sql;
        
        this.connectDb();
        
        sql = "CREATE TABLE EMPLOYEES (";
        sql += "ID INT(12) UNSIGNED AUTO_INCREMENT PRIMARY KEY,";
        sql += "NAME VARCHAR(100) NOT NULL,";
        sql += "AGE INT(3) UNSIGNED,";
        sql += "ADDRS VARCHAR(100),";
        sql += "RG VARCHAR(50),";
        sql += "CPF VARCHAR(50),";
        sql += "STATUS TINYINT(1),";
        sql += "OFFICE VARCHAR(100),";
        sql += "DESCRIPTION VARCHAR(100),";
        sql += "SALARY DOUBLE,";
        sql += "REGS_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP";
        sql += ");";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void createTableOperators()
    {
        String sql;
        
        this.connectDb();
        
        sql = "CREATE TABLE OPERATORS (";
        sql += "ID INT(12) UNSIGNED AUTO_INCREMENT PRIMARY KEY,";
        sql += "NAME VARCHAR(100) NOT NULL,";
        sql += "AGE INT(3) UNSIGNED,";
        sql += "ADDRS VARCHAR(100),";
        sql += "RG VARCHAR(50),";
        sql += "CPF VARCHAR(50),";
        sql += "STATUS TINYINT(1),";
        sql += "USER VARCHAR(20) NOT NULL,";
        sql += "PASS VARCHAR(100) NOT NULL,";
        sql += "REGS_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP";
        sql += ");";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void createTableProducts()
    {
        String sql;
        
        this.connectDb();
        
        sql = "CREATE TABLE PRODUCTS (";
        sql += "ID INT(12) UNSIGNED AUTO_INCREMENT PRIMARY KEY,";
        sql += "NAME VARCHAR(100) NOT NULL,";
        sql += "DESCRIPTION VARCHAR(200),";
        sql += "AMOUNT INT(12),";
        sql += "PRICE DOUBLE,";
        sql += "HEIGHT INT(6),";
        sql += "WIDTH INT(6),";
        sql += "WEIGHT INT(6),";
        sql += "STATUS TINYINT(1),";
        sql += "REGS_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP";
        sql += ");";
        
        this.updateData(sql);    
        this.desconnectDb();
    }
    
    public void dropTableClients()
    {
        String sql;
        
        this.connectDb();
        
        sql = "DROP TABLE CLIENTS;";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void dropTableEmployees()
    {
        String sql;
        
        this.connectDb();
        
        sql = "DROP TABLE EMPLOYEES;";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void dropTableOperators()
    {
        String sql;
        
        this.connectDb();
        
        sql = "DROP TABLE OPERATORS;";
        
        this.updateData(sql);        
        this.desconnectDb();
    }
    
    public void dropTableProducts()
    {
        String sql;
        
        this.connectDb();
        
        sql = "DROP TABLE PRODUCTS;";
        
        this.updateData(sql);    
        this.desconnectDb();
    }
    
    public void resetDb()
    {
        this.dropTableClients();
        this.dropTableEmployees();
        this.dropTableOperators();
        this.dropTableProducts();
        this.createTableClients();
        this.createTableEmployees();
        this.createTableOperators();
        this.createTableProducts();
    }
    
    public boolean getLogin(String _user, String _pass)
    {
        String sql;
        ResultSet rs;
        boolean success = false;
        
        this.connectDb();
        
        sql = "SELECT COUNT(*) AS TOTAL FROM OPERATORS";
        sql += " WHERE USER = '"+_user+"' AND PASS = '"+_pass+"';";
        
        rs = this.queryData(sql);
        
        if (rs != null) {
            try {
                while (rs.next()) {
                    if (rs.getInt("TOTAL") > 0) success = true;
                }
                rs.close();
                smt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println(ex.getClass().getName()+": "+ex.getMessage());
            }
        }
        
        this.desconnectDb();
        
        return success;
    }
}
