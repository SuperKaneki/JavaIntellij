import javax.swing.*;
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args)
    {
        /*
        System.out.println("Hola mundo");

        int edad=23;

        System.out.println(edad);

        float edad2=12.2f; //F siempre al final, eso muestra que es un float.

        System.out.println(edad+edad2);

        double edad3=16.8;

        System.out.println(edad+edad2+edad3);





        String number = JOptionPane.showInputDialog(null, "ingresa un numero entero");

        int numberReal = Integer.parseInt(number);

        System.out.println(numberReal);

        JOptionPane.showMessageDialog(null, number);




        String numero = "24.5";

        double numerodecimal=Double.parseDouble(numero);

        System.out.println(numerodecimal);



        double decima = 24.53;

        String decimalconvertido=Double.toString(decima);

        System.out.println(decimalconvertido);


        Solo hay problemas en la conversión en el caso de que sea un tipo de dato con un límite inferior


        int i = 400;

        short z = (short)i;

        System.out.println(z);



        .equals analiza el contenido, el == solo compara la asignación. En el caso de los Strings
        .concat para concatenar
        String saludopersonalizado=saludo.concat(" querido ").concat(nombre);
        otra forma de concatenar es

        Saluod=Saludo.transform(s -> {
            return s+ 'querido '+normbre;
        });

        para reemplazar

        Nombre1=Nombre1.replace("a", "A");

         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un Nombre");
        String login= entrada.nextLine();
        System.out.println("Introduce una contraseña");
        String contraseña= entrada.nextLine();
        String p = "1234";

        if (contraseña.equals(p))
        {
            System.out.println("Muy bien, por favor espere unos segundo a que iniciemos su sesión");
        }else{
            System.out.println("ERROR, por favor coloque su contraseña nuevamente");
        }

    }
}


