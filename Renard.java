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
            int ligne = entite.getPosition().getRow();
            int colonne = entite.getPosition().getCol();
            Position pos_temporaire = new Position(ligne,colonne);
            this.plateau[ligne][colonne] = new Case(pos_temporaire);

        }
        
    }
}
