package aula_1508.polimorfismo;

public class Main {
    public static void main(String[] args) {

//        Animal rato = new Animal("Rato", "Pachyuromys duprasi", "Terrenos Baldios");
//        System.out.println(rato.getNome());
//        System.out.println(rato.getEspecie());
//        System.out.println(rato.getHabitat());

        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        gato.emitirSom();
        cachorro.emitirSom();
    }
}
