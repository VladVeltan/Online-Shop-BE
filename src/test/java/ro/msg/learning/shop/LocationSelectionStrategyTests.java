package ro.msg.learning.shop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import ro.msg.learning.shop.domain.*;
import ro.msg.learning.shop.dto.OrderCreateDto;
import ro.msg.learning.shop.dto.ProductIdAndQuantityDto;
import ro.msg.learning.shop.repository.CustomerRepository;
import ro.msg.learning.shop.repository.OrderRepository;
import ro.msg.learning.shop.repository.StockRepository;
import ro.msg.learning.shop.service.CustomerService;
import ro.msg.learning.shop.service.OrderService;
import ro.msg.learning.shop.service.ProductService;
import ro.msg.learning.shop.service.StockService;
import ro.msg.learning.shop.strategy.LocationSelectionStrategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class LocationSelectionStrategyTests {


    @Mock
    private StockService stockService;
    @Mock
    private StockRepository stockRepository;
    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private OrderRepository orderRepository;
    @Mock
    private ProductService productService;
    @Mock
    private LocationSelectionStrategy locationSelectionStrategy;
    @Mock
    private OrderService orderService;
    @Mock
    private CustomerService customerService;
    @Test
    void singleLocation() {
//        ProductCategory productCategory = new ProductCategory("Tech", "Chestii de Tech");
//        Product product =Product.builder().name(null).price(null.)build();
//        Location location = new Location("Zalau Location", "Romania", "Zalau", "Salaj", "Str Avram Iancu 3");
//        Location location2 = new Location("Cluj Location", "Romania", "Cluj-Napoca", "Cluj", "Str Brassai 7");
//        Customer customer = new Customer("Vlad", "Veltan", "Vladut", "alabala", "vladut@yahoo.com");
//        Stock stock = new Stock(product, location, 4);
//        Stock stock2 = new Stock(product, location2, 19);
//
//        ProductIdAndQuantityDto productIdAndQuantityDto=new ProductIdAndQuantityDto(product.getId(),7);
//        List<ProductIdAndQuantityDto>productIdAndQuantityDtoList=new ArrayList<>();
//        productIdAndQuantityDtoList.add(productIdAndQuantityDto);
//
//
//        OrderCreateDto orderCreateDto=new OrderCreateDto(customer.getId(), LocalDateTime.now(),"Romania","Zalau","Salaj","Avram Inacu 3",productIdAndQuantityDtoList);
//
//        List<Location> locationList = new ArrayList<>();
//        locationList.add(location);
//        locationList.add(location2);
//
//        when(stockService.findLocationsByProducts())
//        when(customerService.findById(customer.getId())).thenReturn(Optional.of(customer));
//        when(stockService.hasSufficientStock(location,productIdAndQuantityDtoList)).thenReturn(false);
//        when(stockService.hasSufficientStock(location2,productIdAndQuantityDtoList)).thenReturn(true);
//        when(stockService.findLocationsByProducts()
    }




}
