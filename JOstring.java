package org.itstep;

import java.util.Arrays;

public class JOstring {
    public static void main(String[] args) {
        String s;
        //Удалить все скобки из выражения
        s = "What are the {wrapper} {classes} in Java?";
        String result = s.replaceAll("[{}]", "");
        System.out.println(result);
        System.out.println();
        // заменить запятые на точку с запятой
        s = "int, byte, short, long, float, double, boolean, and char";
        result = s.replaceAll(",", ";");
        System.out.println(result);
        System.out.println();
        //Заменить первую букву на прописную
        s = "what is JIT compiler in Java?";
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(0,(s.substring(0,1).toUpperCase()).charAt(0));
        System.out.println(sb);
        System.out.println();
        //Разбить строку на подстроки
        s = "Access modifiers in Java are: \nDefault\nPrivate\nProtected\nPublic";
        String [] sArr = s.split("a\n");
        for (String elen: sArr)
        System.out.println(elen);
        System.out.println();
        //Удалить концевые пробелы
        s = "    Object-Oriented Programming or OOPs is a programming style that is associated with concepts like: "
                + "innheritance, encapsulation, polymorphism, abstraction.    ";
        result = s.trim();
        System.out.println(result);
        System.out.println();
        //Найти в строке символ с наименьшим кодом UTF-8
        s = "string";
        char [] chars = s.toCharArray();
        int min= chars[0];
        System.out.println(min);
        for (int i=0; i<s.length(); i++)
            if (i==min);
        System.out.println(min);

    }
}
