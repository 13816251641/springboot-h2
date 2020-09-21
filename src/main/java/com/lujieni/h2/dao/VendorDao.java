package com.lujieni.h2.dao;

import com.lujieni.h2.domain.Vendor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface VendorDao extends Mapper<Vendor> {

    List<Vendor> searchByVendorCode(@Param("vendor") String vendorCode);

}