//import java.util.LinkedList;

import java.util.*;

//import java.util.Queue;

public  class CarFleet{
    public Queue<Car> GasQueue = new Queue<Car>();
    public Queue<Car> HybridQueue = new Queue<Car>();
    public Queue<Car> ElectricQueue = new Queue<Car>();
    //public Queue<Integer> numberQueue = new LinkedList<Integer>();
   
    // Queue gasQueue = new Queue();
    // Queue electricQueue = new Queue();
    
    public boolean addCar (Car newcar){
        int power = newcar.getPowerSource();
        if (power ==1){
            GasQueue.enqueue(newcar);
            return true;

        }else if (power == 2 ){
            HybridQueue.enqueue(newcar);
            return true;

        }else if (power ==3){
            ElectricQueue.enqueue(newcar);
            return true;

        }else{
            return false;
        }
    }

     public List<Car> processRequests (Queue<Integer> numberQueue){
         List<Car> returnlist = new ArrayList<Car>();
         Car nullCar = new Car(0,0,0);
         while (numberQueue.isEmpty() == false){
             int number = numberQueue.dequeue(); 
             if (number == 1){
                if (GasQueue.isEmpty()==false ){
                     Car gascar = GasQueue.dequeue();
                     returnlist.add(gascar);
                }else{
                     returnlist.add(nullCar);
                }

                

                } else if (number == 2){
                if (HybridQueue.isEmpty() == false){
                    Car hybridcar = HybridQueue.dequeue();
                    returnlist.add(hybridcar);

                 }else{
                     returnlist.add(nullCar);

                 }

                }else if (number ==3){
                     if (ElectricQueue.isEmpty()== false){
                     Car electriccar = ElectricQueue.dequeue();
                     returnlist.add(electriccar);
                     }else{
                         returnlist.add(nullCar);
                     }
                 }
    //         
         }return returnlist;
     }


     public static void main (String[] args){
        Queue<Integer> numQueue =new Queue<Integer>();
        CarFleet carFleetTest = new CarFleet();
        Car newcar3 = new Car(2, 3, 9);
        Car newcar1 = new Car(2, 1, 9);
        Car newcar2 = new Car(2, 2, 9);
        //Car newcarNull = new Car(2, 4, 9);
        carFleetTest.addCar(newcar3);
        carFleetTest.addCar(newcar1);
        carFleetTest.addCar(newcar2);
        //carFleetTest.addCar(newcarNull);

        numQueue.enqueue(1);
        numQueue.enqueue(2);
        numQueue.enqueue(3);
        numQueue.enqueue(3);
        // List<Car> checkList = carFleetTest.processRequests(numQueue);
        // Car check1 = checkList.get(0);
        // Car check2 = checkList.get(1);
        // Car check3 = checkList.get(2);
        // Car check4 = checkList.get(3);
        System.out.println(carFleetTest.processRequests(numQueue));
        
        
        

        }

}



 