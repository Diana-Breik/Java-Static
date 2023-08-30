package org.example;

public class Main {
    public static void main(String[] args) {
        //Schritt 4: Erstellt in der main-Methode mehrere Objekte der Klasse und ruft sowohl die statische als auch die instanzielle Methode auf.
        MeineKlasse class1 = new MeineKlasse();
        MeineKlasse class2 = new MeineKlasse();
        MeineKlasse class3 = new MeineKlasse();
        class1.incrementInstanceCount();
        class2.incrementInstanceCount();
        MeineKlasse.incrementTotalCount();
        //Schritt 5: Gebt nach den Methodenaufrufen die aktuellen Werte von 'totalCount' und 'instanceCount' aus.
        System.out.println("totalCount: " + MeineKlasse.totalCount);//1
        System.out.println("instanceCount in class 1: " + class1.instanceCount);//1
        System.out.println("instanceCount in class2: " + class2.instanceCount);//1
        class2.incrementInstanceCount();
        System.out.println("instanceCount in class2: " + class2.instanceCount);//2
        System.out.println("totalCount: " + MeineKlasse.totalCount);//1
        MeineKlasse.incrementTotalCount();
        System.out.println("totalCount: " + MeineKlasse.totalCount);//2


    }
}