package com.example.usingrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LanScapeAdapter extends RecyclerView.Adapter<LanScapeAdapter.ItemLandHolder> {
   Context context;
   ArrayList<LandScape> lstData;
    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bon = LayoutInflater.from(context);
        View vItem = cai_bon.inflate(R.layout.item_land, parent, false);
        ItemLandHolder viewhoderCreated = new ItemLandHolder(vItem);
        return  viewhoderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
    // lấy đt hiển thị
        LandScape landScapeHienthi = lstData.get(position);
        //TRích thông tin
        String caption = landScapeHienthi.getLandCation();
        String tenAnh = landScapeHienthi.getLandImageFileName();
        // đặt vào các trường thông tin của hoder
        holder.tvCaption.setText(caption);
        //đặt ảnh
            String packagename = holder.itemView.getContext().getPackageName();
            int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipmap", packagename);
         holder.ivViewLandScape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends  RecyclerView.ViewHolder{
    TextView tvCaption;
    ImageView ivViewLandScape;
        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivViewLandScape = itemView.findViewById(R.id.imageViewLand);
        }
    }

}
