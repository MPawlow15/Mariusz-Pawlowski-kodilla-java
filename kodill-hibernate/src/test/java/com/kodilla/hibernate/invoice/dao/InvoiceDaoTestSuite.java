package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(120),2,new BigDecimal(240));
        Item item2 = new Item(new BigDecimal(100), 5, new BigDecimal(500));
        Product product = new Product("something");
        product.getItems().add(item1);
        product.getItems().add(item2);
        item1.setProduct(product);
        item2.setProduct(product);

        //When
        productDao.save(product);
        int id = product.getId();

        //Then
        Assertions.assertNotEquals(0, id);

        //CleanUp
        productDao.deleteById(id);
    }
}
