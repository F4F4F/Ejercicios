import java.util.Scanner;

public class  EjercicioCond {

    public static void main(String[] args) {

        Scanner esca = new Scanner(System.in);

        //Cedula y Dia sale o no Par dia par impar dia impar
        System.out.println("Bienvenido");
        int ced;
        int dia;
        System.out.println("Porfavor ingrese el dia");
    
        dia = esca.nextInt();
        
        System.out.println("Porfavor ingrese el ultimo digito de su CC");
        ced = esca.nextInt();

        if (dia % 2 == 0 && ced % 2 != 0) {System.out.println("No puede salir");
   
        } else if (dia % 2 != 0 && ced % 2 == 0) {System.out.println("No puede salir");
    
        } else {System.out.println("Puede salir");
        
}
    }

}