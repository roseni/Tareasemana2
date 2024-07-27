package umg.principal.PKG_grupo3;
import java.util.Scanner;

public class volumen {
    public void prisma (){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE LA BASE DEL PRISMA");
        int a = sc.nextInt();
        System.out.println("INGRESE LA ALTURA DEL PRISMA");
        int b = sc.nextInt();
        int c= a*a ;
        int d= c * b;
        System.out.println("EL VOLUMEN DEL PRISMA RECTANGULAR ES: "+ d);
        System.out.println(" ");
    }

    public void paralel () {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE LA ALTURA DEL PARALELOGRAMO");
        int a = sc.nextInt();
        System.out.println("INGRESE LA BASE DEL PARALELOGRAMO");
        int b = sc.nextInt();
        int c = a*b;
        System.out.println("EL AREA DEL PARALELOGRAMO ES: "+ c);
    }

    public void cilindro () {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL DIAMETRO DEL CILINDRO");
        int a = sc.nextInt();
        int d = a/2;
        System.out.println("INGRESE LA ALTURA DEL CILINDRO");
        int b = sc.nextInt();
        double c = 3.1416 *  (d*d) * b;
        System.out.println("EL VOLUMEN DEL CILINDRO ES: "+ c);
    }

}


