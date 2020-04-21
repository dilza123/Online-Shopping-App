package com.example.s.ViewHolder;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.s.Interface.itemClickListner;
import com.example.s.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtprodctName, txtProductDescription,txtProductPrice;
    public ImageView imageView;
    public itemClickListner listner;


    public ProductViewHolder(@NonNull View itemView)
    {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.select_product_image);
        txtProductDescription = (TextView) itemView.findViewById(R.id.product_description);
        txtprodctName = (TextView) itemView.findViewById(R.id.product_name);
        txtProductPrice = (TextView) itemView.findViewById(R.id.product_price);
    }
      public void setItemClickListner(itemClickListner listner)
      {
          this.listner = listner;
      }
    @Override
    public void onClick(View v)
    {
        listner.onClick(v,getAdapterPosition(),false);
    }
}
