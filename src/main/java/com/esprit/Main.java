package com.esprit;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InterfaceSociete societe = new SocieteHashMap();

        Employe e1 = new Employe("CIN123", "MAT123", "Ali", "Ben Ali");
        Employe e2 = new Employe("CIN456", "MAT456", "Sara", "Ben Sara");

        Departement d1 = new Departement(1, "Informatique");
        Departement d2 = new Departement(2, "Ressources Humaines");

        societe.ajouterEmployeDepartement(e1, d1);
        societe.ajouterEmployeDepartement(e2, d2);

        societe.afficherLesEmployesLeursDepartements();
        societe.afficherDepartement(e1);
    }
}