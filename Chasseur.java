public class Chasseur extends Predateurs {
    
    Chasseur (Position position){
        super(position, 'C');
    }



    public void interactionPolymorphe(Personnage entite){
        if(entite.getSymbole()=='C'||entite.getSymbole()=='R'){
            //mise en attente
            this.getDirection().generatioDirection();

        }else{
            //l'entité(la case) est supprimée de la matrice plateau
            int ligne = entite.getPosition().getRow();
            int colonne = entite.getPosition().getCol();
            Position pos_temporaire = new Position(ligne,colonne);
            this.plateau[ligne][colonne] = new Case(pos_temporaire);

        }
        
    }
}
