import java.time.LocalDate;

public class University {

    private String nemaUnivera;
    private String decanat;
    private String etash;
    private String skolkaStudentov;

    public University() {
    }

    public University(String nemaUnivera, String decanat, String etash, String skolkaStudentov) {
        this.nemaUnivera = nemaUnivera;
        this.decanat = decanat;
        this.etash = etash;
        this.skolkaStudentov = skolkaStudentov;
    }

    public String getNemaUnivera() {
        return nemaUnivera;
    }

    public void setNemaUnivera(String nemaUnivera) {
        this.nemaUnivera = nemaUnivera;
    }

    public String getDecanat() {
        return decanat;
    }

    public void setDecanat(String decanat) {
        this.decanat = decanat;
    }

    public String getEtash() {
        return etash;
    }

    public void setEtash(String etash) {
        this.etash = etash;
    }

    public String getSkolkaStudentov() {

        return skolkaStudentov;
    }

    public void setSkolkaStudentov(String skolkaStudentov) {
        this.skolkaStudentov = skolkaStudentov;
    }
}


