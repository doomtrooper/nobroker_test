package com.razor.myprogressbar.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kuliza-265 on 8/1/17.
 */

public class AmenitiesMap {
    @SerializedName("CLUB")
    @Expose
    private Boolean cLUB;
    @SerializedName("HK")
    @Expose
    private Boolean hK;
    @SerializedName("INTERNET")
    @Expose
    private Boolean iNTERNET;
    @SerializedName("SC")
    @Expose
    private Boolean sC;
    @SerializedName("VP")
    @Expose
    private Boolean vP;
    @SerializedName("RWH")
    @Expose
    private Boolean rWH;
    @SerializedName("POOL")
    @Expose
    private Boolean pOOL;
    @SerializedName("LIFT")
    @Expose
    private Boolean lIFT;
    @SerializedName("AC")
    @Expose
    private Boolean aC;
    @SerializedName("INTERCOM")
    @Expose
    private Boolean iNTERCOM;
    @SerializedName("FS")
    @Expose
    private Boolean fS;
    @SerializedName("PARK")
    @Expose
    private Boolean pARK;
    @SerializedName("GP")
    @Expose
    private Boolean gP;
    @SerializedName("CPA")
    @Expose
    private Boolean cPA;
    @SerializedName("GYM")
    @Expose
    private Boolean gYM;
    @SerializedName("SECURITY")
    @Expose
    private Boolean sECURITY;
    @SerializedName("SERVANT")
    @Expose
    private Boolean sERVANT;
    @SerializedName("PB")
    @Expose
    private Boolean pB;
    @SerializedName("STP")
    @Expose
    private Boolean sTP;

    public Boolean getCLUB() {
        return cLUB;
    }

    public void setCLUB(Boolean cLUB) {
        this.cLUB = cLUB;
    }

    public Boolean getHK() {
        return hK;
    }

    public void setHK(Boolean hK) {
        this.hK = hK;
    }

    public Boolean getINTERNET() {
        return iNTERNET;
    }

    public void setINTERNET(Boolean iNTERNET) {
        this.iNTERNET = iNTERNET;
    }

    public Boolean getSC() {
        return sC;
    }

    public void setSC(Boolean sC) {
        this.sC = sC;
    }

    public Boolean getVP() {
        return vP;
    }

    public void setVP(Boolean vP) {
        this.vP = vP;
    }

    public Boolean getRWH() {
        return rWH;
    }

    public void setRWH(Boolean rWH) {
        this.rWH = rWH;
    }

    public Boolean getPOOL() {
        return pOOL;
    }

    public void setPOOL(Boolean pOOL) {
        this.pOOL = pOOL;
    }

    public Boolean getLIFT() {
        return lIFT;
    }

    public void setLIFT(Boolean lIFT) {
        this.lIFT = lIFT;
    }

    public Boolean getAC() {
        return aC;
    }

    public void setAC(Boolean aC) {
        this.aC = aC;
    }

    public Boolean getINTERCOM() {
        return iNTERCOM;
    }

    public void setINTERCOM(Boolean iNTERCOM) {
        this.iNTERCOM = iNTERCOM;
    }

    public Boolean getFS() {
        return fS;
    }

    public void setFS(Boolean fS) {
        this.fS = fS;
    }

    public Boolean getPARK() {
        return pARK;
    }

    public void setPARK(Boolean pARK) {
        this.pARK = pARK;
    }

    public Boolean getGP() {
        return gP;
    }

    public void setGP(Boolean gP) {
        this.gP = gP;
    }

    public Boolean getCPA() {
        return cPA;
    }

    public void setCPA(Boolean cPA) {
        this.cPA = cPA;
    }

    public Boolean getGYM() {
        return gYM;
    }

    public void setGYM(Boolean gYM) {
        this.gYM = gYM;
    }

    public Boolean getSECURITY() {
        return sECURITY;
    }

    public void setSECURITY(Boolean sECURITY) {
        this.sECURITY = sECURITY;
    }

    public Boolean getSERVANT() {
        return sERVANT;
    }

    public void setSERVANT(Boolean sERVANT) {
        this.sERVANT = sERVANT;
    }

    public Boolean getPB() {
        return pB;
    }

    public void setPB(Boolean pB) {
        this.pB = pB;
    }

    public Boolean getSTP() {
        return sTP;
    }

    public void setSTP(Boolean sTP) {
        this.sTP = sTP;
    }

    @Override
    public String toString() {
        return "AmenitiesMap{" +
            "cLUB=" + cLUB +
            ", hK=" + hK +
            ", iNTERNET=" + iNTERNET +
            ", sC=" + sC +
            ", vP=" + vP +
            ", rWH=" + rWH +
            ", pOOL=" + pOOL +
            ", lIFT=" + lIFT +
            ", aC=" + aC +
            ", iNTERCOM=" + iNTERCOM +
            ", fS=" + fS +
            ", pARK=" + pARK +
            ", gP=" + gP +
            ", cPA=" + cPA +
            ", gYM=" + gYM +
            ", sECURITY=" + sECURITY +
            ", sERVANT=" + sERVANT +
            ", pB=" + pB +
            ", sTP=" + sTP +
            '}';
    }
}
