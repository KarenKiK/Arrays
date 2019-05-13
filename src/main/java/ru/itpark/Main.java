package ru.itpark;

public class Main {
    public static void main(String[] args) {
        // Два варианта создания
        int[] first = {0, 0, 0}; // литеральная форма (создаётся массив с элементами)
        int[] second = new int[3]; // в квадратных скобках кол-во элементов - создаётся массив с элементами "нулевыми"

        System.out.println(second[0]); // second[index] - доступ по индексу
        System.out.println(second[second.length - 1]);

        // Java следит за выходом за пределы массива
//        System.out.println(second[-1]);
//        System.out.println(second[100]);

        second[0] = 10; // запись элемента в массив
        second[1] = 20; // запись элемента в массив

//        int[] scoresFirst = {10, 8, 10};
//        первое - укороченная запись второго
//        int[] scoresSecond = new int[3];
//        scoresSecond[0] = 10;
//        scoresSecond[1] = 8;
//        scoresSecond[2] = 10;

        // цикл со счётчиком от 0 до 10 (не включая 10)
        for (int i = 0; i < 10; i++) { // всё, что в круглых скобках (оно "условно" внутри блока)
            System.out.println(i);
        }

        // itar
        for (int i = 0; i < second.length; i++) {
            int el = second[i]; // получаем элемент по индексу
        }

        // iter
        for (int el : second) { // сам остановится, когда переберёт все элементы
            // el -> новый элемент (некий "аналог" того, что сверху
        }

        // блок для суммы продаж
        {
            int[] sales = {5_000, 1_000, 500, 2_000};
            int sum = 0;
            for (int sale : sales) {
                sum += sale; // приплюсовываем к имеющейся сумме каждую продажу
            }
        }

        // блок для итогового процента
        {
            float[] percents = {0.5f, 1.0f, 0.5f, 2};
            float total = 1; // главное правильно выбрать начальное значение
            for (float percent : percents) {
                total *= percent; // приплюсовываем к имеющейся сумме каждую продажу
                // total = total * percent;
            }
        }

        // блок для средней оценки
        {
            int[] scores = {8, 7, 4, 2, 10};
            int sum = 0;
            for (int score : scores) {
                sum += score; // приплюсовываем к имеющейся сумме каждую продажу
            }
            int result = sum / scores.length;
            System.out.println(result);
        }

        // блок для поиска максимальной оценки
        {
            int[] scores = {8, 7, 4, 2, 10};
            int max = scores[0]; // берём первый за отправную точку (аналогия с шариками)
            for (int score : scores) {
                if (max < score) {
                    max = score; // меняем текущий максимум
                }
            }
            // будет сравнивать на один раз меньше (но оно того не стоит, в большинстве случаев)
            for (int i = 1; i < scores.length; i++) {
                int score = scores[i];
                if (max < score) {
                    max = score; // меняем текущий максимум
                }
            }
        }

        // блок для поиска индекса максимальной оценки
        {
            int[] scores = {8, 10, 4, 2, 10};
            int max = scores[0]; // берём первый за отправную точку (аналогия с шариками)
            int index = 0;
            for (int i = 0; i < scores.length; i++) {
                int score = scores[i];
                if (max < score) {
                    max = score; // меняем текущий максимум
                    index = i;
                }
            }
        }

        // создание нового массива
        {
                int[] sales = {1_000, 2_000};
            // .length
            // чтобы добавить новую
            int[] newSales = new int[sales.length + 1];
            for (int i = 0; i < sales.length; i++) {
                newSales[i] = sales[i];
            }

            System.arraycopy(sales, 0, newSales, 0, sales.length);
        }
    }
}
