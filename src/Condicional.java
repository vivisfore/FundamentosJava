public class Condicional {

    public static void main(String[] args) {

        int edad=18;
        if(edad>0 && edad<=100){
            if(edad>=18){
                System.out.println("Mayor de edad");
            }else if(edad<10){
                System.out.println("Menor de Edad");
                System.out.println("Es un niño");
            }else{
                System.out.println("Menor de Edad");
                System.out.println("Es Adolecente");
            }
        }else{
            System.out.println("Edad no valida");
        }


    }
}
