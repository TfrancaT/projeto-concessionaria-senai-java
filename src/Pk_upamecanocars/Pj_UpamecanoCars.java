
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
        System.out.println(novoCarroDois.getModelCar());
        System.out.println(novoCarroDois.getColorCar());
        System.out.println(novoCarroDois.getYearCar());
        System.out.println(novoCarroDois.getDoorsCar());
        System.out.println("------------------------");
        
        UpamecanoCarsClass novoCarroTres = new UpamecanoCarsClass("Chevrolet Corsa", "Preto", 2008, 4);
        System.out.println("Carro Básico Três");
        System.out.println(novoCarroTres.getModelCar());
        System.out.println(novoCarroTres.getColorCar());
        System.out.println(novoCarroTres.getYearCar());
        System.out.println(novoCarroTres.getDoorsCar());
        System.out.println("------------------------");
        
        UpamecanoCarsClass novoCarroQuatro = new UpamecanoCarsClass("Chevrolet Vectra", "Dourado", 2009, 4);
        System.out.println("Carro Básico Quatro");
        System.out.println(novoCarroQuatro.getModelCar());
        System.out.println(novoCarroQuatro.getColorCar());
        System.out.println(novoCarroQuatro.getYearCar());
        System.out.println(novoCarroQuatro.getDoorsCar());
        System.out.println("------------------------");
    }
}
