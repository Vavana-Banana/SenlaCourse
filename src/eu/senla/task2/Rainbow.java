package eu.senla.task2;
import java.util.Scanner;



public class Rainbow {



     void getColor(int nColor)    {

        //сравниваем введенное число с цветом
    switch (nColor){
        case 1:
            System.out.println("Red");
            break;
        case 2:
            System.out.println("Orange");
            break;
        case 3:
            System.out.println("Yellow");
            break;
        case 4:
            System.out.println("Green");
            break;
        case 5:
            System.out.println("Blue");
            break;
        case 6:
            System.out.println("Indigo");
            break;
        case 7:
            System.out.println("Violet");
            break;
        default:
            System.out.println("Error");

    }
    }
    void getTwoColor(int nColor1,int nColor2){
         String col1 = null;
         String col2 = null;

         if (nColor1 == 1)  {
             col1 = "Red";

         }
         else if (nColor1 == 2){
             col1 = "Orange";
         }
         else if (nColor1 == 3){
             col1 = "Yellow";
         }
         else if (nColor1 == 4){
             col1 = "Green";
         }
         else if (nColor1 == 5){
             col1 = "Blue";
         }
         else if (nColor1 == 6){
             col1 = "Indigo";
         }
         else if (nColor1 == 7){
             col1 = "Violet";

         } else {
             System.out.println("Error");
         }

        if (nColor2 == 1)  {
            col2 = "Red";

        }
        else if (nColor2 == 2){
            col2 = "Orange";
        }
        else if (nColor2 == 3){
            col2 = "Yellow";
        }
        else if (nColor2 == 4){
            col2 = "Green";
        }
        else if (nColor2 == 5){
            col2 = "Blue";
        }
        else if (nColor2 == 6){
            col2 = "Indigo";
        }
        else if (nColor2 == 7){
            col2 = "Violet";

        } else {
            System.out.println("Error");
        }
        System.out.println(col1 + "-" + col2);

    }

}
