package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



    class filmManagerTest {
        films movie1 = new films(1, "The Fast and the Furious");
        films movie2 = new films(2, "The Fast and the Furious 2");
        films movie3 = new films(3, "The Fast and the Furious 3");
        films movie4 = new films(4, "The Fast and the Furious 4");
        films movie5 = new films(5, "The Fast and the Furious 5");
        films movie6 = new films(6, "The Fast and the Furious 6");
        filmManager manager = new filmManager(3);

        @BeforeEach
        public void setup() {
            manager.saveFilm(movie1);
            manager.saveFilm(movie2);
            manager.saveFilm(movie3);
            manager.saveFilm(movie4);
            manager.saveFilm(movie5);
            manager.saveFilm(movie6);
        }

        @Test
        void shouldSaveMovie() {
            manager.saveFilm(movie1);
            manager.saveFilm(movie2);
            manager.saveFilm(movie3);

            films[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie1, movie2, movie3};

            Assertions.assertArrayEquals(expected, manager.findAll());
        }


        @Test
        void shouldFindAll() {
           films[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};

            Assertions.assertArrayEquals(expected, manager.findAll());

        }

        @Test
        void findLast3() {
            films[] expected = {movie6, movie5, movie4};

            Assertions.assertArrayEquals(expected, manager.findLast());
        }

        @Test
        void findLast5() {
            filmManager defaultManager = new filmManager();

            defaultManager.saveFilm(movie1);
            defaultManager.saveFilm(movie2);
            defaultManager.saveFilm(movie3);


            films[] expected = {movie3, movie2, movie1};

            Assertions.assertArrayEquals(expected, defaultManager.findLast());
        }
    }


