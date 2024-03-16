package com.example.chatit.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chatit.R;
import com.example.chatit.models.PostMember;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FragmentThree extends Fragment {

    FirebaseDatabase database;
    DatabaseReference databaseReference, databaseReference1, profileRef;
    RecyclerView recyclerView, recyclerView_profile ;
   PostMember.RequestMember requestMember;
    TextView requestTv ;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        return  view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String currentUserId = user.getUid();
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("Requests").child(currentUserId);
        profileRef = database.getReference("All Users");

        requestMember = new PostMember.RequestMember();
        recyclerView_profile = requireActivity().findViewById(R.id.recyclerview_profile);
        recyclerView_profile.setHasFixedSize(true);
        recyclerView_profile.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView = requireActivity().findViewById(R.id.recyclerview_requestsf3);
        requestTv = getActivity().findViewById(R.id.requestsTv);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        //  MediaController mediaController;


    }

    @Override
    public void onStart() {
        super.onStart();

    }
}