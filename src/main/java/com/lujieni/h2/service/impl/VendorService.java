package com.lujieni.h2.service.impl;

import com.lujieni.h2.dao.VendorDao;
import com.lujieni.h2.domain.Vendor;
import com.lujieni.h2.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Service
public class VendorService implements IVendorService {

    @Autowired
    private VendorDao vendorDao;

    /*
        事务对于H2数据库同样有效
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addVendor() {
        Vendor vendor = new Vendor();
        vendor.setId("1");
        vendor.setVendorCode("JD");
        vendor.setNameEn("JD");
        vendor.setNameZh("京东物流");
        vendor.setShortName("京东");
        vendor.setActive(1);
        vendor.setCreateUserCode("181268");
        vendor.setCreateTime(new Date());
        vendor.setModifyTime(new Date());
        vendor.setModifyUserCode("181268");
        vendorDao.insert(vendor);
        throw new RuntimeException("my exception");
    }

    @Override
    public List<Vendor> searchByExample() {
        Example example = new Example(Vendor.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("vendorCode","JD");//h2区分大小写,这里用jd就不行
        List<Vendor> vendors = vendorDao.selectByExample(example);
        return vendors;
    }

    @Override
    public List<Vendor> searchByVendorCode(String vendorCode) {
        return vendorDao.searchByVendorCode(vendorCode);
    }
}