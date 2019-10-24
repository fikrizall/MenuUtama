package com.nim1718002.menuutama.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.nim1718002.menuutama.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        slideshowViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        final EditText edtNama =root.findViewById(R.id.ed_nama);
        final EditText edtNohp =root.findViewById(R.id.edt_nohp);
        final EditText edtAlamat =root.findViewById(R.id.edt_alamat);

        final TextView tvNama = root.findViewById(R.id.tv_nama);
        final TextView tvNohp = root.findViewById(R.id.tv_nohp);
        final TextView tvAlamat = root.findViewById(R.id.tv_alamat);

        final Button btnTampil= root.findViewById(R.id.btn_tampil);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNama.setText(edtNama.getText().toString());
                tvNohp.setText(edtNohp.getText().toString());
                tvAlamat.setText(edtAlamat.getText().toString());
            }
        });

        return root;
    }
}