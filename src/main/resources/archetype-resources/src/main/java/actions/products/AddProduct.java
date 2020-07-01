package ${groupId}.actions.products;

import ${groupId}.infrastructure.services.ProductService;

// User action
public class AddProduct {

    private final ProductService service;

    public AddProduct(ProductService service) {
        this.service = service;
    }
}
