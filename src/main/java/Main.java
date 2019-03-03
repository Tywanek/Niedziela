import dao.DaoProvider;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        FilmSelector filmSelector = new FilmSelector(new DaoProvider());

        System.out.println(Arrays.asList(filmSelector.getAllFilms()));
        System.out.println(Arrays.asList(filmSelector.getFilmListByNameSort()));

    }
}
