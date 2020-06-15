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
public class Products {
    protected int id;
    protected String name;
    protected String description;
    protected int amount;
    protected double price;
    protected int height;
    protected int width;
    protected int weight;
    protected boolean status;
    
    public Products()
    {
        id = 0;
        name = "";
        description = "";
        amount = 0;
        price = 0.0;
        height = 0;
        width = 0;
        weight = 0;
        status = false;
    }
    
    public Products(int _id, String _name, double _price)
    {
        id = _id;
        name = _name;
        description = "";
        amount = 0;
        price = _price;
        height = 0;
        width = 0;
        weight = 0;
        status = true;
    }
    
    public Products(int _id, String _name, String _desc, int _amount, double _price)
    {
        id = _id;
        name = _name;
        description = _desc;
        amount = _amount;
        price = _price;
        height = 0;
        width = 0;
        weight = 0;
        status = true;
    }
    
    public Products(int _id, String _name, String _desc, int _amount, double _price, int _height, int _width, int _weight)
    {
        id = _id;
        name = _name;
        description = _desc;
        amount = _amount;
        price = _price;
        height = _height;
        width = _width;
        weight = _weight;
        status = true;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getAmount()
    {
        return amount;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getWeight()
    {
        return weight;
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
    
    public void setDescription(String _desc)
    {
        description = _desc;
    }
    
    public void setAmount(int _amount)
    {
        amount = _amount;
    }
    
    public void setPrice(double _price)
    {
        price = _price;
    }
    
    public void setHeight(int _height)
    {
        height = _height;
    }
    
    public void setWidth(int _width)
    {
        width = _width;
    }
    
    public void setWeight(int _weight)
    {
        weight = _weight;
    }
    
    public void setStatus(boolean _status)
    {
        status = _status;
    }
    
    public double getTotalPrice()
    {
        return (amount * price);
    }
    
    public void increaseStock(int _amount)
    {
        this.setAmount(this.getAmount()+_amount);
    }
    
    public void decreaseStock(int _amount)
    {
        this.setAmount(this.getAmount()-_amount);
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
