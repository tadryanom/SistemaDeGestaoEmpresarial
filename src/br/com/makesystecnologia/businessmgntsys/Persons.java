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
public abstract class Persons {
    protected int id;
    protected String name;
    protected int age;
    protected String address;
    protected int rg;
    protected int cpf;
    protected boolean status;
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public int getRg()
    {
        return rg;
    }
    
    public int getCpf()
    {
        return cpf;
    }
    
    public boolean getStatus()
    {
        return status;
    }
    
    public void setId(int _id)
    {
        id = _id;
    }
    
    public void setName(String _name)
    {
        name = _name;
    }
    
    public void setAge(int _age)
    {
        age = _age;
    }
    
    public void setAddress(String _addr)
    {
        address = _addr;
    }
    
    public void setRg(int _rg)
    {
        rg = _rg;
    }
    
    public void setCpf(int _cpf)
    {
        cpf = _cpf;
    }
    
    public void setStatus(boolean _status)
    {
        status = _status;
    }
}

