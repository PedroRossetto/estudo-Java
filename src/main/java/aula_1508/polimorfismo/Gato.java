package aula_1508.polimorfismo;

public class Gato extends Animal{

    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    // sobrescrita de metodo -> reescrever um metodo

    @Override   // -> Anotação
    public void emitirSom() {
        System.out.println("miau, miau!");
    }
}
