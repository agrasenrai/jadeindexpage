package com.example.jadeindexpage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    private List<Country> countries;

    public CountryAdapter(List<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_country, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        Country country = countries.get(position);
        holder.countryName.setText(country.getName());
        holder.officeLocation.setText(country.getOfficeLocation());
        holder.countryFlag.setImageResource(country.getFlagResourceId());
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    static class CountryViewHolder extends RecyclerView.ViewHolder {
        ImageView countryFlag;
        TextView countryName;
        TextView officeLocation;

        CountryViewHolder(View itemView) {
            super(itemView);
            countryFlag = itemView.findViewById(R.id.countryFlag);
            countryName = itemView.findViewById(R.id.countryName);
            officeLocation = itemView.findViewById(R.id.officeLocation);
        }
    }
} 