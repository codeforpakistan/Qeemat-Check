package com.nascentech.qeematcheck;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.nascentech.qeematcheck.adapters.ItemAdapter;

import java.util.ArrayList;


public class ItemFragment extends Fragment{
ItemAdapter m_adapter;
    ArrayList<Item> categories;
    public ItemFragment() {
        categories=new ArrayList<Item>();
        // Required empty public constructor
        categories.add(new Item("Tomato", 60,"16/07/2016",R.drawable.tomato));
        categories.add(new Item("Potato", 40,"16/07/2016",R.drawable.potato));
        categories.add(new Item("Onion",40, "16/07/2016",R.drawable.onion));
        categories.add(new Item("Tomato", 60,"16/07/2016",R.drawable.tomato));
        categories.add(new Item("Potato", 40,"16/07/2016",R.drawable.potato));
        categories.add(new Item("Onion",40, "16/07/2016",R.drawable.onion));
        categories.add(new Item("Tomato", 60,"16/07/2016",R.drawable.tomato));
        categories.add(new Item("Potato", 40,"16/07/2016",R.drawable.potato));
        categories.add(new Item("Onion",40, "16/07/2016",R.drawable.onion));
        categories.add(new Item("Tomato", 60,"16/07/2016",R.drawable.tomato));
        categories.add(new Item("Potato", 40,"16/07/2016",R.drawable.potato));
        categories.add(new Item("Onion",40, "16/07/2016",R.drawable.onion));
       

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_ucb, container, false);
        // instantiate our ItemAdapter class
        try {
            Activity act=getActivity();
            ListView lv = (ListView) v.findViewById(R.id.CatList);
            m_adapter = new ItemAdapter(getContext(), R.layout.cat_list_item, categories);
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