import dao.DaoProvider;
import models.Film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSelector implements FilmSelectorInterface {

    private List<Film> films = new ArrayList<>();

    public FilmSelector(DaoProvider daoProvider) {
        this.films = daoProvider.getFilmList();
    }

    @Override
    public List<Film> getAllFilms() {
        return this.films;
    }

    @Override
    public List<Film> getFilmListByNameSort() {
        Film[] filmArray = this.films.toArray(new Film[this.films.size()]);
        Arrays.sort(filmArray, (o1, o2) -> o1.getNazwa().compareTo(o2.getNazwa()));
        return Arrays.asList(filmArray);
    }

    @Override
    public List<Film> getFilmListByNameStream() {
        List<Film> result = this.films
                .stream()
                .sorted((p1, p2) -> p1.getNazwa().compareTo(p2.getNazwa()))
                .collect(Collectors.toList());
        return result;
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
