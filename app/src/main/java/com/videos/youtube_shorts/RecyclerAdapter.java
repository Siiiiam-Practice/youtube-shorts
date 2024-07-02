package com.videos.youtube_shorts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class RecyclerAdapter extends RecyclerView.Adapter {
    public class RecyclerShorts extends RecyclerView.ViewHolder {
        YouTubePlayerView playerView;
        public RecyclerShorts(@NonNull View itemView) {
            super(itemView);
            playerView = itemView.findViewById(R.id.player_view);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shorts, parent, false);

        return new RecyclerShorts(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RecyclerShorts item = (RecyclerShorts) holder;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
