package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "UPS_COL_REM")
public class TestEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 30,name = "REMITTER_ID")
    private String REMITTER_ID;

    @Column(length = 60,name = "REMITTER_NAME")
    private String REMITTER_NAME;

    @Lob
    @Column(name = "PROFILE_PIC")
    private byte[] PROFILE_PIC;

    @Column(length = 60,name = "ACC_NUMBER")
    private String ACC_NUMBER;

    @Column(length = 100,name="REMITTER_NAME_ARABIC")
    private String REMITTER_NAME_ARABIC;

    @Column(length = 60,name ="ADDRESS")
    private String ADDRESS;

    @Column(length = 10,name = "MOBILE")
    private Long MOBILE;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getREMITTER_ID() {
        return REMITTER_ID;
    }

    public void setREMITTER_ID(String REMITTER_ID) {
        this.REMITTER_ID = REMITTER_ID;
    }

    public String getREMITTER_NAME() {
        return REMITTER_NAME;
    }

    public void setREMITTER_NAME(String REMITTER_NAME) {
        this.REMITTER_NAME = REMITTER_NAME;
    }

    public byte[] getPROFILE_PIC() {
        return PROFILE_PIC;
    }

    public void setPROFILE_PIC(byte[] PROFILE_PIC) {
        this.PROFILE_PIC = PROFILE_PIC;
    }

    public String getACC_NUMBER() {
        return ACC_NUMBER;
    }

    public void setACC_NUMBER(String ACC_NUMBER) {
        this.ACC_NUMBER = ACC_NUMBER;
    }

    public String getREMITTER_NAME_ARABIC() {
        return REMITTER_NAME_ARABIC;
    }

    public void setREMITTER_NAME_ARABIC(String REMITTER_NAME_ARABIC) {
        this.REMITTER_NAME_ARABIC = REMITTER_NAME_ARABIC;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public Long getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(Long MOBILE) {
        this.MOBILE = MOBILE;
    }
}
