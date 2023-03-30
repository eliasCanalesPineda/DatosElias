package com.example.datoselias;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class QuienSoy extends Fragment {
    String nombre, apellido, carnet, numero, pasatiempo;
    TextView mosnombre, mosapellido, moscarnet, mosnumero, mospasatiempo;
    Button enviar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View ver = inflater.inflate(R.layout.fragment_quien_soy, container, false);
        mosnombre = ver.findViewById(R.id.textmostrarnom);
        mosapellido = ver.findViewById(R.id.textmostrarapellido);
        moscarnet = ver.findViewById(R.id.textmostrarcarnet);
        mosnumero = ver.findViewById(R.id.textmostrartelefono);
        mospasatiempo = ver.findViewById(R.id.textmostrarpasatiempo);
        enviar = ver.findViewById(R.id.Contactame);
        nombre = "Elias";
        mosnombre.setText(nombre);
        apellido = "Canales Pineda";
        mosapellido.setText(apellido);
        carnet = "SMTS124622";
        moscarnet.setText(carnet);
        numero = "+503 73823381";
        mosnumero.setText(numero);
        pasatiempo = "editar videos y leer mangas";
        mospasatiempo.setText(pasatiempo);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactar();
            }
        });
        return ver;
    }
    public void contactar(){
        String mensaje = "Escribeme";
        String tel = "+503 73823381";
        Uri abrirw = Uri.parse("https://wa.me/" + tel + mensaje);
        Intent abrirv = new Intent(Intent.ACTION_VIEW,abrirw);
        startActivity(abrirv);
    }
}