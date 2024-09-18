import java.util.Scanner;

public class Ejemplo_While {

    public static void main(String[] args) {

        Scanner x=new Scanner(System.in);

        int num=5;
      /*  while (num>0){
            System.out.println(num);
            num--;
        }*/

        /*num=-1;
        while (num<0){
            System.out.println("Digite un numero positivo");
            num=x.nextInt();
        }

        System.out.println(num+" es un numero positivo.");*/

        /*do{
            num=x.nextInt();
            System.out.println(num);
        }while (num>=10 && num<=20);*/

        //----------------------------Contraseña correcta-----------------------------

        String password="Talento123";
        String usuario="Campista1";
        String pass,usu;
        System.out.println("Ingrese el usuario:");
        usu=x.next();
        System.out.println("Ingrese la contraseña");
        pass=x.next();
        boolean correcta=false;
        int intentos=1;

        while (!correcta && intentos<3){

            if(password.equals(pass) && usuario.equals(usu)){
                System.out.println("Ingreso correcto");
                correcta=true;
            }else{
                intentos++;
                System.out.println("Datos incorrectos.");
                System.out.println("Ingrese el usuario:");
                usu=x.next();
                System.out.println("Ingrese la contraseña");
                pass=x.next();
            }
            if(intentos==3){
                System.out.println("Ha superado el numero de intentos permitidos.");
                //break;
            }
        }

    }
}
