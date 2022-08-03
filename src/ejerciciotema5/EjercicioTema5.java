/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema5;

/**
 *
 * @author victor
 */
public class EjercicioTema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona persona = new persona();
        persona.setEdad(30);
        persona.setNombre("Victor");
        persona.setTelefono("601078175");
        persona.mostrarDatos();
        
        /*System.out.println("La edad es: "+ persona.getEdad() +
                "\n Se llama: "+ persona.getNombre() + 
                "\n y su telefóno es: "+ persona.getTelefono());*/
    }
    
}
