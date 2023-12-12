package pOo;

import java.util.Scanner;

public class criandoCarro {
    public static void main(String[] args) {
        moldeCarro moldeCarro = new moldeCarro();
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Modelo do carro: ");
        moldeCarro.setModeloCarro(sc1.nextLine());
        System.out.println("Ano do carro: ");
        moldeCarro.setAnoCarro(sc1.nextInt());

        System.out.println("Modelo: " + moldeCarro.getModeloCarro());
        System.out.println("Ano: " + moldeCarro.getAnoCarro());
    }
}
