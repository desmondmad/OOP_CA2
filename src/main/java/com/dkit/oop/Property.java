package com.dkit.oop;

import java.util.ArrayList;
import java.util.Objects;

public class Property<Facilities>
{
    private int propertyID;
    private String owner;
    private String postcode;
    private double sellingPrice;
    private double area;
    private ArrayList<Facilities> facilities;



    public Property(int propertyID, String owner, String postcode, double sellingPrice, double area)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = sellingPrice;
        this.area = area;
        facilities = new ArrayList<>();
    }

    public Property(int propertyID, String owner, String postcode, double area){
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = 0.0;
        this.area = area;
        facilities = new ArrayList<>();
    }

    public int getPropertyID()
    {
        return propertyID;
    }

    public void setPropertyID(int propertyID)
    {
        this.propertyID = propertyID;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    public void addFacility(Facilities f){
        if(f != null){
            facilities.add(f);
        }

    }

    public void removeFacility(Facilities f){
        facilities.remove(f);
    }

    public ArrayList<Facilities> getFacilities(){
        return facilities;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{" +
                "PropertyID = " + propertyID +
                ", Owner = " + owner +
                ", PostCode = " + postcode +
                ", Selling Price = " + sellingPrice +
                ", Area = " + area +
                ", facilities = " + facilities;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Property p = (Property) o;
        return  p.owner == owner &&
                p.propertyID == propertyID;
    }

    @Override
    public int hashCode(){
        return Objects.hash(owner,propertyID);
    }

    public double calculateTax(){
        return (getArea() * 2.2) + 15;
    }

}
