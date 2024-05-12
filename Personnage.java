public class Personnage extends Case {
    private Case case_identifier ;
    
    

    Personnage (Position position ,char symbole,Plateau plateau){
        super(position, symbole,plateau);
        this.getDirection().generationDirection();
        this.case_identifier = new Case(position,plateau);

    }

  

    public boolean estEnInteraction(){
        int row=this.getPosition().getRow() , col=this.getPosition().getCol() , rowDir=this.getDirection().getRowDir() , colDir=this.getDirection().getColDir();
        int temp=row+rowDir;
        int temp2=col+colDir;
            if(this.getPlateauType().getPlateau()[temp][temp2]!=null){
                if(this.getPlateauType().getPlateau()[temp][temp2].getSymbole()!=' '){
                    return true;
                }
                else{
                    return false;
                    
                }
            }
        return false;
    

    }
    public void setCase_id(Case cases){
        this.case_identifier = cases;
    }
    public Case getCase_id(){
        return this.case_identifier;

    }

    public void interactionPolymorphe(Case entite){
        this.interactionPolymorphe(entite);
    }

    public void interactionCase(Case entite){
        int row=this.getPosition().getRow(),col=this.getPosition().getCol(),rowDir=this.getDirection().getRowDir(),colDir=this.getDirection().getColDir();
        int ligne_cible=row+rowDir;
        int colonne_cible=col+colDir;
        if(this.estEnInteraction()){
            
            if(this.getPlateauType().getPlateau()[ligne_cible][colonne_cible].getSymbole()=='X'){
                
                this.getPlateauType().getPlateau()[ligne_cible][colonne_cible].redirection(this);

            }
            else{
                //ici on est en collision avec un personnage
                this.interactionPolymorphe(entite);
                

            }


        }
        else{
            if(ligne_cible<=this.getPlateauType().getRowNumber()-1 && ligne_cible>0 &&colonne_cible<=this.getPlateauType().getColNumber()-1 && colonne_cible>0){
                this.deplacement();
            }
        }
       


    }
    public void deplacement(){
        if(this.getSymbole()!=' '){
            Position position_cible = new Position(this.getPosition().getRow()+this.getDirection().getRowDir(),this.getPosition().getCol()+this.getDirection().getColDir());
            Case case_cible = new Case(position_cible,this.getPlateauType());
            this.getPlateauType().retirerCase(this);
            this.getPlateauType().ajouterCase(this.getCase_id());
            this.getPlateauType().retirerCase(case_cible);
            this.setCase_id(case_cible);
            this.setPosition(case_cible.getPosition());
            this.getPlateauType().ajouterCase(this);
                
            
        }

        
    }

}
