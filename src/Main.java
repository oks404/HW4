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
        int ageHuman = 24;
        if (ageHuman >= 7 && ageHuman < 18) {
         System.out.println("Тебе уже можно пойти в школу.");
        }
        else if (ageHuman >= 18 && ageHuman < 24) {
            System.out.println("Поздравляем! Вы закончили школу и можете пойти в университет.");
        }
        else if (ageHuman >= 24) {
            System.out.println("Сочувствуем, но пора искать работу.");
        }
    }
}
