import java.util.ArrayList;

public class Scrabble {
  public static void main (String[] args) {}

  public Integer scoreScrabble (String word) {
  // char[] scrabbleArray = word.toCharArray();
  String[] scrabbleArray = word.split("");
  System.out.println(scrabbleArray[0]);
  Integer score = 0;
  for (Integer index=0; index < scrabbleArray.length; index++){
      if (scrabbleArray[index] == "a" || scrabbleArray[index] == "e" ||
      scrabbleArray[index] == "i" || scrabbleArray[index] == "o" ||
      scrabbleArray[index] == "u" || scrabbleArray[index] == "l" ||
      scrabbleArray[index] == "n" || scrabbleArray[index] == "r"||
      scrabbleArray[index] == "s" || scrabbleArray[index] == "t") {
        score++;
      }
    }
  return score;
  }
}