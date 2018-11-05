package com.genesiss.pimenvibritania.uts_11570550127.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.genesiss.pimenvibritania.uts_11570550127.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    @BindView(R.id.git)
    Button gits;
    @BindView(R.id.txt_nama)
    TextView txtNama;
    @BindView(R.id.txt_nim)
    TextView txtNim;
    @BindView(R.id.txt_tanggal_lahir)
    TextView txtTanggalLahir;
    @BindView(R.id.txt_alamat)
    TextView txtAlamat;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, v);

        gits.findViewById(R.id.git).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clicked_btn("https://www.github.com/pimenvibritania");

            }
        });

        initUI();

        return v;


    }

    private void initUI() {
        txtNama.setText("Pirman Abdurohman");
        txtNim.setText("1157050127");
        txtTanggalLahir.setText("Sukabumi, 15 Oktober 1995");
        txtAlamat.setText("Asrama Granada , Jl. AH. Nasution, Cibiru , Kota Bandung");
    }

    public void clicked_btn(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


}
