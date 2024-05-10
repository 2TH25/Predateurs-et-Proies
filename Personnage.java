public class Personnage extends Case {
    
    

    Personnage (Position position ,char symbole){
        super(position, symbole);
        this.getDirection().generationDirection();
    }

  

    public boolean estEnInteraction(){
        int row=this.getPosition().getRow() , col=this.getPosition().getCol() , rowDir=this.getDirection().getRowDir() , colDir=this.getDirection().getColDir();
        int temp=row+rowDir;
        int temp2=col+colDir;
        if(temp<=this.getRowNumber()-1&&temp2<=this.getColNumber()-1){
            if(this.plateau[temp][temp2]!=null){
                if(this.plateau[temp][temp2].getSymbole()!=' '){
                    return true;
                }
                else{
                    return false;
                    
                }
            }
        }return false;
    

    }

    public void interactionPolymorphe(Case entite){
        this.interactionPolymorphe(entite);
    }

    public void interactionCase(Case entite){
        if(this.estEnInteraction()){
            int row=this.getPosition().getRow(),col=this.getPosition().getCol(),rowDir=this.getDirection().getRowDir(),colDir=this.getDirection().getColDir();
            int ligne_cible=row+rowDir;
            int colonne_cible=col+colDir;
            if(this.plateau[ligne_cible][colonne_cible].getSymbole()=='X'){
                
                if(rowDir==0){
                    colDir = -colDir;
                }
                else if(colDir==0){
                    rowDir = -rowDir;
                }

                else {

                    if(rowDir==1&&this.plateau[row+1][col].getSymbole()=='X'){
                        rowDir= -rowDir;
                    }
                    else if(rowDir==1&&(this.plateau[row][col+1].getSymbole()=='X'||this.plateau[row][col-1].getSymbole()=='X')){
                        colDir= -colDir;
                    }
                    else if(rowDir==-1&&this.plateau[row-1][col].getSymbole()=='X'){
                        rowDir= -rowDir;
                    }
                    else if(rowDir==-1&&(this.plateau[row][col+1].getSymbole()=='X'||this.plateau[row][col-1].getSymbole()=='X')){
                        colDir= -colDir;
                    }
                    
                    

                }

            }
            else{
                //ici on est en collision avec une entité
                this.interactionPolymorphe(entite);
                

            }


        }
        else{
            this.deplacement();
        }
       


    }
    public void deplacement(){
        if(this.getSymbole()!=' '){

            if(this.getPosition().getRow()+this.getRowNumber()<=this.getRowNumber()||this.getPosition().getCol()+this.getColNumber()<=this.getColNumber()){
                plateau[this.getPosition().getRow()][this.getPosition().getCol()] = new Case(this.getPosition());
                Position new_position = new Position(getPosition().getRow() + this.getDirection().getRowDir(), this.getPosition().getCol() + this.getDirection().getColDir());
                this.setCase(new_position, getSymbole());
            }
        }

        
    }

}
