package jaz.jazs20500nbp.model;

import java.util.Date;

public class Rate {
    public String No;
    public Date EffectiveDate;
    public Date Mid;

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public Date getEffectiveDate() {
        return EffectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        EffectiveDate = effectiveDate;
    }

    public Date getMid() {
        return Mid;
    }

    public void setMid(Date mid) {
        Mid = mid;
    }
}
