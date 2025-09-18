package ru.netology;

public class filmManager {
    private int numberOfFilm;
    private films[] filmsRepozit = new films[0];

    public filmManager() {
        this.numberOfFilm = 5;
    }

    public filmManager(int numberOfLastMovies) {
        this.numberOfFilm = numberOfLastMovies;
    }

    public void saveFilm(films movie) {

        films[] tmp = new films[filmsRepozit.length + 1];
        for (int i = 0; i < filmsRepozit.length; i++) {
            tmp[i] = filmsRepozit[i];
        }
        tmp[tmp.length - 1] = movie;
        filmsRepozit = tmp;
    }


    public films[] findAll() {
        return filmsRepozit;
    }

    public films[] findLast() {
        films[] tmp = new films[filmsRepozit.length <= numberOfFilm ? filmsRepozit.length : numberOfFilm];
        int count = filmsRepozit.length - 1;
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = filmsRepozit[count];
            count--;
        }
        return tmp;

    }


}