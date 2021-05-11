package com.bank.classes;

public class Error {
    private String desp;

    public Error(String desp) {
        this.desp = desp;
    }
    public Error(){

    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    @Override
    public String toString() {
        return "Error{" +
                "desp='" + desp + '\'' +
                '}';
    }
}
