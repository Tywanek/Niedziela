package dao;

import models.Film;
import models.Patient;

import java.util.List;

public interface DaoInterface {

    List<Patient> getPatientList();
    Patient[] getPatientArray();
    List<Film> getFilmList();
    String getData();
}
