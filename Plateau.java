public class Plateau {
    private int rowNumber;
    private int colNumber;
    Case[][] plateau = new Case [rowNumber][colNumber]
 
    

    Plateau(int rowNumber, int colNumber){
        this.colNumber=colNumber;
        this.rowNumber=rowNumber;

    }
    Plateau(){
        this(8,8);
    }

    void setPlateau(int rowNumber,int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        
    }

    int getRowNumber(){
        return this.rowNumber;
    }
    int getColNumber(){
        return this.colNumber;
    }
    Case getCase(Position position){
        return plateau[position.getRow()][position.getCol()]

    }

    void afficherPlateau(){
        for(int i=0;i<this.rowNumber;i++){
            for(int j=0;j<this.colNumber;j++){
                
                Position position_temporaire = new Position(i,j)
                this.getCase(position_temporaire).afficherCase();
            }
        }
    }

}
