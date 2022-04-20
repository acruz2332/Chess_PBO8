# Chess_PBO8
Nama : Akbar Fajar Ramadhan

Nim : 21/479890/SV/19543

**Position**
```java
package com.mycompany.chess_pbo8;

public class Position {
    int row;
    int colomn;
    
    Position (int r, int c){
        this.row = r;
        this.colomn = c;
    }
}
```

---
**Piece**
```java
package com.mycompany.chess_pbo8;

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
```
---
**Pawn**
```java
package com.mycompany.chess_pbo8;

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
```
---
**Main Class**
```java
package com.mycompany.chess_pbo8;

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
```
