public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1:");
        task1();
        System.out.println("Task 2:");
        task2();
        System.out.println("Task 3:");
        task3();
        System.out.println("Task 4:");
        task4();
        System.out.println("Task 5:");
        task5();
        System.out.println("Task 6:");
        task6();
        System.out.println("Task 7:");
        task7();
        int ageOfThePerson;
    }

    public static void task1() {
        int ageOfThePerson = 19;
        if (ageOfThePerson >= 18) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "
                    + ageOfThePerson + ", он не достиг совершеннолетия, нужно немного подождать");
        }

    }

    public static void task2() {
        int outdoorTemperature = 1;
        if (outdoorTemperature >= 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        int maximumAllowedSpeed = 60;
        int theSpeedOfTheMachine = 97;
        if (maximumAllowedSpeed > theSpeedOfTheMachine) {
            System.out.println("Если скорость " + theSpeedOfTheMachine + " , то можно ездить спокойно");
        } else System.out.println("Если скорость " + theSpeedOfTheMachine + " , то придется заплатить штраф");
    }

    public static void task4() {

        int ageOfThePerson = 15;
        if (ageOfThePerson >= 2 && ageOfThePerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в детский сад.");
        }
        if (ageOfThePerson >= 7 && ageOfThePerson <= 17) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в школу.");
        }
        if (ageOfThePerson >= 18 && ageOfThePerson <= 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в университет.");
        }
        if (ageOfThePerson >= 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить на работу.");
        }


    }

    public static void task5() {
        int ageOfThePerson = 16;
        if (ageOfThePerson < 5) {
            System.out.println("Если возраст ребенка равен "
                    + ageOfThePerson + ", то ему нельзя кататься на аттракционе");
        }
        if (ageOfThePerson >= 5 && ageOfThePerson <= 14) {
            System.out.println("Если возраст ребенка равен "
                    + ageOfThePerson + ", то ему можно кататься на аттракционе только в сопровождении взрослого");
        }
        if (ageOfThePerson > 14) {
            System.out.println("Если возраст ребенка равен "
                    + ageOfThePerson + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }


    }

    public static void task6() {
        int numberOfPlacesInTheCarriage = 102;
        int numberOfPassengersInTheCarriage = 106;
        int numberOfSeatsInTheCarriage = 60;
        if (numberOfPassengersInTheCarriage < numberOfSeatsInTheCarriage) {
            System.out.println("В вагоне есть сидячие места");
        } else if (numberOfPassengersInTheCarriage > numberOfSeatsInTheCarriage && numberOfPassengersInTheCarriage < numberOfPlacesInTheCarriage) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("Вагон полон");
        }

    }


    public static void task7() {
        int one = 59;
        int two = 381;
        int three = 97;
        if (one>two && one>three) {
            System.out.println(one);}
        else if (two>three){
            System.out.println(two);}
        else {
            System.out.println(three);}
    }


}


