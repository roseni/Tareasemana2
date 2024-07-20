package umg.principal.PKG_grupo2;

import java.util.Scanner;
public class area {
    public int ar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL AREA DE UN CIRCULO");
        int a = sc.nextInt();
        int b = a / 2;
        double c = (2 * 3.1416) * (b);
        System.out.println("El area del circulo es: " + c);
        return 0;
    }
