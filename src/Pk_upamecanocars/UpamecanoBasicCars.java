
package Pk_upamecanocars;

public class UpamecanoBasicCars {
    
    private String modelCar, colorCar;
    private int yearCar, doorsCar;
    private double valueCar;
    
    UpamecanoBasicCars(String modelCar, String colorCar, int yearCar, int doorsCar, double valueCar){
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.yearCar = yearCar;
        this.doorsCar = doorsCar;
        this.valueCar = valueCar;
    }
    
    /* Getter & Setter para o modelo; */
    public String getModelCar(){
        return modelCar;
    }
    public void setModelCar(String modelCar){
        this.modelCar = modelCar;
    }
    
    /* Getter & Setter para a cor; */
    public String getColorCar(){
        return colorCar;
    }
    public void setColorCar(String colorCar){
        this.colorCar = colorCar;
    }
    
    /* Getter & Setter para o ano; */
    public int getYearCar(){
        return yearCar;
    }
    public void setYearCar(int yearCar){
        this.yearCar = yearCar;
    }
    
    /* Getter & Setter para a quantidade de portas; */
    public int getDoorsCar(){
        return doorsCar;
    }
    public void setDoorsCar(int doorsCar){
        this.doorsCar = doorsCar;
    }
    
        /* Getter & Setter para a quantidade de portas; */
    public double getValueCar(){
        return valueCar;
    }
    public void setValueCar(double valueCar){
        this.valueCar = valueCar;
    }
}
