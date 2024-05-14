public class Plateau {

    private int rowNumber;
    private int colNumber;
    Case[][] plateau;
 
    

    Plateau(int rowNumber, int colNumber){
        this.colNumber=colNumber;
        this.rowNumber=rowNumber;
        this.plateau = new Case[rowNumber][colNumber];

    }

    Plateau(){
        this(8,8);
    }

    public void setPlateau(int rowNumber,int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        
    }
    public Case[][] getPlateau(){
        return this.plateau;
    }

    public int getRowNumber(){
        return this.rowNumber;
    }
    public int getColNumber(){
        return this.colNumber;
    }
    public Case getCase(Position position){
        return plateau[position.getRow()][position.getCol()];

    }
    public void ajouterCase(Case cases){
        plateau[cases.getPosition().getRow()][cases.getPosition().getCol()] = cases;

    }
    public void retirerCase(Case cases){
        plateau[cases.getPosition().getRow()][cases.getPosition().getCol()] = null;

    }
    

    public void afficherPlateau(){
        for(int i=0;i<this.rowNumber;i++){
            
            for(int j=0;j<this.colNumber;j++){
                
                this.plateau[i][j].afficherCase();
                Ecran.afficher(' ');
            }
            Ecran.sautDeLigne();
        }
    }

    public void generationPlateau(){
        for(int i=0;i<rowNumber;i++){
            for(int j=0;j<colNumber;j++){
                Position position_temporaire = new Position(i,j);
                if(i==0||i==rowNumber-1||j==0||j==colNumber-1){
                    this.plateau[i][j] = new Bordure(position_temporaire,this);
                }else {
                    this.plateau[i][j] = new Case(position_temporaire,this);
                }
            }
        }
        
    }
    

    public void generationEntites(){
        int limite_entite_p = 5;
        int limite_entite_l = 5;
        int limite_entite_r = 5;
        int limite_entite_c = 5;

        while(limite_entite_c>0 || limite_entite_l>0 ||limite_entite_p>0 || limite_entite_r>0){
            int random_i = 1+ (int)(Math.random()*(rowNumber-2));
            int random_j = 1+ (int)(Math.random()*(colNumber-2));
            
                    Position position_temporaire = new Position(random_i, random_j);
                        if(plateau[random_i][random_j].getSymbole()==' '){
                            
                            if(0<limite_entite_p){
                                Poule p = new Poule(position_temporaire,this);
                                p.setCase_id(this.plateau[random_i][random_j]);
                                this.plateau[random_i][random_j]=p;
                                limite_entite_p = limite_entite_p-1;
                                
                            }
                            else if(0<limite_entite_l){
                                Lapin l = new Lapin(position_temporaire,this);
                                l.setCase_id(this.plateau[random_i][random_j]);
                                this.plateau[random_i][random_j]=l;
                                limite_entite_l = limite_entite_l-1;
                            }
                            else if(0<limite_entite_r){
                                Renard r = new Renard(position_temporaire,this);
                                r.setCase_id(this.plateau[random_i][random_j]);
                                this.plateau[random_i][random_j]=r;
                                limite_entite_r = limite_entite_r-1;
                            }
                            else if(0<limite_entite_c){
                                Chasseur c = new Chasseur(position_temporaire,this);
                                c.setCase_id(this.plateau[random_i][random_j]);
                                this.plateau[random_i][random_j]=c;
                                limite_entite_c = limite_entite_c-1;
                            }
                           

                        }
                        
                    
        }
    }


    public int nombreEntitesRestantes(){
        int nombre_entites = 0;
        for(int i=1;i<rowNumber-1;i++){
            for(int j=1;j<colNumber-1;j++){
                if(plateau[i][j].getSymbole()=='C' || plateau[i][j].getSymbole()=='R' || plateau[i][j].getSymbole()=='P' || plateau[i][j].getSymbole()=='L'){
                    nombre_entites=nombre_entites+1;
                }

            }
        }
        return nombre_entites;
    }

    

    

}
