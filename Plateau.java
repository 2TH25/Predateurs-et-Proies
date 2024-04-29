public class Plateau {
    private int rowNumber;
    private int colNumber;
 
    

    Plateau(int rowNumber, int colNumber){
        this.colNumber=colNumber;
        this.rowNumber=rowNumber;
    }
    Plateau(){
        this(8,8);
    }
}
