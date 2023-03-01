package car.data;

public class Car {
    public int year;
    public String model, company, colour;
    public float rate;

    public Car(String model, String company, String colour, int year, float rate) {
        this.model = model;
        this.company = company;
        this.colour = colour;
        this.year = year;
        this.rate = rate;

       

    }
    public Car() {}
    public void printCar() {
        System.out.println( company +" "+ model +" " + colour +" colour " + year +" ki bani hui. Rate: " + rate);
    }
}