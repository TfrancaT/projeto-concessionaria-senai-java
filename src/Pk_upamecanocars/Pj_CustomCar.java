package Pk_upamecanocars;

public class Pj_CustomCar {
    
    private String modelCar, colorCar, playerCar, steeringCar;
    private int doorsCar, yearCar;
    private double valueCar;
    
    
    
    public Pj_CustomCar(String modelCar, int yearCar, String colorCar){
        this.modelCar = modelCar;
        this.yearCar = yearCar;
        this.colorCar = colorCar;
    }
    
    public Pj_CustomCar( String modelCar, int yearCar, String colorCar, String steeringCar ){
        this.modelCar = modelCar;
        this.yearCar = yearCar;
        this.colorCar = colorCar;
        this.steeringCar = steeringCar;
    }
    
    public Pj_CustomCar(String modelCar, int yearCar, String colorCar, String playerCar, String steeringCar){
        this.modelCar = modelCar;
        this.yearCar = yearCar;
        this.colorCar = colorCar;
        this.playerCar = playerCar;
        this.steeringCar = steeringCar;
    }
    
    
    // Get & Set para modelo do carro;
    public String getModelCar(){
        return modelCar;
    }
    public void setModelCar(String modelCar){
        this.modelCar = modelCar;
    }
    
    // Get & Set para a cor do carro;
    public String getColorCar(){
        return colorCar;
    }
    public void setColorCar(String colorCar){
        this.colorCar = colorCar;
    }
    
    // Get & Set para player(som) do carro;
    public String getPlayerCar(){
        return playerCar;
    }
    public void setPlayerCar(String playerCar){
        this.playerCar = playerCar;
    }
    
    // Get & Set para direção do carro;
    public String getSteeringCar(){
        return steeringCar;
    }
    public void setSteeringCar( String steeringCar ){
        this.steeringCar = steeringCar;
    }
    
    // Get & Set para quantidade de portas;
    public int getDoorsCar(){
        return doorsCar;
    }
    public void setDoorsCar(int doorsCar){
        this.doorsCar = doorsCar;
    }
    
    // Get * Set para o ano do carro;
    public int getYearCar(){
        return yearCar;
    }
    public void setYearCar(int yearCar){
        this.yearCar = yearCar;
    }
    
    // Get & Set para o valor do carro;
    public double getValueCar(){
        return valueCar;
    }
    public void setValueCar(double valueCar){
        this.valueCar = valueCar;
    }
    
}
