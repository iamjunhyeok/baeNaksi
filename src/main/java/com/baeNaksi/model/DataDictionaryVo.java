package com.baeNaksi.model;

import java.sql.Timestamp;

public class DataDictionaryVo extends CommonVo {
    public String parentCode;
    public String code;
    public String name;

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
