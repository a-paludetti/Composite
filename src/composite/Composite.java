package composite;

public class Composite {

    public static void main(String[] args) {

        Trajeto ts = new Trajeto("Trajeto 1", "ZN");
        ts.getTrajetos().add(new Onibus("671-D", "22:30", "21", "Onibus"));

        ts.mostrarTrajeto();
    }

}
