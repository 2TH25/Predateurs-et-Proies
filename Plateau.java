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
    public void clearPosition(Position position){
        this.plateau[position.getRow()][position.getCol()] = new Case(position,this);
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
        int limite_entite_p = 3;
        int limite_entite_l = 3;
        int limite_entite_r = 3;
        int limite_entite_c = 3;
        int limite_entite_trap=2;
        int random_i;
        int random_j;

        for(int a=0;a<limite_entite_p;a++){
            do {
                random_i = 1+ (int)(Math.random()*(rowNumber-2));
                random_j = 1+ (int)(Math.random()*(colNumber-2));
                
                
            } while(plateau[random_i][random_j].getSymbole()!=' ');
            
                    Position position_temporaire = new Position(random_i, random_j);
                    Poule p = new Poule(position_temporaire,this);
                    
                    this.plateau[random_i][random_j]=p;
        }
        

        for(int b=0;b<limite_entite_l;b++){
            
            do {
                random_i = 1+ (int)(Math.random()*(rowNumber-2));
                random_j = 1+ (int)(Math.random()*(colNumber-2));
            } while(plateau[random_i][random_j].getSymbole()!=' ');
                    Position position_temporaire = new Position(random_i, random_j);
                    Lapin l = new Lapin(position_temporaire,this);
                    
                    this.plateau[random_i][random_j]=l;
        }
                
        
        for(int c=0;c<limite_entite_r;c++){
            do {
                random_i = 1+ (int)(Math.random()*(rowNumber-2));
                random_j = 1+ (int)(Math.random()*(colNumber-2));
        
            } while(plateau[random_i][random_j].getSymbole()!=' ');
                    Position position_temporaire = new Position(random_i, random_j);
                    Renard r = new Renard(position_temporaire,this);
                    
                    this.plateau[random_i][random_j]=r;
        }
        
    
        for(int d=0;d<limite_entite_c;d++){
            do {
                random_i = 1+ (int)(Math.random()*(rowNumber-2));
                random_j = 1+ (int)(Math.random()*(colNumber-2));
            } while(plateau[random_i][random_j].getSymbole()!=' ');
                    Position position_temporaire = new Position(random_i, random_j);
                    Chasseur c = new Chasseur(position_temporaire,this);
                    
                    this.plateau[random_i][random_j]=c;
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
