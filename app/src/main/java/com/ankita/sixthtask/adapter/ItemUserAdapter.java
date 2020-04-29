package com.ankita.sixthtask.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ankita.sixthtask.R;
import com.ankita.sixthtask.model.User;

import java.util.ArrayList;

public class ItemUserAdapter extends RecyclerView.Adapter<ItemUserAdapter.ItemHolder> {

    private Context context;
    public static int checkedCount=0;
    private ArrayList<User> userList;
    private OnItemSelected onItemSelected;

    public ItemUserAdapter(Context context, ArrayList<User> userList, OnItemSelected onItemSelected) {
        this.context = context;
        this.userList = userList;
        this.onItemSelected = onItemSelected;
    }


    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, final int position) {
        holder.tvPostTitleValue.setText(userList.get(position).getTitle());
        holder.tvCreatedAtValue.setText(userList.get(position).getCreated_at());
        holder.tvItemLink.setText(userList.get(position).getUrl());
        holder.tvCreatedAt.setText("Created at");
        holder.tvTitle.setText("Post Title");
        holder.switchSelected.setChecked(userList.get(position).isSelected());
        holder.switchSelected.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onItemSelected.onSelect(buttonView,isChecked,position);
                if(buttonView.isChecked()){
                    userList.get(position).setSelected(true);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        TextView tvCreatedAtValue,tvItemLink,tvPostTitleValue,tvCreatedAt,tvTitle;
        Switch switchSelected;
        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            tvCreatedAtValue=itemView.findViewById(R.id.tvCreatedAtValue);
            tvItemLink=itemView.findViewById(R.id.tvItemLink);
            tvPostTitleValue=itemView.findViewById(R.id.tvPostTitleValue);
            tvCreatedAt=itemView.findViewById(R.id.tvCreatedAt);
            tvTitle=itemView.findViewById(R.id.tvPostTitle);
            switchSelected=itemView.findViewById(R.id.switchSelectUser);

        }
    }
}
