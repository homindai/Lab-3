import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Nước tương", 8000);
        Product product2 = new Product("Gạo", 18000);
        Product product3 = new Product("Đường", 100);

        Order order = new Order(1, LocalDate.of(2015, 9, 10));
        order.addLineItem(product1, 10);
        order.addLineItem(product2, 5);
        order.addLineItem(product3, 1);

        order.printOrderDetails();
    }
}
