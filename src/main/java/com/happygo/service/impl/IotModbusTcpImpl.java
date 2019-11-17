package com.happygo.service.impl;

import com.alibaba.fastjson.JSON;
import com.happygo.bean.IotModbusTcpBean;
import com.happygo.mapper.IotModbusTcpMapper;
import com.happygo.service.IotModbusTcp;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import cn.afterturn.easypoi.excel.imports.ExcelImportService;
import netscape.javascript.JSObject;

/**
 * @Description:
 * @Date: Create in 2019/11/16 10:51
 */

@Service
public class IotModbusTcpImpl implements IotModbusTcp {

    @Autowired
    private IotModbusTcpMapper iotModbusTcpMapper;

    @Override
    public void upload(MultipartFile file) throws Exception {
        ImportParams params = new ImportParams();
        params.setReadRows(7000);
        params.setNeedVerfiy(true);

        InputStream inputStream = file.getInputStream();
        Long start = System.currentTimeMillis();

        ExcelImportResult<IotModbusTcpBean> excelImportResult=new MyExcelImportService().importExcelByIs(inputStream, IotModbusTcpBean.class, params,true);

        excelImportResult.getList().stream().forEach(i -> {
            System.out.println(JSON.toJSONString(i));
        });

        excelImportResult.getFailList().stream().forEach(i -> {
            System.out.println(JSON.toJSONString(i));
        });

        System.out.println("成功：" +  excelImportResult.getList().size() +
                "失败：" +  excelImportResult.getFailList().size() +
                "  解析数据：" + (System.currentTimeMillis() - start));
    }
}
