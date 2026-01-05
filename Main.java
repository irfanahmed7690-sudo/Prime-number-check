public class Main {
  public static void main(String[] args) {
    int n = 0;
    if(n <= 1) { //First condition to be a prime number
    
      System.out.println("Invalid number");
      
      return; //stop
    
    }
    
    int i = 2;
    boolean isPrime = true;
    
    while(i <= n / 2) { // 2 <= 1, 3 <= 3
    
      if(n % i == 0) { // 7 % 2 != 0, 7 % 3 != 0
      
        isPrime = false;
      
      }
      
      i++;
    
    }
    
    if(isPrime) {
    
      System.out.println("Prime");
    
    } else {
    
      System.out.println("Not a prime");
    
    }

    System.out.println("Thanks for practice");
    System.out.println("Ghola pani");
    
    
  }
}