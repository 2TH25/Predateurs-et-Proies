public class Position {
    private int row;
    private int col;

    Position(int row,int col){
        this.col=col;
        this.row=row;
    }

    void setPosition(int row,int col){
        this.col=col;
        this.row=row;
    }

    int getRow(){
        return this.row;
    }
    int getCol(){
        return this.col;
    }
    
    String PositiontoString(){
        return "("+this.row+","+this.col+")";
        
    }
}
