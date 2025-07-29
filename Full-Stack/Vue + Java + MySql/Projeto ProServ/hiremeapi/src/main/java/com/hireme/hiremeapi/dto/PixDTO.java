package com.hireme.hiremeapi.dto;


public class PixDTO {
    private String pixKey;

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public String toString() {
        return "PixDTO{" +
                "pixKey='" + pixKey + '\'' +
                '}';
    }
}
