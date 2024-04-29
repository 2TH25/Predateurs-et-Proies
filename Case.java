public class Case extends Plateau {
       
    private Position position ;
    private char symbole;

    Case (Position position, char symbole) {
        this.position = position;
        this.symbole = symbole;
    }

    Case (Position position){
        this.position = position;
        this.symbole = ' ';
    }

    void setCase(Position position,char symbole){
        this.position=position;
        this.symbole=symbole;
    }


    Position getPosition(){
        return this.position;
    }

    void afficherCase(){
        Ecran.afficher(this.symbole);
    }

}
