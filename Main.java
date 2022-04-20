/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chess_pbo8;

/**
 *
 * @author akbar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Piece pion1 = new Pawn(new Position(1,2),"Hitam");
        System.out.println(pion1.showPosition());
        pion1.Move(new Position(1,3));
        System.out.println(pion1.showPosition());
    }
}
