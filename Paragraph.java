/**
__________________________________________________________________________________________________________________
Name: Anjan Pandey                                                                                                |
                                                                                                                  |
Date: 01/10/2014                                                                                                  |                                                                                             |
                                                                                                                  |
Submitted to: Dr. Cordova                                                                                         |
                                                                                                                  |
Program Disription: This program uses arraylist to format the paragraph from a file. The paragraph is             |
left formated, right formated, and finally trim. The trim method is used to remove the unnecessary non            |
alphabetic characters, numbers, and punctuation. The method also remove the words which are less then minLength.  |
Some of the methods like boolean readparagraph reads the string from the file. Once it is done, it reads      |
the strings in the arraylist until it hits end_of_data. After it hits end_of_data it is going to throw an         |
exception.                                                                                                        |
__________________________________________________________________________________________________________________|
*/
import java.io.*;
import java.util.*;
 

public class Paragraph
{
   
   ArrayList<String>words_list;
   
/**The first constructor of the program, Paragraph, is used to initialize the empty list of the words by using
the arraylist.
*/    
   public Paragraph()
   {  
      words_list = new ArrayList<String>();
   }
   
/**The second constructor of the program uses for loop to passed all the strings in the array. 
The constructor ends by adding all the strings to an aaray list name words_list. 
*/   
   public Paragraph(String[] array)
   {
      words_list = new ArrayList <String> ();
      for ( int i = 0; i < array.length ; i++)
      {
         words_list.add(array[i]);
      }
   }
   
/**The method, readParagraph, adds all the words contained in the file to an array list. The scanner is used to
read the strings from the file given by the user. The boolean method hasNext is ued to scan the next string.
The program is going to store the string untill it hits end_of_data. If the file is open successfully the method
is returning true, otherwise, the try-catch is going to handle an exception called IOException and display the
message to aware the user that the exception has occured and hence returns false.

@Param find_true_false returns true if file open sucessfully otherwise false   
*/   
   public boolean readParagraph(String filename)
   {
      String addWord;
      boolean find_true_false = false;
      try
      {
         Scanner fileScan;
         fileScan = new Scanner(new File(filename));
         while (fileScan.hasNext())
         {
         
            addWord = fileScan.next();
            if(!addWord.equalsIgnoreCase("end_of_data"))//If the addWord doesnot read end_of_data then words_list add all the
                                                        //elements from the file. 
            {
               words_list.add(addWord);
            }
            find_true_false = true;
         }
      }
      catch (IOException ex)
      {
         System.out.println("Unable to read the file. Please try again.");
         find_true_false = false;
      }
      return find_true_false;
   }
/** The count method is simple method to return the total number of words stored in the array list
words_list. The total number of the words store is actually equivalent to the list size. It provides
the same value in all cases.

@Param wordsCount returns the total number of words stored in the aaraylist. 
*/ 
   public int count()
   {
      int wordsCount = words_list.size();
      return wordsCount;
   }
   
/**The totalLength method, by using the for loop, obtain the total length of the words stored in the
array list. It does that because the wordslength keep on adding the length of the words after each loop
is executed. Then it finally returns the total length of thw ords to the user. 

@Param wordsLength returns the total length of words stored in the list. 
*/
   
   
   public int totalLength()
   {
      int wordslength = 0;
      for (int i =0; i < words_list.size();i++)
      {
         wordslength += words_list.get(i).length();
      }
      return wordslength;
   }
   
/**The formatLeft method make sure that none of the line is longer then maxWidth. It tries to keep as many
words as possible in each line. Then it is also going to take care of the spaces with in the words in the
paragraph. Finally the method is going to return the formated string called updating_line. 

@Param updating_line returns the left formatted string containing all the words in the Paragraph
*/ 
   
   public String formatLeft(int maxWidth)
   {
      String changing_line ="";
      String updating_line ="";
   
      for (int i = 0; i < words_list.size();i++)
      {
         int wordslength = changing_line.length();
         int wordscount = maxWidth - wordslength;
      
         if (words_list.get(i).length() <= wordscount)
         { 
            changing_line +=words_list.get(i)+ " ";
         
         }
         else 
         {
            changing_line += "\n";
            updating_line += changing_line ;
            changing_line = words_list.get(i)+" ";
         }
      }
      updating_line = updating_line+changing_line;
      return updating_line;
   }
/**The formatRight method make sure that none of the line is longer then maxWidth. It tries to keep as many
words as possible in each line. Then it is also going to take care of the spaces with in the words in the
paragraph. Finally the method is going to return the formated string called Rightline. 

@Param Rightline returns the right formatted string containing all the words in the Paragraph
*/
   public String formatRight(int maxWidth)
   {
      String Right_line = "";
      String Rightline = "";
   
      for (int i = 0; i < words_list.size();i++)
      {
         int Rwordslength = Right_line.length();
         int Rwordscount = maxWidth - Rwordslength;
      
         if (words_list.get(i).length() <= Rwordscount)
         { 
            Right_line +=words_list.get(i)+ " ";
         }
         else
         {
            int space = maxWidth - (Right_line.length()-1);
            String countSpace = "";
            for(int a=0; a<space;a++)
            {
               countSpace += " "; 
            }
            Right_line = countSpace+ Right_line;
            Right_line += "\n";
            Rightline += Right_line;
            Right_line = words_list.get(i)+ " ";
         }
      }
      if (Right_line.length()<=maxWidth)
      {
         String lastSpace="";
         for(int x =0; x<maxWidth-(Right_line.length()-1);x++)
         {
            lastSpace+=" ";
         }
         Right_line = lastSpace+Right_line;
         Rightline+=Right_line;
      }
      else
      {
         Rightline += Right_line;
      }
      return Rightline;
   }
     
/** The method returns a String containing all the words in the paragraph that is left justfiied. The maximum
width is of 80 characters provided within the parenthesis. 

@Param formatLeft returns the String containing all the words in the left justified paragraph
*/
   public String toString()
   {
      return formatLeft(80);
   }
   
/**The trim method is used to remove any non-alphabetic symbols, punctuation, and so on. It is also going to
remove the words which are less then minLength. 
The method is not going to return anyvalue because it is a void method. 
*/
   public void trim(int minLength)
   {
      int WordLength =0;
      String oldWord ="";
      String newWord ="";
      for(int i =0;i<words_list.size();i++)
      {
         oldWord = words_list.get(i);
         WordLength = oldWord.length();
         if(WordLength <= minLength )
         {
            words_list.remove(oldWord);
            i--;
         }
         if(oldWord.charAt(WordLength-1)<'A' || oldWord.charAt(WordLength-1)>'z')
         {
             
            newWord = oldWord.substring(0,WordLength-1);
            if(newWord.length() <= minLength)
            {
               words_list.remove(oldWord);
               i--;
            }
            else
            {
               words_list.set(i,newWord);
            }
                         
         }
      }
   }
}
