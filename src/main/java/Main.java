import dao.DaoProvider;
import models.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        PatientSelector patientSelector = new PatientSelector();

        System.out.println(Arrays.asList(patientSelector.getPatientsByName()));
        System.out.println(Arrays.asList(patientSelector.getPatientsByAge()));

    }
}
