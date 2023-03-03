package Es1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1
        int[] v = new int[10];
        for(int i=0;i<10; ++i) v[i] = i;

        //2
        for(int i=0;i<10; ++i) System.out.print(v[i]+" "); System.out.println();

        //3
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i!=j) if(v[i]<v[j]){
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
        int max = v[v.length-1];

        //4
        int min = v[0];

        //5
        int media = Arrays.stream(v).sum()/v.length;

        //6
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i!=j) if(v[i]<v[j]){
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }

        //7
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i!=j) if(v[i]>v[j]){
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }

        //8
        for(int n:v){
            boolean c = n > 1;
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    c = false;
                    break;
                }
            }
            if(c) System.out.println(n);
        }
    }
}