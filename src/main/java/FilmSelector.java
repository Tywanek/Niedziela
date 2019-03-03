import dao.DaoProvider;
import models.Film;

import java.util.ArrayList;
import java.util.List;

public class FilmSelector implements FilmSelectorInterface {

    private List<Film> films = new ArrayList<>();

    public FilmSelector(DaoProvider daoProvider) {
        this.films = daoProvider.getFilmList();
    }

    @Override
    public List<Film> getFilmListByName() {
        return null;
    }

    @Override
    public List<Film> getFilmListByYear() {
        return null;
    }

    @Override
    public List<Film> getFilmListByCountry(String countryName) {
        return null;
    }
}
