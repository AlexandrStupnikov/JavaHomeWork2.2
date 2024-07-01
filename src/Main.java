public class Main {
    public static void main(String[] args) {

        int initial_Balance = 100; // начальный баланс
        int replenishment_Of_The_Balance = 1100; // пополнение баланса
        int total_Balance = initial_Balance + replenishment_Of_The_Balance; //общий баланс
        int bonus;
        if (total_Balance > 1000) {
            bonus = ((total_Balance - initial_Balance) / 100);
        } else {
            bonus = 0;
        }
        System.out.println("Начисленно бонусов " + bonus);
        System.out.println("Ваш баланс " + (bonus + total_Balance) + " рублей");
    }
}