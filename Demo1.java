import java.util.Random;
import java.util.Scanner;
public class Demo1 {
    // 主程式 
    public static void main(String[] args) { 
        Boolean isTrue = true;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int correct = 0, wrong = 0; 
        int[] user = new int[4]; 
        int[] answer = new int[4]; 

        
        System.out.println("輸入四個數字。如果猜對一個數字且位置相同，則得1A。如果猜對一個數字，但是位置不同，則得1B。目標是得4A。");
        for(int i=0; i<4; i++){
            //亂數不能重複
            answer[i] = random.nextInt(10);
            //檢查亂數是否重複
            for(int j=0; j<i; j++){
                while(answer[j] == answer[i]){//檢查是否與前面產生的數值發生重複，如果有就重新產生
                    j = 0;//如有重複，將變數j設為0，再次檢查 (因為還是有重複的可能)
                    answer[i] = random.nextInt(10); //重新產生，存回陣列，亂數的範圍是1~9
                }       
            }
        }
       System.out.print("解答：");
        //輸出ansewr
       for(int i=0; i<4; i++){
           System.out.print(answer[i] + " ");
       }
       System.out.println();
        
        
        
        while(isTrue){
        
            System.out.print("請輸入4個數字(中間要空格) ");
            for(int i=0; i<4; i++){
                user[i] = sc.nextInt();
            }
            //接著user陣列要和answer陣列做比對
            for(int i=0; i<4; i++){
                if(user[i] == answer[i])
                    correct ++;  //如果猜對一個數字且位置相同，則得1A
                else{
                    for(int j=0; j<4; j++){
                        if(user[i] == answer[j] ){ //和answer的4個元素一個個比 有相同的就wrong+1
                            wrong ++;    //如果猜對一個數字，但是位置不同，則得1B
                        }
                    }     
                }
            }        
            System.out.println(correct + "A" + wrong + "B");   
            if(correct == 4){
                isTrue = false;
                System.out.println("遊戲獲勝！");   
                
            }
            correct = 0;
            wrong = 0;
            

            
        }
    }
}