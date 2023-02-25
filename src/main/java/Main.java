import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<String> products = new LinkedList();
    private Scanner scanner = new Scanner(System.in);

    private void start() {
        while (true) {
            System.out.println("Выберете номер операции:");
            System.out.println("\t1. Добавить");
            System.out.println("\t2. Показать");
            System.out.println("\t3. Удалить");
            System.out.println("\t4. Найти покупку");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> add(scanner.nextLine());

                case 2 -> show();

                case 3 -> delete(scanner.nextLine());

                case 4 -> find();

            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }

    public void add(String product) {
        System.out.println("Какую покупку хотите добавить?");
        try {
            products.add(product);
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        System.out.println("Итого в списке покупок: " + products.size());
        System.out.println();
    }

    public void show() {
        System.out.println("Список покупок:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + ". " + products.get(i));
        }
        System.out.println();
    }

    public void delete(String removeProduct) {
        System.out.println("Список покупок:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + ". " + products.get(i));
        }
        System.out.println("Какую хотите удалить? Введите номер или название");
        try {
            products.remove(Integer.parseInt(removeProduct) - 1);
        } catch (Exception e) {
            products.remove(removeProduct);
        }
        System.out.println("Список покупок:");
        for (String list : products) {
            System.out.println(list);
        }
        System.out.println();
    }

    public void find() {
        String itemLower;
        String queryLower = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            itemLower = products.get(i).toLowerCase();
            queryLower = queryLower.toLowerCase();
            if (itemLower.contains(queryLower)) {
                System.out.println(i + 1 + ". " + products.get(i));
            }
        }
        System.out.println();
    }

    public int getProductsSize() {
        return products.size();
    }

    public List<String> getProducts() {
        return products;
    }
}
