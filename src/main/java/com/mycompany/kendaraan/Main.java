/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kendaraan;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        MobilBaru mobilBaru = new MobilBaru("Toyota", "Avanza", "3 tahun");
        MobilBekas mobilBekas = new MobilBekas("Honda", "Civic", 2018, 200000000);
        Dealer dealer = new Dealer("Mobilindo", mobilBaru, mobilBekas); dealer.info();
    }
}