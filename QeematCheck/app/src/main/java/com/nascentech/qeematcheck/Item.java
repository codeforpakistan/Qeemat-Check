package com.nascentech.qeematcheck;

/**
 * Created by pc1 on 7/17/2016.
 */
public class Item {
    String Name;
    int price;
    int imgid;
    String lu;

    public Item(String name,int pr, String lu1,int iid)
    {
        this.Name=name;
        this.price=pr;
        this.lu=lu1;
        int imgid=iid;
    }
    public String getName()
    {
        return Name;
    }
    public int getPrice()
    {
        return price;
    }
    public int getImgid()
    {
        return imgid;
    }

    public String getLU()
    {
        return lu;
    }

}
