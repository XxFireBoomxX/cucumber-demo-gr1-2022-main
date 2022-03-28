package uni.fmi.services;

import uni.fmi.models.Projects;

import java.util.Collections;
import java.util.List;

public class TaskCreationService
{
    private static List<Projects> ProjectDB = Collections.singleton(new Projects("IT Project"));

    public static String checkExist(final String projectName){
        boolean doExist = ProjectDB.stream().anyMatch(p->projectName.equals(p.getNameProject()));
        return doExist ? "Success" : "Project doesnt exist";
    }

}
