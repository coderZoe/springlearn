package com.coderzoe.entity;

/**
 * @author yhs
 * @date 2020/5/31 12:46
 * @description
 */
public class Address {
    private String address;

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
