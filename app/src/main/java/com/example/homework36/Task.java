package com.example.homework36;

public class Task {
    public String title;
    public String descreption;
    public String adress;
    public String hobbi;
    public String nomer;
    public boolean checkBox;
    public Task(String title, String descreption, boolean checkBox) {
        this.title = title;
        this.descreption = descreption;
        this.checkBox= checkBox;

    }

    public Task(String title, String descreption, String adress, String hobbi, String nomer) {
        this.title = title;
        this.descreption = descreption;
        this.adress = adress;
        this.hobbi = hobbi;
        this.nomer = nomer;
    }
}

