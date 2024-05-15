public class Piege extends Case {


    Piege(Position position, Plateau plateau){
        super(position,'w',plateau);

    }
    public void afficherCase(){
        Ecran.afficher('w');
    }


    public void interactionFinale(Case entite){
        
    }
    
}
