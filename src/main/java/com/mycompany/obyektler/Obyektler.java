/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.obyektler;

/**
 *
 * @author mrust
 */
// Qarsisinda Static yazilmayan elementler diger
// classlarda caqirila bilmir meselen name den 
// surnameden istifade ede bilmeriy amaki foo methodunu caqira bileriy
// Yeniki eger bir elementden basqa yerdede istifade ederiyse bu zaman static yazilmalidir
public class Obyektler {

    public String name;
    public String surname;
    public int say;
    public static String umumi;

    public static void foo() {
        System.out.println("Salam");
    }

    public void foo2() {
        System.out.println("Salam Aleykum");
    }
}
