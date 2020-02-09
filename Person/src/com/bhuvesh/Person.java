package com.bhuvesh;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 101) {
            this.age = age;
        } else
            this.age = 0;
    }

    public boolean isTeen (){
        if (age>12 && age <20){
            return true;
        }else
            return false;
    }

    public String getFullName(){
        String fullName = "";
        if(firstName.isEmpty() && lastName.isEmpty()){
            return fullName;
        }

        if(lastName.isEmpty()){
            return firstName;
        }

        if(firstName.isEmpty()){
            return lastName;
        }
        fullName = this.firstName + " " + this.lastName;
        return fullName;
    }
}
