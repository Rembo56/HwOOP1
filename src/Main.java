public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada","Granta","Russia","Yellow",2015, (float) 1.6);
        car1.info();

        Car car2 = new Car("AudiA8","50lTdiQuattro","Germany","black",2020, 3.0F);
        car2.info();

        Car car3 = new Car("BMW","Z8","Germany","black",2021, 3.0F);
        car3.info();

        Car car4 = new Car("KIA","Sportage","South Korea","red",2018, (float) 2.4);
        car4.info();

        Car car5 = new Car("Hyundai","Avante","South Korea","orange",2016, (float) 1.6);
        car5.info();


    }

}