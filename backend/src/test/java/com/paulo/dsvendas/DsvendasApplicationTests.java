package com.paulo.dsvendas;

import com.paulo.dsvendas.dto.SellerDTO;
import com.paulo.dsvendas.service.SaleService;
import com.paulo.dsvendas.service.SellerService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DsvendasApplicationTests {

    @Autowired
    SellerService sellerService;

    @Autowired
    SaleService saleService;

    @Test
    public void testDeveRetornarTodosOsVendedores() {
        List<SellerDTO> list = sellerService.findAll();

        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals(list.get(i).getName(), sellerService.findAll().get(i).getName());
        }
        Assert.assertEquals(5, sellerService.findAll().size());
    }

    @Test
    public void testDeveRetornarTodasAsVendas(){
        Assert.assertEquals(170, saleService.findAll());
    }

}
