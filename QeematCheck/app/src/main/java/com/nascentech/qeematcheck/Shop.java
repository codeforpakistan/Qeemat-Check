package com.nascentech.qeematcheck;

/**
 * Created by pc1 on 7/17/2016.
 */
public class Shop {
    String Name;
    float rating;
    String Address;

    public Shop(String name,float rat,String addr)
    {
        this.Name=name;
        this.Address=addr;
        this.rating=rat;
    }
    public String getName()
    {
        return Name;
    }
    public String getAddress()
    {
        return Address;
    }
    public float getRating()
    {
        return rating;
    }
}
