package com.gacovid19project.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gacovid19project.Models.FreeFood;
import com.gacovid19project.R;

import java.util.List;

public class FreeFoodAdapter extends RecyclerView.Adapter<FreeFoodAdapter.ImageViewHolder> {

    private Context mContext;
    private List<FreeFood> mFree_Food;

    public FreeFoodAdapter(Context context, List<FreeFood> list) {
        mContext = context;
        mFree_Food = list;
    }


    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.single_free_food, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ImageViewHolder holder, final int position) {

        final FreeFood freeFood = mFree_Food.get(position);

        holder.District.setText(freeFood.getDistrict());
        holder.Phone_Number.setText(freeFood.getPhone_number());
    }

    @Override
    public int getItemCount() {
        return mFree_Food.size();
    }



    public class ImageViewHolder extends RecyclerView.ViewHolder {

        public TextView District, Phone_Number;
        public ImageViewHolder(View itemView) {
            super(itemView);

            District = itemView.findViewById(R.id.district);
            Phone_Number = itemView.findViewById(R.id.phone_number);
        }
    }

}