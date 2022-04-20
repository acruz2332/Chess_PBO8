/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess_pbo8;

/**
 *
 * @author akbar
 */
public class Pawn extends Piece {
    
    public Pawn(Position posisi, String colour){
        super(posisi, colour);
    }
    
    @Override
    public void Move(Position newPosisi){
        if (newPosisi.colomn == posisi.colomn + 1 && super.isValidPosition(newPosisi)){
            posisi.colomn = posisi.colomn + 1;
        }
    }
}
