public class Renard extends Predateurs {
  
    Renard (Position position,Plateau plateau){
        super(position, 'R',plateau);
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
            this.tuerEntite(entite);

        }
        
    }
}
