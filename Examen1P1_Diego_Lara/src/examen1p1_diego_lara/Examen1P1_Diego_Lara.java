/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_diego_lara;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Examen1P1_Diego_Lara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerS = new Scanner(System.in);
        Scanner leerI = new Scanner(System.in); 
        // Scanners a utilizar ^^^ uno para int y otro para Strings
        boolean respuesta = true;

        while (respuesta) { // El while del menu
            System.out.println("1. Sumador Binario");
            System.out.println("2. Estrella de David");
            System.out.println("3. Salir");
            int opcion = leerI.nextInt(); // tipo int para que el usuario decida cual numero del menu elegir

            switch (opcion) { // inicio del switch
                case 1: { // inicio del primer ejercicio
                    System.out.println("Ingrese la primera cadena de 1s y 0s: ");
                    String cadena1 = leerS.nextLine();
                    System.out.println("Ingrese la segunda cadena de 1s y 0s: ");
                    String cadena2 = leerS.nextLine();
                    
                    int i = 0;
                    int charA;
                    int charB;
                    char residuo = '0';
                    String resultado = "";
                    if (cadena1.length() < cadena2.length() || cadena1.length() > cadena2.length()) { // Validacion para comprobar si ambas cadenas son iguales
                        System.out.println("Los numeros deben tener el mismo numero de bits");
                    } else {
                            while (i < cadena1.length() || i < cadena2.length()) {
                                charA = cadena1.charAt(i);
                                charB = cadena2.charAt(i);
                                if (charA != 48 && charA != 49) {
                                    System.out.println("Una de sus cadenas contiene un numero distinto de 0 y 1");
                                    break;
                                }
                                if (charB != 48 && charB != 49) {
                                    System.out.println("Una de sus cadenas contiene un numero distinto de 0 y 1");
                                    break;
                                }
                                i++;
                            } // Segunda validacion para que no se pueda ingresar otro numero que no sean los digitos de 0 y 1
                            
                      for (i = cadena1.length() - 1; i>=0; i--) {
                          if(residuo == '0') {
                              String charX =  cadena1;
                              String charY =  cadena2;
                              if (charX.equals("0") && charY.equals("0")) {
                                  resultado = 0+resultado;
                              } else if(charX.equals("1") && charY.equals("0") ) {
                                  resultado = 1+resultado;
                              } else if(charX.equals("1") && charY.equals("1")) {
                                  resultado = 0+resultado;
                                  residuo = '1';
                              }
                          } else {
                              resultado = 1+resultado;
                          }
                      } // for con condiciones de if y else para lograr hacer la suma en binario
                     
                    }
                   
                } // fin del primer ejercicio
                break;
                case 2: { // inicio del segundo ejercicio
                    System.out.println("Ingrese un tamaño: ");
                    int numero = leerI.nextInt();
                    while(numero < 9 || numero % 2 != 1) {
                        System.out.println("!ERROR¡ SOLO NUMEROS IMPARES Y MAYORES QUE 9"); 
                        numero = leerI.nextInt();
                    } // Validacion para que no pueda ser menor que 9 ni tampoco que pueda ser numero par
                    for (int i = 0; i < numero; i++) {
                        for (int j = 0; j < numero - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("*");
                        }
                        for (int l = 0; l < i; l++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    } // Fors anidados para hacer la figura
                } // fin del segundo ejercicio
                break;
                case 3: // Para salir del menu
                    respuesta = false;
                    break; 
                default:
                    System.out.println("Opcion invalida");
                    break;
                    // defaul para evitar que el usuario pueda ingresar otro numero que no sea los indicados
            } // fin del switch
        } // fin del while
    } // fin del main

} // fin de la public class
