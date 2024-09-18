public class Ejemplo_for {

    public static void main(String[] args) {

       /* for(int i=2;i<8;i++){
            System.out.println(i);
        }*/

        for(int i=20;i>0;i--){
            //System.out.println(i);
        }

        String frase="Hola Java";
        System.out.println(frase.length());
        for(int i=0;i<frase.length();i++){
            System.out.println(frase.charAt(i));
        }
    }
}
