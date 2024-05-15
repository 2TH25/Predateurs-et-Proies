public class Renard extends Predateurs {
  
    Renard (Position position,Plateau plateau){
        super(position, 'R',plateau);
    }
    public void afficherCase(){
        Ecran.afficher('R');
    }
    public void interactionFinale(Case entite){
        if(!this.getAgi()){
            if(entite.getSymbole()!=' '&&entite.getSymbole()!='X'&&entite.getSymbole()!='w'){
                if(entite.getSymbole()=='C'||entite.getSymbole()=='R'){
                    this.getDirection().generationDirection();
                    this.setAgi(true);
                }else if(entite.getSymbole()!='w'){
                    //l'entité(la case) est supprimée de la matrice plateau
                    this.tuerEntite(entite);
                    this.setAgi(true);
                }
                else {
                    //lorqu'une entité Poule, Renard, ou Lapin marche sur un Piege, cette entité décède.
      
                    this.tuerEntite(entite);
                    //Un piège est à usage unique, lorsqu'il élimine une entité, le Piege est supprimé. 
                    this.getPlateauType().retirerCase(this);
                    this.getPlateauType().ajouterCase(this.getCase_id());}
        
               
        
            }
            
            else{
                entite.redirection(this);
            }
        }
    }
    
}
