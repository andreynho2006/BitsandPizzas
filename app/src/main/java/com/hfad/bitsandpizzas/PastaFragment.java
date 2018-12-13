package com.hfad.bitsandpizzas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PastaFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView pastaRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_pasta, container, false);
        String[] pastaNames = new String[com.hfad.bitsandpizzas.Pasta.pastas.length];
        for (int i = 0; i < pastaNames.length; i++) {
            pastaNames[i] = com.hfad.bitsandpizzas.Pasta.pastas[i].getName();
        }

        int[] pastaImages = new int[com.hfad.bitsandpizzas.Pasta.pastas.length];
        for (int i = 0; i < pastaImages.length; i++) {
            pastaImages[i] = com.hfad.bitsandpizzas.Pasta.pastas[i].getImageResourceId();
        }

        com.hfad.bitsandpizzas.CaptionedImagesAdapter adapter = new com.hfad.bitsandpizzas.CaptionedImagesAdapter(pastaNames, pastaImages);
        pastaRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        pastaRecycler.setLayoutManager(layoutManager);
        return pastaRecycler;

    }
}