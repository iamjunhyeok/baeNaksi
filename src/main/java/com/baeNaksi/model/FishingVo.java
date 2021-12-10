package com.baeNaksi.model;

import java.sql.Timestamp;

public class FishingVo extends CommonVo {
    public String groupId;
    public String memberId;
    public String name;
    public int maxNumberOfPeople;
    public int minNumberOfPeople;
    public String seaArea;
    public String mainTarget;
    public String mainPoints;
    public String timeRequired;
    public String gatheringPlace;
    public int tonnage;
    public int speed;
    public Timestamp departureDate;
    public Timestamp arrivalDate;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public int getMinNumberOfPeople() {
        return minNumberOfPeople;
    }

    public void setMinNumberOfPeople(int minNumberOfPeople) {
        this.minNumberOfPeople = minNumberOfPeople;
    }

    public String getSeaArea() {
        return seaArea;
    }

    public void setSeaArea(String seaArea) {
        this.seaArea = seaArea;
    }

    public String getMainTarget() {
        return mainTarget;
    }

    public void setMainTarget(String mainTarget) {
        this.mainTarget = mainTarget;
    }

    public String getMainPoints() {
        return mainPoints;
    }

    public void setMainPoints(String mainPoints) {
        this.mainPoints = mainPoints;
    }

    public String getTimeRequired() {
        return timeRequired;
    }

    public void setTimeRequired(String timeRequired) {
        this.timeRequired = timeRequired;
    }

    public String getGatheringPlace() {
        return gatheringPlace;
    }

    public void setGatheringPlace(String gatheringPlace) {
        this.gatheringPlace = gatheringPlace;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Timestamp getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Timestamp departureDate) {
        this.departureDate = departureDate;
    }

    public Timestamp getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Timestamp arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
