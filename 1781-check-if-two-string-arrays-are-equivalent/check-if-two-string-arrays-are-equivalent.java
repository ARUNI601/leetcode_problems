class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String f1 = String.join("", word1); 
        String f2 = String.join("", word2); 
        if(f1.equals(f2))
        {
            return true;
        }
        return false;
    }
}