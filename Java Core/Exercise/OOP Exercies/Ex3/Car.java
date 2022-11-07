package Ex3;

public class Car {

    private String CarOwner;
    private String RangeOfVehicle;
    private float Capacity;
    private float Value;
    private float Tax;

    public Car(String CarOwner , String RangeOfVehicle , float Capacity , float Value) {
        setCarOwner(CarOwner);
        setRangeOfVehicle(RangeOfVehicle);
        setCapacity(Capacity);
        setValue(Value);
        setTax();
    }

    public void setCarOwner(String CarOwner) {
        this.CarOwner = CarOwner;
    }

    public void setRangeOfVehicle(String RangeOfVehicle) {
        this.RangeOfVehicle = RangeOfVehicle;
    }

    public void setCapacity(float Capacity) {
        this.Capacity = Capacity;
    }

    public void setValue(float Value) {
        this.Value = Value;
    }

    public void setTax() {
        if (this.Capacity < 100) {
            this.Tax = this.Value / 100;
        } else if (this.Capacity < 200) {
            this.Tax = (this.Value * 3) / 100;
        } else {
            this.Tax = (this.Value * 5) / 100;
        }
    }

    public String getCarOwner() {
        return this.CarOwner;
    }

    public String getRangeOfVehicle() {
        return this.RangeOfVehicle;
    }

    public float getCapacity() {
        return this.Capacity;
    }

    public float getValue() {
        return this.Value;
    }

    public float getTax() {
        return this.Tax;
    }
}