import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Apredniendo Java"); //Mostrar por consola
        System.out.println("TalentoTech");

        byte edad; //Definir la variable
        /*short anio = 2024;
        int salario=5400000;*/
        String cedula="1073345678";
        char sexo='F';
        float estatura=(float)1.68;
        double valorCasa=234567890.234;
        boolean hombre=false;
        System.out.println(valorCasa);

        //Operadores Aritmeticos + - * / %

        Scanner x=new Scanner(System.in);
        System.out.println("Digite el numero 1: ");
        byte num1=x.nextByte();
        System.out.println("Digite el numero 2: ");
        byte num2=x.nextByte();
        short suma= (short) (num1+num2);
        int resta=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        byte mod= (byte) (num1%num2);
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+mul);
        System.out.println("Division: "+div);
        System.out.println("Modulo: "+mod);

    }
}