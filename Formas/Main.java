package Formas;

public class Main {
    public static void main(String[] args) {
        // Criando um círculo com raio 5
        Circulo circulo = new Circulo(5);
        System.out.println(circulo.toString());
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        // Criando um quadrado com lado 4
        Quadrado quadrado = new Quadrado(4);
        System.out.println(quadrado.toString());
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());

        // Criando um retângulo com altura 6 e largura 8
        Retangulo retangulo = new Retangulo(6, 8);
        System.out.println(retangulo.toString());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}
