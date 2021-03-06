package composite;

public class Onibus extends ModoTransporte {

    String tipo;

    public Onibus(String linha, String HorarioChegada, String HorarioPartida, String tipo) {
        super(linha, HorarioPartida, HorarioChegada);
        this.tipo = tipo;
    }

    @Override
    public void getInfo() {
        System.out.println("Tipo: "+this.tipo + "Linha: " + this.getLinha() + "Horário Partida: " + getHorarioPartida() + "Horário Chegada: " + getHorarioChegada());
    }

}
