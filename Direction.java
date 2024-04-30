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
}
