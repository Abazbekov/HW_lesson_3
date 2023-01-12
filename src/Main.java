public class Main {
    public static void main(String[] args) {

         double []numbers = {1.2, 3.4, -6.4, 5.3, 12.4, -7.5, 3.7, 9.0, 8.0, 123.3, 12.9, 8.7, 12.9, 5.6, 7.8};
         double count = 0;
         int amount = 0;
         boolean isNegative = false;
        for (double element:numbers) {
            if (element < 0){
                isNegative = true;

            } else if (element > 0 && isNegative) {
                count = element;
                amount ++;
                System.out.println(element);
            }

        }
        System.out.println("Среднее арифметическое число" + count/amount);
    }
}