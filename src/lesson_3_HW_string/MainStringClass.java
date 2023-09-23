package lesson_3_HW_string;

public class MainStringClass {
    public static void main(String[] args) {
        String input = "    >>Test_.  String, Test1 ,  Part2, Test, .Loss  ";

        //1. Прибрати прогалини на початку та в кінці стрінги
        String trimedString = input.trim();
        System.out.println(trimedString);

        //2. З вказаної стрінги залишити лише слово Test
        String wantedWord = "Test";
        int firstCharIndex = input.indexOf(wantedWord);
        int lastCharIndex = firstCharIndex + wantedWord.length();
        String result = input.substring(firstCharIndex, lastCharIndex);
        System.out.println(result);


        //3. Розібрати данну стрінгу по комі.
        // Пройтися по отриманим словам і  зробити перевірку – якщо перший
        // Не порожній символ слова 't' або 'T' вивести повідомлення
        // «Перший символ - «Т»» якщо ні – Вивести перший Непорожній символ слова.
        String[] wordsMassive = input.split(",");
        for (String word : wordsMassive) {
            for (String letter : word.split("")) {
                if (letter.equals(" ") || letter.isEmpty()) {
                    continue;
                } else if (letter.equalsIgnoreCase("t")) {
                    System.out.println("First symbol \"T\"");
                    break;
                } else {
                    System.out.println("First symbol is - " + letter);
                    break;
                }
            }
        }

        //4. Знайти першу букву 's' та замінити її на 'y'
        //Це тренування по роботі зі стрінгами, тому робити його можна прямо в мейні.
        // Кожен пункт - це окрема нова дія з початковою стрінгою.
        String replacedS = input.replaceFirst("s", "y");
        System.out.println(replacedS);
    }
}

