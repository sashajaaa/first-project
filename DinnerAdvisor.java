public class DinnerAdvisor {

    void getAdvice(double moneyBeforeSalary, int daysBeforeSalary) {
        if (moneyBeforeSalary < 3000) {
            System.out.println("������� ����� ������ ����. ���������, � �� �������� �� ��������!");
        } else if (moneyBeforeSalary < 10000) {
            if (daysBeforeSalary < 10) {
                System.out.println("����, ���� � ������!");
            } else {
                System.out.println("������� ����� ������ ����. ���������, � �� �������� �� ��������!");
            }
        } else if (moneyBeforeSalary < 30000) {
            if (daysBeforeSalary < 10) {
                System.out.println("�������! ��������� �������� � ������� ��������� � �������� �����. :)");
            } else {
                System.out.println("����, ���� � ������!");
            }
        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("�������! ����������� ������!");
            } else {
                System.out.println("�������! ��������� �������� � ������� ��������� � �������� �����. :)");
            }
        }
    }
} //nnn