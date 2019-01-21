package com.teamfive.usercontent.controller;



import com.teamfive.usercontent.dto.AddressDTO;
import com.teamfive.usercontent.entity.Address;
import com.teamfive.usercontent.services.AddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/addressIndividual")
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("/add")
    public Address add(@RequestBody AddressDTO addressDTO){
        Address address=new Address();
        BeanUtils.copyProperties(addressDTO, address);
        Address addressCreated=addressService.add(address);

        return addressCreated;
    }
    @GetMapping("/select")
    public Address select(@RequestParam String userId){
        AddressDTO addressDTO=new AddressDTO();
        Address address=addressService.select(userId);

        return address;
    }
    @PutMapping("/update")
    public Address update(@RequestBody AddressDTO addressDTO){
        Address address=new Address();
        BeanUtils.copyProperties(addressDTO,address);
        Address addressCreated=addressService.add(address);

        return addressCreated;
    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam String userId){
        addressService.delete(userId);
    }
}