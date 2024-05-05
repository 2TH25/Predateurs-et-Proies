public class Lapin extends Proies {
    
    Lapin (Position position){
        super(position, 'L');
    }


    public void interactionPolymorphe(Case entite){
        //mise en attente
        this.getDirection().setDirection(-this.getDirection().getRowDir(),-this.getDirection().getColDir());
}
}
