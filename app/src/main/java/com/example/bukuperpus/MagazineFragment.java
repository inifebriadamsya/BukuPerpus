package com.example.bukuperpus;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MagazineFragment extends Fragment{

    ListView listView3;
    BookListViewAdapter adapter3;
    String[] nama;
    String[] ID;
    int[] icon;
    String[] status;
    String[] kategori;
    ArrayList<Buku> arrayList3 = new ArrayList<Buku>();

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_magazine, container, false);
        Context context = inflater.getContext();
        setHasOptionsMenu(true);

        nama = new String[]{"Majalah 1", "Majalah 2", "Majalah 3", "Majalah 4", "Majalah 5", "Majalah 6"};
        ID = new String[]{"MB001", "MB002", "MB003", "MB004", "MB005", "MB006"};
        icon = new int[]{R.drawable.magazine, R.drawable.magazine, R.drawable.magazine, R.drawable.magazine, R.drawable.magazine, R.drawable.magazine};
        status = new String[]{"Tersedia", "Tersedia", "Tersedia", "Tersedia", "Tersedia", "Tersedia"};
        kategori = new String[]{"Majalah", "Majalah", "Majalah", "Majalah", "Majalah", "Majalah"};
        for (int i = 0; i < nama.length; i++) {
            Buku buku = new Buku(nama[i], "ID: " +  ID[i], icon[i], status[i], "kategori: " + kategori[i]);
            //bind all strings in an array
            arrayList3.add(buku);
        }

        listView3= view.findViewById(R.id.listView3);

        //pass results to listViewAdapter class
        adapter3 = new BookListViewAdapter(context, arrayList3);

        //bind the adapter to the listview
        listView3.setAdapter(adapter3);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        MenuItem menuItem = menu.findItem(R.id.action_search);
        android.support.v7.widget.SearchView searchView = (android.support.v7.widget.SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText)) {
                    adapter3.filter("");
                    listView3.clearTextFilter();
                } else {
                    adapter3.filter(newText);
                    if (adapter3.isEmpty()){
                        Toast toast = Toast.makeText(getContext(), "Buku tidak ditermukan!", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER_VERTICAL, 0,-250);
                        toast.show();
                    }
                }
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.layout.activity_main:
                return false;
            case R.layout.fragment_textbook:
                return true;
            case R.id.action_logout:
                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        return false;
    }
}
