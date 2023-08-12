

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
public class CarFleetTests {
    Queue<Integer> numQueue =new Queue<Integer>();
    CarFleet carFleetTest = new CarFleet();
    Car newcar3 = new Car(2, 3, 9);
    Car newcar1 = new Car(2, 1, 9);
    Car newcar2 = new Car(2, 2, 9);
    Car newcarNull = new Car(2, 4, 9);

    @Test
    public void constructortest(){
        CarFleet carFleetTest = new CarFleet();
        assertNotNull(carFleetTest);
    }
    @Test 
    public void addCar(){
    // Car newcar3 = new Car(2, 3, 9);
    // Car newcar1 = new Car(2, 1, 9);
    // Car newcar2 = new Car(2, 2, 9);
    // Car newcarNull = new Car(2, 4, 9);
    boolean test3 = carFleetTest.addCar(newcar3);
    boolean test1 = carFleetTest.addCar(newcar1);
    boolean test2 = carFleetTest.addCar(newcar2);
    boolean testNull = carFleetTest.addCar(newcarNull);

    assertEquals(test3, true);
    assertEquals(test1, true);
    assertEquals(test2, true);
    assertEquals(testNull, false);
    }

    @Test
    public void processRequeststest(){
        carFleetTest.addCar(newcar3);
        carFleetTest.addCar(newcar1);
        carFleetTest.addCar(newcar2);
        //carFleetTest.addCar(newcarNull);

        numQueue.enqueue(1);
        numQueue.enqueue(2);
        numQueue.enqueue(3);
        numQueue.enqueue(3);
        List<Car> checkList = carFleetTest.processRequests(numQueue);
        Car check1 = checkList.get(0);
        Car check2 = checkList.get(1);
        Car check3 = checkList.get(2);
        Car check4 = checkList.get(3);
        Car nullcar = new Car(0, 0, 0);

        assertEquals(check1.toString(), newcar1.toString());
        assertEquals(check2.toString(), newcar2.toString());
        assertEquals(check3.toString(), newcar3.toString());
        assertEquals(check4.toString(), nullcar.toString());






    }

    }



