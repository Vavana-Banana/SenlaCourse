package eu.senla.task1;

public class main {


        //Примитивные типы переменных, глобальные
    //Статик чтобы использовать в том же классе что и мейн
        static byte a1Byte;
        static int b1Int;
        static short c1Short;
        static long d1Long;
        static float e1Float;
        static double f1Double;
        static char g1Char;
        static boolean i1Boolean;
//    Классы оболочки reference variables (боксинг )
        static String k1;

        static Byte a2ReferenceByte;
        static Integer b2ReferenceInteger;
        static Short c2ReferenceShort;
        static Long d2ReferenceLong;
        static Float e2ReferenceFloat;
        static Double f2ReferenceDouble;
        static Character i2ReferenceCharacter;

//Запуск программы - компилятору сообщает откуда через статик воид мейн
        public static void main(String[] args) {

        numbers Numbers = new numbers();

//        локальные переменные
        byte aByteLocal  =  5;
                System.out.println(aByteLocal);
        int bIntLocal = 1234;
                System.out.println(bIntLocal);
                aByteLocal = (byte) bIntLocal;
                System.out.println(aByteLocal);
                bIntLocal = aByteLocal;
                System.out.println(bIntLocal);
        short cShortLocal = (short) 21111;
                System.out.println(cShortLocal);
                cShortLocal = aByteLocal;
                System.out.println(cShortLocal);


                Numbers.setaByte((byte)4);
                System.out.println("class byte " + Numbers.getaByte());

                Numbers.setcInt(bIntLocal);
                System.out.println("class int " + Numbers.getcInt());
//        int ;
//        short ;
//        long ;
//        float ;
//        double ;
//        char ;
//        boolean ;
//
//        String ;
//        Byte ;
//        Integer ;
//        Short ;
//        Long ;
//        Float ;
//        Double ;
//        Character ;

//            Integer i3 = 220;
//            Integer in = new Integer(150);
//            System.out.println("Hello World!");
//            System.out.println(i3);
//            System.out.println(in);
            //Operation other_class = new Operation();


        }
    }

