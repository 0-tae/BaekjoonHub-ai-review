class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int A = a;
        int B = b;
        
        while(!(Math.min(A,B) % 2 == 1 && 
              Math.max(A,B) - Math.min(A,B) == 1)){
            
            A = getNextOrder(A);
            B = getNextOrder(B);
            answer++;
        }

        return answer;
    }
    
    public int getNextOrder(int num){
        if(num % 2 != 0){
            num = num+1;
        }
        
        return num / 2;
    }
}