import dao.DaoProvider;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        FilmSelector filmSelector = new FilmSelector(new DaoProvider());

        PatientSelector patientSelector =  new PatientSelector(new DaoProvider());
        System.out.println(Arrays.asList(patientSelector.getCustomSort()));

//        System.out.println(Arrays.asList(filmSelector.getAllFilms()));
//        System.out.println(Arrays.asList(filmSelector.getFilmListByNameSort()));
//        System.out.println("######################################");
//        System.out.println(Arrays.asList(filmSelector.getCustomFilter()));

    }
}
