package com.example.exoemploye;

import java.time.LocalDate;
import java.time.Period;

public class Employe {
    
    private String nom;
    private String prenom;
    private String dateEmbauche;
    private String fonction;
    private int salaireBrut;
    private String service;
    
    
    public Employe(String nom, String prenom, String dateEmbauche, String fonction, int salaireBrut, String service) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateEmbauche = dateEmbauche;
        this.fonction = fonction;
        this.salaireBrut = salaireBrut;
        this.service = service;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getDateEmbauche() {
        return dateEmbauche;
    }


    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }


    public String getFonction() {
        return fonction;
    }


    public void setFonction(String fonction) {
        this.fonction = fonction;
    }


    public int getSalaireBrut() {
        return salaireBrut;
    }


    public void setSalaireBrut(int salaireBrut) {
        this.salaireBrut = salaireBrut;
    }


    public String getService() {
        return service;
    }


    public void setService(String service) {
        this.service = service;
    }


    public int AnneesDeService(){

        LocalDate startDate = LocalDate.of(Integer.parseInt(this.dateEmbauche.substring(0, 4)), Integer.parseInt(this.dateEmbauche.substring(5, 7)), Integer.parseInt(this.dateEmbauche.substring(8, 10)));

        LocalDate today = LocalDate.now();

        int diffInYears = Period.between(startDate, today).getYears();

        return diffInYears;

    }

    public Float Prime(){
        Float prime;

        prime = (float) (0.05 * this.salaireBrut + 0.02 * this.AnneesDeService() * this.salaireBrut);

        return prime;
    
    }
}
        
    

