package cz.oauh.test20221031;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SkladovanaPolozka {
    private String nazevSkladovePolozky;
    private int mnozstviKusuNaSklade;
    //private double hmotnostJednohoKusu;//
    private int hmotnostJednohoKusu;
    private BigDecimal cenaJednohoKusu;
    private boolean zboziVNabidce;
    private LocalDate datumZavedeni;

    public SkladovanaPolozka(String nazevSkladovePolozky, int mnozstviKusuNaSklade, int hmotnostJednohoKusu, BigDecimal cenaJednohoKusu, boolean zboziVNabidce, LocalDate datumZavedeni) {
        setNazevSkladovePolozky(nazevSkladovePolozky);
        this.mnozstviKusuNaSklade = mnozstviKusuNaSklade;
        this.hmotnostJednohoKusu = hmotnostJednohoKusu;
        setCenaJednohoKusu(cenaJednohoKusu);
        this.zboziVNabidce = zboziVNabidce;
        setDatumZavedeni(LocalDate.now());
    }

    public String getNazevSkladovePolozky() {
        return nazevSkladovePolozky;
    }

    public void setNazevSkladovePolozky(String nazevSkladovePolozky) {
        this.nazevSkladovePolozky = nazevSkladovePolozky;
    }

    public int getMnozstviKusuNaSklade() {
        return mnozstviKusuNaSklade;
    }

    public void setMnozstviKusuNaSklade(int mnozstviKusuNaSklade) {
        this.mnozstviKusuNaSklade = mnozstviKusuNaSklade;
    }

    public int getHmotnostJednohoKusu() {
        return hmotnostJednohoKusu;
    }

    public void setHmotnostJednohoKusu(int hmotnostJednohoKusu) {
        this.hmotnostJednohoKusu = hmotnostJednohoKusu;
    }

    public BigDecimal getCenaJednohoKusu() {
        return cenaJednohoKusu;
    }

    public void setCenaJednohoKusu(BigDecimal cenaJednohoKusu) {
        this.cenaJednohoKusu = cenaJednohoKusu;
    }

    public boolean isZboziVNabidce() {
        return zboziVNabidce;
    }

    public void setZboziVNabidce(boolean zboziVNabidce) {
        this.zboziVNabidce = zboziVNabidce;
    }

    public LocalDate getDatumZavedeni() {
        return datumZavedeni;
    }

    public void setDatumZavedeni(LocalDate datumZavedeni) {
        this.datumZavedeni = datumZavedeni;
    }
}
