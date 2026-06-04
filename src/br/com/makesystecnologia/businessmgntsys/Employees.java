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
public class Employees extends Persons {
    protected String office;
    protected String description;
    protected double salary;
    
    public Employees()
    {
        this.setId(0);
        this.setName("");
        this.setAge(0);
        this.setAddress("");
        this.setRg(0);
        this.setCpf(0);
        this.setStatus(false);
        office = "";
        description = "";
        salary = 0.0;
    }
    
    public Employees(int _id, String _name, int _age, String _addr, int _rg, int _cpf)
    {
        this.setId(_id);
        this.setName(_name);
        this.setAge(_age);
        this.setAddress(_addr);
        this.setRg(_rg);
        this.setCpf(_cpf);
        this.setStatus(true);
        office = "";
        description = "";
        salary = 0.0;
    }
    
    public Employees(int _id, String _name, int _age, String _addr, int _rg, int _cpf, String _office)
    {
        this.setId(_id);
        this.setName(_name);
        this.setAge(_age);
        this.setAddress(_addr);
        this.setRg(_rg);
        this.setCpf(_cpf);
        this.setStatus(true);
        office = _office;
        description = "";
        salary = 0.0;
    }
    
    public Employees(int _id, String _name, int _age, String _addr, int _rg, int _cpf, String _office, String _desc)
    {
        this.setId(_id);
        this.setName(_name);
        this.setAge(_age);
        this.setAddress(_addr);
        this.setRg(_rg);
        this.setCpf(_cpf);
        this.setStatus(true);
        office = _office;
        description = _desc;
        salary = 0.0;
    }
    
    public Employees(int _id, String _name, int _age, String _addr, int _rg, int _cpf, String _office, String _desc, double _sal)
    {
        this.setId(_id);
        this.setName(_name);
        this.setAge(_age);
        this.setAddress(_addr);
        this.setRg(_rg);
        this.setCpf(_cpf);
        this.setStatus(true);
        office = _office;
        description = _desc;
        salary = _sal;
    }
    
    public String getOffice()
    {
        return office;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setOffice(String _office)
    {
        office =  _office;
    }
    
    public void setDescription(String _desc)
    {
        description = _desc;
    }
    
    public void setSalary(double _sal)
    {
        salary =  _sal;
    }
    
    public void increaseSalary(double _perc)
    {
        this.setSalary(this.getSalary()+(this.getSalary()*_perc/100));
    }
    
    public void increaseSalary5Percent()
    {
        this.increaseSalary(5);
    }
    
    public void increaseSalary10Percent()
    {
        this.increaseSalary(10);
    }
    
    public void increaseSalary20Percent()
    {
        this.increaseSalary(20);
    }
    
    public void decreaseSalary(double _perc)
    {
        this.setSalary(this.getSalary()-(this.getSalary()*_perc/100));
    }
    
    public void decreaseSalary5Percent()
    {
        this.decreaseSalary(5);
    }
    
    public void decreaseSalary10Percent()
    {
        this.decreaseSalary(10);
    }
    
    public void decreaseSalary20Percent()
    {
        this.decreaseSalary(20);
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
