/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;

import java.awt.BorderLayout;
import java.util.Scanner;

import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author leaha
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {int op1;
        String nombre;
        int nombre [][][][];
            }
        
        {System.out.println("Bienvenido a LOTUS, En este emocionante juego, te sumergirás en una historia llena de romance, intriga y decisiones que marcarán tu destino. Conoce a cuatro personajes únicos, cada uno con su propia historia y secretos por descubrir. ¿Listo para empezar esta aventura?");
        System.out.println("Ingrese su usuario y contraseña para iniciar sesion");
            String = "USUARIO"
            Stinrg = "CONTRASEÑA"
        Scanner captu = new Scanner(System.in);
            
            while (true)
                System.out.println("Usuario:");
                usuario = captu.nextLine();
                System.out.println("Contraseña:");
                pwd = captu.nextLine();
                if(usuario.equals(USUARIO) && pwd.equals(CONTRASEÑA)  )
                   break;
                else;
                    break;
            }
        
        {System.out.println("¿Cual es tu nombre?");
        Scanner captu = new Scanner (System.in);
        nombre = captu.nextLine();
            }
        System.out.println(nombre + " Un gusto conocerte, recuerda responder como te va guiando tu propio corazón."){
        
        System.out.println("Acabas de llegar a este nuevo pueblo, donde la primavera apenas te da la bienvenida");
        System.out.println("al dar un paso al lugar. Este lugar podría ser un nuevo comienzo para ti, ");
        System.out.println("una oportunidad para explorar nuevas pasiones y conocer a personas fascinantes,");
        System.out.println("¿Qué te intriga más de esta nueva aventura?");
        System.out.println("1.-Explorar y descubrir los secretos que este pueblo oculta. ");
        System.out.println("2.-Analizar cada detalle y desentrañar los misterios que acechan en sus calles. ");
        System.out.println("3.-Proteger y velar por el bienestar de quienes llaman a este lugar su hogar. ");
        System.out.println("4.-Establecer conexiones y relaciones significativas con los habitantes, construyendo puentes entre corazones. ");
        }
     
        op1= captu.nextInt();
        
        if (op1 == 1)
            System.out.println("Bienvenido a la fase 3 " + nombre );
        else if (op1 == 2)
            System.out.println("Bienvenido a la fase 4 " + nombre);
        else if (op1 == 3)
            System.out.println("Bienvenido a la fase 2 " + nombre );
        else if (op1 == 4)
            System.out.println("Bienvenido a la fase 1 " + nombre);
            
        
        
        
        
    }
}