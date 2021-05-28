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
public class TestEquivalenciaFechas {

    public TestEquivalenciaFechas() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void pruebaValorMenor() throws ParseException {
        System.out.println("Fecha anterior");
        Fechas f = new Fechas();
        String fecha = "2001-01-02";
        int expResult = -1;
        int result = f.esFacturaCorrectaEnFecha(fecha);
        assertEquals(expResult, result);
    }

    @Test
    public void pruebaValorMayor() throws ParseException {
        System.out.println("Fecha posterior");
        Fechas f = new Fechas();
        String fecha = "2022-01-02";
        int expResult = 1;
        int result = f.esFacturaCorrectaEnFecha(fecha);
        assertEquals(expResult, result);
    }


}
