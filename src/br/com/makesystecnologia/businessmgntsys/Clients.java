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
public class Clients extends Persons {
    protected int walletId;
    protected double walletBalance;
    
    public Clients()
    {
        this.setId(0);
        this.setName("");
        this.setAge(0);
        this.setAddress("");
        this.setRg(0);
        this.setCpf(0);
        this.setStatus(false);
        walletId = 0;
        walletBalance = 0.0;
    }
    
    public Clients(int _id, String _name, int _age, String _addr, int _rg, int _cpf)
    {
        this.setId(_id);
        this.setName(_name);
        this.setAge(_age);
        this.setAddress(_addr);
        this.setRg(_rg);
        this.setCpf(_cpf);
        this.setStatus(true);
        walletId = 0;
        walletBalance = 0.0;
    }
    
    public Clients(int _id, String _name, int _age, String _addr, int _rg, int _cpf, int _wallet)
    {
        this.setId(_id);
        this.setName(_name);
        this.setAge(_age);
        this.setAddress(_addr);
        this.setRg(_rg);
        this.setCpf(_cpf);
        this.setStatus(true);
        walletId =  _wallet;
        walletBalance = 0.0;
    }
    
    public Clients(int _id, String _name, int _age, String _addr, int _rg, int _cpf, int _wallet, double _walletBal)
    {
        this.setId(_id);
        this.setName(_name);
        this.setAge(_age);
        this.setAddress(_addr);
        this.setRg(_rg);
        this.setCpf(_cpf);
        this.setStatus(true);
        walletId = _wallet;
        walletBalance = _walletBal;
    }
    
    public int getWalletId()
    {
        return walletId;
    }
    
    public double getWalletBalance()
    {
        return walletBalance;
    }
    
    public void setWalletId(int _wallet)
    {
        walletId = _wallet;
    }
    
    public void setWalletBalance(double _walletBal)
    {
        walletBalance = _walletBal;
    }
    
    public void increaseWalletBalance(double _val)
    {
        this.setWalletBalance(this.getWalletBalance()+_val);
    }
        
    public void decreaseWalletBalance(double _val)
    {
        this.setWalletBalance(this.getWalletBalance()-_val);
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
