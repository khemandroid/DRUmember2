package com.thailand.kh.drumember.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thailand.kh.drumember.R;

import java.util.zip.Inflater;

/**
 * Created by Dell on 1/2/2561.
 */

public class RegisterFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_register, container, false);
        return view;
    }
} //Main Class
