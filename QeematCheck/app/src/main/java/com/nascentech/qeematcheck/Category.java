package com.nascentech.qeematcheck;

/**
 * Created by pc1 on 7/16/2016.
 */
public class Category {

    String Name;
    String lastUpdated;
    int ImageID;

    public Category(String name,String lu,int imgid)
    {
        this.Name=name;
        this.lastUpdated=lu;
        this.ImageID=imgid;
    }
    public String getName()
    {
        return Name;
    }
    public String getLastUpdated()
    {
        return lastUpdated;
    }
    public int getImageID()
    {
        return this.ImageID;
    }
}
