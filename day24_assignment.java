import java.util.Scanner;

public class day24_assignment {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
// Q93 String Rotation :
    System.out.println("enter first string:");
    String str1 = sc.nextLine();
    System.out.println("enter second string:");
      String str2 = sc.nextLine();
    if(str1.length( )==str2.length()&& (str1+str2).contains(str2)){
  System.out.println("string is a rotation ");
         }

    else  {
    System.out.println("string is not a roation ");
    }
    System.out.println("-----------------------NEXT-------------------------");
// Q94 string compression :
 System.out.println("enter a string to compress ");
 String str3 = sc.nextLine();
String compressed = "";
        int count = 1;

        for (int i = 0; i < str3.length() - 1; i++) {
            if (str3.charAt(i) == str3.charAt(i + 1)) {
                count++;
            } else {
                compressed += str3.charAt(i);
                compressed += count;
                count = 1;
            }
        }

        compressed += str3.charAt(str3.length() - 1);
        compressed += count;

        System.out.println("Compressed String = " + compressed);
System.out.println("------------NEXT-----------");

// Q94 - longest word in a sentence 

System.out.println("enter  a sentence");
String str4 = sc.nextLine();
String[] words= str4.split(" ");
String longest = words[0] ;
for( int i=0 ;i < words.length;i++){
    if( words[i].length() > longest.length()){
        longest = words[i];
    }
}
System.out.println("longest word =" + longest);
System.out.println("lenght ="+ longest.length());

System.out.println("--------------NEXT------------");
// Q95 Program to remove duplicate characters :
System.out.println(" enter a string to remove duplicate characters");
String str5  = sc.nextLine();
String result = "" ;
 for (int  i=0; i< str5.length(); i++)
{ char ch  = str5.charAt(i);
if(!result.contains(String.valueOf(ch)))
{ result += ch ;

}
}
System.out.println("after removing duplicates " + result);







sc.close();
    }
    }







