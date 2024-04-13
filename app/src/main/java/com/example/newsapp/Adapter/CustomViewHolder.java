package com.example.newsapp.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.R;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    CardView main_container;
    TextView tv_title, tv_source;
    ImageView img_headline;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        main_container = itemView.findViewById(R.id.main_container);
        tv_title = itemView.findViewById(R.id.tv_title);
        tv_source = itemView.findViewById(R.id.tv_source);
        img_headline = itemView.findViewById(R.id.img_headline);
    }
}
