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

public class Arranceles extends Fragment {
    String parvularia, graduado, colegio,univerisdad,ciclo, materias;
    TextView par, gra, col, uni,cicl, mat;
    Button go;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View observar=  inflater.inflate(R.layout.fragment_arranceles, container, false);
        par = observar.findViewById(R.id.textmostrarpar);
        gra = observar.findViewById(R.id.textmostrargra);
        col = observar.findViewById(R.id.textmostrarcole);
        uni = observar.findViewById(R.id.textmostraruni);
        cicl = observar.findViewById(R.id.textmostrarciclo);
        mat = observar.findViewById(R.id.textmostrarmater);
        go = observar.findViewById(R.id.Ver);
        parvularia ="Liceo San Miguel";
        par.setText(parvularia);
        graduado = "Liceo San Miguel";
        gra.setText(graduado);
        colegio = "CIPC";
        col.setText(colegio);
        univerisdad = "UGB";
        uni.setText(univerisdad);
        ciclo = "Ciclo III";
        cicl.setText(ciclo);
        materias = "4 Materias";
        mat.setText(materias);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri ir = Uri.parse("https://ugb.edu.sv/");
                Intent uni = new Intent(Intent.ACTION_VIEW, ir);
                startActivity(uni);
            }
        });
        return observar;
   }
}
