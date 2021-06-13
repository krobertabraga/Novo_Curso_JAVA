// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args){

        // Condicional = verificar uma condição - fazer yma pergunta para uma pessoa, hardware ou software

        // if = se
        // else = senão

        String modo = "externso";

        if ( modo == "curto"){
            calcularAreaModoCompacto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCompacto(){
        System.out.println("Calcular Area Modo Compacto");
        // Calcula de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }
    public static void calcularAreaModoExtenso(){
        System.out.println("Calcular Area Modo Extenso");
        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + "m²");
    }
}
