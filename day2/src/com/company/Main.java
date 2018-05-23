package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person=new Person(1,"Belal","Faouri","Salalem",1515,"Jordanian","Amman",73,177,true);
        System.out.println(person.getFullName());

        Person p1=new Person();
        Person p2=new Person();
        Person p3=new Person();

        System.out.println(Person.counter);

        Person[] people=new Person[4];

        people[0]=person;
        people[1]=p1;
        people[2]=p2;
        people[3]=p3;


        System.out.println(people[0]);
    }
}
