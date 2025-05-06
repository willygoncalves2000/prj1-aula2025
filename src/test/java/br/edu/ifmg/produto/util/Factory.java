package br.edu.ifmg.produto.util;

import br.edu.ifmg.produto.dtos.ProductDTO;
import br.edu.ifmg.produto.entities.Category;
import br.edu.ifmg.produto.entities.Product;

public class Factory {
    public static Product craeteProduct() {
        Product p = new Product();
        p.setName("IPhone XXX");
        p.setPrice(5000);
        p.setImageUrl("http://img.com/iphonexxx.jpg");
        p.getCategories().add(new Category(60L, "News"));
        return p;
    }
    public static ProductDTO craeteProductDTO() {
        Product p = craeteProduct();
        return new ProductDTO(p);
    }
}
