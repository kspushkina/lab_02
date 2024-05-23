package com.example.convent;

public class object {
    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}