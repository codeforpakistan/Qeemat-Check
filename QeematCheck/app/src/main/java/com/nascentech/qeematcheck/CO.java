package com.nascentech.qeematcheck;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class CO extends Fragment{
    Context cont;
   // DatabaseOpenHelper helper;
    SQLiteDatabase db;
    //MyCursorAdapter curAdpt;
    public CO() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for getActivity() fragment
        View view=inflater.inflate(R.layout.fragment_co, container, false);
     //   helper= new DatabaseOpenHelper(view.getContext());
       // db= helper.getWritableDatabase();
        //db.delete(helper.Table_name, null, null);
        //insertBirthdays(db);
        //final Cursor cur = ReadBirthdays();
/*
        curAdpt= new MyCursorAdapter(view.getContext() ,cur,0);
        ListView lv= (ListView) view.findViewById(R.id.friendslist);
        try
        {
            lv.setAdapter(curAdpt);

        }
        catch(Exception ei)
        {
            Toast.makeText(view.getContext(),ei.toString(),Toast.LENGTH_SHORT).show();
        }
        Intent inten2 = new Intent(getActivity() ,BirthWishService.class);
        getActivity().startService(inten2);
        */
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(view.getContext(),"clicked",Toast.LENGTH_SHORT).show();
                // Click action
               Intent intent = new Intent(getActivity(), Add__Complaint.class);
                getActivity().startActivity(intent);
            }
        });
        return view;

    }

}