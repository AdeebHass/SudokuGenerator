import java.util.ArrayList;
public class SudokuGenerator
{   public static char[][] Board = new char[9][9];
    public static void main(String[] args)
    {
        ArrayList<Integer> Sequence =  new  ArrayList<Integer>();
        randomize(Sequence);
            int count = 0;
            for(int i = 0;  i < Board.length; i++){
                add(i, Sequence);
                shift(Sequence, i);
                 count++;
                for(int m = 0; m < Board[0].length; m++){
                    System.out.print(Board[i][m]);
                    System.out.print(" ");
                    if((m + 1) % 3 == 0 ) {
                        System.out.print("|");
                        }
                    }
                    System.out.println();
                    if(count % 3 == 0 ){
                        for(int j = 0; j < 21; j++){
                            System.out.print("-");
                            }
                            System.out.println();
                        }
                }
            
    }
    public static  ArrayList<Integer> randomize( ArrayList<Integer> orgin){
        for(int  i = 0; i < 9; i++ ){
            int rand = (int)(Math.random() * 9) + 1;
            orgin.add(rand);
            int count1 = 0;
            for(int m = 0; m < orgin.size(); m++){
                if(orgin.get(m).equals(rand)){
                    count1++;
                    }
                if (count1 > 1){
                        orgin.remove(orgin.size() - 1);
                        i--;
                        break;
                        } 
                }
            }
            return orgin;
        
        }
        public static void add  (int row, ArrayList<Integer> addition){
            for(int k = 0; k < addition.size(); k++){
                Board[row][k] = (char)(addition.get(k) + '0');
                }
            }
            public static void shift (ArrayList<Integer> old, int row){
                if((row + 1) % 3 != 0 || (row + 1) == 9){
                    for(int i = 0; i < 3; i++){
                        int temp =  old.get(0);
                        old.remove(0);
                        old.add(temp);
                        }
                    }
                    else{
                        int temp =  old.get(0);
                        old.remove(0);
                        old.add(temp);
                        }
                } 

}
