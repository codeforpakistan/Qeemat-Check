package com.nascentech.qeematcheck;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.nascentech.qeematcheck.adapters.ShopAdapter;

import java.util.ArrayList;


public class PR extends Fragment{
    ShopAdapter m_adapter;
ArrayList<Shop> Shops;
    public PR() {
        // Required empty public PRnstructor
        Shops=new ArrayList<Shop>();
        Shops.add(new Shop("Khattak General Store",3,"Chaudhary Market I-9/4"));
        Shops.add(new Shop("Abbasi  Meat Store",4,"Niazi Market, G-10"));
        Shops.add(new Shop("Bakeman Bakery",Float.parseFloat("4.5"),"G-10 Markaz"));
        Shops.add(new Shop("Metro",Float.parseFloat("4.5"),"I-11"));
        Shops.add(new Shop("Butt Fruits",Float.parseFloat("2.5"),"Slot No. 3, Mangal Bazar, I-9/1"));
        Shops.add(new Shop("Khattak General Store",3,"Chaudhary Market I-9/4"));
        Shops.add(new Shop("Abbasi  Meat Store",4,"Niazi Market, G-10"));
        Shops.add(new Shop("Bakeman Bakery",Float.parseFloat("4.5"),"G-10 Markaz"));
        Shops.add(new Shop("Metro",Float.parseFloat("4.5"),"I-11"));
        Shops.add(new Shop("Butt Fruits",Float.parseFloat("2.5"),"Slot No. 3, Mangal Bazar, I-9/1"));
        Shops.add(new Shop("Khattak General Store",3,"Chaudhary Market I-9/4"));
        Shops.add(new Shop("Abbasi  Meat Store",4,"Niazi Market, G-10"));
        Shops.add(new Shop("Bakeman Bakery",Float.parseFloat("4.5"),"G-10 Markaz"));
        Shops.add(new Shop("Metro",Float.parseFloat("4.5"),"I-11"));
        Shops.add(new Shop("Butt Fruits",Float.parseFloat("2.5"),"Slot No. 3, Mangal Bazar, I-9/1"));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup PRntainer,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_pr, PRntainer, false);
        // instantiate our ItemAdapter class
        try {
            Activity act=getActivity();
            ListView lv = (ListView) v.findViewById(R.id.ShopList);
            m_adapter = new ShopAdapter(getContext(), R.layout.shop_list_item, Shops);
            lv.setAdapter(m_adapter);

        }
        catch (Exception e1)
        {
            String msg=e1.getLocalizedMessage();
            Toast.makeText(getContext(), e1.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
        }
        return v;
    }

}