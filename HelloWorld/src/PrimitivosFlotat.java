public class PrimitivosFlotat {
    static float ejemplo;
    public static void main(String[] args) {
        
       /* float realFloat = 2120F;
        System.out.println("realFloat = " + realFloat);*/
        /*
        float numfloat = 2.12e5f; //Aquì asignamos el valor con notación
        System.out.println("numfloat = " + numfloat);

        float numfloat2 = 2.12e-2f; //Aquì asignamos el valor con notación negativa
        System.out.println("numfloat = " + numfloat2);
         */

        // Vamos a ver constantes del tipo de datos flotantes

        float realFloat = 0.00000000015F; //1.5e-10f
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a " +Float.BYTES);
        System.out.println("float corresponde en bites a " +Float.SIZE);
        System.out.println("Máximo valor para float = " +Float.MAX_VALUE);
        System.out.println("Mínimo valor para float = " +Float.MIN_VALUE);

        // Vamos a ver los de Doble Precisiòn = double

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a " +Double.BYTES);
        System.out.println("double corresponde en bites a " +Double.SIZE);
        System.out.println("Máximo valor para double = " +Double.MAX_VALUE);
        System.out.println("Mínimo valor para double = " +Double.MIN_VALUE);

        float numFloat = 3.1416f;
        System.out.println("numFloat = " + numFloat);
        
        //float VarFloat;
        System.out.println("VarFloat = " + ejemplo);
    }
}
