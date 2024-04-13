package com.example.newsapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.Model.NewsHeadlines;
import com.example.newsapp.R;
import com.example.newsapp.listener.SelectListener;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    Context context;
    List<NewsHeadlines> list;
    SelectListener listener;

    public CustomAdapter(Context context, List<NewsHeadlines> list, SelectListener listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.headline_list_items, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.tv_title.setText(list.get(position).getTitle());
        holder.tv_source.setText(list.get(position).getSource().getName());
        if (list.get(position).getUrlToImage() != null){
            Picasso.get().load(list.get(position).getUrlToImage()).into(holder.img_headline);
        }

        holder.main_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.OnNewsClicked(list.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
