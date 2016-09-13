/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion1;

import javax.swing.JOptionPane;

/**
 *
 * @author Arles Cerrato
 */
public class ProyectoProgramacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Empiezo del los Cambios de Arles Cerrato
        PrimerParcial metodo1 = new PrimerParcial();// Metodo para las preguntas del primer parcial
        String respuesta = "Si";// variable para la respuesta del usuario
        while (respuesta.equalsIgnoreCase("Si")) {//ciclo de respuesta de usuario
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre por favor");// variable donde el usuario introducira su nombre en el juego
            JOptionPane.showMessageDialog(null, "Empezaremos con el juego de preguntas");// Mensaje para el usuario para empezar el juego de preguntas
            String[] PreguntasPrimerParcial = new String[10];// Arreglo donde iran las preguntas del Primer Parcial
            //Asignacion de preguntas del primer parcial en el arreglo
            PreguntasPrimerParcial[0] = "Es un conjunto finito de instrucciones claras y precisa que se utilizan para realizar una tarea especifica";
            PreguntasPrimerParcial[1] = "Lenguaje de programacion orientados a objetos y basado en C++";
            PreguntasPrimerParcial[2] = "Quien fue el creador del lenguaje Java";
            PreguntasPrimerParcial[3] = "En que año fue creado el lenguaje Java";
            PreguntasPrimerParcial[4] = "Es un tipo de jerarquia de datos";
            PreguntasPrimerParcial[5] = "Es un paquete o fragmento de codigo Java que permite crear al menos una instancia";
            PreguntasPrimerParcial[6] = "Significa traducir el codigo escrito en lenguaje entendible por humanos,"
                    + " a un codigo en lenguaje maquina que entiende las maquinas, pero no entendible por nosotros";
            PreguntasPrimerParcial[7] = "Es un tipo de dato primitivo que tiene un tamaño de 32 bits";
            PreguntasPrimerParcial[8] = "Metodo para comparar si el contenido de dos String es exactamente iguales";
            PreguntasPrimerParcial[9] = "Metodos que nos permite cambiar un caracter por otro dentro de una cadena";
            //fin de la asiganacion de las preguntas del primer parcial
            //Fin de mis cambios Arles Cerrato
            String[] PreguntasSegundoParcial = new String[10];// Arreglo donde iran las preguntas del Segundo Parcial
            //Asignacion de preguntas del segundo parcial en el arreglo
            PreguntasSegundoParcial[0] = "Son ventanas en las que los programas mensajes importantes a los usuarios:";
            PreguntasSegundoParcial[1] = "Cuenta con cuadros de dialogo prefabricados, los cuales permiten a los programas mostrar "
                    + "ventanas que contengan mesanjes:";
            PreguntasSegundoParcial[2] = "La unidad de graficos se mide en:";
            PreguntasSegundoParcial[3] = "Para crear una dibujo importamos la clase:";
            PreguntasSegundoParcial[4] = "Es el metodo para dibujar texto y figuras en la pantalla:";
            PreguntasSegundoParcial[5] = "Son los dos metodos para dibujar rectangulos y ovalos:";
            PreguntasSegundoParcial[6] = "Paquete de java para representar colores mediante sus valores RGB:";
            PreguntasSegundoParcial[7] = "Metodos para dibujar rectangulos y ovalos rellenos:";
            PreguntasSegundoParcial[8] = "Es el metodo por el cual podemos dibujar arcos:";
            PreguntasSegundoParcial[9] = "Es el metodo que nos devuelve la posicion de un ArraysList:";
            //fin de la asiganacion de las preguntas del segundo parcial
            //Fin de mis cambios F.G.
        }
    }
}
