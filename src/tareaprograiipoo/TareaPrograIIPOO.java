
package tareaprograiipoo;

import java.util.Scanner;

public class TareaPrograIIPOO {
    
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       Calculadora calculadora = new Calculadora("JP");
       CalculadoraEspecial calculadoraEspecial = new CalculadoraEspecial ();
       boolean salir = false;
       int opcion; 
               
       do{
           System.out.println("");
           System.out.println("=======================");
           System.out.println("1.  Sumar");
           System.out.println("2.  Restar");
           System.out.println("3.  Multiplicar");
           System.out.println("4.  Dividir");
           System.out.println("5.  Raiz Cuadrada");
           System.out.println("6.  Verificar numero Primo");
           System.out.println("7.  Calcular el area de un circulo");
           System.out.println("8.  Calcular el area de un triangulo");
           System.out.println("9.  Calcular el area de un rectangulo");
           System.out.println("10. Calcular el area de un cuadrado");
           System.out.println("11. Calcular el permietro de un circulo");
           System.out.println("12. Calcular el perimetro de un triangulo");
           System.out.println("13. Salir");
           System.out.println("Selecciona una opcion");
           System.out.println("=======================");
           opcion = sn.nextInt();
            switch(opcion){
                case 1:
                   System.out.println("El resultado de la suma es = " + calculadora.sumar(10, 5));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calculadora.restar(10, 5));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calculadora.multiplicar(10, 5));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calculadora.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadora.raizCuadrada(16));
                    break;
                case 6:
                    System.out.println("Es primo? = " +calculadora.esPrimo(11));
                    break;
                   case 7:
                    System.out.println("Ingrese el radio del circulo: ");
                    double radioCirculo = sn.nextDouble();
                    System.out.println("El area del circulo es = " + calculadoraEspecial.calcularAreaCirculo(radioCirculo));
                    break;
                case 8:
                    System.out.println("Ingrese la base del triangulo: ");
                    double baseTriangulo = sn.nextDouble();
                    System.out.println("Ingrese la altura del triangulo: ");
                    double alturaTriangulo = sn.nextDouble();
                    System.out.println("El area del triangulo es = " + calculadoraEspecial.calcularAreaTriangulo(baseTriangulo, alturaTriangulo));
                    break;
                case 9:
                    System.out.println("Ingrese el primer lado del rectangulo: ");
                    double lado1Rectangulo = sn.nextDouble();
                    System.out.println("Ingrese el segundo lado del rectangulo: ");
                    double lado2Rectangulo = sn.nextDouble();
                    System.out.println("El area del rectangulo es = " + calculadoraEspecial.calcularAreaRectangulo(lado1Rectangulo, lado2Rectangulo));
                    break;
                case 10:
                    System.out.println("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = sn.nextDouble();
                    System.out.println("El area del cuadrado es = " + calculadoraEspecial.calcularAreaCuadrado(ladoCuadrado));
                    break;
                case 11:
                    System.out.println("Ingrese el radio del circulo: ");
                    double radioPerimetroCirculo = sn.nextDouble();
                    System.out.println("El perimetro del circulo es = " + calculadoraEspecial.calcularPerimetroCirculo(radioPerimetroCirculo));
                    break;
                case 12:
                    System.out.println("Ingrese el primer lado del triangulo: ");
                    double lado1PerimetroTriangulo = sn.nextDouble();
                    System.out.println("Ingrese el segundo lado del triangulo: ");
                    double lado2PerimetroTriangulo = sn.nextDouble();
                    System.out.println("Ingrese el tercer lado del triangulo: ");
                    double lado3PerimetroTriangulo = sn.nextDouble();
                    System.out.println("El perimetro del triangulo es = " + calculadoraEspecial.calcularPerimetroTriangulo(lado1PerimetroTriangulo, lado2PerimetroTriangulo, lado3PerimetroTriangulo));
                    break;
                case 13:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 13");
            }
       }
        while(!salir);   
    }
}