package Classes;

public class PersonalSpitalFactory {
    public PersonalSpital createNewPersonal(SpecializariPersonalSpital specializare, String nume, String mail) throws Exception {
        switch (specializare) {
            case Medic:
                return new Medic(nume, mail);
            case Asistent:
                return new Asistent(nume, mail);
            case Brancardier:
                return new Brancardier(nume, mail);
            default:
                throw new Exception("Specializarea mentionata nu a fost gasita!");
        }
    }
}
