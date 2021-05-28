/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;

/**
 *
 * @author javie
 */
public class mainFechas {

    /**
     *
     * @param args argumentos por lineas de comandos.
     * @throws ParseException -hpña
     */
    public static void main(String[] args) throws ParseException  {
        // TODO code application logic here
        System.out.println("Inicio");
        Fechas miFecha = new Fechas();
        
        miFecha.esFacturaCorrectaEnFecha("2001-01-02");
        
        
       
        
        System.out.println("Fin");
        
    }
}
/*Primer caso crearé una prueba para las fechas anteriores a la actual debiendo dar como resultado al comprobarla -1
   Segundo caso crearé una prueba para la fecha actualdebiendo dar como resultado al comprobarla 0
Tecer caso crearé una prueba para las fechas posteriores a la actual debiendo dar como resultado al comprobarla 1
*/
