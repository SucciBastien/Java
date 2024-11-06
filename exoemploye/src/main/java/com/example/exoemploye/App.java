package com.example.exoemploye;

import java.time.LocalDate;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {

        ArrayList<Employe> employes = new ArrayList<Employe>();

        Employe employe1 = new Employe("Declerck", "Théo", "2020-12-01", "Dev",20, "Developpement");
        Employe employe2 = new Employe("Vance", "George", "2022-02-08", "Dev",13, "Developpement");
        Employe employe3 = new Employe("Marre", "Dylan", "2019-09-15", "Dev",23, "Developpement");
        Employe employe4 = new Employe("Succi", "Bastien", "2015-05-19", "Dev",31, "Developpement");
        Employe employe5 = new Employe("Safra-Dufossey", "Raph", "2017-07-22", "Dev",28, "Developpement");
        
        employes.add(employe1);
        employes.add(employe2);
        employes.add(employe3);
        employes.add(employe4);
        employes.add(employe5);

        LocalDate dayToday = LocalDate.now();

        int month = dayToday.getMonthValue();

        int day = dayToday.getDayOfMonth();

        System.out.println("Nombre d'employé : " + employes.size());

        for (Employe e: employes){
            System.out.print( e.getNom() + " " + e.getPrenom() + " ; Ancienneté : " + e.AnneesDeService() );
            if(month == 11 && day == 5){
                System.out.println( " ; Prime de " + e.Prime() + " K Transférée.");
            }
            else{
                System.out.println("");
            }
        }
    }
}
