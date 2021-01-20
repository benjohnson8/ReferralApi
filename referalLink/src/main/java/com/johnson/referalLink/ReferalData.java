package com.johnson.referalLink;

public class ReferalData {

    String refererUsername;
    String ipAddress;

    public ReferalData(String refererUsername, String ipAddress) {
        this.refererUsername = refererUsername;
        this.ipAddress = ipAddress;
    }

    public String getRefererUsername() {
        return refererUsername;
    }

    public String getIpAddress() {
        return ipAddress;
    }

}
