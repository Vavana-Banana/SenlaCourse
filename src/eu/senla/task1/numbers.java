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
    //Оберточные переменные reference variables

    private String referenceString;
    private Byte referenceByte;
    private Short referenceShort;
    private Integer referenceInteger;
    private Long referenceLong;
    private Character referenceCharacter;
    private Float referenceFloat;
    private Double referenceDouble;
    private Boolean referenceBoolean;




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

    //get for reference variables


    public String getReferenceString() {
        return referenceString;
    }

    public Byte getReferenceByte() {
        return referenceByte;
    }

    public Short getReferenceShort() {
        return referenceShort;
    }

    public Integer getReferenceInteger() {
        return referenceInteger;
    }

    public Long getReferenceLong() {
        return referenceLong;
    }

    public Character getReferenceCharacter() {
        return referenceCharacter;
    }

    public Float getReferenceFloat() {
        return referenceFloat;
    }

    public Double getReferenceDouble() {
        return referenceDouble;
    }

    public Boolean getReferenceBoolean() {
        return referenceBoolean;
    }
    // set for reference variables


    public void setReferenceString(String referenceString) {
        this.referenceString = referenceString;
    }

    public void setReferenceByte(Byte referenceByte) {
        this.referenceByte = referenceByte;
    }

    public void setReferenceShort(Short referenceShort) {
        this.referenceShort = referenceShort;
    }

    public void setReferenceInteger(Integer referenceInteger) {
        this.referenceInteger = referenceInteger;
    }

    public void setReferenceLong(Long referenceLong) {
        this.referenceLong = referenceLong;
    }

    public void setReferenceCharacter(Character referenceCharacter) {
        this.referenceCharacter = referenceCharacter;
    }

    public void setReferenceFloat(Float referenceFloat) {
        this.referenceFloat = referenceFloat;
    }

    public void setReferenceDouble(Double referenceDouble) {
        this.referenceDouble = referenceDouble;
    }

    public void setReferenceBoolean(Boolean referenceBoolean) {
        this.referenceBoolean = referenceBoolean;
    }

    public void setaByte(int aByte) {
    }
}
