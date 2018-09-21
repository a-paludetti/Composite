package composite;

import java.util.ArrayList;

public class Trajeto {

    private String nome;
    private String regiao;
    private final ArrayList<iTrajeto> trajetos = new ArrayList<>();

    public Trajeto(String nome, String regiao) {
        this.nome = nome;
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public ArrayList<iTrajeto> getTrajetos() {
        return trajetos;
    }

    public void mostrarTrajeto() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Região: " + this.regiao);

        for (iTrajeto trajeto : trajetos) {
            trajeto.getInfo();
        }

    }
}
