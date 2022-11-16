public class Main {
    public static void main(String[] args) {
//  Задание 1.1
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else {
            System.out.println("Тебе нет 18, возвращайся позже.");
        }
//  Задание 1.2
        int ageHuman = 24;
        if (ageHuman >= 7 && ageHuman < 18) {
         System.out.println("Тебе уже можно пойти в школу.");
        } else if (ageHuman >= 18 && ageHuman < 24) {
            System.out.println("Поздравляем! Вы закончили школу и можете пойти в университет.");
        }
        else {
            System.out.println("Сочувствуем, но пора искать работу.");
        }
//  Задание 1.3
        int wagonCapacity = 102;
        int seatPlaces = 60;
        int standingPlaces = wagonCapacity - seatPlaces;
        int ticketsSoldSeatPlaces = 60;
        int ticketSoldStandingPlaces = 42;
        int ticketSoldAll = ticketSoldStandingPlaces + ticketsSoldSeatPlaces;
        if (ticketSoldAll < 102) {
        System.out.println("Количество свободных мест: " + (wagonCapacity - ticketSoldAll) + ". Из них сидячих: " + (seatPlaces - ticketsSoldSeatPlaces) + ", стоячих: " + (standingPlaces - ticketSoldStandingPlaces));
        }
        else  {
        System.out.println("Простите, но свободных мест нет.");
        }
//  Задание 3.1
        int ageSubject = 25;
        if (ageSubject >= 2 && ageSubject <= 6) {
            System.out.println("Если возраст человека равен " + ageSubject + ", то ему нужно ходить в детский сад.");
        }
        else if (ageSubject >= 7 && ageSubject <= 18) {
            System.out.println("Если возраст человека равен " + ageSubject + ", то ему нужно ходить в школу.");
        }
        else if (ageSubject >= 18 && ageSubject <= 24) {
            System.out.println("Если возраст человека равен " + ageSubject + ", то ему нужно ходить в университет.");
        }
        else {
            System.out.println("Если возраст человека равен " + ageSubject + ", то ему нужно ходить на работу.");
        }
//  Задание 3.2
        int ageChild = 23;
        if (ageChild < 5) {
            System.out.println("К сожалению тебе нельзя на аттракцион.");
        }
        else if (ageChild >=5 && ageChild<= 14) {
            System.out.println("Ты можешь кататься на аттракционе только в сопровождении взрослого.");
        }
        else {
            System.out.println("Ты можешь кататься на аттракционе.");
        }
//  Задание 3.3
        int one = 1;
        int two = 100;
        int three = 900;
        if (one > two && one > three) {
            System.out.println(one + " самое большое число.");
        }
        else if (two > one && two > three) {
            System.out.println(two + " самое большое число.");
        }
        else if (three > one && three > two) {
            System.out.println(three + " самое большое число.");
        }
        else {
            System.out.println("Все числа равны.");
        }

        }

    }

