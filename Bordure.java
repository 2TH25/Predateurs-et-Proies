public class Bordure extends Case {
    
    Bordure (Position position,Plateau plateau){
        super(position,'X', plateau);
    }
    public void afficherCase(){
        Ecran.afficher('X');
    }

    public void redirection(Case entite){
        if(entite.getPosition().getRow()==this.getPosition().getRow()+1||entite.getPosition().getRow()==this.getPosition().getRow()-1){
            Ecran.afficherln("l'entité est en bas ou en haut");
            Direction nouvelle_direction = new Direction(-entite.getDirection().getRowDir(),entite.getDirection().getColDir());
            entite.setDirection(nouvelle_direction);  
            entite.afficherDirection();
        }
        else if(entite.getPosition().getCol()==this.getPosition().getCol()+1||entite.getPosition().getCol()==this.getPosition().getCol()-1) {
            Ecran.afficherln("l'entité est à droite ou à gauche");
            Direction nouvelle_direction = new Direction(entite.getDirection().getRowDir(),-entite.getDirection().getColDir());
            entite.setDirection(nouvelle_direction);  
            entite.afficherDirection();
        }
    }
}
