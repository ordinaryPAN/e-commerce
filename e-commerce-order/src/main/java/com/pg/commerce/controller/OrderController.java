package com.pg.commerce.controller;

import com.pg.commerce.mapper.WmsWareInfoMapper;
import com.pg.commerce.pojo.WmsWareInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private WmsWareInfoMapper wmsWareInfoMapper;

    @GetMapping(value = "queryWmsWareList")
    public List<WmsWareInfo> queryWmsWareList() {
        List<WmsWareInfo> wmsWareInfos = wmsWareInfoMapper.selectAll();
        return wmsWareInfos;
    }

}
