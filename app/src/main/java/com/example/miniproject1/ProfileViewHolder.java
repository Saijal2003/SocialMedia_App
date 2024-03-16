package com.example.chatit;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ProfileViewHolder extends RecyclerView.ViewHolder {
  public   TextView textViewName, textViewProfession, viewUserProfile ;
   public ImageView imageView;
   public CardView cardView;
    public ProfileViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void setProfile(FragmentActivity fragmentActivity, String name, String uid, String prof, String url){
        cardView = itemView.findViewById(R.id.cardview_profile);
        textViewName = itemView.findViewById(R.id.tv_name_profile);
        textViewProfession = itemView.findViewById(R.id.tv_profession_profile);
        viewUserProfile = itemView.findViewById(R.id.viewUser_profile);
        imageView = itemView.findViewById(R.id.profile_imageView);

        Picasso.get().load(url).into(imageView);
        textViewName.setText(name);
        textViewProfession.setText(prof);
    }
}
