package br.edu.ifmg.produto.util;

import br.edu.ifmg.produto.dtos.ProductDTO;
import br.edu.ifmg.produto.entities.Category;
import br.edu.ifmg.produto.entities.Product;

public class Factory {
    public static Product createProduct() {
        Product p = new Product();
        p.setName("IPhone XXX");
        p.setPrice(5000);
        p.setImageUrl("http://img.com/iphonexxx.jpg");
        p.getCategories().add(new Category(1L, "News"));
        return p;
    }
    public static ProductDTO createProductDTO() {
        Product p = createProduct();
        return new ProductDTO(p);
    }
}
