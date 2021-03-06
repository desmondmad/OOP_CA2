package com.dkit.oop;

import java.util.ArrayList;

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
        ArrayList<Property> prop = new ArrayList<>();
        Property p4;
        Property p5;
        prop.add(p4 = new Property(3,"Andrew Phelps","C15FX61",2300000,300));
        prop.add(p5 = new Property(5,"Angela White","H90NM37",150));
        prop.add(p1);

        //DisplayProperties()
        displayProperties(prop);
        System.out.println();
        //getPropertiesPriceAbove()
        ArrayList<Property> above = getPropertiesPriceAbove(prop,200000);
        for (int i = 0; i < above.size();i++){
            System.out.println(above.get(i));
        }
        System.out.println();


        System.out.println("Q3 - tests");
        //Inherited Class
        PrivateProperty pp1 = new PrivateProperty(6,"George Micheal","ABVCMN929",500000,500,10,"Mansion");
        System.out.println(pp1);
        System.out.println();
        PrivateProperty pp2 = pp1;
        //equals()
        if(pp1 == pp2){
            System.out.println("pp1 == pp2 is true");
        } else {
            System.out.println("pp1 == pp2 is false");
        }
        if(pp1.equals(pp2)){
            System.out.println("pp1.equals(pp2) is true");
        } else {
            System.out.println("pp1.equals(pp2) is false");
        }
        System.out.println();
        //CalculateTax()
        System.out.println(pp1.calculateTax());
        System.out.println();

        System.out.println("Q4 - tests");
        PrivateProperty pp3 = new PrivateProperty(7,"Steve Carey","AKJDFG438",170000,100,3,"Detached");
        PrivateProperty pp4 = new PrivateProperty(8,"Mary Kate","JKSDFAHJ33",200000,120,4,"Apartment");
        ArrayList<Property> allProps = new ArrayList<>();
        for(int i = 0; i < prop.size(); i++){
            allProps.add(prop.get(i));
        }
        allProps.add(pp1);
        allProps.add(pp3);
        allProps.add(pp4);

        for (int i = 0; i < allProps.size();i++){
            System.out.println(allProps.get(i));
        }




    }

    public void displayProperties(ArrayList<Property> p){
        for(int i = 0; i < p.size(); i++){
            System.out.println(p.get(i));
        }
    }

    public ArrayList<Property> getPropertiesPriceAbove(ArrayList<Property> p, double price){
        ArrayList<Property> above = new ArrayList<>();
        for(int i = 0; i < p.size(); i++) {
            if (p.get(i).getSellingPrice() > price)
                above.add(p.get(i));
        }
        return above;
    }

    public ArrayList<Property> displayAllPropID(ArrayList<Property> p){
        for(int i = 0; i < p.size(); i++) {
            return System.out.println("PropertyID = " + p.get(i).getPropertyID() + " Tax = " + p.get(i).calculateTax());
        }
    }
}

