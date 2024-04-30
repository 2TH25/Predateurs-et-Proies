public class Plateau {
    private int rowNumber;
    private int colNumber;
    Case[][] plateau = new Case [rowNumber][colNumber];
 
    

    Plateau(int rowNumber, int colNumber){
        this.colNumber=colNumber;
        this.rowNumber=rowNumber;

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
                
                Position position_temporaire = new Position(i,j);
                this.getCase(position_temporaire).afficherCase();
            }
        }
    }

    public void generationPlateau(){
        for(int i=0;i<rowNumber;i++){
            for(int j=0;j<colNumber;j++){
                double x = (Math.random());
                if (x>=0 && x<=0.25){
                    x = 0;

                }
                else if (x>=0.25 && x<=0.5){
                    x = 1;

                }
                else if (x>=0.5 && x<=0.75){
                    x = 2;

                }
                else {
                    x=3;
                }

            }
        }
    }

}
