package composite;

public abstract class ModoTransporte implements iTrajeto {

    private String linha = "";
    private String horarioPartida = "";
    private String horarioChegada = "";

    public ModoTransporte(String linha, String horarioPartida, String horarioChegada) {
        this.linha = linha;
        this.horarioChegada = horarioChegada;
        this.horarioPartida = horarioPartida;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

}
