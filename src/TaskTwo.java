import java.util.Scanner;

public class TaskTwo {
    //TODO:
    // Входные данные:Переменная choice содержит целое число, представляющее выбор пользователя.
    // Выходные данные:Программа определяет действие, соответствующее значению choice, и выводит его описание.
    // Алгоритм:
    // 1.Инициализация переменной choice с выбранным пользователем числом.
    // 2.Используя оператор switch, программа выбирает действие в зависимости от значения choice.
    // 3.Для каждого варианта case определено определенное действие.
    // 4.При совпадении значения choice с определенным вариантом case, программа выполняет соответствующее действие.
    // 5.Если choice не соответствует ни одному case, программа выполняет действие по умолчанию.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер действия (1-12):");
        int choice = scan.nextInt();
        switch (choice) {

            case 1,2: {
                System.out.println("Выбранное действие: сохранение данных");
                break;
            }
            case 3,8: {
                System.out.println("Выбранное действие: удаление данных");
                break;
            }
            case 4,12: {
                System.out.println("Выбранное действие: конвертация данных");
                break;
            }
            case 5,11: {
                System.out.println("Выбранное действие: архивирование данных");
                break;
            }
            case 6,7,9: {
                System.out.println("Выбранное действие: восстановление данных");
                break;
            }
            case 10: {
                System.out.println("Выбранное действие: чтение данных");
                break;
            }
            default: {
                System.out.println("ERROR!ERROR!ERROR! - неверный номер действия!");
            }
        }
    }
}
