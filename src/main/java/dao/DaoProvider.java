package dao;


import models.Film;
import models.Patient;
import models.OnlineManager;


import java.util.ArrayList;
import java.util.List;

public class DaoProvider implements DaoInterface {

    private String data = "This is my data";

    private List<Patient> generatePatientList() {
        ArrayList<Patient> lista = new ArrayList<>();
        lista.add(new Patient("Roman", "Kowalski", 55));
        lista.add(new Patient("Roman", "Novak", 44));
        lista.add(new Patient("Andrzej", "Novak", 44));
        lista.add(new Patient("Andrzej", "Novak", 45));
        lista.add(new Patient("Andrzej", "Novak", 30));
        lista.add(new Patient("Janush", "Pik", 66));

        return lista;
    }

    @Override
    public List<Patient> getPatientList() {
        List<Patient> mojalista = generatePatientList();
        return mojalista;
    }

    @Override
    public Patient[] getPatientArray() {
        return generatePatientList().toArray(new Patient[generatePatientList().size()]);
    }

    @Override
    public List<Film> getFilmList() {
        List<Film> result = new ArrayList<>();
        try {
            result = OnlineManager.getMovieList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    @Override
    public String getData() {
        return data;
    }


}
