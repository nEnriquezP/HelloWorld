public class prueba {
    public static void main(String[] args) {
        int m=0;
        for (int i=1; i <= 10; i++){
            System.out.print("Tabla de Multiplicar del " +i+"\n");
            for (int j=1; j<=10; j++){
                m=i*j;
                System.out.println(i + " * " + j + " = " + m);
            }
            System.out.println("");
        }

    }
}
