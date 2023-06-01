package tareaprograiipoo;

public class CalculadoraEspecial extends Calculadora {

    
    public CalculadoraEspecial(String Andy){
        super(Andy);
        this.tipoCalculadora = "Calculadora Especial";
    }
    //area de un círculo
    public double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    
    //area de un triángulo
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    
    //área de un rectángulo
    public double calcularAreaRectangulo(double lado1, double lado2) {
        return lado1 * lado2;
    }
    
    //área de un cuadrado
    public double calcularAreaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }
    
    //perímetro de un círculo
    public double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
    
    //perímetro de un triángulo
    public double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
}
