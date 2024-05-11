public class Case {
    Direction direction;
    private Position position ;
    private char symbole;
    private Plateau plateau;


    Case (Position position, char symbole, Plateau plateau) {
        this.position = position;
        this.symbole = symbole;
        this.direction = new Direction();
        this.plateau=plateau;
    }

    Case (Position position,Plateau plateau){
        this(position, ' ',plateau);
    }
    public Direction getDirection(){
        return this.direction;
    }
    public Plateau getPlateauType(){
        return this.plateau;
    }
    public Case getCase_id(){
        return null;

    }
    public void setDirection(Direction direction){
        this.direction=direction;
    }


    public void setCase(Position position,char symbole){
        this.position=position;
        this.symbole=symbole;
    }

    public void setPosition(Position position){
        this.position=position;
        
    }
    public void redirection(Case entite){
        
    }


    public Position getPosition(){
        return this.position;
    }
    public char getSymbole(){
        return this.symbole;
    }

    public void afficherCase(){
        Ecran.afficher(' ');
    }

    public void deplacement(){
        this.deplacement();
    }
    public void interactionCase(Case entite){
        Ecran.afficherln("Erreur, méthode interactionCase appelée sur un non-Personnage");
    }
  

    



}
