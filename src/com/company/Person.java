package com.company;

public class Person {
    public static int counter;
    private String firstName;
    private String lastName;
    private String address;
    private int dateOfBirth;
    private String nationality;
    private String city;
    private int weight;
    private int height;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    private Boolean isMale;

    public Person(){
        counter++;
    }

    public Person( int counter,String firstName,String lastName,String address,int dateOfBirth,String nationality,String city,int weight,int height,Boolean isMale) {
        this.counter = counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.city = city;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;


    }

    public String getFullName(){
        return this.firstName +" "+ this.lastName;
    }
    public double getHeightInFeet(){
        return height/30.48;
    }
    public int getAge(){
        return 2018-dateOfBirth;
    }
    public void eating(){
        this.weight++;
        System.out.println("im eating!");
    }
    public void getInfo(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);
        System.out.println(dateOfBirth);
        System.out.println(nationality);
        System.out.println(city);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(isMale);
    }
}
