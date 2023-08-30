package org.example;
//Schritt 1: Erstellt eine Klasse mit einer statischen Variable 'totalCount' und einer instanziellen Variable 'instanceCount'. Initialisiert beide Variablen mit dem Wert 0.
public class MeineKlasse {
    public static int totalCount = 0;
    public  int instanceCount= 0;

    //Schritt 2: Schreibt eine statische Methode 'incrementTotalCount', die die 'totalCount' um 1 erhöht.
    public static void incrementTotalCount(){
        totalCount = totalCount +1;
    }

    //Schritt 3: Schreibt eine instanzielle Methode 'incrementInstanceCount', die die 'instanceCount' für das Objekt um 1 erhöht.
    public void incrementInstanceCount(){
        this.instanceCount =  this.instanceCount +1;
    }

}
