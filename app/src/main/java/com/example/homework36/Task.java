package com.example.homework36;

import java.io.Serializable;

public class Task implements Serializable {
    public  int id;
    public String title;
    public String descreption;
    public String prichina;
    public String doctor;
    public boolean checkBox;
    public Task(String title, String descreption, boolean checkBox) {
        this.title = title;
        this.descreption = descreption;
        this.checkBox= checkBox;

    }

    public Task(int id,String title, String descreption, String prichina,String doctor) {
        this.title = title;
        this.descreption = descreption;
        this.prichina = prichina;
        this.doctor = doctor;
        this.id=id;

    }
}

