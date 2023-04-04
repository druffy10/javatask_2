public class Main {
    public static void main(String[] args) {
        int costTicket = 10500;
        int milesPerRub = 20;
        int bonusMiles = costTicket / milesPerRub;

        System.out.println("Количество бонусных миль: " + bonusMiles);
    }
}