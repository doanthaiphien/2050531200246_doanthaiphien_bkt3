package com.example.a2050531200246_doanthaiphien_baikt3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class tacgiaAdapter extends BaseAdapter {
    Activity activity;
    List<tacgia> tacgias;

    public tacgiaAdapter(Activity activity, List<tacgia> tacgias) {
        this.activity = activity;
        this.tacgias = tacgias;
    }
    @Override
    public int getCount() {
        return tacgias.size();
    }

    @Override
    public Object getItem(int i) {
        return tacgias.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.layoutitem, null);
        TextView tvName = (TextView) view.findViewById(R.id.tencasi);
        ImageView imageView = (ImageView) view.findViewById(R.id.hinhcasi);

        tvName.setText(tacgias.get(i).getTenTacGia());
        imageView.setImageResource(tacgias.get(i).getHinhAnh());

        return view;
    }
}
