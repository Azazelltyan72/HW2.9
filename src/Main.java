import autoRacing.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1.1");
        Set<Product> products = new HashSet<>();

        Product bananas = new Product("Банан", 20.99, 1);
        Product tomatos = new Product("Помидор", 20.99, 2);
        Product cucmbers = new Product("Огурцы", 20.99, 2);
        Product potatos = new Product("Картошка", 20.99, 1);
        Product eggs = new Product("Яйца", 20.99, 1);
        Product apples = new Product("Яблоки", 20.99, 1);

        bananas.addProduct(products);
        tomatos.addProduct(products);
        potatos.addProduct(products);
        eggs.addProduct(products);
        apples.addProduct(products);
//        apples.addProduct(products);
        System.out.println(products.size());
        System.out.println("В списке продуктов имеются " + Arrays.toString(products.toArray()));

        System.out.println("Task 2.1");

        Recipe salat = new Recipe("Salat", 55.99);
        Recipe salat2 = new Recipe("Salat2", 55.99);
        salat.getIngredients().add(tomatos);
        salat.getIngredients().add(cucmbers);
        salat.getIngredients().add(eggs);

        salat2.getIngredients().add(tomatos);
        salat2.getIngredients().add(cucmbers);
        salat2.getIngredients().add(eggs);
        System.out.println(salat);
        System.out.println(salat.getIngredients().size());

        Set<Recipe> recipes = new HashSet<>();
        salat.addRecipe(recipes);

        System.out.println("Task 2.2");

        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < 21; i++) {
            integers.add((int) (Math.random() * 1000) + 1);
        }

        integers.removeIf(Integer -> Integer % 2 != 0);
        System.out.println(integers);

        System.out.println("Task 3.1");


        Car lada = new Car("Лада", "Гранта", 59.5599, "Бурый", "Хетчбэк", "автомат");
        Bus neman = new Bus("Неман", "420211-10", 57.49, "Зеленый");
        Truck gazel4 = new Truck("Газель", "Рута", 110);

        CategoryBDriver nana = new CategoryBDriver("Нана Кобаяси Л.", true, 12, lada);


        Mechanic<Car> salavat = new Mechanic<>("Салават", "Валидов", "SintraCorp");
        Mechanic<Truck> renata = new Mechanic<>("Рената", "Девиль", "Evil");
        Mechanic<Bus> alex = new Mechanic<>("Александра", "Валидова", "SintraCorp");


        Sponsor honda = new Sponsor("Honda", 420);
        Sponsor redBull = new Sponsor("Red Bull", 243);
        Sponsor intel = new Sponsor("Intel", 40);
        Sponsor marlboro = new Sponsor("Marlboro", 200);
        Sponsor bridgestone = new Sponsor("Bridgestone ", 105);

        lada.addDriver(new CategoryBDriver("Тагирова Азалия Азаматовна", true, 12, lada), nana);
        lada.addMechanics(salavat);
        lada.addSponsors(honda, redBull, bridgestone);

        gazel4.addDriver(new CategoryCDriver("Даминов Максим Рюрикович", true, 10, gazel4));
        gazel4.addMechanics(renata);
        gazel4.addSponsors(marlboro, redBull);

        neman.addDriver(new CategoryDDriver("Гарипов Динислам Анисович", true, 20, neman));
        neman.addMechanics(alex);
        neman.addSponsors(intel, marlboro, honda);

        Set<MotorTransport> motorTransports = new HashSet<>();

        motorTransports.add(neman);
        motorTransports.add(lada);
        motorTransports.add(gazel4);

        System.out.println(lada.getDrivers().size());

        System.out.println(motorTransports.size());

        System.out.println("Task 3.2");
//        Я все списала с сайта(Комментарии с объяснениями почитала. Что-то поняла, что-то нет)
        int[][] Mas = new int[15][3];
        for (int i = 0; i < Mas.length; i++) {
            for (int h = 0; h < Mas[i].length; h++) {
                Mas[i][h] = (int) (Math.random() * 8) + 2;
                if (h == Mas[i].length - 1) {
                    Mas[i][h] = Mas[i][h - 2] * Mas[i][h - 1];
                    for (int q = 0; q < i; q++) {
                        if (Mas[i][h] == Mas[q][h] && i > 0) {
                            if (Mas[i][h - 1] == Mas[q][h - 1] || Mas[i][h - 2] == Mas[q][h - 2]) --i;
                        }
                    }
                }
            }
        }
        for(int i=0;i<Mas.length;i++){
            System.out.print("Задание №"+(i+1+" Умножить "));
            for(int h=0;h<Mas[i].length;h++){
                if(h==0)
                    System.out.print(Mas[i][h]+" на ");
                if(h==1)
                    System.out.println(Mas[i][h]);
            }
        }

        System.out.println("Task 3.3");

        Passport p1 = new Passport(800183L, "Т", "А", null, "20.12.2009");
        Passport p2 = new Passport(800185L, "Н", "А", "Н", "20.12.2000");
        Passport p3 = new Passport(800185L, "Д", "Г", "В", "20.12.1975");

        HashMap<Long, Passport> origPassport = new HashMap<>();
        origPassport.put(p1.getPassportNumber(), p1);
        origPassport.put(p2.getPassportNumber(), p2);
        System.out.println(origPassport);
        origPassport.put(p3.getPassportNumber(), p3);
        System.out.println(origPassport);
        System.out.println(origPassport.get(800183L));
        System.out.println(origPassport.get(800189L));

    }

    public static void printInfoDriver(MotorTransport motorTransport) {
        System.out.println("Автотранспорт " + motorTransport.getBrand() + " " + motorTransport.getModel() + " будет учавствовать в заезде c водителем/ями:");
        for (Driver<?> driver : motorTransport.getDrivers()) {
            System.out.println(driver.getFullName());
        }
        System.out.println("со спонсором/ами из:");
        for (Sponsor sponsor : motorTransport.getSponsors()) {
            System.out.println(sponsor.getName() + ", чей взнос составляет $" + sponsor.getAmount() + " млн");
        }
        System.out.println("и с механиком/ами:");
        for (Mechanic<?> mechanic : motorTransport.getMechanics()) {
            System.out.println(mechanic.getSurname() + " " + mechanic.getName() + " из компании " + mechanic.getCompany());
        }
    }


    private static void service(MotorTransport... motorTransports) {
        for (MotorTransport motorTransport : motorTransports) {
            serviceT(motorTransport);
        }
    }

    private static void serviceT(MotorTransport motorTransport) {
        try {
            if (!motorTransport.service()) {
                throw new RuntimeException("Автотранспорт " + motorTransport.getBrand() + " " + motorTransport.getModel() + " не прошёл диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

}