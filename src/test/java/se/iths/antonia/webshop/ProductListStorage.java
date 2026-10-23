package se.iths.antonia.webshop;

import se.iths.antonia.webshop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductListStorage implements ProductStorage {
    private List<Product> products = new ArrayList<>();

    @Override
    public void saveProduct(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Product getProduct(String articleNumber) {
        for (Product product : products) {
            if (articleNumber.equals(product.getArticleNumber())) {
                return product;
            }
        }
        return null;
    }
}
