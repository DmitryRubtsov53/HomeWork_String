import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание Урока Строки ****************************************************");
        System.out.println();
        System.out.println("Задача 1. Напечатать ФИО сотрудника");

        String fistName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + fistName + " " + middleName;

        System.out.println(fullName);

        System.out.println();
        System.out.println("Задача 2. Напечатать ФИО сотрудника в верхнем регистре");

        String UpName = fullName.toUpperCase();
        System.out.println(UpName);

        System.out.println();
        System.out.println("Задача 3. Заменить в ФИО сотрудника буквы ё на буквы е.");

        String newName = "Иванов Семён Семёнович";
        String new2Name = newName.replace ('ё', 'е');
        System.out.println(new2Name);

        System.out.println();
        System.out.println("Задачи Повышенной сложности Урока Строки");

        System.out.println();
        System.out.println("Задача ПС 5. Вариант 1. Разделить строку ФИО сотрудника и напечатать части");

        String[] names = fullName.split(" ");

        String lName = names[0];    System.out.println("Фамилия сотрудника - " + lName);
        String fName = names[1];    System.out.println("Имя сотрудника - " + fName);
        String mName = names[2];    System.out.println("Отчество сотрудника - " + mName);

        System.out.println();
        System.out.println("Задача ПС 5. Вариант 2. Разделить строку ФИО сотрудника и напечатать части");

        int entry1 = fullName.indexOf(' ');
        int entry2 = fullName.lastIndexOf(' ');
        int exit = fullName.length() - 1;

        String Name0 = fullName.substring(0, entry1);         System.out.println("Фамилия сотрудника - " + lastName);
        String Name1 = fullName.substring(entry1, entry2);    System.out.println("Имя сотрудника - " + fistName);
        String Name2 = fullName.substring(entry2, exit);    System.out.println("Отчество сотрудника - " + middleName);

        System.out.println();
        System.out.println("Задача ПС 6. Превести первые буквы ФИО сотрудника в верхний регистр.");

        String fio = "иванов иван иванович";
        char [] fioArray = fio.toCharArray();

        fioArray[0] = Character.toUpperCase(fioArray[0]);

        for (int i = 1; i < fioArray.length; i++) {
            if (fioArray[i] == ' ')
                fioArray[i+1] = Character.toUpperCase(fioArray[i+1]);
        }
        System.out.println(fioArray);

        System.out.println();
        System.out.println("Задача ПС 8. Найти и распечатать дублирующиеся в строке буквы");

        String alfa = "aabccddefgghiijjkk";
        char [] dubl = alfa.toCharArray();

        for (int i = 0; i < dubl.length; i++) {
            for (int j = i + 1; j < dubl.length; j++) {
                if (dubl[i] == dubl[j]) {
                    System.out.print(dubl[i]);
                }
            }
        }


    }
}