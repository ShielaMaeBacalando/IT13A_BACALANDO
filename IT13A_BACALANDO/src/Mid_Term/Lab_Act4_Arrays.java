
package Mid_Term;

/**
 *
 * @author Bacalando
 */
public class Lab_Act4_Arrays {
    public static void main(String[] args) {
        
//Single Array
              char letters[] ={'A','B','C','D','E','F','G'};
        
        for(int i=0; i < letters.length; i++){
              System.out.print(letters[i] + " ");
        }
        System.out.println();
        
//Multi-dimentional Array
        int numbers[][]={
                           {1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12}
        };
        
        for(int x=0; x<numbers.length; x++){
            System.out.print("The Elements in Row " + (x+1) + ": ");
            for(int y=0; y<numbers[x].length;y++){
                System.out.print(numbers[x][y] + " ");
            }
            System.out.println();
        }
        
        
    }
    
}
