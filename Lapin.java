public class Lapin extends Proies {
    
    Lapin (Position position,Plateau plateau){
        super(position, 'L', plateau);
    }
    public void afficherCase(){
        Ecran.afficher('L');
    }
    public void interactionFinale(Case entite){
        if(!this.getAgi()){

            if(entite.getSymbole()!=' '&&entite.getSymbole()!='X'&&entite.getSymbole()!='w'){
                Direction new_direction = new Direction(-this.getDirection().getRowDir(),-this.getDirection().getColDir());
                this.setDirection(new_direction);
                this.setAgi(true);

            }
            else if(entite.getSymbole()!='w'){
                entite.redirection(this);
            }
            else {
                this.tuerEntite(entite);
                entite.getPlateauType().retirerCase(entite);
                entite.getPlateauType().ajouterCase(entite.getCase_id());
            }
        }
        
    }
    
}

