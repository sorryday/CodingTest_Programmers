import java.util.HashMap;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {        
        HashMap<String,Integer> map = new HashMap<String,Integer>()
        {
            {
                put("6",1);
                put("5",2);
                put("4",3);
                put("3",4);
                put("2",5);
                put("1",6);
                put("0",6);
            }
        };
        
        int correct = 0;
        int zero = 0;
        
        String f, l;
        int first, last;
        
        for(int i=0; i<6; i++)
        {
            for(int j=0; j<6; j++)
            {
                if (win_nums[i] == lottos[j])
                    correct += 1;
            }
        }
        
        l = Integer.toString(correct);
        last = map.get(l);
        
        for(int k=0; k<6; k++)
        {
            if(lottos[k] == 0)
                zero += 1;
        }
        
        f = Integer.toString(correct + zero);
        first = map.get(f);
        
        int[] answer = {first, last};
        
        return answer;
    }
}