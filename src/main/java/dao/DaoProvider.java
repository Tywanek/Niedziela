package dao;


import models.Film;
import models.Patient;

import java.util.ArrayList;
import java.util.List;

public class DaoProvider implements DaoInterface{

    private String data = "This is my data";

    private List<Patient> generatePatientList(){
        ArrayList<Patient> lista = new ArrayList<>();
        lista.add(new Patient("Roman","Kowalski",55));
        lista.add(new Patient("Andrzej","Novak",44));
        lista.add(new Patient("Janush","Pik",66));

        return lista;
    }

    @Override
    public List<Patient> getPatientList() {
        List<Patient> mojalista = generatePatientList();
        return mojalista;
    }

    @Override
    public Patient[] getPatientArray() {
        List<Patient> tempList = generatePatientList();
        Patient[] array = new Patient[tempList.size()];
        tempList.toArray(array);
        return array;
       // return  generatePatientList().toArray(new Patient[generatePatientList().size()]);
    }

    public List<Film> getFilmList() {
        return null;
    }

    @Override
    public String getData() {
        return data;
    }
}
