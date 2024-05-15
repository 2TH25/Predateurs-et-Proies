public class Case {
    private Direction direction;
    private Position position ;
    private char symbole;
    private Plateau plateau;
    private boolean a_deja_agi = false;
    private int debuff_deplacement;
    


    Case (Position position,char symbole, Plateau plateau) {
        this.position = position;
        this.symbole = symbole;
        this.direction = new Direction();
        this.plateau=plateau;
        this.debuff_deplacement=0;
        
    }

    Case (Position position,Plateau plateau){
        this.position=position;
        this.plateau=plateau;
        this.symbole=' ';
        this.debuff_deplacement=0;
        
    }
    public int getDebuff_Deplacement(){
        return this.debuff_deplacement;
    }
    public void addDebuff_Deplacement(){
        this.debuff_deplacement=1;
    }
    public void retireDebuff_Deplacement(){
        this.debuff_deplacement=0;
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

    public void tuerEntite(Case entite){
        this.getPlateauType().retirerCase(entite);
        this.getPlateauType().ajouterCase(entite.getCase_id());

    }

    
    public char getSymbole(){
        
        return this.symbole;
    }

    public void afficherCase(){
        Ecran.afficher(this.getSymbole());
        
    }
    
    public void afficherDirection(){
        Ecran.afficherln("(",this.getDirection().getRowDir()," ," ,this.getDirection().getColDir(),")");
    }
  
}
    




