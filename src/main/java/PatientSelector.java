import dao.DaoProvider;
import models.Patient;

import java.util.Arrays;
import java.util.Comparator;

public class PatientSelector implements PatientSelectorInterface {

    private Patient[] patientList;

    public PatientSelector() {
        DaoProvider daoProvider = new DaoProvider();
        this.patientList = daoProvider.getPatientArray();
    }

    @Override
    public Patient[] getPatientsByName() {
        Arrays.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        
        Arrays.sort(patientList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        return patientList;
    }

    @Override
    public Patient[] getPatientsByAge() {
        Arrays.sort(patientList, (o1, o2) -> o1.getAge() - o2.getAge());

        return patientList;
    }
}
