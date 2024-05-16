public class Bordure extends Case {
    
    Bordure (Position position,Plateau plateau){
        super(position,'X', plateau);
    }
    public void afficherCase(){
        Ecran.afficher('X');
    }

    public void redirection(Case entite){
        
            Position posSuiv = new Position(entite.getPosition().getRow()-entite.getDirection().getRowDir(), this.getPosition().getCol());
            Direction dir = new Direction(posSuiv.getRow() - entite.getPosition().getRow(), posSuiv.getCol() - entite.getPosition().getCol());
            entite.setDirection(dir);
            if(entite.getAgi()!=true){
                if (posSuiv.getCol() == 0 || posSuiv.getRow() == this.getPlateauType().getColNumber()-1){
                    dir.inverseDir();
                    entite.setDirection(dir);
                }
                entite.setAgi(true);
            }
          
    }

}
