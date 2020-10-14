/**
 * Produces random number of asterisks on a number of lines
 * @author Liana Bazzarella
 */
public class Main {

  public static void chaotic( int numberOfLines){
    for( int j = 1; j <= numberOfLines; j++){
      int numberStars = (int)(Math.random()*(5 - 1 + 1))+ 1;
      for( int i = 1; i <= numberStars; i++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
  
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    chaotic(20);
    
  
  }
}
