package SustinereExamene_SingletonRegistry.Classes;

public class Student {
    private int id;
    private String nume;
    private String mail;
    private int anStudii;

    public Student(int id, String nume, String mail, int anStudii) {
        this.id = id;
        this.nume = nume;
        this.mail = mail;
        this.anStudii = anStudii;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Student: {" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", mail='" + mail + '\'' +
                ", anStudii=" + anStudii +
                '}';
    }
}
