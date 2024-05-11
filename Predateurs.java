public class Predateurs extends Personnage {
    
    Predateurs (Position position,char symbole,Plateau plateau){
        super(position,symbole,plateau);
    }


    public void tuerEntite(Case entite){
        this.getPlateauType().retirerCase(entite);
        this.getPlateauType().ajouterCase(entite.getCase_id());

    }
}
