package com.company;

public class defangingIPAddress {

    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}