package com.camila.databinding19032016;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.camila.databinding19032016.databinding.ItemUserBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 19/03/2016.
 */
public class Adapter extends BaseAdapter{

    List<User> users = new ArrayList<>();
    LayoutInflater mInflater;

    public Adapter(List<User> users, LayoutInflater mInflater) {
        this.users = users;
        this.mInflater = mInflater;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemUserBinding mBinding = ItemUserBinding.inflate(mInflater,parent,false);

        mBinding.setUsuario((users.get(position)));

        return mBinding.getRoot();
    }
}
