package com.happygo.bean;

import javax.validation.constraints.NotNull;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class IotModbusTcpBean {

    @Excel(name = "id",isImportField="true")
    @NotNull
    private String id;

    @Excel(name = "device_id",isImportField="true")
    @NotNull
    private String deviceId;

    @Excel(name = "slave_num",isImportField="true")
    @NotNull
    private String slaveNum;

    @Excel(name = "units_id",isImportField="true")
    @NotNull
    private String unitsId;

    @Excel(name = "name",isImportField="true")
    @NotNull
    private String name;

    @Excel(name = "unit",isImportField="true")
    @NotNull
    private String unit;

    @Excel(name = "serial",isImportField="true")
    @NotNull
    private String serial;

    @Excel(name = "register_type",isImportField="true")
    @NotNull
    private String registerType;

    @Excel(name = "function_type",isImportField="true")

    private String functionType;

    @Excel(name = "address",isImportField="true")
    @NotNull
    private String address;

    @Excel(name = "address_type",isImportField="true")
    @NotNull
    private String addressType;

    @Excel(name = "address_length",isImportField="true")
    @NotNull
    private String addressLength;

    @Excel(name = "model_type",isImportField="true")
    @NotNull
    private String modelType;

    @Excel(name = "bite",isImportField="true")

    private Integer bite;

    @Excel(name = "factor",isImportField="true")
    @NotNull
    private String factor;

    @Excel(name = "frequency",isImportField="true")
    @NotNull
    private String frequency;

    @Excel(name = "dict_id",isImportField="true")
    @NotNull
    private String dictId;

    @Excel(name = "event_code_id",isImportField="true")
    private String eventCodeId;

    @Excel(name = "event_type_id",isImportField="true")
    private String eventTypeId;

    @Excel(name = "type",isImportField="true")
    @NotNull
    private String type;

    @Excel(name = "sort",isImportField="true")
    @NotNull
    private String sort;

    @Excel(name = "office_id",isImportField="true")
    @NotNull
    private String officeId;

    @Excel(name = "create_by",isImportField="true")
    @NotNull
    private String createBy;

    @Excel(name = "create_date",isImportField="true")
    @NotNull
    private String createDate;

    @Excel(name = "update_by",isImportField="true")
    @NotNull
    private String updateBy;

    @Excel(name = "update_date",isImportField="true")
    @NotNull
    private String updateDate;

    @Excel(name = "remarks",isImportField="true")
    private String remarks;

    @Excel(name = "del_flag",isImportField="true")
    @NotNull
    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSlaveNum() {
        return slaveNum;
    }

    public void setSlaveNum(String slaveNum) {
        this.slaveNum = slaveNum;
    }

    public String getUnitsId() {
        return unitsId;
    }

    public void setUnitsId(String unitsId) {
        this.unitsId = unitsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public String getFunctionType() {
        return functionType;
    }

    public void setFunctionType(String functionType) {
        this.functionType = functionType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressLength() {
        return addressLength;
    }

    public void setAddressLength(String addressLength) {
        this.addressLength = addressLength;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public Integer getBite() {
        return bite;
    }

    public void setBite(Integer bite) {
        this.bite = bite;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getEventCodeId() {
        return eventCodeId;
    }

    public void setEventCodeId(String eventCodeId) {
        this.eventCodeId = eventCodeId;
    }

    public String getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(String eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public IotModbusTcpBean() {
    }

}
