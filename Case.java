public class Case extends Plateau {
    Direction direction;
    private Position position ;
    private char symbole;

    Case (Position position, char symbole) {
        this.position = position;
        this.symbole = symbole;
        this.direction = new Direction();
    }

    Case (Position position){
        this(position, ' ');
    }
    public Direction getDirection(){
        return this.direction;
    }


    public void setCase(Position position,char symbole){
        this.position=position;
        this.symbole=symbole;
    }

    public void setPosition(int row,int col){
        Ecran.afficherln("Erreur de setPosition dans la classe Case");
    }


    public Position getPosition(){
        return this.position;
    }
    public char getSymbole(){
        return this.symbole;
    }

    public void afficherCase(){
        Ecran.afficher(this.getSymbole());
    }

    public void deplacement(){
        this.deplacement();
    }
    public void interactionCase(Case entite){
        Ecran.afficherln("Erreur, méthode interactionCase appelée sur un non-Personnage");
    }
  

    



}
