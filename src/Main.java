
//        Университет, Школа, Автомобиль жана Человек деген класс тузунуз
//
//        Алардын свойстваларын ойлоп табыныз
//
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//
//        Ар бир класска 3-4 тона объект туп жана аларга маанилерин бериниз
//
//        Ар бир класстын объектилерин оз-озунчо массивный салып, аларды консольного чыгарыныза

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Murzaiym", "Keldibekova", LocalDate.of(2003, 10, 3), "Chyu");
        Person person2 = new Person("Acan", "Akkulov", LocalDate.of(2004, 3, 16), "Jalal-Abad");
        Person person3 = new Person("Azat", "Ergeshov", LocalDate.of(2005, 8, 20), "Jalal-Abad");
          Person[] adamdar = {person1,person2,person3};
        for (Person pp :adamdar) {
            System.out.println(STR."""
                    name:\{pp.getName()}
                    surNaame:\{pp.getSurNaame()}
                    birthday:\{pp.getBirthday()}
                    region:\{pp.getRegion()}
                ----------------------------------
                    """);
        }

        School school = new School("17-Kyla orto mektebi", " Roza Abdyjapavora", "700");
        School school1 = new School("28-Chyngys Aitmatov", "Tamara Manapovna", "500");
        School school2 = new School("14-Kochkor-Ata", "Marina Ergeshova", "900");
        School[] array = {school,school1,school2};
        for (School sss:array) {
            System.out.println(STR."""
                   nameSchool: \{sss.getNameSchool()}
                   NameDerektor:\{sss.getNameDerektor()}
                   skolcoShkolnikov:\{sss.getSkolcoShkolnikov()}
                ---------------------------------
                    """);
        }


        Car car1 = new Car();
        car1.setNameCar("Mers");
        car1.setModelCar("X-klass");
        car1.setSvetCar("kara");

        Car car2 = new Car();
        car2.setNameCar("AUD");
        car2.setModelCar("X-klass");
        car2.setSvetCar("Ak");

        Car car3 = new Car();
        car3.setNameCar("BMB");
        car3.setModelCar("X5");
        car3.setSvetCar("kara");

        Car[] massCar = {car1, car2, car3};



        University muk1 = new University();
        muk1.setNemaUnivera("Mukr");
        muk1.setDecanat("Mirlan");
        muk1.setEtash("4");
        muk1.setSkolkaStudentov("1200");

        University alatoo2 = new University();
        alatoo2.setNemaUnivera("Alatoo");
        alatoo2.setDecanat("Azim");
        alatoo2.setEtash("6");
        alatoo2.setSkolkaStudentov("2100");

        University[] massUnik = {muk1,alatoo2};


        for (Car carr : massCar) {
            System.out.println(STR. """
                   Name car: \{ carr.getNameCar() }
                  Model car: \{ carr.getModelCar() }
                   Svet car:: \{ carr.getSvetCar() }
               ---------------------------------------------
                    """ );
        }

        for (University unv : massUnik) {
            System.out.println(STR."""
                    Namber unisera\{unv.getNemaUnivera()}
                    Nam Dekanata \{unv.getDecanat()}
                    Skolca etash\{unv.getEtash()}
                    SkolkaStudentov\{unv.getSkolkaStudentov()}
              -------------------------------------------------------
                    """);
        }


    }
}
