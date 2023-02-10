public class Caracteres {
    public static void main(String[] args) {
        char caracter = '\u0040'; // Podemos ver los códigos UNICODE buscando MAPAS DE CARACTERES
        System.out.println("caracter = " + caracter);
        
        char nuevocaracter = '@'; // Hacemos lo mismo de otra manera
        System.out.println("nuevocaracter = " + nuevocaracter);

        char decimal = 64; // También podemos buscar en google su equivalente a código HTML y declararlo así
        System.out.println("decimal = " + decimal);

        //Comparamos de manera booleana si el caracter es el mismo
        System.out.println("decimal = nuevocaracter = " + (decimal == nuevocaracter));

        //Podemos ver que pasa si utilizamos var

        var caracterVar = '\u0040';
        System.out.println("caracterVar = " + caracterVar); //Lo toma como un tipo char

        var otroCaracter = '@'; // De la misma manera en este caso, reconoce el motor de JAVA que es un char
        System.out.println("otroCaracter = " + otroCaracter);

        //Veamos sus clases equivalentes para char

        System.out.println("Char Corresponde en byte a " + Character.BYTES);
        System.out.println("Char corresponde en bits a " + Character.SIZE);
        System.out.println("Valor máximo de Char = " + Character.MAX_VALUE);
        System.out.println("Valor Mínimo de Char = " + Character.MIN_VALUE);

    }
}
