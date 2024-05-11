public class Poule extends Proies {
    
    Poule (Position position,Plateau plateau){
        super(position, 'P',plateau);
    }
    public void afficherCase(){
        Ecran.afficher('P');
    }


    public void interactionPolymorphe(Case entite){
            //mise en attente
            this.getDirection().setDirection(-this.getDirection().getRowDir(),-this.getDirection().getColDir());
    }
    
}
