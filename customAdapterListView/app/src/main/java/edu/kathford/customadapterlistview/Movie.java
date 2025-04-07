package edu.kathford.customadapterlistview;

public class Movie {
    private Integer id;
    private String name;
    private String language;
    private String genre;
    private String duration;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Movie(Integer id, String name, String language, String genre, String duration) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.genre = genre;
        this.duration = duration;
    }
}
