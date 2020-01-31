package com.sda.hibernate.entity;

import javax.persistence.Entity;

@Entity
public class LegalBody extends Body {
    private String name;
    private String krs;
    private String nip;
    private String regon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKrs() {
        return krs;
    }

    public void setKrs(String krs) {
        this.krs = krs;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }
}
