package com.lujieni.h2.domain;

import com.lujieni.h2.domain.base.BasicEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="t_vendor")
@Data
public class Vendor extends BasicEntity {

    /**
     * 供应商编号
     * 界面录入2位大写字母，不能重复
     */
    @Column(name = "vendor_code")
    private String vendorCode;

    /**
     * 供应商名称（中）
     */
    @Column(name = "name_zh")
    private String nameZh;


    /**
     * 供应商名称（英）
     */
    @Column(name = "name_en")
    private String nameEn;


    /**
     * 供应商名称简称
     */
    @Column(name = "short_name")
    private String shortName;

}