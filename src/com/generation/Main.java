package com.generation;

public class Main {

    public static void main(String[] args) {
	    // Javascript: const edad = 31;
        // Variable String
        String nombre = "Manuel";

        //Datos primitivos numéricos
        byte num1= 10;
        short numShort1 = num1;
        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        //Datos primitivos decimales
        float decimal1= 10.3423423f;
        double decimal2 = 20.23423423d;

        //Datos primitivos char
        char caracter = 'a';

        //Dato Primitivo Boolean
        boolean verdadero = true;

        short numerotiposhort = num1;
        int numerotipoInt = numerotiposhort;
        // short numShort2 = numerotipoInt;
        // esta es incorrecta porque no puedo pasar de un grado superior a uno inferior

        //Se puede declarar variables sin especificar su valor inmediatamente
        int MyNum;
        MyNum = 15;
        //System.out.println(MyNum);

        // Ejercicio 1
        byte numByte;
        numByte = 120;
        byte numByte2;
        numByte2 = 120;
        short suma = (short) (numByte + numByte2);

        //Mandar a imprimir
        //System.out.println(numerotipoInt);
        //System.out.println(numerotiposhort);

        // Operadores aritméticos en Java
        // + sumar o concatenar cadenas
        // - restar
        // * multiplicación
        // / dividir
        // % residuo

        int numero1, numero2;
        numero1 = 20;
        numero2 = 5;

        float div1, div2;
        div1 = 20;
        div2 = 3.2f;

        System.out.println(("Su suma es ") + (numero1 + numero2));
        System.out.println(("Su resta es ") + (numero1 - numero2));
        System.out.println(("Su multiplicación es ") + (numero1 * numero2));
        System.out.println(("Su división es ") + (div1 / div2));

    }
}

