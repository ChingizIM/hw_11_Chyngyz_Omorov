package com.company;

public class User {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name)throws IllegalNameLengthException {
        if (name.length() > 20) {
            throw new IllegalNameLengthException(" Имя введено не верно ");
        }else {
            this.name=name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException{
        if (age > 100) {
            throw new IllegalAgeException("ВВедите верный возраст ");
        } else {
            this.age=age;
        }
        this.age = age;


        }
    }


