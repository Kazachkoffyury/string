package ru.skypro;

import javax.xml.stream.events.Characters;

public class Main {

    public static void main(String[] args) {
        // task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        // task 2

        System.out.println("Данные ФИО сотрудника для заполнения отчета- "+ fullName.toUpperCase());

        //task 3

        System.out.println("Данные ФИО сотрудника для административного отдела — "+ fullName.replace(" ", ";"));

        //task 4

        String fullname1 = "Иванов Семён Семёнович";

        System.out.println(fullname1.replace("ё","е"));

        // task 5

        String [ ] fullNameArray = fullName.split("\\s");

        for (String s : fullNameArray) {

            System.out.println(s);

        }

        //task 6

        String fullName2 = "ivanov ivan ivanovich";
        String [ ] words  = fullName2.split("\\s");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String  temp = words[i];
            output.append(Character.toUpperCase(temp.charAt(0))).append(temp.substring(1)).append(" ");

        }
        System.out.println(output);



    }

}
