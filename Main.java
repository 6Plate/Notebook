package HW6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
// import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String [] args){
    Map<NB>noteBook = new HashSet<>();
    NB nb1 = new NB();
    nb1.color = "красный";
    nb1.hd = 512;
    nb1.os = "windows";
    nb1.ram = 8;
    NB nb2 = new NB();
    nb2.color = "белый";
    nb2.hd = 512;
    nb2.os = "mac";
    nb2.ram = 16;
    NB nb3 = new NB();
    nb3.color = "серый";
    nb3.hd = 2000;
    nb3.os = "mac";
    nb3.ram = 32;
    NB nb4 = new NB();
    nb4.color = "черный";
    nb4.hd = 512;
    nb4.os = "windows";
    nb4.ram = 8;
    NB nb5 = new NB();
    nb5.color = "черный";
    nb5.hd = 512;
    nb5.os = "linux";
    nb5.ram = 8;
    noteBook.add(nb1);
    noteBook.add(nb2);
    noteBook.add(nb3);
    noteBook.add(nb4);
    noteBook.add(nb5);
    Map<Integer, String> filter = new HashMap<>();
    filter.put(1, "Color");
    filter.put(2, "Hd");
    filter.put(3, "Оs");
    filter.put(4, "озy");


System.out.println(filter);
System.out.println("Введите номер желаемого критерия:");
Scanner sc = new Scanner(System.in);
int choosed = sc.nextInt();
System.out.println(workWithMenu(choosed));

public List<NB> workWithMenu(int choose){
switch (choose) {
    case choose == 1:
        System.out.println("Выберите цвет: ");
        String colchose = sc.nextLine();
        List <NB> colored = new ArrayList<>();
        for (NB nb: noteBook.isEmpty()){
           if (nb.getColor().equals(colchose)){
            colored.add(nb);
            System.out.println("Вот все варианты:");
        }
        return colored.toString();
    }
    case choose == 2:
    System.out.println("Выберите объем жесткого диска: ");
    int choosehd = sc.nextInt();
    List <NB> hd = new ArrayList<>();
    for (NB nb: noteBook.isEmpty()){
           if (nb.getHD() == choosehd){
            hd.add(nb);
            System.out.println("Вот все варианты:");
         }
         return hd.toString();
    }   
    case choose == 3:
    System.out.println("Выберите операционную систему: ");
    String chooseos = sc.nextLine();
    List <NB> os = new ArrayList<>();
    for (NB nb: noteBook.isEmpty()){
        if (nb.getOS().equals(chooseosos)){
            os.add(nb);
            System.out.println("Вот все варианты:");
            System.out.println(os);
    }
    return os.toString();
}
    case choose == 4:
    System.out.println("Выберите объем озу: ");
    int chooseram = sc.nextInt();
    List <NB> ram = new ArrayList<>();
    for (NB nb: noteBook.isEmpty()){
        if (nb.getRam() == chooseram){
            ram.add(nb);
            System.out.println("Вот все варианты:");
            System.out.println(ram);
        }
        return ram.toString();
    }
}
}
}
}
    