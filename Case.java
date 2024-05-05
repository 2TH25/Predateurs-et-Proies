public class Case extends Plateau {
       
    private Position position ;
    private char symbole;

    Case (Position position, char symbole) {
        this.position = position;
        this.symbole = symbole;
    }

    Case (Position position){
        this(position, ' ');
    }


    public void setCase(Position position,char symbole){
        this.position=position;
        this.symbole=symbole;
    }


    public Position getPosition(){
        return this.position;
    }
    public char getSymbole(){
        return this.symbole;
    }

    public void afficherCase(){
        Ecran.afficher(this.symbole);
    }

    public void deplacement(){
        this.deplacement();
    }


    



}
