
package Pk_upamecanocars;

public class Pj_UpamecanoCars {

    public static void main(String[] args) {
        UpamecanoBasicCars basicOne = new UpamecanoBasicCars("Honda Civic EXR","Branca", 2014, 4, 68990);
            System.out.println(basicOne.getModelCar() + ", " + basicOne.getColorCar());
        UpamecanoBasicCars basicTwo = new UpamecanoBasicCars("Wolkswagen Gol G5", "Prata", 2008, 4, 32990);
            System.out.println(basicTwo.getModelCar() + ", " + basicTwo.getColorCar());
        UpamecanoBasicCars basicThree = new UpamecanoBasicCars("Corsa Classic", "Branco", 2008, 4, 14990);
            System.out.println(basicThree.getModelCar() + ", " + basicThree.getColorCar());
        UpamecanoBasicCars basicFour = new UpamecanoBasicCars("Chevrolet Prisma", "Prata", 2012, 4, 28990);
            System.out.println(basicFour.getModelCar() + ", " + basicFour.getColorCar());

        
    }
}
