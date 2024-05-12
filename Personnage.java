public class Personnage extends Case {
    private Case case_identifier ;

    Personnage (Position position ,char symbole,Plateau plateau){
        super(position, symbole,plateau);
        this.getDirection().generationDirection();
        this.case_identifier = new Case(position,plateau);

    }
    public void setCase_id(Case cases){
        this.case_identifier = cases;
    }

    public Case getCase_id(){
        return this.case_identifier;

    }
    
    public void interactionFinale(Case entite){

    }

   

}
