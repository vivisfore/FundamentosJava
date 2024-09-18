import java.util.Arrays;
import java.util.Random;

public class Ejemplo_Arreglos {

    public static void main(String[] args) {

       /* String[] nombres=new String[5];
        nombres[0]="Maria";
        nombres[1]="Juan";
        nombres[2]="Leonardo";
        nombres[3]="Pedro";
        nombres[4]="Mario";
        System.out.println(nombres[4]);
*/
        int[] edades={34,23,18,11,30};
        /*System.out.println(nombres[2]+" "+edades[2]);

        System.out.println(nombres.length);
        for(int i=0;i< nombres.length;i++){
            System.out.println(nombres[i]);
        }

        for (int x:edades) {
            System.out.println(x);
        }*/

        //-------------------------------------------------------------
     int[] resultado=Ejemplo_Arreglos.generaArreglo(10,21);
     imprimirArreglo(generaArreglo(50,201));
     imprimirArreglo(resultado);
        //System.out.println(Arrays.toString(edades));
     resultado=generaArreglo(5,11);
     imprimirArreglo(resultado);
     System.out.println("El promedio es: "+calculaPromedio(resultado));
    }

    public static int[] generaArreglo(int tam,int limite){

        int[] numeros=new int[tam];
        Random aleatorio=new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=aleatorio.nextInt(limite);
        }
        //imprimirArreglo(numeros);
        return numeros;
    }

    public static void imprimirArreglo(int[] n){
        System.out.println(Arrays.toString(n));
    }

    public static double calculaPromedio(int[] arreglo){
        double suma=0;
        for(int num:arreglo){
           suma+=num;
        }
        double promedio=suma/arreglo.length;
        return promedio;
    }
}
