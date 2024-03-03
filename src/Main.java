public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String separator = " ";
        String fullName = lastName + separator + firstName + separator + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Задача 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        String fullNameWithoutYo = fullName.replace('ё', 'e');
        System.out.println("Данные ФИО сотрудника — " + fullNameWithoutYo);
    }
}