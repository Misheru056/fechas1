/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michelle
 */
public class FechasValorBordeTest {

    public FechasValorBordeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void pruebaValorIgual() throws ParseException {
        System.out.println("Fecha actual");
        Fechas f = new Fechas();
        Calendar fec = new GregorianCalendar();
        int anio = fec.get(Calendar.YEAR);
        int mes = fec.get(Calendar.MONTH);
        int dia = fec.get(Calendar.DAY_OF_MONTH);
        String fecha = anio + "-" + (mes + 1) + "-" + dia;
        int expResult = 0;
        int result = f.esFacturaCorrectaEnFecha(fecha);
        assertEquals(expResult, result);
    }

}
