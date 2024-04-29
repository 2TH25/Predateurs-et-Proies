public class Position {
    private int row;
    private int col;

    Position(int row,int col){
        this.col=col;
        this.row=row;
    }

    setPosition(int row,int col){
        this.col=col;
        this.row=row;
    }

    getPosition(){
        return (this.row,this.col);
    }
}
