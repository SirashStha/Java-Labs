package lab2;

public class Money {
    private int rupee, paisa;
    private int carry   = 0;

    public void setMoney(int rupee, int paisa) {
        this.rupee = rupee;
        this.paisa = paisa;
    }

    public void displayMoney() {
        System.out.println("Money: "+rupee+" rupees "+paisa+" paisa");
    }

    public void addMoney(Money m1, Money m2) {
        this.paisa = m1.paisa + m2.paisa;
        carry = this.paisa/100;
        this.paisa %= 100;
        this.rupee = m1.rupee + m2.rupee + carry;

    }
}
