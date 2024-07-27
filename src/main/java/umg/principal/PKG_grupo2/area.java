package umg.principal.PKG_grupo2;
import java.util.Scanner;

public class area {
    public  void piramide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE LA BASE DE SU PIRAMIDE");
        int a = sc.nextInt();
        System.out.println("INGRESE LA ALTURA DE SU PIRAMIDE");
        int b = sc.nextInt();
        int c= (a*b)/2;
        int d = (a+b)/3;
        System.out.println("EL AREA DE SU PIRAMIDE ES: "+ c);
        System.out.println("EL VOLUMEN DE SU PIRAMIDE ES: "+ d);
        System.out.println(" ");
    }
    public  void tri(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE LA BASE DE SU TRIANGULO");
        int a = sc.nextInt();
        System.out.println("INGRESE LA ALTURA DE SU TRIANGULO");
        int b = sc.nextInt();
        int c= (a*b)/2;
        System.out.println("EL AREA DE SU TRIANGULO ES: "+ c);
    }}