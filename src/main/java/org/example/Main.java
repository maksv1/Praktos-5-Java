package org.example;
import java.util.Scanner;

interface Production {
    void produceItem(String itemName);
}

interface Shipping {
    void shipItem(String itemName, int quantity);
}

interface CostCalculation {
    void calculateProductionCost(String itemName);
}

interface ProductionManagement {
    void manageProduction();
}

interface QualityInspection {
    void inspectQuality(String itemName);
}

interface RawMaterialOrder {
    void orderRawMaterials();
}

class ProductionImpl implements Production {
    public void produceItem(String itemName) {
        System.out.println("Производство товара: " + itemName);
    }
}

class ShippingImpl implements Shipping {
    public void shipItem(String itemName, int quantity) {
        System.out.println("Отгрузка товара: " + itemName + ", количество: " + quantity);
    }
}

class CostCalculationImpl implements CostCalculation {
    public void calculateProductionCost(String itemName) {
        System.out.println("Расчет себестоимости товара: " + itemName);
    }
}

class ProductionManagementImpl implements ProductionManagement {
    public void manageProduction() {
        System.out.println("Управление производством");
    }
}

class QualityInspectionImpl implements QualityInspection {
    public void inspectQuality(String itemName) {
        System.out.println("Проверка качества товара: " + itemName);
    }
}

class RawMaterialOrderImpl implements RawMaterialOrder {
    public void orderRawMaterials() {
        System.out.println("Заказ сырья");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Production production = new ProductionImpl();
        Shipping shipping = new ShippingImpl();
        CostCalculation costCalculation = new CostCalculationImpl();
        ProductionManagement productionManagement = new ProductionManagementImpl();
        QualityInspection qualityInspection = new QualityInspectionImpl();
        RawMaterialOrder rawMaterialOrder = new RawMaterialOrderImpl();

        System.out.println("Выберите действие:");
        System.out.println("1. Производство товара");
        System.out.println("2. Отгрузка товара");
        System.out.println("3. Расчет себестоимости товара");
        System.out.println("4. Управление производством");
        System.out.println("5. Проверка качества товара");
        System.out.println("6. Заказ сырья");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите название товара для производства:");
                String itemName = scanner.next();
                production.produceItem(itemName);
                break;
            case 2:
                System.out.println("Введите название товара для отгрузки:");
                String shippedItem = scanner.next();
                System.out.println("Введите количество:");
                int quantity = scanner.nextInt();
                shipping.shipItem(shippedItem, quantity);
                break;
            case 3:
                System.out.println("Введите название товара для расчета себестоимости:");
                String costItem = scanner.next();
                costCalculation.calculateProductionCost(costItem);
                break;
            case 4:
                productionManagement.manageProduction();
                break;
            case 5:
                System.out.println("Введите название товара для проверки качества:");
                String qualityItem = scanner.next();
                qualityInspection.inspectQuality(qualityItem);
                break;
            case 6:
                rawMaterialOrder.orderRawMaterials();
                break;
            default:
                System.out.println("Некорректный выбор");
        }

        scanner.close();
    }
}