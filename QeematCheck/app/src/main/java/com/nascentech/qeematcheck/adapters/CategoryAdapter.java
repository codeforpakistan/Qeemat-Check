package com.nascentech.qeematcheck.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nascentech.qeematcheck.Category;
import com.nascentech.qeematcheck.R;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Category> {

    // declaring our ArrayList of Categorys
    private ArrayList<Category> objects;

    /* here we must override the constructor for ArrayAdapter
    * the only variable we care about now is ArrayList<Category> objects,
    * because it is the list of objects we want to display.
    */
    public CategoryAdapter(Context context, int textViewResourceId, ArrayList<Category> objects) {
        super(context, textViewResourceId, objects);
        this.objects = objects;
    }

    /*
     * we are overriding the getView method here - this is what defines how each
     * list Category will look.
     */
    public View getView(int position, View convertView, ViewGroup parent){

        // assign the view we are converting to a local variable
        View v = convertView;

        // first check to see if the view is null. if so, we have to inflate it.
        // to inflate it basically means to render, or show, the view.
        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.cat_list_item, null);
        }

		/*
		 * Recall that the variable position is sent in as an argument to this method.
		 * The variable simply refers to the position of the current object in the list. (The ArrayAdapter
		 * iterates through the list we sent it)
		 * 
		 * Therefore, i refers to the current Category object.
		 */
        Category i = objects.get(position);

        if (i != null) {

            // This is how you obtain a reference to the TextViews.
            // These TextViews are created in the XML files we defined.

            TextView name = (TextView) v.findViewById(R.id.ItemName);
            TextView date = (TextView) v.findViewById(R.id.ShopAddr);
            ImageView img= (ImageView) v.findViewById(R.id.catimg);
            img.setImageDrawable(v.getResources().getDrawable(i.getImageID()));

            name.setText(i.getName());
            date.setText("Last Updated: "+i.getLastUpdated());

        }

        // the view must be returned to our activity
        return v;

    }

}