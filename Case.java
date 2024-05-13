public class Case {
    private Direction direction;
    private Position position ;
    private char symbole;
    private Plateau plateau;
    private boolean a_deja_agi = false;
    private int longueur_herbe;


    Case (Position position, char symbole, Plateau plateau) {
        this.position = position;
        this.symbole = symbole;
        this.direction = new Direction();
        this.plateau=plateau;
        this.longueur_herbe=0;
    }

    Case (Position position,Plateau plateau){
        this.position=position;
        this.plateau=plateau;
        this.longueur_herbe=0;
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

    public int getLongueur_herbe(){
        return this.longueur_herbe;
    }
    public void setLongueur_herbe(int longueur_herbe){
        this.longueur_herbe=longueur_herbe;
    }

    public void setDirection(Direction direction){
        this.direction=direction;
    }
    public void setCase_id(Case cases){
        
    }
    public void interactionFinale(Case entite){

    }
    public void redirection(Case entite){
        entite.herbeTropHaute();
        if(!entite.getAgi()){
        Position position_cible = new Position(this.getPosition().getRow(),this.getPosition().getCol());
        Case case_cible = new Case(position_cible,this.getPlateauType());
        entite.getPlateauType().retirerCase(entite);
        entite.getPlateauType().ajouterCase(entite.getCase_id());
        entite.applatir(case_cible);
        entite.getPlateauType().retirerCase(case_cible);
        entite.setCase_id(case_cible);
        entite.setPosition(case_cible.getPosition());
        entite.getPlateauType().ajouterCase(entite);
        entite.setAgi(true);
        }
     
    }
    public void herbeTropHaute(){

    }

    public void applatir(Case cases){

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
        if(this.longueur_herbe<4&&this.longueur_herbe>=0){
            if(this.longueur_herbe==0){
                Ecran.afficher(' ');
            }
            if(this.longueur_herbe==1){
                Ecran.afficher(' ');
            }
            if(this.longueur_herbe==2){
                Ecran.afficher(' ');
            }
            if(this.longueur_herbe==3){
                Ecran.afficher(' ');
            }
        }
        
    }
    
    public void afficherDirection(){
        Ecran.afficherln("(",this.getDirection().getRowDir()," ," ,this.getDirection().getColDir(),")");
    }
  

    



}
