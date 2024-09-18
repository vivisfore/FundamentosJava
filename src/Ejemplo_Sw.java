import java.util.Scanner;

public class Ejemplo_Sw {

    public static void main(String[] args) {

        Scanner x=new Scanner(System.in);
        System.out.println("Digite el valor de la compra: ");
        double compra=x.nextDouble();
        System.out.println("Digite color de la balota");
        String balota=x.next().toLowerCase();
        float descuento;

        switch (balota){
            case "blanca":
               descuento=0.1f;
                System.out.println("Balota Blanca obtiene el 10% de descuento");
                break;
            case "verde":
                descuento=0.2f;
                System.out.println("Balota Verde obtiene el 20% de descuento");
                break;
            case "azul":
                descuento=0.3f;
                System.out.println("Balota Azul obtiene el 30% de descuento");
                break;
            case "amarilla":
                descuento=0.5f;
                System.out.println("Balota Amarilla obtiene el 50% de descuento");
                break;
            case "roja":
                descuento=1.0f;
                System.out.println("Balota Roja obtiene el 100% de descuento");
                break;
            default:
                descuento=0;
                System.out.println("No Obtuvo descuento.");

        }
        double valorDes=compra*descuento;
        double total=compra-valorDes;
        System.out.println("Se otorga un descuento de: "+valorDes);
        System.out.println("Total a pagar: "+total);
    }
}
