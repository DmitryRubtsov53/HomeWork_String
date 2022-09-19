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



    }
}