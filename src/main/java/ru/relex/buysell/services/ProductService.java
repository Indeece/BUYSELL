package ru.relex.buysell.services;

import org.springframework.stereotype.Service;
import ru.relex.buysell.models.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID,"Playstation 5", "Igrayte", 50000,
                "Moscow", "Anton"));
        products.add(new Product(++ID,"iPhone 15", "Apple", 62000,
                "Moscow", "Vasiliy"));
    }

    public List<Product> list() {
        return products;
    }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
