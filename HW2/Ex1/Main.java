package HW2.Ex1;
// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class Main {
    private static StringBuilder str = new StringBuilder();
    private static String startRequest = "select * from students where ";

    public static void main(String[] args) {

        System.out.println(str.StringBuilder(startRequest));
    }
}
