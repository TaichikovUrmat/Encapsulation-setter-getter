public class School {

    private String  nameSchool;
    private  String  NameDerektor;
    private  String skolcoShkolnikov;

    public School(String nameSchool, String nameDerektor, String skolcoShkolnikov) {
        this.nameSchool = nameSchool;
        NameDerektor = nameDerektor;
        this.skolcoShkolnikov = skolcoShkolnikov;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getNameDerektor() {
        return NameDerektor;
    }

    public void setNameDerektor(String nameDerektor) {
        NameDerektor = nameDerektor;
    }

    public String getSkolcoShkolnikov() {
        return skolcoShkolnikov;
    }

    public void setSkolcoShkolnikov(String skolcoShkolnikov) {
        this.skolcoShkolnikov = skolcoShkolnikov;
    }
}

