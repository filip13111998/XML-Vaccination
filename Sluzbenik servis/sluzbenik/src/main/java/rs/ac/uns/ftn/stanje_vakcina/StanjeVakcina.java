package rs.ac.uns.ftn.stanje_vakcina;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "fajzer",
        "sputnjik",
        "moderna",
        "sinofarm",
        "astraZeneca"

})
@XmlRootElement(name = "StanjeVakcina")
public class StanjeVakcina {

    @XmlElement(required = true)
    protected int fajzer;
    @XmlElement(required = true)
    protected int sputnjik;
    @XmlElement(required = true)
    protected int moderna;
    @XmlElement(required = true)
    protected int sinofarm;
    @XmlElement(required = true)
    protected int astraZeneca;

    public StanjeVakcina() {
    }

    public int getFajzer() {
        return fajzer;
    }

    public void setFajzer(int fajzer) {
        this.fajzer = fajzer;
    }

    public int getSputnjik() {
        return sputnjik;
    }

    public void setSputnjik(int sputnjik) {
        this.sputnjik = sputnjik;
    }

    public int getModerna() {
        return moderna;
    }

    public void setModerna(int moderna) {
        this.moderna = moderna;
    }

    public int getSinofarm() {
        return sinofarm;
    }

    public void setSinofarm(int sinofarm) {
        this.sinofarm = sinofarm;
    }

    public int getAstraZeneca() {
        return astraZeneca;
    }

    public void setAstraZeneca(int astraZeneca) {
        this.astraZeneca = astraZeneca;
    }
}

