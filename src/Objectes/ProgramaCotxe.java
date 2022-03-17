package Objectes;

public class ProgramaCotxe {

    public static void main(String[] args) {
        
        String marca = "Opel";
        String model = "Astra";
        String color = "blau";
        
        Cotxe cotxe1 = new Cotxe(marca, model, color);
        System.out.println("Abans de matricular!");
        System.out.println(cotxe1.toString());
        cotxe1.generarMatricula();
        System.out.println("Desprès de matricular!");
        System.out.println(cotxe1.toString());
    }
    
}
