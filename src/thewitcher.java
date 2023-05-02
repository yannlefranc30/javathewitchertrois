import java.util.Scanner;
public class thewitcher {
    public static void main( String [] args ) {

        try ( Scanner scanner = new Scanner( System.in ) ) {

            System.out.print( "Veuillez saisir une valeur : "); // permet de rentrer une variable
            int value = scanner.nextInt();


            System.out.print( "Veuillez saisir un chiffre plus élévé : "); // p
            int power = scanner.nextInt();


            int result = 1; //declaration de la variable.

            for( int ciri=0; ciri<power; ciri++) {
                result = value * result;
            }
            System.out.printf( "%d^%d == %d\n", value, power, result );
        }
    }
}