public class Chasseur extends Predateurs {
    
    Chasseur (Position position,Plateau plateau){
        super(position,'C',plateau);
    }
    public void afficherCase(){
        Ecran.afficher('C');
    }
    
    public void interactionFinale(Case entite){
        if(!this.getAgi()){
            if(entite.getSymbole()!=' '&&entite.getSymbole()!='X'){
                if(entite.getSymbole()=='C'||entite.getSymbole()=='P'){
                    //mise en attente
                    this.getDirection().generationDirection();
                    this.setAgi(true);
        
                }else{
                    //l'entité(la case) est supprimée de la matrice plateau
                    this.tuerEntite(entite);
                    this.setAgi(true);
        
                }

            }
            else{
                entite.redirection(this);
            }
        }
    }
}
