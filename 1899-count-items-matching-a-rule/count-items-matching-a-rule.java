class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i;
        int h=0;
        int r=items.size();
        int c=0;
        if(ruleKey.equals("color"))
        {
            h=1;
        }
        else if(ruleKey.equals("name"))
        {
            h=2;
        }
        for(i=0;i<r;i++)
        {
            if (items.get(i).get(h).equals(ruleValue)) {
                c++;
            }
       }
       return c;
    }
}