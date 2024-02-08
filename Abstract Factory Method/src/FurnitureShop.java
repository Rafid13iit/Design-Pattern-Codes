// Abstract Product Interfaces

// interface Chair {
//     void sitOn();
// }

// interface Sofa {
//     void lieOn();
// }

// interface CoffeeTable {
//     void putCoffee();
// }


// Concrete Product Variants

// class ModernChair implements Chair {
//     @Override
//     public void sitOn() {
//         System.out.println("Sitting on a modern chair.");
//     }
// }

// class ModernSofa implements Sofa {
//     @Override
//     public void lieOn() {
//         System.out.println("Lying on a modern sofa.");
//     }
// }

// class ModernCoffeeTable implements CoffeeTable {
//     @Override
//     public void putCoffee() {
//         System.out.println("Putting coffee on a modern coffee table.");
//     }
// }

// class VictorianChair implements Chair {
//     @Override
//     public void sitOn() {
//         System.out.println("Sitting on a Victorian chair.");
//     }
// }

// class VictorianSofa implements Sofa {
//     @Override
//     public void lieOn() {
//         System.out.println("Lying on a Victorian sofa.");
//     }
// }

// class VictorianCoffeeTable implements CoffeeTable {
//     @Override
//     public void putCoffee() {
//         System.out.println("Putting coffee on a Victorian coffee table.");
//     }
// }

// class ArtDecoChair implements Chair {
//     @Override
//     public void sitOn() {
//         System.out.println("Sitting on an ArtDeco chair.");
//     }
// }

// class ArtDecoSofa implements Sofa {
//     @Override
//     public void lieOn() {
//         System.out.println("Lying on an ArtDeco sofa.");
//     }
// }

// class ArtDecoCoffeeTable implements CoffeeTable {
//     @Override
//     public void putCoffee() {
//         System.out.println("Putting coffee on an ArtDeco coffee table.");
//     }
// }


// Abstract Factory Interface

// interface FurnitureFactory {
//     Chair createChair();
//     Sofa createSofa();
//     CoffeeTable createCoffeeTable();
// }


// Concrete Factory Variants

// class ModernFurnitureFactory implements FurnitureFactory {
//     @Override
//     public Chair createChair() {
//         return new ModernChair();
//     }

//     @Override
//     public Sofa createSofa() {
//         return new ModernSofa();
//     }

//     @Override
//     public CoffeeTable createCoffeeTable() {
//         return new ModernCoffeeTable();
//     }
// }

// class VictorianFurnitureFactory implements FurnitureFactory {
//     @Override
//     public Chair createChair() {
//         return new VictorianChair();
//     }

//     @Override
//     public Sofa createSofa() {
//         return new VictorianSofa();
//     }

//     @Override
//     public CoffeeTable createCoffeeTable() {
//         return new VictorianCoffeeTable();
//     }
// }

// class ArtDecoFurnitureFactory implements FurnitureFactory {
//     @Override
//     public Chair createChair() {
//         return new ArtDecoChair();
//     }

//     @Override
//     public Sofa createSofa() {
//         return new ArtDecoSofa();
//     }

//     @Override
//     public CoffeeTable createCoffeeTable() {
//         return new ArtDecoCoffeeTable();
//     }
// }


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
