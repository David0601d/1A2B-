import java.util.Random;
import java.util.Scanner;
public class Demo1 {
    // �D�{�� 
    public static void main(String[] args) { 
        Boolean isTrue = true;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int correct = 0, wrong = 0; 
        int[] user = new int[4]; 
        int[] answer = new int[4]; 

        
        System.out.println("��J�|�ӼƦr�C�p�G�q��@�ӼƦr�B��m�ۦP�A�h�o1A�C�p�G�q��@�ӼƦr�A���O��m���P�A�h�o1B�C�ؼЬO�o4A�C");
        for(int i=0; i<4; i++){
            //�üƤ��୫��
            answer[i] = random.nextInt(10);
            //�ˬd�üƬO�_����
            for(int j=0; j<i; j++){
                while(answer[j] == answer[i]){//�ˬd�O�_�P�e�����ͪ��ƭȵo�ͭ��ơA�p�G���N���s����
                    j = 0;//�p�����ơA�N�ܼ�j�]��0�A�A���ˬd (�]���٬O�����ƪ��i��)
                    answer[i] = random.nextInt(10); //���s���͡A�s�^�}�C�A�üƪ��d��O1~9
                }       
            }
        }
       System.out.print("�ѵ��G");
        //��Xansewr
       for(int i=0; i<4; i++){
           System.out.print(answer[i] + " ");
       }
       System.out.println();
        
        
        
        while(isTrue){
        
            System.out.print("�п�J4�ӼƦr(�����n�Ů�) ");
            for(int i=0; i<4; i++){
                user[i] = sc.nextInt();
            }
            //����user�}�C�n�Manswer�}�C�����
            for(int i=0; i<4; i++){
                if(user[i] == answer[i])
                    correct ++;  //�p�G�q��@�ӼƦr�B��m�ۦP�A�h�o1A
                else{
                    for(int j=0; j<4; j++){
                        if(user[i] == answer[j] ){ //�Manswer��4�Ӥ����@�ӭӤ� ���ۦP���Nwrong+1
                            wrong ++;    //�p�G�q��@�ӼƦr�A���O��m���P�A�h�o1B
                        }
                    }     
                }
            }        
            System.out.println(correct + "A" + wrong + "B");   
            if(correct == 4){
                isTrue = false;
                System.out.println("�C����ӡI");   
                
            }
            correct = 0;
            wrong = 0;
            

            
        }
    }
}