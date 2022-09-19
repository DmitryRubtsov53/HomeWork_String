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
        System.out.println("Задача 5. Вариант 1. Разделить строку ФИО сотрудника и напечатать части");

        String[] names = fullName.split(" ");

        String lName = names[0];    System.out.println("Фамилия сотрудника - " + lName);
        String fName = names[1];    System.out.println("Имя сотрудника - " + fName);
        String mName = names[2];    System.out.println("Отчество сотрудника - " + mName);

        System.out.println();
        System.out.println("Задача 5. Вариант 2. Разделить строку ФИО сотрудника и напечатать части");

        int entry1 = fullName.indexOf(' ');
        int entry2 = fullName.lastIndexOf(' ');
        int entry3 = fullName.length() - 1;

        String Name0 = fullName.substring(0, entry1);         System.out.println("Фамилия сотрудника - " + lastName);
        String Name1 = fullName.substring(entry1, entry2);    System.out.println("Имя сотрудника - " + fistName);
        String Name2 = fullName.substring(entry2, entry3);    System.out.println("Отчество сотрудника - " + middleName);


    }
}