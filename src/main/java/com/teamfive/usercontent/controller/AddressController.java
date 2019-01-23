package com.teamfive.usercontent.controller;

import com.teamfive.usercontent.dto.AddressPackDTO;
import com.teamfive.usercontent.entity.AddressPack;
import com.teamfive.usercontent.services.AddressPackService;
import com.teamfive.usercontent.services.AddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressPackService addressPackService;
    @Autowired
    AddressService addressService;
    @PostMapping("/add")
    public AddressPack addAddressPack(@RequestBody AddressPackDTO addressPackDTO)
    {
        AddressPack addressPack= getAddressPack(addressPackDTO.getToken());
        if(addressPack==null) addressPack=new AddressPack();
        addressPack.setToken(addressPackDTO.getToken());
        addressPack.setAddressList(addressPackDTO.getAddress());
        addressPackService.updateAddressPack(addressPack);
        return addressPack;
    }
    @RequestMapping(value ="/select",method = RequestMethod.GET)
    public AddressPack getAddressPack(@RequestParam String token)
    {
        AddressPack addressPack=addressPackService.getAddressPack(token);
        return addressPack;
    }
    @RequestMapping(value ="/update",method = RequestMethod.PUT)
    public AddressPack updateAddressPack(@RequestBody AddressPackDTO addressPackDTO)
    {
        AddressPack addressPack = new AddressPack();
        BeanUtils.copyProperties(addressPackDTO,addressPack);

        return addressPackService.updateAddressPack(addressPack);
    }
    @RequestMapping(value ="/delete",method = RequestMethod.DELETE)
    public void deleteAddressPack(@RequestParam String token)
    {
        addressPackService.deleteAddressPack(token);
    }

    @RequestMapping(value = "/findByToken",method = RequestMethod.GET)
    public Iterable<AddressPack> findByToken(String token)
    {

        return addressPackService.findByToken(token);
    }
}
