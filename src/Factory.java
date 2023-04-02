class Factory {
    public Product createProduct(int productType) {
        switch(productType) {
            case 1:
                return new ConcreteProduct1();
            case 2:
                return new ConcreteProduct2();
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}