import java.util.Scanner;

public class CalculatePerimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String person1 = "Иванов Вован";
        System.out.println("Введите имя пользователя....");
        String newPerson = scanner.nextLine();
        checkUserName(person1, newPerson);
    }

    private static void checkUserName(String person1, String newPerson) {
        if (newPerson.equalsIgnoreCase(person1)) {
            System.out.println("Выберите другое имя , данное имя занято((");
        } else {
            System.out.println("Поздраляем! Ваше имя пользовтеля : " + newPerson);
            System.out.println("Кол-во символов в вашем имени: " + newPerson.length() );
            String newPersonSymbols = newPerson.replaceAll("\\s+","");
            System.out.println("А без пробелов ваше имя занимает " + newPersonSymbols.length() + " символов");
        }
    }
}







