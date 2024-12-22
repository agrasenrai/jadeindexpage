package com.example.jadeindexpage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setupCountriesRecyclerView();
    }

    private void setupCountriesRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.countriesRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        List<Country> countries = new ArrayList<>();
        countries.add(new Country("United States", "New York, NY", R.drawable.flag_us));
        countries.add(new Country("United Kingdom", "London", R.drawable.flag_uk));
        countries.add(new Country("Singapore", "Marina Bay", R.drawable.flag_sg));
        countries.add(new Country("Australia", "Sydney", R.drawable.flag_au));
        countries.add(new Country("Japan", "Tokyo", R.drawable.flag_jp));
        countries.add(new Country("India", "Mumbai", R.drawable.flag_in));

        CountryAdapter adapter = new CountryAdapter(countries);
        recyclerView.setAdapter(adapter);
    }
}