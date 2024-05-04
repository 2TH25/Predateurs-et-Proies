public class Renard extends Predateurs {
  
    Renard (Position position){
        super(position, 'R');
    }

    public void interactionPolymorphe(Personnage entite){
        if(entite.getSymbole()=='C'||entite.getSymbole()=='R'){
            //mise en attente
            this.getDirection().generatioDirection();

        }else{
            //l'entité(la case) est supprimée de la matrice plateau
        }
        
}
}
