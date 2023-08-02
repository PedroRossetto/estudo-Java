package aula_0208;
// POO (Programação Orientada a Objetos)
// Classes -> Fruta (Modelagem)
// Objectos -> Maçã, Perâ. Banana, Goiaba
// Instancia -> Processo que constroi um objeto a partir de uma classe
// Metodos/Função -> Uma rotina /procedimento/tarefa que é feito pelo objeto

public class EstudoClasses {
    public static void main(String[] args) {

        Fruta maca = new Fruta();  // criar/instanciar um objeto
        maca.nome = "Maçã";
        maca.cor = "Vermelha";
        maca.acidez = 5;
        maca.suculencia = true;

        System.out.println(maca.nome.length());
    }
}
