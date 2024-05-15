public class Main {

    public static void main(String[] args) {
      
        Plateau PlateauDeJeu = new Plateau(9,9);
      
        
        PlateauDeJeu.generationPlateau();
        PlateauDeJeu.generationEntites();
        PlateauDeJeu.afficherPlateau();  

    //boucle de jeu principale

        while(PlateauDeJeu.nombreEntitesRestantes()>3){
            for(int i = 1; i<PlateauDeJeu.getRowNumber()-1 ; i++){
                for(int j = 1 ; j<PlateauDeJeu.getColNumber()-1 ; j++){
                    if(PlateauDeJeu.getPlateau()[i][j].getSymbole()!='X'&& PlateauDeJeu.getPlateau()[i][j].getSymbole()!=' '&&PlateauDeJeu.getPlateau()[i][j].getSymbole()!='w'){
                        PlateauDeJeu.getPlateau()[i][j].interactionFinale(PlateauDeJeu.getPlateau()[ i + PlateauDeJeu.getPlateau()[i][j].getDirection().getRowDir()][ j + PlateauDeJeu.getPlateau()[i][j].getDirection().getColDir()]);
                        

                    }

                }
            }
            for(int k = 1; k<PlateauDeJeu.getRowNumber()-1 ; k++){
                for(int l = 1 ; l<PlateauDeJeu.getColNumber()-1 ; l++){
                    if(PlateauDeJeu.getPlateau()[k][l].getSymbole()!='X'&& PlateauDeJeu.getPlateau()[k][l].getSymbole()!=' '){
                        PlateauDeJeu.getPlateau()[k][l].setAgi(false);
                    }
                }
            }


            try {
                Thread.sleep(2000);}
                
                catch(Exception e) {
                    Ecran.afficherln("Quelque chose ne va pas, le catch a été utilisé");
                }
                finally {
                    Ecran.afficherln("Mise en attente bien réalisée");
                }
            PlateauDeJeu.afficherPlateau();
        }


    }




}