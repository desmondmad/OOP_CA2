package com.dkit.oop;

import java.util.Objects;

public class PrivateProperty extends Property {
        private int numBeds;
        private String propertyType;

    public PrivateProperty(int propertyID, String owner, String postcode, double sellingPrice, double area, int numBeds, String propertyType) {
        super(propertyID, owner, postcode, sellingPrice, area);
        this.propertyType = propertyType;
        this.numBeds = numBeds;
    }


    public int getNumBeds() {
        return numBeds;
    }

    public String getPropertyType() {
        return propertyType;
    }


    @Override
    public String toString(){
        return super.toString() +
                ", Number of Beds = " + numBeds +
                ", Property Type = " + propertyType +
                "}";
    }

    //Equals() and hashCode() will have to use the getters to get the fields information from the the super class
    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PrivateProperty pp = (PrivateProperty) o;
        return pp.getOwner() == super.getOwner() &&
                pp.getPropertyID() == super.getPropertyID();
    }

    @Override
    public int hashCode(){
        return Objects.hash(getOwner(),getPropertyID());
    }
    @Override
    public double calculateTax(){
        return ((getArea() * 2.2) + 15) + (getNumBeds() * 25);
    }
}
