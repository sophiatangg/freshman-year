public class Car {
    int id;
    int powerSource;
    float pricePerDay;

    Car (int id, int powerSource, float pricePerDay){
        this.id = id;
        this.powerSource = powerSource;
        this.pricePerDay = pricePerDay;
    }

    void setId(int id){
        this.id = id;
    }

    int getId(){
        return id;
    }

    int getPowerSource(){
        return powerSource;

    }

    void setPowerSource (int powerSource){
        if (powerSource > 0 && powerSource< 4){
            this.powerSource = powerSource;
        }

    }

    float getPricePerDay(){
        return pricePerDay;
    }

    void setPricePerDay( float pricePerDay){
        this.pricePerDay = pricePerDay; 
    }

    public String toString(){
        return (("id= "+getId()) +("\nPower Source = "+ getPowerSource()) + ("\nPrice Per Day = "+getPricePerDay()) +"\n");
    }




}
