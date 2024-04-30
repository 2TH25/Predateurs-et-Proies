public class Direction {
    
    private int rowDir;
    private int colDir;

    Direction (int rowDir, int colDir){
        this.rowDir = rowDir;
        this.colDir = colDir;
    }

    Direction (){
        this(0, 0);
    }

    public void setDirection(int rowDir, int colDir){
        this.rowDir = rowDir;
        this.colDir = colDir;
    }

    public int getRowDir(){
        return this.rowDir;
    }

    public int getColDir(){
        return this.colDir;
    }
}
