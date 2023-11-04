public class Car {

    private String nameCar;
    private String svetCar;
    private String modelCar;
    public Car(){}

    public Car(String nameCar, String svetCar, String modelCar) {
        this.nameCar = nameCar;
        this.svetCar = svetCar;
        this.modelCar = modelCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getSvetCar() {
        return svetCar;
    }

    public void setSvetCar(String svetCar) {
        this.svetCar = svetCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }
}
