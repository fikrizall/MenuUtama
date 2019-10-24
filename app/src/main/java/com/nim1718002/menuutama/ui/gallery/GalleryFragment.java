package com.nim1718002.menuutama.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.nim1718002.menuutama.R;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        final TextView bil1_i = root.findViewById(R.id.et_bil1);
        final TextView bil2_i = root.findViewById(R.id.et_bil2);
        final TextView hasil_o = root.findViewById(R.id.tv_hasil);

        final Button tambah = root.findViewById(R.id.btn_tambah);
        final Button kurang = root.findViewById(R.id.btn_kurang);
        final Button kali = root.findViewById(R.id.btn_kali);
        final Button bagi = root.findViewById(R.id.btn_bagi);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = bil1_i.getText().toString();
                String n2 = bil2_i.getText().toString();

                double bil1 =Double.parseDouble(n1);
                double bil2 =Double.parseDouble(n2);
                double hasil = bil1+bil2;
                hasil_o.setText(Double.toString(hasil));
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = bil1_i.getText().toString();
                String n2 = bil2_i.getText().toString();

                double bil1 =Double.parseDouble(n1);
                double bil2 =Double.parseDouble(n2);
                double hasil = bil1-bil2;
                hasil_o.setText(Double.toString(hasil));
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = bil1_i.getText().toString();
                String n2 = bil2_i.getText().toString();

                double bil1 =Double.parseDouble(n1);
                double bil2 =Double.parseDouble(n2);
                double hasil = bil1*bil2;
                hasil_o.setText(Double.toString(hasil));
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = bil1_i.getText().toString();
                String n2 = bil2_i.getText().toString();

                double bil1 =Double.parseDouble(n1);
                double bil2 =Double.parseDouble(n2);
                double hasil = bil1/bil2;
                hasil_o.setText(Double.toString(hasil));
            }
        });

        return root;
    }
}