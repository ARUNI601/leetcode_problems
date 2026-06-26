class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int sc1=0;
        int sc2=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L')
            {
                sc1--;
                sc2--;
            }
            else if(moves.charAt(i)=='R')
            {
                sc1++;
                sc2++;
            }
            else
            {
                sc1--;
                sc2++;
            }
        }
        if(sc1<0)
        {
            sc1=sc1*(-1);
        }
        else if(sc2<0){
            sc2=sc2*(-1);
        }
        if(sc1>sc2)
        {
            return sc1;
        }
        else
        {
            return sc2;
        }
    }
}