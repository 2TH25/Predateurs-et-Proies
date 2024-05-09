public class Bordure extends Case {
    
    Bordure (Position position){
        super(position,'X');
    }
    public void afficherCase(){
        Ecran.afficher('X');
    }
}
