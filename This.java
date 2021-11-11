public class This {
    private int num1, num2, num3;

    public void setNum(int num) {
        this.num1 = num;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void setNum3(int num3) {
        this.num3 = num3;
    }
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public int getNum3() {
        return num3;
    }

    public int soma(int num4) {
        return this.num1 + this.num2 + this.num3 + num4;
    }
}
