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

import com.nascentech.qeematcheck.adapters.CategoryAdapter;

import java.util.ArrayList;


public class UCB extends Fragment{
CategoryAdapter m_adapter;
    ArrayList<Category> categories;
    public UCB() {
        categories=new ArrayList<Category>();
        // Required empty public constructor
        categories.add(new Category("Vegetables", "16/07/2016",R.drawable.vegi));
        categories.add(new Category("Fruits", "16/07/2016",R.drawable.fruits));
        categories.add(new Category("Lentils/Daal", "16/07/2016",R.drawable.lentils));
        categories.add(new Category("Meat", "16/07/2016",R.drawable.meat));
        categories.add(new Category("Dairy", "16/07/2016",R.drawable.dairy));
        categories.add(new Category("Vegetables", "16/07/2016",R.drawable.vegi));
        categories.add(new Category("Fruits", "16/07/2016",R.drawable.fruits));
        categories.add(new Category("Lentils/Daal", "16/07/2016",R.drawable.lentils));
        categories.add(new Category("Meat", "16/07/2016",R.drawable.meat));
        categories.add(new Category("Dairy", "16/07/2016",R.drawable.dairy));
        categories.add(new Category("Vegetables", "16/07/2016",R.drawable.vegi));
        categories.add(new Category("Fruits", "16/07/2016",R.drawable.fruits));
        categories.add(new Category("Lentils/Daal", "16/07/2016",R.drawable.lentils));
        categories.add(new Category("Meat", "16/07/2016",R.drawable.meat));
        categories.add(new Category("Dairy", "16/07/2016",R.drawable.dairy));
        categories.add(new Category("Vegetables", "16/07/2016",R.drawable.vegi));
        categories.add(new Category("Fruits", "16/07/2016",R.drawable.fruits));
        categories.add(new Category("Lentils/Daal", "16/07/2016",R.drawable.lentils));
        categories.add(new Category("Meat", "16/07/2016",R.drawable.meat));
        categories.add(new Category("Dairy", "16/07/2016",R.drawable.dairy));

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
            m_adapter = new CategoryAdapter(getContext(), R.layout.cat_list_item, categories);
            lv.setAdapter(m_adapter);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                    Toast.makeText(getContext(), "p=" + position, Toast.LENGTH_SHORT).show();
                    ((MainActivity) getActivity()).setViewPageAdapter();
                }
            });
        }
        catch (Exception e1)
        {
            String msg=e1.getLocalizedMessage();
            Toast.makeText(getContext(), e1.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
        }
            return v;

    }

}