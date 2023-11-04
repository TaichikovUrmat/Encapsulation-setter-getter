import java.time.LocalDate;

public class Person {
    private String  name;
    private   String surNaame;
    private LocalDate birthday;
    private String  region;

    public Person(String name,String surNaame,LocalDate age,String region){
        this.name= name;
        this.surNaame = surNaame;
        this.birthday = age;
        this.region = region;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurNaame() {
        return surNaame;
    }

    public void setSurNaame(String surNaame) {
        this.surNaame = surNaame;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
