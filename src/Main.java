public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // начальный баланс
        int replenishmentOfTheBalance = 1100; // пополнение баланса
        int totalBalance = initialBalance + replenishmentOfTheBalance; //общий баланс
        int bonus;
        if (totalBalance > 1000) {
            bonus = ((totalBalance - initialBalance) / 100);
        } else {
            bonus = 0;
        }
        System.out.println("Начисленно бонусов " + bonus);
        System.out.println("Ваш баланс " + (bonus + totalBalance) + " рублей");
    }
}