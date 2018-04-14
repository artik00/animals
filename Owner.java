package com.artyom.khvediouk.Model;

public class Owner implements Cloneable{
    private String name;
    private String telephoneNumber;

    public Owner(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "my owner is: " + name + " his telephone number is " + telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Owner) {
            Owner other = (Owner) o;
            if (this.getName().equals(other.getName()) && this.getTelephoneNumber().equals(other.getTelephoneNumber())) {
                return true;
            }
        }
        return false;
    }
}
