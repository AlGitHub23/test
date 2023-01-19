public class Main {
    public static void main(String[] args) {
        Product product = new Product("Молоко", 50);
        Product one = new Product("Хлеб", 30);
        System.out.println(Product.getCount());
        System.out.println(Product.getAveragePrice());
    }
}
