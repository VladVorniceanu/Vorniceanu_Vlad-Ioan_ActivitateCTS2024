package SustinereExamene_SingletonRegistry;

import SustinereExamene_SingletonRegistry.Classes.Student;
import SustinereExamene_SingletonRegistry.Classes.SustinereExamen;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student(123,"Pop Denis", "popdenis21@stud.ase.ro", 3);
        Student student2 = new Student(124,"Popa Gheorghe", "popagheorghe22@stud.ase.ro", 2);
        Student student3 = new Student(125,"Ion Ion", "ionion23@stud.ase.ro", 1);
        Student student4 = new Student(126,"Andrei Ion", "andreiion21@stud.ase.ro", 3);

        SustinereExamen examenPoo = new SustinereExamen("Programare Orientata Obiect");
        SustinereExamen examenCTS = new SustinereExamen("Calitate si Testare Software");

        examenPoo.inregistrareStudentLaExamen(student1);
        examenPoo.inregistrareStudentLaExamen(student2);
        examenPoo.inregistrareStudentLaExamen(student1);
        examenPoo.inregistrareStudentLaExamen(student3);
        examenPoo.inregistrareStudentLaExamen(student4);
    }
}
