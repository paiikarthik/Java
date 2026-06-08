package SKillLab;

class Hello {

    String str;

    void setVars(String s) {
        str = s;
    }

    void display() {
        System.out.println(str);
    }
}

public class HelloWord {
    public static void main(String[] args) {

        String s = "Hello, Good Morning";

        Hello ob1 = new Hello();
        ob1.setVars(s);
        ob1.display();
    }
}
