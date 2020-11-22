package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan kendaraan menggunakan konsep inheritance dan polymorphism
 */

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : ".concat(bicycle.getBrand()));
        System.out.println("Model : ".concat(bicycle.getModel()));
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount());

        System.out.println();
        Skateboard skateboard = new Skateboard();
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");
        skateboard.setMyBoardLength(54.5);
        System.out.println("Brand : ".concat(skateboard.getBrand()));
        System.out.println("Model : ".concat(skateboard.getModel()));
        System.out.println("Panjangnya Board : "+ skateboard.getMyBoardLength());
    }
}
