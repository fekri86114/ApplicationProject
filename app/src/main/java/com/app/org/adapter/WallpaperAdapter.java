package com.app.org.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.app.org.R;
import com.app.org.model.WallpaperModel;
import com.bumptech.glide.Glide;

import java.util.List;

public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperAdapter.WallpaperViewHolder> {

    private List<WallpaperModel> wallpaperModelList;

    public WallpaperAdapter(List<WallpaperModel> wallpaperModelList) {
        this.wallpaperModelList = wallpaperModelList;
    }

    public static class WallpaperViewHolder extends RecyclerView.ViewHolder{
        private AppCompatTextView textViewWallpaper;
        private AppCompatImageView imageViewWallpaper;

        public WallpaperViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewWallpaper =itemView.findViewById(R.id.textview_wallpaper);
            imageViewWallpaper =itemView.findViewById(R.id.imageview_wallpaper);
        }
    }
    @NonNull
    @Override
    public WallpaperViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WallpaperViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview_wallpaper, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull WallpaperViewHolder holder, int position) {
        WallpaperModel wallpaperModel = wallpaperModelList.get(position);
        Glide.with(holder.itemView.getContext()).load(wallpaperModel.getWallpaperImage()).into(holder.imageViewWallpaper);
        holder.textViewWallpaper.setText(wallpaperModel.getWallpaperName());

    }

    @Override
    public int getItemCount() {
        return wallpaperModelList.size();
    }


}
