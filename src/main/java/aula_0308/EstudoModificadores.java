package aula_0308;

public class EstudoModificadores {
    public final double PI = 3.16545;

    public static void main(String[] args) {
//        Modificadores
//      -Acesso
    //        -> public (pode acessar fora da classe e fora do pacote que ele foi definito)
    //        -> private (não se pode acessar fora da classe, somente dentro da propria classe)
    //        -> protected (acessado por classes do mesmo pacote pela propria classe e por seus filhos)
    //        -> default (padrao) (acessado somente por classes no mesmo pacote)
//      -Não acesso
    //        -> static
    //        -> final
        Cliente maria = new Cliente();
        maria.setNome("Maria");
        System.out.println(maria.getNome());

    }
}

// Escapsulamento -> Garantir a consistencia dos dados de uma classe