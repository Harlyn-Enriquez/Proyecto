/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginb;
import java.util.ArrayList;

/**
 *
 * @author adanel
 */
public class Loginb {
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static Profesor ProfesorLogeado = new Profesor();
    
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static Alumno AlumnoLogeado = new Alumno();
    
    public static ArrayList<Curso> cursos = new ArrayList<>();
    
    
   
    
   


    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);
        
        Login a = new Login();
        a.setVisible(true);
        
         Login g = new Login();
        g.setVisible(true);
    }
}
