package com.lujieni.h2.service;

import com.lujieni.h2.domain.Vendor;

import java.util.List;

public interface IVendorService {

    /**
     * 新增供应商
     */
    void addVendor();

    List<Vendor> searchByExample();

    List<Vendor> searchByVendorCode(String vendorCode);

}
