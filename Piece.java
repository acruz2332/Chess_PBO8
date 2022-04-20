/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess_pbo8;

/**
 *
 * @author akbar
 */
public class Piece {
    Position posisi;
    String colour;
    private int board[][] = new int[8][8];
    
    public Piece(Position posisi, String colour){
        this.posisi = posisi;
        this.colour = colour;
    }

    public boolean isValidPosition(Position posisi){
        if ((posisi.row>0 && posisi.colomn>0) && (posisi.row<8 && posisi.colomn<8)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String showPosition(){
        return "["+posisi.row+"]["+posisi.colomn+"]";
    }
    
    public void Move(Position newPosition){
        
    }
}
