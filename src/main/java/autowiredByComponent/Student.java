package autowiredByComponent;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Component
@Scope("singleton")
public class Student implements People{
    private int count=0;

    public void dinner() {
        System.out.println("student begin eat dinner");
    }

    public void printCount(){
        System.out.println("-------"+count++);
    }

    public static void main(String[] args) {
        String s="()(()())((((())";


        int[] flag=new int[s.length()];
        for(int i=0;i<flag.length;i++){
            flag[i]=0;
        }

        boolean have=true;
        while(have) {
            have=false;
            for (int j = 1; j < flag.length; j++) {

                if (s.charAt(j) == ')' &&flag[j]!=1) {

                    for(int m=j-1;m>=0;m--){
                        if(flag[m]!=1&&s.charAt(m)=='('){
                            flag[j]=1;
                            flag[m] = 1;
                            have = true;

                            break;
                        }
                    }

                }


            }
        }
        for (int i : flag) {
            System.out.println(i);
        }

        int length = 0;
        int max = 0;
        for(int i=0;i<flag.length;i++){
            if(flag[i] == 1){
                length++;
                continue;
            }
            if (length > max){
                max = length;
            }
            length=0;
        }
        if (length > max){
            max = length;
        }
        System.out.println(max);






    }
}
