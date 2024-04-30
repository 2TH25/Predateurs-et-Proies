public class Personnage extends Case {
    
    Direction direction;

    Personnage (Position position ,char symbole){
        super(position, symbole);
        this.direction = new Direction();
    }

}
