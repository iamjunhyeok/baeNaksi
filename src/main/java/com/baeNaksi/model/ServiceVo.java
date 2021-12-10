package com.baeNaksi.model;

import java.sql.Timestamp;

public class ServiceVo extends CommonVo {
    public String fishingId;
    public String code;
    public String tooltip;

    public String getFishingId() {
        return fishingId;
    }

    public void setFishingId(String fishingId) {
        this.fishingId = fishingId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }
}
