package com.example.hello.model;

public class Car {
    private String brand;
    private int nbkms;

    public Car(String brand, int nbkms) {
        this.brand = brand;
        this.nbkms = nbkms;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNbkms() {
        return nbkms;
    }
    
    public void setNbkms(int nbkms) {
        this.nbkms = nbkms;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", nbkms=" + nbkms + "]";
    }

}
