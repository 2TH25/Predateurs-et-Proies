public class Lapin extends Proies {
    
    Lapin (Position position,Plateau plateau){
        super(position, 'L', plateau);
    }
    public void afficherCase(){
        Ecran.afficher('L');
    }
    public void interactionFinale(Case entite){
        if(!this.getAgi()){

            if(entite.getSymbole()!=' '&&entite.getSymbole()!='X'){
                Direction new_direction = new Direction(-this.getDirection().getRowDir(),-this.getDirection().getColDir());
                this.setDirection(new_direction);
                this.setAgi(true);

            }
            else{
                entite.redirection(this);
            }
        }
        
    }
    public void applatir(Case cases){
        if(this.getLongueur_herbe()>0){
            cases.setLongueur_herbe(getLongueur_herbe()-1);
        }
    }
    public void herbeTropBasse(){
        if(this.getLongueur_herbe()<=1){
            while(this.getPlateauType().getPlateau()[this.getPosition().getRow()][this.getPosition().getCol()].getSymbole()==' '||this.getPlateauType().getPlateau()[this.getPosition().getRow()][this.getPosition().getCol()].getSymbole()==',')
                this.getDirection().generationDirection();
        }
    }
}

