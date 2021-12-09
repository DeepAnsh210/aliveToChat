package com.alivetocode.alivetochat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class ChatsFragment extends Fragment {

    MessageAdapter messageAdapter;
    List<Chat> mChat;

    RecyclerView recyclerView;

    public ChatsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chats, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        // Pinning content to the bottom edge
        linearLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(linearLayoutManager);

        view.findViewById(R.id.btn_send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mChat = new ArrayList<>();
                EditText msg = view.findViewById(R.id.text_send);
                Chat c = new Chat("", "", msg.getText().toString());
                mChat.add(c);
                c = new Chat("", "", "msg.getText().toString()");
                mChat.add(c);
                c = new Chat("", "", "haaaa");
                mChat.add(c);

                messageAdapter = new MessageAdapter(getContext(), mChat, "default");
                recyclerView.setAdapter(messageAdapter);
            }
        });

        return view;
    }

    // Load Messages to Chat class
    private void readMessages(String myId, String userId, String imageUrl) {
//        mChat = new ArrayList<>();


    }
}