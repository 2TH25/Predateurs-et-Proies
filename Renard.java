public class Renard extends Predateurs {
  
    Renard (Position position){
        super(position, 'R');
    }
    public void afficherCase(){
        Ecran.afficher('R');
    }

    public void interactionPolymorphe(Case entite){
        if(entite.getSymbole()=='C'||entite.getSymbole()=='R'){
            //mise en attente
            this.getDirection().generationDirection();

        }else{
            //l'entité(la case) est supprimée de la matrice plateau
            this.plateau[entite.getPosition().getRow()][entite.getPosition().getCol()] = null;
            this.plateau[entite.getPosition().getRow()][entite.getPosition().getCol()] = new Case( this.plateau[entite.getPosition().getRow()][entite.getPosition().getCol()].getPosition());
            this.setPosition(entite.getPosition().getRow(),entite.getPosition().getCol());

        }
        
    }
}
