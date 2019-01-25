package com.teamfive.usercontent.controller;

import com.teamfive.usercontent.dto.AddressPackDTO;
import com.teamfive.usercontent.dto.AddressRequestDTO;
import com.teamfive.usercontent.entity.AddressPack;
import com.teamfive.usercontent.services.AddressPackService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressPackService addressPackService;


    @RequestMapping(value ="/add",method = RequestMethod.POST)
    public AddressPack addAddressPack(@RequestBody AddressRequestDTO addressRequestDTO)
    {
        AddressPack addressPack= addressPackService.findByToken(addressRequestDTO.getToken());
        if(addressPack==null) addressPack=new AddressPack();
        addressPack.setToken(addressRequestDTO.getToken());
        addressPack.setAddressList(addressRequestDTO.getAddress());
        addressPackService.updateAddressPack(addressPack);
        return addressPack;
    }
    @RequestMapping(value ="/get",method = RequestMethod.GET)
    public AddressPackDTO getAddressPack(@RequestParam String token)
    {
        AddressPack addressPack=addressPackService.findByToken(token);
        System.out.println(token);
        if(addressPack==null) return null;
        AddressPackDTO addressPackDTO=new AddressPackDTO();
        ArrayList<String> addressDTOS=new ArrayList<String>();
        for(String address:addressPack.getAddressList())
        {
            addressDTOS.add(address);
        }
        addressPackDTO.setAddressList(addressDTOS);
        addressPackDTO.setToken(addressPack.getToken());
        return addressPackDTO;
    }
    @RequestMapping(value ="/update",method = RequestMethod.PUT)
    public AddressPack updateAddressPack(@RequestBody AddressRequestDTO addressPackDTO)
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


}
