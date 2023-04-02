public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Product product1 = factory.createProduct(1);
        product1.doSomething();

        Product product2 = factory.createProduct(2);
        product2.doSomething();
    }
}