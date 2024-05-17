public class BordureOrizontal extends Bordure {
    
    BordureOrizontal(Position position,Plateau plateau){
        super(position,plateau);
    }

    public void redirection(Case entite){
        
        if(entite.getAgi()!=true){
            Direction dir = entite.getDirection();
            dir.inverseRow();
            entite.setDirection(dir);
            entite.setAgi(true);
        }
    }

}
