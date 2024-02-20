// Client Code
public class FurnitureShop {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();

        modernChair.sitOn();
        modernSofa.lieOn();
        modernCoffeeTable.putCoffee();

        System.out.println();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable();

        victorianChair.sitOn();
        victorianSofa.lieOn();
        victorianCoffeeTable.putCoffee();

        System.out.println();

        FurnitureFactory artDecoFactory = new ArtDecoFurnitureFactory();
        Chair artDecoChair = artDecoFactory.createChair();
        Sofa artDecoSofa = artDecoFactory.createSofa();
        CoffeeTable artDecoCoffeeTable = artDecoFactory.createCoffeeTable();

        artDecoChair.sitOn();
        artDecoSofa.lieOn();
        artDecoCoffeeTable.putCoffee();
    }
}
