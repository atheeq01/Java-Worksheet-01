import java.util.Scanner;
import java.util.StringTokenizer;
//have 3 methods

public class naming {
    public static void main(String[] args) {
        /*-------------Mtd 1-----------------
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("Enter the full name in the format first middle last : ");
        word = input.nextLine();
        int first=word.indexOf(" ");
        int last=word.lastIndexOf(" ");
        System.out.println(word.substring(last+1)+", "+word.substring(0,first)+" "+word.charAt(first+1));
        input.close();*/

        /*-------------Mtd 2-----------------*/
        Scanner input = new Scanner(System.in);
        String word ;
        String[] max=new String[3];
        int i=0;
        StringTokenizer st;
        do{
            System.out.println("Enter the full name in the format first middle last : ");
            word = input.nextLine();
            st=new StringTokenizer(word," ");
            if (st.countTokens()!=3){
                System.out.println("invalid name.");
            }
        }while(st.countTokens()!=3);
        while(st.hasMoreTokens()){
            max[i]= st.nextToken();
            i++;
        }
        System.out.println(max[2]+", "+max[0]+" "+max[1].charAt(0));
        input.close();

        /*-------------Mtd 3-----------------
        Scanner input = new Scanner(System.in);
        String word ;
        String[] max=new String[3];
        System.out.println("Enter the full name in the format first middle last : ");
        word = input.nextLine();
        max=word.split(" ");
        System.out.println(max[2]+", "+max[0]+" "+max[1].charAt(0));*/
    }
}
