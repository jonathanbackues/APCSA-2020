package ConsumerLab;

import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
 
  
  private static final String SPACE = " ";
  
  static{
    try {
      Scanner input = new Scanner(new File("src/ConsumerLab/cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("src/ConsumerLab/negativeAdjectives.txt"));
      while(input.hasNextLine()){
    	  String temp = input.nextLine().trim();
          System.out.println(temp);
          negAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }
  
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }
   /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }
    
    return word;
  }
  
    //Finds the sentiment of each word and adds it up to find the total sentiment of the whole file
  public static double totalSentiment(String fileName)
  {
      
      String reviewText = textToString(fileName);

      String word = "";
      String punctuation = "";
      double sentValue = 0.0;
      
      for(int i = 0; i < reviewText.length(); i++)
      {
         
         String letter = reviewText.substring(i, i+1);
         
         if (!(letter.equals(" ")))
         {
            word += letter;
         }
         
         
         else
         {
            removePunctuation(word);
            sentValue += sentimentVal(word);
            word = "";
         }
      }
      
      return sentValue;
  }
  
   // This method takes the sentiment of the whole file and assigns it a star rating from 1 to 5
  public static int starRating(String fileName)
  {
    String reviewText = textToString(fileName);
    double sentiment = totalSentiment(fileName);
    int rating;
    
    if(sentiment < -3)
    {
       rating = 1;
    }
    
    else if(sentiment < 0)
    {
       rating = 2;
    }
    
    else if(sentiment < 3)
    {
       rating = 3;
    }
    
    else if(sentiment < 6)
    {
       rating = 4;
    }
    
    else
    {
       rating = 5;
    }
    
    return rating;
  }


  /*
  This method replaces the starred adjectives with a random adjective.
  */
  public static String fakeReview(String fileName)
  {
    int beginInd = 0;
    int endInd = 0;
    String adj = "";
    String newAdj = "";
    String reviewText = textToString(fileName);
    
    while (reviewText.indexOf("*") > -1)
    {
        beginInd = reviewText.indexOf("*");
      
        //cycles through the rest of the review once * is found for the next space
        for(int j = beginInd; j < reviewText.length(); j++) 
         {
            if(reviewText.substring(j, j + 1).equals(" "))
            {
               endInd = j;
               break;
            }
            else
            {
               endInd = reviewText.length();
            }
         } 
      

        adj = reviewText.substring(beginInd, endInd);
        newAdj = randomAdjective();
        reviewText = reviewText.replace(adj, newAdj);
       
    }
    return reviewText;
  }

  /*
  This method does the same as the fakeReview() method BUT
  It replaces the negative adjectives with a negative adjective with a lower (more negative) sentiment value AND
  It replaces the positive adjectives a positive adjective with a higher (more positive) sentiment value.
  */
  public static String fakeReviewStronger(String fileName)
  {
    int beginInd = 0;
    int endInd = 0;
    String adj = "";
    String nadj = "";
    String newAdj = "";
    String newerAdj = "";
    String reviewText = textToString(fileName);

    
    while (reviewText.indexOf("*") > -1)
    {
        beginInd = reviewText.indexOf("*");
    
        for(int j = beginInd; j < reviewText.length(); j++)
         {
            if(reviewText.substring(j, j + 1).equals(" "))
            {
               endInd = j;
               break;
            }
            else
            {
               endInd = reviewText.length();
            }
         } 
      
        adj = reviewText.substring(beginInd, endInd);
        nadj = reviewText.substring(beginInd+1, endInd);

        double adjSent = sentimentVal(nadj);

        if(adjSent > 0)
        {
         newAdj = randomPositiveAdj();
         double newAdjSent = sentimentVal(newAdj);
         while(newAdjSent > adjSent)
         {
            newerAdj = randomPositiveAdj();
            newAdjSent = sentimentVal(newerAdj);
         }
        }
        else
        {
         newAdj = randomNegativeAdj();
         double newAdjSent = sentimentVal(newAdj);
         while(newAdjSent > adjSent)
         {
            newerAdj = randomNegativeAdj();
            newAdjSent = sentimentVal(newerAdj);
         }
        }
 
        reviewText = reviewText.replace(adj, newAdj);
       
    }
    return reviewText;
  }
}


