package edu.kathford.customadapterlistview;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView movieListView;
    private ArrayList<Movie> movieArrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        movieListView = findViewById(R.id.movieListView);
        setDataSource();
    }

    public void setDataSource(){
        movieArrayList = new ArrayList<Movie>();
        Movie movie = new Movie(1, "THE LADY", "English", "Mystery/Thriller", "120 mins");
        movieArrayList.add(movie);
    }
}
