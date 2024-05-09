public class Main {

    public static void main(String[] args) {
        Plateau PlateauDeJeu = new Plateau(9,9);
        PlateauDeJeu.generationPlateau();
        PlateauDeJeu.afficherPlateau();


    //boucle de jeu principale

    while(PlateauDeJeu.nombreEntitesRestantes()>3){
        for(int i = 0; i<PlateauDeJeu.getRowNumber() ; i++){
            for(int j = 0 ; j<PlateauDeJeu.getColNumber() ; j++){
                if(PlateauDeJeu.getPlateau()[i][j].getSymbole()!='X'||PlateauDeJeu.getPlateau()[i][j].getSymbole()!=' '){
                    PlateauDeJeu.getPlateau()[i][j].interactionCase(PlateauDeJeu.getPlateau()[ i + PlateauDeJeu.getPlateau()[i][j].getDirection().getRowDir()][ j + PlateauDeJeu.getPlateau()[i][j].getDirection().getColDir()]);

                }

            }
        }
        try {
            Thread.sleep(5000);}
            
            catch(Exception e) {
                Ecran.afficherln("Quelque chose ne va pas, le catch a été utilisé");
            }
            finally {
                Ecran.afficher("Mise en attente bien réalisée");
            }
    
        PlateauDeJeu.afficherPlateau();
    }


    }




}