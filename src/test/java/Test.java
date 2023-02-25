import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.LinkedList;
import java.util.List;

class Test {

    Main main;

    @BeforeEach
    void beforeEach() {
        main = new Main();
    }

    @org.junit.jupiter.api.Test
    void add() {
        int a = main.getProductsSize();
        main.add("Хлеб");
        int b = main.getProductsSize();
        Assertions.assertEquals(a, b - 1);
    }

    @org.junit.jupiter.api.Test
    void delete() {
        main.add("Хлеб");
        int a = main.getProductsSize();
        main.delete("Хлеб");
        int b = main.getProductsSize();
        Assertions.assertEquals(a, b + 1);
    }

    @org.junit.jupiter.api.Test
    void show() {
        List productsExpected = main.getProducts();
        List productsActual = new LinkedList();
        for (int i = 0;  i < productsExpected.size(); i++) {
            productsActual.add(productsExpected.get(i));
        }
        Assertions.assertLinesMatch(productsExpected, productsActual);
    }
}