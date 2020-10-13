/**
 *
 * @author Liana Bazzarella
 */
public class Main {

  public static void chaotic(int numberOfLines){
    for(int i = math.random(); i <= 5; i++)
      System.out.print("*");
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    chaotic(5);
  }
}
