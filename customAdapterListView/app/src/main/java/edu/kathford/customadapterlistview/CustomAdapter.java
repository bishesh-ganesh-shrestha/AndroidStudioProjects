package edu.kathford.customadapterlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Movie> {
    private ArrayList<Movie> movieArrayList;
    private Activity context;

    public CustomAdapter(Activity context, ArrayList<Movie> movieArrayList) {
        super(context, R.layout.item_movie);
        this.movieArrayList = movieArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.item_movie, parent, false);
        ImageView posterImageView = view.findViewById(R.id.posterImageView);
        TextView movieNameTextView = view.findViewById(R.id.movieNameTextView);
        TextView languageTextView = view.findViewById(R.id.languageTextView);
        TextView genreTextView = view.findViewById(R.id.genreTextView);

        Movie movie = movieArrayList.get(position);

        movieNameTextView.setText(movie.getName());
        languageTextView.setText(movie.getLanguage());
        genreTextView.setText(movie.getGenre());

        return super.getView(position, convertView, parent);
    }
}
