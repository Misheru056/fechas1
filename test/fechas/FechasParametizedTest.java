/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Michelle
 */
@RunWith(Parameterized.class)
public class FechasParametizedTest {

    String fecha;
    int res;

    public FechasParametizedTest(String fecha, int res) {
        this.fecha = fecha;
        this.res = res;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            {"2002-05-20", -1},{"2024-05-20", 1}
        });

    }

    @Test
    public void todo() throws ParseException {
        Fechas f = new Fechas();
        int result = f.esFacturaCorrectaEnFecha(fecha);
        assertEquals(res, result);
    }

}
