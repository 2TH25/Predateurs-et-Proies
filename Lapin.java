public class Lapin extends Proies {
    
    Lapin (Position position,Plateau plateau){
        super(position, 'L', plateau);
    }
    public void afficherCase(){
        Ecran.afficher('L');
    }


    public void interactionPolymorphe(Case entite){
        Direction new_direction = new Direction(-this.getDirection().getRowDir(),-this.getDirection().getColDir());
        this.setDirection(new_direction);
    }
}

