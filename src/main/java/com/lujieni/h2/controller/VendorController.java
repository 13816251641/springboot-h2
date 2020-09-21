package com.lujieni.h2.controller;

import com.lujieni.h2.domain.Vendor;
import com.lujieni.h2.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendorController {

    @Autowired
    private IVendorService iVendorService;

    @GetMapping("/add_vendor")
    public void addVendor(){
        iVendorService.addVendor();
    }

    @GetMapping("/search_by_example")
    public List<Vendor> searchByExample(){
        return iVendorService.searchByExample();
    }

    @GetMapping("/search_by_vendor_code")
    public List<Vendor> searchByVendorCode(String vendorCode){
        return iVendorService.searchByVendorCode(vendorCode);
    }

}