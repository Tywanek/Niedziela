import dao.DaoProvider;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        PatientSelector patientSelector = new PatientSelector();

        System.out.println(Arrays.asList(patientSelector.getPatientsByName()));
        System.out.println(Arrays.asList(patientSelector.getPatientsByAge()));


        DaoProvider daoProvider = new DaoProvider();
        System.out.println(daoProvider.getFilmList());


    }
}
