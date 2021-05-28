/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Michelle
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({fechas.FechasParametizedTest.class, fechas.TestEquivalenciaFechas.class, fechas.FechasValorBordeTest.class})
public class suiteFechas {

}
