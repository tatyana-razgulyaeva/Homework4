import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        int temperature = 15;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + ", нужно надеть шапку");
        }else {
            System.out.println("На улице " + temperature + ", можно идти без шапки");
        }
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        age = 30;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }else if (age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }else if (age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        age = 8;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }else if (age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься без сопровождения взрослого");
        }
        int people = 60;
        if (people < 60) {
            System.out.println("В вагоне поезда есть сидячие места");
        }else if (people < 102) {
            System.out.println("В вагоне есть стоячие места");
        }else {
            System.out.println("В вагоне мест нет");
        }
        int one = 23;
        int two = 34;
        int three = 2;
        if (one > two && one > three) {
            System.out.println(one);
        }else if (two > three) {
            System.out.println(two);
        }else {
            System.out.println(three);
        }
    }
}