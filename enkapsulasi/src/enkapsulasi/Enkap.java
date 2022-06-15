/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author pdewa
 */
class Enkap {
public int A = 9000;
private String B = "Segar";
protected String C = "Ambon";
String D = "Manis";

void tampil(){
    System.out.println("Harga Pisang : "+A);
    System.out.println("Apakah Segar? : "+B);
    System.out.println("Pisang Asal Mana? : "+C);
    System.out.println("Apakah Manis : "+D);
}
}
