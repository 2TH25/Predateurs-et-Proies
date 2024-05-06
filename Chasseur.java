public class Chasseur extends Predateurs {
    
    Chasseur (Position position){
        super(position, 'C');
    }
    public void afficherCase(){
        Ecran.afficher('C');
    }



    public void interactionPolymorphe(Case entite){
        if(entite.getSymbole()=='C'||entite.getSymbole()=='P'){
            //mise en attente
            this.getDirection().generationDirection();

        }else{
            //l'entité(la case) est supprimée de la matrice plateau
            int ligne = entite.getPosition().getRow();
            int colonne = entite.getPosition().getCol();
            Position pos_temporaire = new Position(ligne,colonne);
            this.plateau[ligne][colonne] = new Case(pos_temporaire);
            this.setPosition(ligne+this.getDirection().getRowDir(),colonne+this.getDirection().getColDir());

        }
        
    }
}
