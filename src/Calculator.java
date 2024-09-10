public class Calculator {
    public int calculator(int a ,int b,char operator) {
    int resulte = 0;
        switch (operator) {
            case '+':
                resulte = a + b;
                break;
            case '-':
                resulte = a - b;
                break;
            case '*' :
                resulte = a * b;
                break;
            case '/':
                resulte = a / b;
                break;
        }
        return resulte;
    }
}
