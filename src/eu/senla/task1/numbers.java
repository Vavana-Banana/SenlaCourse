package eu.senla.task1;

public class numbers {
    //базовые типы переменных
    private byte a;
    private short b;
    private int c;
    private long d;
    private float e;
    private double g;
    private char f;
    private boolean i;
    private String k;
    private String l = new String();

    public numbers(byte a) {
        this.a = a;
    }

    //Геттеры и сеттеры получение и запись значений в приват переменных
    Byte aByte;

    public byte getA() {
        return a;
    }

    public void setA(byte a) {
        this.a = a;
    }

    public short getB() {
        return b;
    }

    public void setB(short b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public float getE() {
        return e;
    }

    public void setE(float e) {
        this.e = e;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public char getF() {
        return f;
    }

    public void setF(char f) {
        this.f = f;
    }

    public boolean isI() {
        return i;
    }

    public void setI(boolean i) {
        this.i = i;
    }

    public Byte getaByte() {
        return aByte;
    }

    public void setaByte(Byte aByte) {
        this.aByte = aByte;

    }

    public String getK () {
        return k;
    }

    public void setK (String k){
        this.k = k;
    }
}
