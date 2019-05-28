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
//import android.widget.SearchView;
import android.widget.Toast;
import android.support.v7.widget.SearchView;

import java.util.ArrayList;

public class TextBookFragment extends Fragment{
    ListView listView1;
    BookListViewAdapter adapter1;
    String[] nama;
    String[] ID;
    int[] icon;
    String[] status;
    String[] kategori;
    ArrayList<Buku> arrayList1 = new ArrayList<Buku>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_textbook, container, false);
        setHasOptionsMenu(true);
        Context context = inflater.getContext();

        nama = new String[]{"Text Book 1", "Text Book 2", "Text Book 3", "Text Book 4", "Text Book 5", "Text Book 6"};
        ID = new String[]{"TB001", "TB002", "TB003", "TB004", "TB005", "TB006"};
        icon = new int[]{R.drawable.textbook, R.drawable.textbook, R.drawable.textbook, R.drawable.textbook, R.drawable.textbook, R.drawable.textbook};
        status = new String[]{"Tersedia", "Tersedia", "Tersedia", "Tersedia", "Tersedia", "Tersedia"};
        kategori = new String[]{"Text Book", "Text Book", "Text Book", "Text Book", "Text Book", "Text Book"};
        for (int i = 0; i < nama.length; i++) {
            Buku buku = new Buku(nama[i], "ID: " +  ID[i], icon[i], status[i], "kategori: " + kategori[i]);
            //bind all strings in an array
            arrayList1.add(buku);
        }

        listView1= view.findViewById(R.id.listView1);

        //pass results to listViewAdapter class
        adapter1 = new BookListViewAdapter(context, arrayList1);
        //adapter = new BookListViewAdapter(MainActivity, arrayList);

        //bind the adapter to the listview
        listView1.setAdapter(adapter1);

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
                    adapter1.filter("");
                    listView1.clearTextFilter();
                } else {
                    adapter1.filter(newText);
                    if (adapter1.isEmpty()) {
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
