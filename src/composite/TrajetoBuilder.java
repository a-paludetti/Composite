package composite;

public class TrajetoBuilder {

    enum TipoTrajeto {
        ONIBUS,
        TREM,
        METRO
    }

    public static Metro criarMetro(String linha, String HorarioChegada, String HorarioPartida, String tipo) {
        return new Metro(linha, HorarioChegada, HorarioPartida, tipo);
    }

    public static Onibus criarOnibus(String linha, String HorarioChegada, String HorarioPartida, String tipo) {
        return new Onibus(linha, HorarioChegada, HorarioPartida, tipo);
    }

    public static Trem criarTrem(String linha, String HorarioChegada, String HorarioPartida, String tipo) {
        return new Trem(linha, HorarioChegada, HorarioPartida, tipo);
    }

    public static iTrajeto criarTrajeto(String linha, String HorarioPartida, String HorarioChegada, TipoTrajeto ts) {
        switch(ts){
            case ONIBUS:
                criarOnibus(linha, HorarioPartida, HorarioPartida, linha);
            case TREM:
                criarTrem(linha, HorarioPartida, HorarioPartida, linha);
            case METRO:
                criarTrem(linha, HorarioPartida, HorarioPartida, linha);
            default: return null;}
    }

}
