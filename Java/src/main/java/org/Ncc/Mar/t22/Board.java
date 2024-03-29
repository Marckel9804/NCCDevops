package org.Ncc.Mar.t22;

import java.sql.Blob;
import java.util.Date;

public class Board {
    private int bno;
    private  String  btitle;
    private String    bcontent;
    private  String  bwritter;
    private Date bdate;
    private String bfilename;
    private Blob bfiledata;

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBwritter() {
        return bwritter;
    }

    public void setBwritter(String bwritter) {
        this.bwritter = bwritter;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getBfilename() {
        return bfilename;
    }

    public void setBfilename(String bfilename) {
        this.bfilename = bfilename;
    }

    public Blob getBfiledata() {
        return bfiledata;
    }

    public void setBfiledata(Blob bfiledata) {
        this.bfiledata = bfiledata;
    }

    @Override
    public String toString() {
        return "Board{" +
                "bno='" + bno + '\'' +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bwritter='" + bwritter + '\'' +
                ", bdate=" + bdate +
                ", bfilename='" + bfilename + '\'' +
                ", bfiledata=" + bfiledata +
                '}';
    }
}
