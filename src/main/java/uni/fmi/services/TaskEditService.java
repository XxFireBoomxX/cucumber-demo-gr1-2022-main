package uni.fmi.services;

import uni.fmi.models.Developers;

import java.util.Collections;
import java.util.List;

public class TaskEditService {
    private static List<Develope> DeveloperDB = Collections.singletonList(new Developers("Mitko", true));

    public static Boolean CheckDeveloper(final String firstName){
        boolean isUnique = DeveloperDB.stream().anyMatch(d->firstName.equals(d.getFirstName()));
        return isUnique;
    }
}
