public class Herbe extends Case {
    private int herbe_longueur;
    private int longueur_memoire=0;
    Herbe (Position position,Plateau plateau){
        super(position,plateau);
        this.herbe_longueur=0;
    }
    Herbe (Position position,Plateau plateau,int herbe_longueur){
        super(position,plateau);
        this.herbe_longueur=0;
    }
    public int getLongueur_Herbe(){
        return this.herbe_longueur;
    }
    public int getLongueur_Memoire(){
        return this.longueur_memoire;
    }
    public void afficherCase(){
        switch(this.herbe_longueur) {
                case 0 : 
                Ecran.afficher(',');
                break;
                case 1 : 
                Ecran.afficher(')');
                break;
                case 2 : 
                Ecran.afficher('|');
                break;

        }
    }

    public void redirection(Case entite){
        if(entite.getSymbole()=='C'){
            this.herbe_longueur=0;
        }
        if(entite.getSymbole()=='L'&&this.herbe_longueur>0){
            this.herbe_longueur=this.herbe_longueur-1;
            this.longueur_memoire=this.longueur_memoire-1;
        }
        else if(entite.getSymbole()=='L'&&this.getLongueur_Memoire()==0){
            entite.getDirection().generationDirection();
        }
        else {
            Position position_cible = new Position(this.getPosition().getRow(),this.getPosition().getCol());
            Case case_cible = new Case(position_cible,this.getPlateauType());
            this.getPlateauType().clearHerbe(entite.getPosition());
            entite.getPlateauType().retirerCase(case_cible);
            entite.setPosition(case_cible.getPosition());
            entite.getPlateauType().ajouterCase(entite);
            entite.setAgi(true);
        }
    }

    public void addLongueur_Herbe(){
        this.herbe_longueur=this.herbe_longueur+1;
        this.longueur_memoire=this.longueur_memoire+1;
    }

}
