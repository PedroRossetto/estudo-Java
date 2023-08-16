package aula_1608.atividades.atividade1;

public class Carro extends Veiculo{
    private Integer velocidadeMax;

    public Carro() {
    }

    public Carro(String marca, String modelo, Integer ano, Integer velocidadeMax) {
        super(marca, modelo, ano);
        this.velocidadeMax = velocidadeMax;
    }

    public Integer getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(Integer velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
}
