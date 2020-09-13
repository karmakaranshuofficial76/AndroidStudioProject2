package com.anshukarmakar.recycler_121710303003;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    Context context;
    ArrayList<MainModel> mainModels;

    public MainAdapter(Context context2, ArrayList<MainModel> mainModels2) {
        this.context = context2;
        this.mainModels = mainModels2;
    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false));
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.imageView.setImageResource(this.mainModels.get(position).getImageLogo());
        holder.textView.setText(this.mainModels.get(position).getImageName());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainAdapter.this.context, DetailsActivity.class);
                intent.putExtra("logo", MainAdapter.this.mainModels.get(position).getImageLogo());
                intent.putExtra("name", MainAdapter.this.mainModels.get(position).getImageName());
                MainAdapter.this.context.startActivity(intent);
            }
        });
    }

    public int getItemCount() {
        return this.mainModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        LinearLayout linearLayout;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.iv);
            this.textView = (TextView) itemView.findViewById(R.id.tv);
            this.linearLayout = (LinearLayout) itemView.findViewById(R.id.linear_layout);
        }
    }
}
