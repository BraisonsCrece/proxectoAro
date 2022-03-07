/**
 * Probas para a clase Aro
 * @author A21BraisFD
 */
package Aro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author A21BraisFD
 */
public class AroTest {
    
    public AroTest() {
    }
    
    /**
     * Test do setter setCoordenadaX, da clase Aro
     */
    @Test
    public void testSetCoordenadaX() {
        System.out.println("establecerX");
        int valorX = 0;
        Aro instance = new Aro();
        instance.setCoordenadaX(valorX);
    }

    /**
     * Test do getter getCoordenadaX, da clase Aro
     */
    @Test
    public void testGetCoordenadaX() {
        System.out.println("obterX");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }

    /**
     * Test do setter setCoordenadaY, da clase Aro
     */
    @Test
    public void testSetCoordenadaY() {
        System.out.println("establecerY");
        int valorY = 0;
        Aro instance = new Aro();
        instance.setCoordenadaY(valorY);
    }

    /**
     * Test do getter getCoordenadaY, da clase Aro
     */
    @Test
    public void testGetCoordenadaY() {
        System.out.println("obterY");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test do setter setRadio, da clase Aro
     */
    @Test
    public void testSetRadio() {
        System.out.println("establecerRadio");
        Aro instance = new Aro();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
        instance.setRadio(-0.1);
    }

    /**
     * Test do getter getRadio, da clase Aro
     */
    @Test
    public void testGetRadio() {
        System.out.println("obterRadio");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(-0.1);
        result= instance.getRadio();
        assertEquals(0.0, result,0);
    }

    /**
     * Test do método obterDiametro, da clase Aro
     */
    @Test
    public void testObterDiametro() {
        System.out.println("obterDiametro");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.obterDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test do método obterCircunferencia, da clase Aro
     */
    @Test
    public void testObterCircunferencia() {
        System.out.println("obterCircunferencia");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obterCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test do método obterSuperdicie, da clase Aro
     */
    @Test
    public void testObterSuperficie() {
        System.out.println("obterArea");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obterSuperficie();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test do método trasladarCentro, da clase Aro
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Aro instance = new Aro();
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro(5, 6);
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }
    
}
