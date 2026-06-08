package SKillLab;

class SumCal {
    int num;

    SumCal(int num) {
        this.num = num;
    }

    int Printing() {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    void display() {
        System.out.println("Sum = " + Printing());
    }
}

public class NaturalNum {
    public static void main(String[] args) {
        int num = 100;
        SumCal ob1 = new SumCal(num);
        ob1.display();
    }
}
