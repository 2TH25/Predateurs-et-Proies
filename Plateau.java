public class Plateau {

    private int rowNumber;
    private int colNumber;
    Case[][] plateau;
 
    

    Plateau(int rowNumber, int colNumber){
        this.colNumber=colNumber;
        this.rowNumber=rowNumber;
        this.plateau = new Case[rowNumber][colNumber];

    }

    Plateau(){
        this(8,8);
    }

    public void setPlateau(int rowNumber,int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        
    }

    public int getRowNumber(){
        return this.rowNumber;
    }
    public int getColNumber(){
        return this.colNumber;
    }
    public Case getCase(Position position){
        return plateau[position.getRow()][position.getCol()];

    }

    public void afficherPlateau(){
        for(int i=0;i<this.rowNumber;i++){
            for(int j=0;j<this.colNumber;j++){
                
                this.plateau[i][j].afficherCase();
            }
        }
    }

    public void generationPlateau(){
        
        for(int i=0;i<rowNumber-1;i++){
            for(int j=0;j<colNumber-1;j++){

                Position position_temporaire = new Position(i, j);
                if (i == 0 || i == rowNumber-1 || j == 0 || j == colNumber-1){
                    
                    this.plateau[i][j] = new Bordure(position_temporaire);
                } else {
                    this.plateau[i][j] = new Case(position_temporaire);
                }
            }
        }
    }

}
