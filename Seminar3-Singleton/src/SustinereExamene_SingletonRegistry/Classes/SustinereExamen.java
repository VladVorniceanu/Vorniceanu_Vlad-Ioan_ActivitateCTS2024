package SustinereExamene_SingletonRegistry.Classes;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
    private String numeMaterie;
    private Map<Integer, Student> listaStudenti = new HashMap<>();

    public SustinereExamen(String numeMaterie) {
        this.numeMaterie = numeMaterie;
    }

    public String getNumeMaterie() {
        return numeMaterie;
    }

    public Map<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public void inregistrareStudentLaExamen(Student student) {
        if(listaStudenti.containsKey(student.getId())) {
            System.out.println("Studentul " + student.getNume() + " a sustinut deja examenul.");
        } else {
            listaStudenti.put(student.getId(), student);
            System.out.println("Studentul " + student.getNume() + " sustine acum examenul.");
        }
//        listaStudenti.putIfAbsent()
    }
}
