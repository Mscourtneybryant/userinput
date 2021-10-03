public class userinput {
   
        public static void main(String[] args) {
            
  
            
              int count;
              int num1 = 0;
              int num2 = 1;
                System.out.println("Enter a number for the sequence:");
                Scanner scan = new Scanner(System.in);
                count = scan.nextInt();
               
                System.out.print("Your fibonacci Series of "+count+" numbers is:");
    
                int i=1;
                while(i<=count)
                {
                    System.out.print(num1+" ");
                    int sumOfPrevTwo = num1 + num2;
                    num1 = num2;
                    num2 = sumOfPrevTwo;
                    i++;
                }
            
            
            
            
            

                int n;
                int copy;
                int remainder;
                int sum=0;
                System.out.println("Enter a number and the system will determine if it's an armstrong number: ");
                
                    n=scan.nextInt();
                               copy=n;
                              while(copy!=0)
                              {
                remainder=copy%10;
                      sum=sum+remainder*remainder*remainder;
                        copy=copy/10;
                    }
                
                if(sum==n)
                        System.out.println(n+" is an Armstrong number");
                    else
                        System.out.println(n+" is not an Armstrong number");
                
                
               
  
                scan.nextLine();
             
             System.out.println("Enter a word to find out if it's a palindrome: ");
              
                String origString = scan.nextLine();
                String reverseString = "";
                 
                char[] characters = origString.toCharArray();
         
                for( int p = characters.length - 1 ; p >= 0 ; p-- ) {
                    reverseString = reverseString + characters[p];
                }
         
   
                if (origString.equals(reverseString)) {
                    System.out.println("This string is a palindrome.");
                } else {
                    System.out.println("This string is not a palindrome.");
                }
                
                
                
                scan.close();
        }
    
    }  

