package com.dkit.oop;

/**
 * OOP - CA#2 - Nov 2020
 * Your Name:
 * <p>
 * Your GitHub link:
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Property & Private Property- - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        System.out.println("Q1 - some simple tests");

        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130);
        //Overload constructor
        Property p2 = new Property(1,"Mary Smith","A91AB12",130);
        System.out.println("Property p1 details:");
        System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea());
        System.out.println("Property p2 details:");
        System.out.println(p2.getPropertyID() + " : " + p2.getOwner() + " : " + p2.getPostcode()  + " : " + p1.getArea());
        System.out.println();
        //Adding Facilities
        p1.addFacility("Mains Water");
        p1.addFacility("Freehold");
        System.out.println(p1);
        System.out.println();
        //Removing Facility
        p1.removeFacility("Mains Water");
        System.out.println(p1);
        System.out.println();
        //Equals
        Property p3 = p1;
        if(p1 == p2){
            System.out.println("p1 == p2 is true");
        } else {
            System.out.println("p1 == p2 is false");
        }
        if(p1.equals(p2)){
            System.out.println("p1.equals(p2) is true");
        } else {
            System.out.println("p1.equals(p2) is false");
        }
        System.out.println();
        if(p1 == p3){
            System.out.println("p1 == p3 is true");
        } else {
            System.out.println("p1 == p3 is false");
        }
        if(p1.equals(p3)){
            System.out.println("p1.equals(p3) is true");
        } else {
            System.out.println("p1.equals(p3) is false");
        }
        System.out.println();
        //CalculateTax()
        System.out.println(p1.calculateTax());
        System.out.println();


        System.out.println("Q2 - tests");



        System.out.println("Q3 - tests");


        System.out.println("Q4 - tests");


    }
}

