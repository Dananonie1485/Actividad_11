import java.util.Scanner;

public class CalculadoraAP {

    public static void main(String args[]) {
        int o;
        Scanner leer=new Scanner(System.in);
        //despliegue de menú

        System.out.println("\n Actividad 11");
        System.out.println("\n Calculadora de A & P");
        System.out.println("Selecciona la opción que desees calcular del menú: ");

        System.out.println("\n 1: Área Cuadrado");
        System.out.println("2: Perímetro Cuadrado");
        System.out.println("3: Área Círculo");
        System.out.println("4: Perímetro Círculo");
        System.out.println("5: Área Tríangulo");
        System.out.println("6: Perímetro Tríangulo");
        o=leer.nextInt(); //lectura de opción

        //metodo de claculo para cada opción
        switch (o){
            case 1:

                System.out.println("\n Dame el valor del lado: ");
                int valLado=leer.nextInt();

                Square miSquare = new Square();
                int areaSquare = miSquare.getArea(valLado);
                System.out.println("\n El área del cuadrado es de: " + areaSquare);

                break;

            case 2:

                System.out.println("\n Dame el valor del lado: ");
                int valLadoP=leer.nextInt();

                Square miSquare1 = new Square();
                int periSquare = miSquare1.getPerimeter(valLadoP);
                System.out.println("\n El perimetro del cuadrado es de: " + periSquare);

                break;

            case 3:

                System.out.println("\n Dame el valor del radio: ");
                double valRadio=leer.nextInt();

                Circle miCircle = new Circle();
                double areaCircle = miCircle.getArea(valRadio);
                System.out.println("\n El área del círculo es: " + areaCircle);

                break;

            case 4:

                System.out.println("\n Dame un valor: ");
                double valPeri=leer.nextInt();

                Circle miCircle1 = new Circle();
                double periCircle = miCircle1.getPerimeter(valPeri);
                System.out.println("\n El perimetro del círculo es de: " + periCircle);

                break;

            case 5:

                System.out.println("\n Dame el valor del lado: ");
                int valLadoTA=leer.nextInt();

                Triangle miTriangle = new Triangle();
                int areaTriangle = miTriangle.getArea(valLadoTA);
                System.out.println("\n El área del triangulo es de: " + areaTriangle);

                break;

            case 6:

                System.out.println("\n Dame el valor del lado: ");
                int valLadoT=leer.nextInt();

                Triangle miTriangle1 = new Triangle();
                int periTriangle = miTriangle1.getPerimeter(valLadoT);
                System.out.println("\n El perimetro del triangulo es de: " + periTriangle);

                break;

        }

    } // Fin del main

}// fin de la clase
