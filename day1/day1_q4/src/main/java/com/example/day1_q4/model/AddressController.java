package com.example.day1_q4.model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AddressController {
    @GetMapping("/address")
    public Address addressobject(){
        Address obj = new Address();
        obj.setName("chaturya");
        obj.setDoorNo(123);
        obj.setStreetName("Main St");
        obj.setPincode(600123);
        obj.setArea("Summa");
        obj.setDistrict("Chennai");
        obj.setState("Tamil Nadu");
        obj.setCountry("India");
        return obj;
    }
}
