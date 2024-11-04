public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int age = 34;
        boolean personIsAdult = age >= 18;
        if (personIsAdult) {
            System.out.println("Если возраст человека равен " + age + ",то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия," +
                    "нужно немного подождать");
        }
        System.out.println("");

        System.out.println("Задача 2");
        int temperature = 2;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("");

        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ехать спокойно");
        }
        System.out.println("");

        System.out.println("Задача 4");
        int personAge = 13;

        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека " + personAge+ ", то ему нужно ходить в детский сад");
            }
        if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека " + personAge + ", то ему нужно ходить в школу");
            }
        if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека " + personAge + ", то ему нужно ходить в университет");
            }
        if (personAge > 24) {
            System.out.println("Если возраст человека " + personAge + ", то ему пора ходить на работу");
        }
        System.out.println("");

        System.out.println("Задача 5");
        int childAge = 15;
        boolean childCantTakeRides = childAge < 5;
        boolean childCanTakeRidesWithAdult = childAge >=5 && childAge <= 14;
        boolean childCanTakeRides = childAge > 14;

        if (childCantTakeRides) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childCanTakeRidesWithAdult) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childCanTakeRides) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("");

        System.out.println("Задача 6");
        int capacity = 50;

        if (capacity > 60 && capacity < 102) {
            System.out.println("В вагоне только стоячие места");
        }
        else if (capacity >0 && capacity <= 60) {
                System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }
        System.out.println("");

        System.out.println("Задача 7");
        int one = 508;
        int two = 2802;
        int three = 6609;

        if (three > two && three > one) {
            System.out.println("Третье число - самое большое");
        } else if (two > three && two > one) {
            System.out.println("Второе число - самое большое");
        } else {
            System.out.println("Первое число - самое большое ");
        }
    }
}
