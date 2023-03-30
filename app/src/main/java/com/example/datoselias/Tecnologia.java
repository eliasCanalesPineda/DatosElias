package com.example.datoselias;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Tecnologia extends Fragment {
    String editar, aftereffects, capcut, alight, programar, dibujar;
    TextView ed, ae, ca, al, pr, db;
    Button Ir;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View tec = inflater.inflate(R.layout.fragment_tecnologia, container, false);
        ed = tec.findViewById(R.id.textmostraredi);
        ae = tec.findViewById(R.id.textmostrarae2);
        ca = tec.findViewById(R.id.textmostrarccp);
        al = tec.findViewById(R.id.textmostraraml);
        pr = tec.findViewById(R.id.textmostrarpro);
        db = tec.findViewById(R.id.textmostrardib);
        Ir = tec.findViewById(R.id.Ir);
        editar = "Editar videos";
        ed.setText(editar);
        aftereffects = "After Effects";
        ae.setText(aftereffects);
        capcut = "manejo de transiciones";
        ca.setText(capcut);
        alight = "manejo de calidad de edicion";
        al.setText(alight);
        programar = "C#, C++,html, python, Pseint y Java";
        pr.setText(programar);
        dibujar = "dibujo digital";
        db.setText(dibujar);
        Ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Enviar_Email();
            }
        });
        return tec;
    }
    public void Enviar_Email(){
        String enviar = "Me interesan tus servicios";
        String mensaje ="";
        Intent abrir = new Intent(Intent.ACTION_SEND);
        abrir.putExtra(Intent.EXTRA_EMAIL, new String[]{});
        abrir.putExtra(Intent.EXTRA_SUBJECT, enviar);
        abrir.putExtra(Intent.EXTRA_TEXT, mensaje);
        abrir.setType("message/rfc822");
        startActivity(Intent.createChooser(abrir, "Ayuda necesaria"));
    }
}