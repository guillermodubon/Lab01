import java.util.Scanner;

public class Calculadora{

    public int num1;
    public int num2;
    public int total=0;

    int suma(int num1, int num2){

        return num1+num2;
    }

    int resta(int num1, int num2){

        return num1-num2;
    }

    int multiplicacion(int num1, int num2){

        return num1*num2;
    }

    int division(int num1, int num2) {

        return num1 / num2;
    }

    void cerrar_calculadora(Scanner sc){
        sc.close();
        System.exit(0);
    }

        public static void main(String[] args){

            Scanner scanner=new Scanner(System.in);
            Calculadora calculadora=new Calculadora();

            while(true) {
                System.out.println("CALCULADORA VIRTUAL");
                System.out.println("1.SUMA");
                System.out.println("2.RESTA");
                System.out.println("3.MULTIPLICACION");
                System.out.println("4.DIVISION");
                System.out.println("0.EXIT");
                int choice = scanner.nextInt();

                if(choice==0){
                    System.out.println("Gracias por usar la calculadora virtual :)");
                   calculadora.cerrar_calculadora(scanner);
                }

                System.out.println("Ingresa el primer numero");
                calculadora.num1 = scanner.nextInt();

                System.out.println("Ingresa el segundo numero");
                calculadora.num2 = scanner.nextInt();

                switch (choice) {

                    case 1:
                        calculadora.total = calculadora.suma(calculadora.num1, calculadora.num2);
                        System.out.println("La suma total es: " + calculadora.total);
                        break;
                    case 2:
                        calculadora.total = calculadora.resta(calculadora.num1, calculadora.num2);
                        System.out.println("La resta total es: " + calculadora.total);
                        break;

                    case 3:
                        calculadora.total = calculadora.multiplicacion(calculadora.num1, calculadora.num2);
                        System.out.println("La multiplicacion total es: " + calculadora.total);
                        break;

                    case 4:
                        calculadora.total = calculadora.division(calculadora.num1, calculadora.num2);
                        System.out.println("La division total es: " + calculadora.total);
                        break;

                    default:
                        System.out.println("Ingresa una opcion valida");
                }
            }


                        }

                    }

