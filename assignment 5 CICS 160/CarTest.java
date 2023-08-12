import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CarTest {
    
    @Test
    public void constructortest(){
        Car newcar = new Car(2, 3, 6);
        assertNotNull(newcar);
    }

    @Test 
    public void getAndSetID(){
        Car testcar = new Car(1, 2, 2.5f);
        testcar.setId(4);
        int ID = testcar.getId();
        assertEquals(ID, 4);
    }

    @Test
    public void getandsetPower(){
        Car testcar = new Car(1, 2, 2.5f);
        testcar.setPowerSource(3);
        int Pow = testcar.getPowerSource();
        assertEquals(Pow, 3);
    }

    @Test 
    public void getandsetprice(){
        Car testcar = new Car(1, 2, 2.5f);
        testcar.setPricePerDay(4.5f);
        assertEquals(testcar.getPricePerDay(), 4.5, 0.001);
        
    }
    //  @Test
    //  public void CarAll(){
    //     Car testcar = new Car(1, 2, 2.5f);
    //     testcar.setId( 4);
    //     testcar.setPowerSource(3);
    //     testcar.setPricePerDay(4.5f);
    //     assertEquals(testcar.getId(), 4);
    //     assertEquals(testcar.getPowerSource(), 3);
    //     assertEquals(testcar.getPricePerDay(), 4.5, 0.001);
        
        

     }
    
    
