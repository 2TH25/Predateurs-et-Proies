public class Poule extends Proies {
    
    Poule (Position position){
        super(position, 'P');
    }


    public void interactionPolymorphe(Personnage entite){
            //mise en attente
            this.getDirection().setDirection(-this.getDirection().getRowDir(),-this.getDirection().getColDir());
    }
    
}
