public class Plateau {

    private int rowNumber;
    private int colNumber;
    private int tours_effectues;
    Case[][] plateau;
 
    

    Plateau(int rowNumber, int colNumber){
        this.colNumber=colNumber;
        this.rowNumber=rowNumber;
        this.plateau = new Case[rowNumber][colNumber];

    }

    Plateau(){
        this(8,8);
    }
    public void addTour(){
        this.tours_effectues=this.tours_effectues+1;
    }
    public int getTour(){
        return this.tours_effectues;
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
        int limite_entite_p = 3;
        int limite_entite_l = 3;
        int limite_entite_r = 3;
        int limite_entite_c = 3;
        int limite_entite_trap=2;
        int random_i;
        int random_j;
        Ecran.afficherln("t");
        for(int a=0;a<limite_entite_p;a++){
            random_i = 1+ (int)(Math.random()*(rowNumber-2));
            random_j = 1+ (int)(Math.random()*(colNumber-2));
            Position position_temporaire = new Position(random_i, random_j);
            if(plateau[random_i][random_j].getSymbole()==' '){
                Poule p = new Poule(position_temporaire,this);
                p.setCase_id(this.plateau[random_i][random_j]);
                this.plateau[random_i][random_j]=p;
            }else {
                limite_entite_p=limite_entite_p+1;
            }

        }
        for(int b=0;b<limite_entite_l;b++){
            random_i = 1+ (int)(Math.random()*(rowNumber-2));
            random_j = 1+ (int)(Math.random()*(colNumber-2));
            Position position_temporaire = new Position(random_i, random_j);
            if(plateau[random_i][random_j].getSymbole()==' '){
                Lapin l = new Lapin(position_temporaire,this);
                l.setCase_id(this.plateau[random_i][random_j]);
                this.plateau[random_i][random_j]=l;
                                
            }else {
                limite_entite_l=limite_entite_l+1;
            }

        }
        for(int c=0;c<limite_entite_r;c++){
            random_i = 1+ (int)(Math.random()*(rowNumber-2));
            random_j = 1+ (int)(Math.random()*(colNumber-2));
            Position position_temporaire = new Position(random_i, random_j);
            if(plateau[random_i][random_j].getSymbole()==' '){
                Renard r = new Renard(position_temporaire,this);
                r.setCase_id(this.plateau[random_i][random_j]);
                this.plateau[random_i][random_j]=r;
            }else {
                limite_entite_r=limite_entite_r+1;
            }

        }
        for(int d=0;d<limite_entite_c;d++){
            random_i = 1+ (int)(Math.random()*(rowNumber-2));
            random_j = 1+ (int)(Math.random()*(colNumber-2));
            Position position_temporaire = new Position(random_i, random_j);
            if(plateau[random_i][random_j].getSymbole()==' '){
                Chasseur c = new Chasseur(position_temporaire,this);
                c.setCase_id(this.plateau[random_i][random_j]);
                this.plateau[random_i][random_j]=c;
            }else {
                limite_entite_c=limite_entite_c+1;
            }

        }
        for(int e=0;e<limite_entite_trap;e++){
            random_i = 1+ (int)(Math.random()*(rowNumber-2));
            random_j = 1+ (int)(Math.random()*(colNumber-2));
            Position position_temporaire = new Position(random_i, random_j);
            if(plateau[random_i][random_j].getSymbole()==' '){
                Piege pi = new Piege(position_temporaire,this);
                pi.setCase_id(this.plateau[random_i][random_j]);
                this.plateau[random_i][random_j]=pi;
            }else {
                limite_entite_trap=limite_entite_trap+1;
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
