
package Pk_upamecanocars;

public class Pj_UpamecanoCars {

    public static void main(String[] args) {
        
        UpamecanoCarsClass novoCarroUm = new UpamecanoCarsClass("Honda Civic", "Prata", 2014, 4);
        System.out.println("------------------------");
        System.out.println("Carro Básico Um");
        System.out.println(novoCarroUm.getModelCar());
        System.out.println(novoCarroUm.getColorCar());
        System.out.println(novoCarroUm.getYearCar());
        System.out.println(novoCarroUm.getDoorsCar());
        System.out.println("------------------------");
        
        UpamecanoCarsClass novoCarroDois = new UpamecanoCarsClass("Wolksvagen Gol", "Branco", 2010, 4);
        System.out.println("Carro Básico Dois");
        System.out.println(novoCarroUm.getModelCar());
        System.out.println(novoCarroUm.getColorCar());
        System.out.println(novoCarroUm.getYearCar());
        System.out.println(novoCarroUm.getDoorsCar());
        System.out.println("------------------------");
        
        UpamecanoCarsClass novoCarroTres = new UpamecanoCarsClass("Chevrolet Corsa", "Preto", 2008, 4);
        System.out.println("Carro Básico Três");
        System.out.println(novoCarroUm.getModelCar());
        System.out.println(novoCarroUm.getColorCar());
        System.out.println(novoCarroUm.getYearCar());
        System.out.println(novoCarroUm.getDoorsCar());
        System.out.println("------------------------");
        
        UpamecanoCarsClass novoCarroQuatro = new UpamecanoCarsClass("Chevrolet Vectra", "Dourado", 2009, 4);
        System.out.println("Carro Básico Quatro");
        System.out.println(novoCarroUm.getModelCar());
        System.out.println(novoCarroUm.getColorCar());
        System.out.println(novoCarroUm.getYearCar());
        System.out.println(novoCarroUm.getDoorsCar());
        System.out.println("------------------------");
    }
}
