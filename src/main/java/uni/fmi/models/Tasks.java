package uni.fmi.models;

import sun.java2d.windows.GDIWindowSurfaceData;

import java.util.*;

/**
 * 
 */
public class Tasks {

    String nameTask;
    String status;
    String statusMsg;
    String descriptionTask;
    String devDoing;

    public Tasks() {
    }

    /**
     * 
     */


    public Projects Projects;

    /**
     * 
     */
    public Set<Tasks> SubTasks;

    /**
     * 
     */
    public Tasks Tasks;

    /**
     * @return
     */
    public void getNameTask() {
        // TODO implement here
    }

    /**
     * @param nameTask 
     * @return
     */
    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    /**
     * @return
     */
    public void getStatus() {
    }

    /**
     * @param status 
     * @return
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     */
    public void getStatusMsg() {
        // TODO implement here
    }

    /**
     * @param statusMsg 
     * @return
     */
    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    /**
     * @return
     */
    public void getDescriptionTask() {
        // TODO implement here
    }

    /**
     * @param descriptionTask 
     * @return
     */
    public void setDescriptionTask(String descriptionTask) {
        this.descriptionTask = descriptionTask;
    }

    /**
     * @return
     */
    public void getDevDoing() {
        // TODO implement here
    }

    /**
     * @param devDoing 
     * @return
     */
    public void setDevDoing(String devDoing) {
        this.devDoing = devDoing;
    }

    /**
     * @return
     */
    public void changeStatus() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void getProjects() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void getTasks() {
        // TODO implement here
    }

    /**
     * @param Tasks 
     * @return
     */
    public void addSubTasks(Tasks Tasks) {
        // TODO implement here
    }

}