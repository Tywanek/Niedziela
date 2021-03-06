import models.Film;

import java.util.List;

public interface FilmSelectorInterface {
    List<Film> getAllFilms();
    List<Film> getFilmListByNameSort();
    List<Film> getFilmListByNameStream();
    List<Film> getFilmListByYear();
    List<Film> getFilmListByCountry(String countryName);
}
