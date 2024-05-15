public class Piege extends Case {


    Piege(Position position, Plateau plateau){
        super(position,'w',plateau);

    }
    public void afficherCase(){
        Ecran.afficher('w');
    }


    public void interactionFinale(Case entite){
        //lorqu'une entité Poule, Renard, ou Lapin marche sur un Piege, cette entité décède.
        if(entite.getSymbole()!='C'){
            this.tuerEntite(entite);
        }
        else{
            //lorsque c'est un Chasseur, son déplacement est debuff, ce qui le fait se déplacer, mais avec un certain taux de chance.
            entite.addDebuff_Deplacement();
        }
        //Un piège est à usage unique, lorsqu'il élimine une entité, le Piege est supprimé. 
        this.getPlateauType().retirerCase(this);
        this.getPlateauType().ajouterCase(this.getCase_id());
    }
    
}
