
package Pk_upamecanocars;

public class Pj_UpamecanoCars {

    public static void main(String[] args) {
        Pj_UpamecanoBasicCars basicOne = new Pj_UpamecanoBasicCars("Honda Civic","Branca", 2014, 4, 68990);
            System.out.println(basicOne.getModelCar() + ", " + basicOne.getColorCar());
        Pj_UpamecanoBasicCars basicTwo = new Pj_UpamecanoBasicCars("Wolkswagen Gol G5", "Prata", 2008, 4, 32990);
            System.out.println(basicTwo.getModelCar() + ", " + basicTwo.getColorCar());
        Pj_UpamecanoBasicCars basicThree = new Pj_UpamecanoBasicCars("Corsa Classic", "Branco", 2008, 4, 14990);
            System.out.println(basicThree.getModelCar() + ", " + basicThree.getColorCar());
        Pj_UpamecanoBasicCars basicFour = new Pj_UpamecanoBasicCars("Chevrolet Prisma", "Prata", 2012, 4, 28990);
            System.out.println(basicFour.getModelCar() + ", " + basicFour.getColorCar());

        
    }
}
