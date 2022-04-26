package ro.Fasttrackit.lab7;

public class ProducObj {
    public static void main(String[] args) {
        Product prod1 = new Product("CocaCola", 23.7, 3, "sucuri");
        Product prod2 = new Product("Cleste", 24.5, 5, "scule de mana");
        Product prod3 = new Product("Sprite", 34.4, 4, "sucuri");
        Product prod4 = new Product("Surubelnita", 32.4, 0, "scule de mana");
        Product prod5 = new Product("Mirinda", 34.4, 0, "sucuri");
        Product prod6 = new Product("Cleste", 3.4, 0, "nu");

        printProduct(prod1);
        printProduct(prod2);
        printProduct(prod3);
        printProduct(prod4);
        printProduct(prod5);
        printProduct(prod6);

    }

    public static void printProduct(Product product) {
        if (product.isCategory("sucuri")) {
            System.out.println("bauturi nonalcoolice");
        } else if (product.isCategory("scule de mana")) {
            System.out.println("unelte");
        }else{
            System.out.println("categorie inexistenta");
        }


        if (product.hasStock()) {
            System.out.println(product.getName() + " " + product.getPrice() + " lei " + product.getQuantity() + " bucati " + " acest produs este disponibil");
        }else{
            System.out.println(product.getName() + " "+ product.getPrice() + " lei " + product.getQuantity() + " bucati " + " acest produs nu este disponibil");
        }
    }

}