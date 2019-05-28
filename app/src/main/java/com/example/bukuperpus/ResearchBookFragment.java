package com.example.bukuperpus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.support.v7.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class ResearchBookFragment extends Fragment{

    ListView listView2;
    BookListViewAdapter adapter2;
    String[] nama;
    String[] ID;
    int[] icon;
    String[] status;
    String[] kategori;
    ArrayList<Buku> arrayList2 = new ArrayList<Buku>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_researchbook, container, false);
        Context context = inflater.getContext();
        setHasOptionsMenu(true);

        nama = new String[]{"Hasil Riset 1", "Hasil Riset 2", "Hasil Riset 3", "Hasil Riset 4", "Hasil Riset 5", "Hasil Riset 6"};
        ID = new String[]{"RB001", "RB002", "RB003", "RB004", "RB005", "RB006"};
        icon = new int[]{R.drawable.research, R.drawable.research, R.drawable.research, R.drawable.research, R.drawable.research, R.drawable.research};
        status = new String[]{"Tersedia", "Tersedia", "Tersedia", "Tersedia", "Tersedia", "Tersedia"};
        kategori = new String[]{"Hasil Riset", "Hasil Riset", "Hasil Riset", "Hasil Riset", "Hasil Riset", "Hasil Riset"};
        for (int i = 0; i < nama.length; i++) {
            Buku buku = new Buku(nama[i], "ID: " +  ID[i], icon[i], status[i], "kategori: " + kategori[i]);
            //bind all strings in an array
            arrayList2.add(buku);
        }

        listView2= view.findViewById(R.id.listView2);

        //pass results to listViewAdapter class
        adapter2 = new BookListViewAdapter(context, arrayList2);

        //bind the adapter to the listview
        listView2.setAdapter(adapter2);


        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText)) {
                    adapter2.filter("");
                    listView2.clearTextFilter();
                } else {
                    adapter2.filter(newText);
                    if (adapter2.isEmpty()){
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
                Toast toast = Toast.makeText(getContext().getApplicationContext(), "Memproses untuk keluar...",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                toast.show();
                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        return false;
    }
}