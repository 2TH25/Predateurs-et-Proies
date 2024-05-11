public class Lapin extends Proies {
    
    Lapin (Position position,Plateau plateau){
        super(position, 'L', plateau);
    }
    public void afficherCase(){
        Ecran.afficher('L');
    }


    public void interactionPolymorphe(Case entite){
        //mise en attente
        this.getDirection().setDirection(-this.getDirection().getRowDir(),-this.getDirection().getColDir());
}
}
