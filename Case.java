public class Case {
    private Direction direction;
    private Position position ;
    private char symbole;
    private Plateau plateau;
    private boolean a_deja_agi = false;


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
    public boolean getAgi(){
        return this.a_deja_agi;
    }
    public void setAgi(boolean bool){
        this.a_deja_agi=bool;
    }
    public void setDirection(Direction direction){
        this.direction=direction;
    }
    public void setCase_id(Case cases){
        
    }
    public void interactionFinale(Case entite){

    }
    public void redirection(Case entite){
        if(!entite.getAgi()){
        Position position_cible = new Position(this.getPosition().getRow(),this.getPosition().getCol());
        Case case_cible = new Case(position_cible,this.getPlateauType());
        entite.getPlateauType().retirerCase(entite);
        entite.getPlateauType().ajouterCase(entite.getCase_id());
        entite.getPlateauType().retirerCase(case_cible);
        entite.setCase_id(case_cible);
        entite.setPosition(case_cible.getPosition());
        entite.getPlateauType().ajouterCase(entite);
        entite.setAgi(true);
        entite.afficherDirection();
            
        
        }
     
}

    public void setCase(Position position,char symbole){
        this.position=position;
        this.symbole=symbole;
    }

    public void setPosition(Position position){
        this.position=position;
        
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
    
    public void afficherDirection(){
        Ecran.afficherln("(",this.getDirection().getRowDir()," ," ,this.getDirection().getColDir(),")");
    }
  

    



}
