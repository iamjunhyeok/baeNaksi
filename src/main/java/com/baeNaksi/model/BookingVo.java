package com.baeNaksi.model;

import java.sql.Timestamp;

public class BookingVo extends CommonVo {
    public String fishingId;
    public String memberId;
    public int numberOfPeople;
    public int shipFare;
    public String depositorName;
    public String memo;
    public Timestamp bookingDate;

    public String getFishingId() {
        return fishingId;
    }

    public void setFishingId(String fishingId) {
        this.fishingId = fishingId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getShipFare() {
        return shipFare;
    }

    public void setShipFare(int shipFare) {
        this.shipFare = shipFare;
    }

    public String getDepositorName() {
        return depositorName;
    }

    public void setDepositorName(String depositorName) {
        this.depositorName = depositorName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Timestamp getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Timestamp bookingDate) {
        this.bookingDate = bookingDate;
    }
}
