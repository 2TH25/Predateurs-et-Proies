public class Main {

    public static void main(String[] args) {
        Plateau PlateauDeJeu = new Plateau(9,9);
        PlateauDeJeu.generationPlateau();
        PlateauDeJeu.afficherPlateau();


    //boucle de jeu principale

    while(PlateauDeJeu.nombreEntitesRestantes()>3){
        for(int i=0;i<PlateauDeJeu.getRowNumber();i++){
            for(int j = 0;j<PlateauDeJeu.getColNumber();j++){
                while(PlateauDeJeu.getPlateau()[i][j].getSymbole()!='X'||PlateauDeJeu.getPlateau()[i][j].getSymbole()!=' '){
                    PlateauDeJeu.getPlateau()[i][j].deplacement();

                }

            }
        }
        PlateauDeJeu.afficherPlateau();
    }


    }




}