package uni.fmi.services;

import uni.fmi.models.Developers;

import java.util.Collections;
import java.util.List;

public class DeveloperRegisterService {
    private  static List<Developers> DevelopersDB = Collections.singletonList(new Developers("Mitko", true));

    public static String Register(final String name, final  boolean isAdmin){
        boolean isUnique = DevelopersDB.stream().anyMatch(d->name.equals(d.getFirstName()));
        return isUnique ? "Its already registered" : "Success";
    }
}
