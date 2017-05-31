package com.projects.cristianzapata.tagventas;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class tabFrutas extends Fragment {

    ListView lv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         //Arreglo de datos a mostrar
        frutas frutas[] = new frutas[]{
                new frutas(R.drawable.apples,"Manzana","$2.000"),
                new frutas(R.drawable.grapes,"Uvas","$3.000"),
                new frutas(R.drawable.onions,"Cebollas","$1.000"),
                new frutas(R.drawable.oranges,"Naranjas","$1.500"),
                new frutas(R.drawable.potatoes,"Papas","$2.500"),
        };
        frutasAdapter adapter = new frutasAdapter(getActivity(),R.layout.frutas_row,frutas);
        View rootView = inflater.inflate(R.layout.fragment_tab_frutas, container, false);
        lv = (ListView) rootView.findViewById(R.id.listaFrutas);
        lv.setAdapter(adapter);
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_tab_frutas, container, false);
        return rootView;
    }
}
