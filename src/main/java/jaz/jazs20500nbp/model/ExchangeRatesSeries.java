package jaz.jazs20500nbp.model;

public class ExchangeRatesSeries {
    public String Table;
    public String Currency;
    public String Code;
    public Rates Rates;
    public String xsd;
    public String xsi;
    public String text;

    public String getTable() {
        return Table;
    }

    public void setTable(String table) {
        Table = table;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public jaz.jazs20500nbp.model.Rates getRates() {
        return Rates;
    }

    public void setRates(jaz.jazs20500nbp.model.Rates rates) {
        Rates = rates;
    }

    public String getXsd() {
        return xsd;
    }

    public void setXsd(String xsd) {
        this.xsd = xsd;
    }

    public String getXsi() {
        return xsi;
    }

    public void setXsi(String xsi) {
        this.xsi = xsi;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}