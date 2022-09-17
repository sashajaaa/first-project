public class Praktikum {
    public static void main(String[] args) {
        double[] expenses = new double[7]; // ������ ����� ����� ������ ������

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� � ��� �������� �� ��������?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("������� ���� �� ��������?");
        int daysBeforeSalary = scanner.nextInt();
        
        Converter converter = new Converter(78.5,88.7,0.75);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager(); // ����� �������� ������ ������ ExpensesManager
        
        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("���� ����������: " + moneyBeforeSalary + " RUB");
                System.out.println("� ����� ������ ������ ��������������? ��������� ��������: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                System.out.println("�� ����� ���� �� ������ ������ �����: 1-��, 2-��, 3-��, 4-��, 5-��, 6-��, 7-��?");
                int day = scanner.nextInt();
                System.out.println("������� ������ �����:");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense, day);
            } else if (command == 4) {
                expensesManager.printAllExpenses();
            } else if (command == 5) {
                System.out.println("����� ������� ����� �������� �� ���� ������ ��������� " + expensesManager.findMaxExpense() + " ���.");
            } else if (command == 0) {
                System.out.println("�����");
                break;
            } else {
                System.out.println("��������, ����� ������� ���� ���.");
            }
        }
    }
    
    // ���������� � ExpensesManager ��� ������� saveExpense, findMaxExpense � printAllExpenses

    
        
        // ������ �������� � ���������� ������� �������� � ������ Praktikum


        
    public static void printMenu() {
        System.out.println("��� �� ������ �������? ");
        System.out.println("1 - �������������� ������");
        System.out.println("2 - �������� �����");
        System.out.println("3 - ������ �����");
        System.out.println("4 - �������� ����� �� ������");
        System.out.println("5 - �������� ����� ������� ����� �������� �� ������");
        System.out.println("0 - �����");
    }
}