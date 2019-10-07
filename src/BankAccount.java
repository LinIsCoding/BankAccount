import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankAccount implements Comparable<BankAccount>, Measurable{
    private float balance;
    private float rate;

    // constructor
    public BankAccount(float balance, float rate) {
        this.balance = balance;
        this.rate = rate;
    }
    public BankAccount(float rate){
        this.balance = 0;
        this.rate = rate;
    }

//    public void processYear(float balance, float rate) {
//        float interest = this.balance * this.rate;
//        this.balance = this.balance + interest;
//        System.out.println("balance after one year is: " + this.balance);
//    }
//
//    public void processNYears(int n){
//        int i = 0;
//        while (i < n) {
//            float interest = this.balance * this.rate;
//            this.balance = this.balance + interest;
//            i = i + 1;
//        }
//        System.out.println("balance after two years is: " + this.balance);
//    }

    @Override
    public String toString() {
        return "The balance is: " + this.balance;
    }

    @Override
    public int compareTo(BankAccount b) {
        if (this.balance > b.balance) return 1;
        else if (this.balance == b.balance)return 0;
        else return -1;
    }

    /**
     * helper method
     * @param arr the array of BankAccount
     * @param i one of index to be swapped
     * @param j another index to be swapped
     */
    private static void swap(BankAccount[] arr, int i, int j){
        BankAccount temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public float getMeasure() {
        return this.balance;
    }

    public static void main(String [] args) {
        BankAccount account = new BankAccount(1000, .1f);
        BankAccount account2 = new BankAccount(.1f);
        BankAccount account3 = new BankAccount(2000, .1f);
        BankAccount[] list = {account, account2, account3};
        Arrays.sort(list);
        List<Measurable> list1 = new ArrayList<>();
        for (BankAccount b : list) {
            System.out.println(b);
            list1.add(b);
        }
        System.out.println(Measurable.average(list1));
    }
}
