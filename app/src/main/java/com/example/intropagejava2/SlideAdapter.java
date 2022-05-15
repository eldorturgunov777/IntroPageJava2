package com.example.intropagejava2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eldor Turgunov on 15.05.2022.
 * Intro Page Java2
 * eldorturgunov777@gmail.com
 */
public class SlideAdapter extends RecyclerView.Adapter<SlideAdapter.MyViewHolder> {
    List<ListData> arrayList;
    Context context;

    public SlideAdapter(List<ListData> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ListData data = arrayList.get(position);

        holder.lottieAnimationView.setAnimation(data.getImg());
        holder.title.setText(data.getTitle());
        holder.desc.setText(data.getDesc());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        LottieAnimationView lottieAnimationView;
        TextView title;
        TextView desc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            lottieAnimationView = itemView.findViewById(R.id.anim);
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);

        }
    }
}
