public class Main {
    public static void main(String[] args) {
//  Задание 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age <18) {
            System.out.println("Тебе нет 18, возвращайся позже.");
        }
//  Задание 2
        int ageHuman = 7;
        if (ageHuman >= 7 && ageHuman < 18) {
         System.out.println("Тебе уже можно пойти в школу.");
        }
        if (ageHuman >= 18 && ageHuman < 24) {
            System.out.println("Поздравляем! Вы закончили школу и можете пойти в университет.");
        }
        if (ageHuman >= 24) {
            System.out.println("Сочувствуем, но пора искать работу.");
        }
//  Задание 3
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

    }
}
