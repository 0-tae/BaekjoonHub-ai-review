import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t=1;t<=T;t++){
            StringTokenizer s=new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(s.nextToken());
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());
            sb.append("#").append(t).append(" ")
                    .append(Math.min(a,b)).append(" ").append(Math.max(0,a+b-N))
                    .append("\n");
        }

        System.out.println(sb);
    }
}