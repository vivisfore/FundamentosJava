public class Operadores {
    public static void main(String[] args) {
        System.out.println("Operadores");
        //Operadores aritmeticos: + - * / %

        //Operadores Relaciones == != > < >= <=

        boolean compara=3>=2;
        boolean texto="Juan"!="Juan";
        boolean resultado=23>5;
        System.out.println(compara);
        System.out.println(texto);

        //Operadores Logicos And, Or, Not
        System.out.println(23<5 && 5>3 && 12==12);
        System.out.println(3==3 && 21<7 || 8!=8);
        System.out.println(!(23==10));

        //Operadores asignacion = += -= /= *=
        int num2=23;
        //num2=num2+20;
        num2+=20;
        num2-=3;
        num2*=2;
        num2/=8;
        System.out.println(num2);
        num2--;
        System.out.println(++num2);
        System.out.println(num2);

        //Operadores incremento - decremento

    }
}
