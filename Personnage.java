public class Personnage extends Case {
    
    Direction direction;

    Personnage (Position position ,char symbole){
        super(position, symbole);
        this.direction = new Direction();
        this.getDirection().generationDirection();
    }

    public Direction getDirection(){
        return this.direction;
    }

    public boolean estEnInteraction(){
        int row=this.getPosition().getRow(),col=this.getPosition().getCol(),rowDir=this.getDirection().getRowDir(),colDir=this.getDirection().getColDir();
        int temp=row+rowDir;
        int temp2=col+colDir;
        if(this.plateau[temp][temp2].getSymbole()!=' '){
            return true;
        }else{
            return false;
            
        }

    }

    public void interactionPolymorphe(Case entite){
        this.interactionPolymorphe(entite);
    }

    public void interactionCase(Case entite){
        if(this.estEnInteraction()){
            int row=this.getPosition().getRow(),col=this.getPosition().getCol(),rowDir=this.getDirection().getRowDir(),colDir=this.getDirection().getColDir();
            int temp=row+rowDir;
            int temp2=col+colDir;
            if(this.plateau[temp][temp2].getSymbole()!='X'){
                
                if(rowDir==0){
                    colDir = -colDir;
                }
                else if(colDir==0){
                    rowDir = -rowDir;
                }

                else {

                    if(rowDir==1&&this.plateau[row+1][col].getSymbole()!='X'){
                        rowDir= -rowDir;
                    }
                    else if(rowDir==1&&(this.plateau[row][col+1].getSymbole()!='X'||this.plateau[row][col-1].getSymbole()!='X')){
                        colDir= -colDir;
                    }
                    else if(rowDir==-1&&this.plateau[row-1][col].getSymbole()!='X'){
                        rowDir= -rowDir;
                    }
                    else if(rowDir==-1&&(this.plateau[row][col+1].getSymbole()!='X'||this.plateau[row][col-1].getSymbole()!='X')){
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
            
        }
       


    }
    public void deplacement(){
        plateau[this.getPosition().getRow()][this.getPosition().getCol()] = new Case(this.getPosition());
        Position new_position = new Position(this.getRowNumber() + this.getDirection().getRowDir(), this.getColNumber() + this.getDirection().getColDir());
        this.setCase(new_position, getSymbole());

        
    }

}
