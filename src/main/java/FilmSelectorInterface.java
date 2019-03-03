import models.Film;

import java.util.List;

public interface FilmSelectorInterface {
    List<Film> getAllFilms();
    List<Film> getFilmListByName();
    List<Film> getFilmListByYear();
    List<Film> getFilmListByCountry(String countryName);
}
