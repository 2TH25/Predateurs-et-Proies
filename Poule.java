public class Poule extends Proies {
    
    Poule (Position position,Plateau plateau){
        super(position, 'P',plateau);
    }
    public void afficherCase(){
        Ecran.afficher('P');
    }


    public void interactionPolymorphe(Case entite){
            Direction new_direction = new Direction(-this.getDirection().getRowDir(),-this.getDirection().getColDir());
            this.setDirection(new_direction);
    }
    
}
