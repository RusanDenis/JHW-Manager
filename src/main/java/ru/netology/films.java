package ru.netology;

public class films {
    private int filmId;
    private String filmName;

    public films(int filmId, String filmName) {
        this.filmId = filmId;
        this.filmName = filmName;
    }

    public int getFilmId() {
        return filmId;

    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
}
