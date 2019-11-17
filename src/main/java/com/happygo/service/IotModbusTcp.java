package com.happygo.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Description:
 * @Date: Create in 2019/11/16 10:51
 */
public interface IotModbusTcp {

    void upload(MultipartFile file) throws Exception;
}
