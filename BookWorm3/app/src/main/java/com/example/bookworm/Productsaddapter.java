package com.example.bookworm;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Productsaddapter  extends ArrayAdapter<Products> {
    List<Products>productsList;
    public Productsaddapter(@NonNull Context context, int resource, @NonNull List<Products> objects) {
        super(context, resource, objects);
        productsList= objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
         View view = LayoutInflater.from(getContext()).inflate(R.layout.listproduct,parent,false);
        Products currentproducts = productsList.get(position);
        TextView bookName = view.findViewById(R.id.textView2);
        TextView bookAuthor = view.findViewById(R.id.textView3);
        TextView bookpprice= view.findViewById(R.id.textView4);
        TextView bookprice = view.findViewById(R.id.textView5);
        TextView bookpricee = view.findViewById(R.id.textView6);
        ImageView bii = view.findViewById(R.id.imageView);
        ImageButton delete = view.findViewById(R.id.imageView2);

        bookName.setText(currentproducts.getName());
        bookAuthor.setText(currentproducts.getAuthor());
        bookpprice.setText(currentproducts.getPprice());
        bookprice.setText(String.valueOf(currentproducts.getPrice()));
        bookpricee.setText(currentproducts.getPricee());
        bii.setImageResource(currentproducts.getBi());



        return view;}}
