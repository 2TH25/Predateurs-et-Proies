public class Chasseur extends Predateurs {
    
    Chasseur (Position position,Plateau plateau){
        super(position,'C',plateau);
    }
    public void afficherCase(){
        Ecran.afficher('C');
    }



    public void interactionPolymorphe(Case entite){
        if(entite.getSymbole()=='C'||entite.getSymbole()=='P'){
            this.getDirection().generationDirection();

        }else{
            //l'entité(la case) est supprimée de la matrice plateau
            this.tuerEntite(entite);

        }
        
    }
}
