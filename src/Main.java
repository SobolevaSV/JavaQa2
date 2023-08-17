public class Main {
    public static void main(String[] args) {
        int balanceOpen = 100; // начальный остаток на счете клиента
        int refill = 1001; // сумма пополнения
        int bonus; // переменная бонусных рублей
        if (refill > 1000) {
            bonus = refill / 100; // сумма бонусных рублей при пополнении на сумму больше 1000 рублей
        } else {
            bonus = 0; // сумма бонусных рублей при пополнении на сумму 1000 рублей и менее
        }
        int balanceClose = balanceOpen + refill + bonus; // конечный остаток на счете клиента
        System.out.println("За пополнение счета начислено " + bonus + " бонусных рубль(я/ей).");
        System.out.println("Итого на счете " + balanceClose + " рубль(я/ей).");
    }
}