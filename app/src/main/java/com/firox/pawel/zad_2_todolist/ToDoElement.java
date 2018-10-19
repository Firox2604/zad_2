package com.firox.pawel.zad_2_todolist;

import java.io.Serializable;
import java.util.Calendar;

public class ToDoElement implements Serializable {
    private String title;
    private Calendar timestamp;
    private Boolean isTaskCompleted;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getTimestamp() {
        return timestamp;
    }
    public String getTime(){
        StringBuilder sb = new StringBuilder();
        sb.append(timestamp.HOUR_OF_DAY)
                .append(":")
                .append(timestamp.MINUTE)
                .append(" ")
                .append(timestamp.DAY_OF_MONTH)
                .append(".")
                .append(timestamp.MONTH)
                .append(".")
                .append(timestamp.YEAR);
        return  sb.toString();
    }
    public void setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getTaskCompleted() {
        return isTaskCompleted;
    }

    public void setTaskCompleted(Boolean taskCompleted) {
        isTaskCompleted = taskCompleted;
    }

    public ToDoElement(String title, Calendar timestamp, Boolean isTaskCompleted) {
        this.title = title;
        this.timestamp = timestamp;
        this.isTaskCompleted = isTaskCompleted;
    }
}
