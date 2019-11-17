package com.happygo.mapper;

import com.happygo.entity.IotModbusTcpDO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IotModbusTcpMapper {

    int insert(IotModbusTcpDO record);

    int insertSelective(IotModbusTcpDO record);

    IotModbusTcpDO selectByPrimaryKey(Integer id);
}