package DP;

public class Fib {

    public static void main(String[] args){
        int[] mem = new int[9];
        System.out.println(fib(8, mem));
    }
    
    public static int fib(int n, int mem[]){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        
        if(mem[n] == 0){
            mem[n] = fib(n - 1, mem) + fib(n - 2, mem);
        }
        
        return mem[n]; 
    }
}
