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
public class Operators extends Persons {
    protected String user;
    protected String pass;
    
    public Operators(int _id, String _name, int _age, String _addr, int _rg, int _cpf)
    {
        this.setId(_id);
        this.setName(_name);
        this.setAge(_age);
        this.setAddress(_addr);
        this.setRg(_rg);
        this.setCpf(_cpf);
        this.setStatus(true);
    }
    
    public Operators(int _id, String _name, int _age, String _addr, int _rg, int _cpf, String _user, String _pass)
    {
        this.setId(_id);
        this.setName(_name);
        this.setAge(_age);
        this.setAddress(_addr);
        this.setRg(_rg);
        this.setCpf(_cpf);
        this.setStatus(true);
        user =  _user;
        pass = _pass;
    }
    
    public String getUser()
    {
        return user;
    }
    
    public String getPassword()
    {
        return pass;
    }
    
    public void setUser(String _user)
    {
        user = _user;
    }
    
    public void setPassword(String _pass)
    {
        pass = _pass;
    }
    
    public void resetLogin(String _user, String _pass)
    {
        this.setUser(_user);
        this.setPassword(_pass);
    }
        
    public void resetPassword(String _pass)
    {
        this.setPassword(_pass);
    }
    
    public void setStatusActived()
    {
        this.setStatus(true);
    }
    
    public void setStatusLocked()
    {
        this.setStatus(false);
    }    
}
