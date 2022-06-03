import java.util.HashMap;
import java.util.Scanner;

public class Translate {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap();
        data.put("Здравствуйте", "Guten Tag");
        data.put("как дела?", "Wie geht es Ihnen?");
        data.put("бутерброд", "ein Sandwich");
        data.put("Германия", "Deutschland");
//        data.put(, "королева Елизовета 2", "Königin Elisabeth 2");
//        data.put(, "ядерный полигон", "Atomtestgelände");
//        data.put(, "вода", "Wasser");
//        data.put(, "как пройти до ближайшего паба?", "Wie komme ich zur nächsten Kneipe?");
//        data.put(, "какая сегодня погода на улице?", "Wie ist das Wetter heute draußen?");
//        data.put(, "Макс сделал ядерный полигон на интернет карте.", "Max hat auf der Internetkarte ein Atomtestgelände erstellt.");
//        data.put(, "какой сейчас год?", "Welches Jahr ist es jetzt?");
//        data.put(, "Россия", "Russland");
//        data.put(, "Здравствуйте", "Guten Tag");
//        data.put(, "как дела?", "Wie geht es Ihnen?");
//        data.put(, "бутерброд", "ein Sandwich");
//        data.put(, "Германия", "Deutschland");
//        data.put(, "королева Елизовета 2", "Königin Elisabeth 2");
//        data.put(, "ядерный полигон", "Atomtestgelände");
//        data.put(, "вода", "Wasser");
//        data.put(, "как пройти до ближайшего паба?", "Wie komme ich zur nächsten Kneipe?");
//        data.put(, "какая сегодня погода на улице?", "Wie ist das Wetter heute draußen?");
//        data.put(, "Макс сделал ядерный полигон на интернет карте.", "Max hat auf der Internetkarte ein Atomtestgelände erstellt.");
//        data.put(, "какой сейчас год?", "Welches Jahr ist es jetzt?");
//        data.put(, "Russland", "Россия");


        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("на какой язык хотите перевести?(с Русского на Немецкий или наоборот(если 1-ый вариант то напишите РН, иначе НР))");
            String a = sc.nextLine();
                System.out.println(" введите слово:");
                a = sc.nextLine();
                System.out.println(data.getOrDefault(a, "такого слова в словоре пока, что нет"));



        }
















































    }
}
