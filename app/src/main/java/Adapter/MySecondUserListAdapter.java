package Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmandretrofitandinterseptor.R;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import MyModel.Other;

public class MySecondUserListAdapter extends RecyclerView.Adapter<MySecondUserListAdapter.MyViewHolder>
{

    private Context context;
    private List<Other> userList=new ArrayList<Other>();

    public MySecondUserListAdapter(Context context, List<Other> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_user_second,parent,false);
        return new MyViewHolder(view);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position)
    {
        Other other=userList.get(position);
        holder.mName.setText(other.getName());
       // holder.mId.setText(other.getId());
        Picasso.get().load(other.getSmallImage()).into(holder.mImage);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        private final TextView mId;
        private final TextView mName;
        private ImageView mImage;
        public MyViewHolder(@NonNull @NotNull View itemView)
        {
            super(itemView);
            mId=itemView.findViewById(R.id.item_id);
            mName=itemView.findViewById(R.id.item_name);
            mImage=itemView.findViewById(R.id.small_image);
        }
    }
}
