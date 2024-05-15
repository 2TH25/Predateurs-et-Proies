public class Chasseur extends Predateurs {
    
    Chasseur (Position position,Plateau plateau){
        super(position,'C',plateau);
        
    }
   
    public void afficherCase(){
        Ecran.afficher('C');
    }
    
    public void interactionFinale(Case entite){
        if(!this.getAgi()){
            if(entite.getSymbole()!=' '&& entite.getSymbole()!='X'&&entite.getSymbole()!='w'){
                if(entite.getSymbole()=='C'||entite.getSymbole()=='P'){
                    this.getDirection().generationDirection();
                    this.setAgi(true);
        
                }else if(entite.getSymbole()!='w'){
                    //l'entité(la case) est supprimée de la matrice plateau
                    this.tuerEntite(entite);
                    this.setAgi(true);
        
                }
                else {
                    //lorsque c'est un Chasseur, son déplacement est debuff, ce qui le fait se déplacer, mais avec un certain taux de chance.
                    entite.addDebuff_Deplacement();
                    entite.setTour_Debuff_Applique(this.getPlateauType().getTour());
                
                    //Un piège est à usage unique, lorsqu'il élimine une entité, le Piege est supprimé. 
                    entite.getPlateauType().retirerCase(entite);
                    entite.getPlateauType().ajouterCase(entite.getCase_id());
                }
            }

        }
        else{
            entite.redirection(this);
        }
    }
}
 

