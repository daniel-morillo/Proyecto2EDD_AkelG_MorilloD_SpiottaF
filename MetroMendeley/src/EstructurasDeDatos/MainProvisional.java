/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;



/**
 *
 * @author fabriziospiotta
 */
public class MainProvisional {
    
    public static String capitalizeTitle(String palabra) {  
        String words[]= palabra.split("\\s");  
        String capitalizeWord="";  
        for(String w:words){  
            String first = w.substring(0,1);  
            String afterfirst = w.substring(1);  
            capitalizeWord += first.toUpperCase() + afterfirst + " ";  
        }  
        return capitalizeWord.trim();  
    }
    
    public static void main(String[] args) {
        String palabra = "hola mi bro como estas paaana";
        String palabra1 = capitalizeTitle(palabra);
        System.out.println(palabra1);
    }
}
