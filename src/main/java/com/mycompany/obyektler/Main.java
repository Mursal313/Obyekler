/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obyektler;

/**
 *
 * @author mrust
 */
// Asaqida yazilan obyekt sayilir ve u obyekti dedikde Obyektler classi daxilindeki
// static olmayan elementler nezerde tutulur.Obyektlerle class lar arasindaki ferq budurki
// obyektlerden bir nece dene ola biler
public class Main {

    public static void main(String[] args) {
        Obyektler.umumi = "Salam";
        Obyektler.foo();
        Obyektler u = new Obyektler();
        Obyektler u2 = new Obyektler();

        u.say = 10;
        u2.say = 12;
        System.out.println("U = " + u.say + " |" + " U2 = " + u2.say);

    }
}
