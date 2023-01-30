package pengliu.me.forfrontend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pengliu.me.forfrontend.Order;
import pengliu.me.forfrontend.OrderWithFile;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
@CrossOrigin
public class OrderController {
    @GetMapping("/ordersWithError")
    public ResponseEntity<String> allWithError() throws Exception {
        Thread.sleep(5000);
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY)
                .body("error to get orders!!");
    }

    @GetMapping("/orders")
    public List<Order> all() throws Exception {
        Thread.sleep(5000);
        List<Order> returnOrders = new ArrayList<>();
        returnOrders.add(new Order(1, "test1"));
        returnOrders.add(new Order(2, "test2"));
        returnOrders.add(new Order(3, "test3"));

        return returnOrders;
    }

    @PostMapping("/order")
    public void create(@RequestBody Order order) throws Exception {
        Thread.sleep(5000);
        System.out.println(order.toString());
    }

    @RequestMapping(path = "/order/formdata", method = POST, consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public Order createdByFormData(@ModelAttribute Order order) throws Exception {
        Thread.sleep(5000);
        System.out.println(order);
        return order;
    }

    @RequestMapping(path = "/order/formdata/file", method = POST, consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public OrderWithFile createdByFormDataWithFile(@ModelAttribute OrderWithFile orderWithFile) throws Exception {
        Thread.sleep(5000);
        System.out.println(orderWithFile);
        return orderWithFile;
    }
}
