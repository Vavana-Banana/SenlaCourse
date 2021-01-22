package eu.senla.task1;

public class numbers {
    //базовые типы переменных
    private byte aByte;
    private short bShort;
    private int cInt;
    private long dLong;
    private float eFloat;
    private double gDouble;
    private char fChar;
    private boolean iBollean;
    private String kString;
    private String lString = new String();


    public numbers(byte a) {
        this.a = a;
    }

    //Геттеры и сеттеры получение и запись значений в приват переменных
   //Get для получения из приватной переменной создаем методы get


    public byte getaByte() {
        return aByte;
    }

    public short getbShort() {
        return bShort;
    }

    public int getcInt() {
        return cInt;
    }

    public long getdLong() {
        return dLong;
    }

    public float geteFloat() {
        return eFloat;
    }

    public double getgDouble() {
        return gDouble;
    }

    public char getfChar() {
        return fChar;
    }

    public boolean isiBollean() {
        return iBollean;
    }

    public String getkString() {
        return kString;
    }

    public String getlString() {
        return lString;
    }

    //Set для назначения приватной переменной новое значение создаем методы Set


    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public void setbShort(short bShort) {
        this.bShort = bShort;
    }

    public void setcInt(int cInt) {
        this.cInt = cInt;
    }

    public void setdLong(long dLong) {
        this.dLong = dLong;
    }

    public void seteFloat(float eFloat) {
        this.eFloat = eFloat;
    }

    public void setgDouble(double gDouble) {
        this.gDouble = gDouble;
    }

    public void setfChar(char fChar) {
        this.fChar = fChar;
    }

    public void setiBollean(boolean iBollean) {
        this.iBollean = iBollean;
    }

    public void setkString(String kString) {
        this.kString = kString;
    }

    public void setlString(String lString) {
        this.lString = lString;
    }
}
