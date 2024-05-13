public class Bordure extends Case {
    
    Bordure (Position position,Plateau plateau){
        super(position,'X', plateau);
    }
    public void afficherCase(){
        Ecran.afficher('X');
    }

    public void redirection(Case entite){
        
            Position posx = new Position(entite.getPosition().getRow()+entite.getDirection().getRowDir(), entite.getPosition().getCol());
            Position posy = new Position(entite.getPosition().getRow(), entite.getPosition().getCol()+entite.getDirection().getColDir());
            if(entite.getAgi()!=true){

                if(this.getPosition().getRow()==posy.getRow()&&posy.getRow()!=0){
                    entite.getDirection().setDirection(entite.getDirection().getRowDir(), -entite.getDirection().getColDir());
                    entite.setAgi(true);
                }
                else if(this.getPosition().getRow()==posx.getRow()&&posx.getCol()!=0){
                    entite.getDirection().setDirection(-entite.getDirection().getRowDir(),entite.getDirection().getColDir());
                    entite.setAgi(true);
                }
            }
          
    }

}
