package steps;

import com.paulo.dsvendas.DsvendasApplication;
import com.paulo.dsvendas.dto.SellerDTO;
import com.paulo.dsvendas.service.SaleService;
import com.paulo.dsvendas.service.SellerService;
import io.cucumber.java.en.Then;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@CucumberContextConfiguration
@SpringBootTest(classes = DsvendasApplication.class)
public class DsVendasApplicationStep {

    private String urlBase = "http://localhost:8080/";

    @Autowired
    SellerService sellerService;

    @Autowired
    SaleService saleService;


    @Then("should return size of sellers {int}")
    public void should_return_size_of_sellers(Integer size) {
        List<SellerDTO> list = sellerService.findAll();

        System.out.println("TOTAL DATA IN SELLERS: " + list.size());

        Assertions.assertEquals(size, sellerService.findAll().size());
    }

    @Then("should return seller names {string}, {string}, {string}, {string}, {string}")
    public void should_return_seller_names(String name1, String name2, String name3, String name4, String name5) {
        List<SellerDTO> list = sellerService.findAll();
        for (int i = 0; i < list.size(); i++) {
//            Assertions.assertEquals(list.get(i).getName(), sellerService.findAll().get(i).getName());
            System.out.println(list.get(i).getName());
        }

        Assertions.assertEquals(name1, list.get(0).getName());
        Assertions.assertEquals(name2, list.get(1).getName());
        Assertions.assertEquals(name3, list.get(2).getName());
        Assertions.assertEquals(name4, list.get(3).getName());
        Assertions.assertEquals(name5, list.get(4).getName());
    }

    @Then("should return size of sales {int}")
    public void should_return_size_of_sales(Integer size) {
        Assertions.assertEquals(size, saleService.findAll());
    }

}
