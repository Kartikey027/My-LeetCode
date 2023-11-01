class Solution {
    public char nextGreatestLetter(char[] letters, char target)
    {   char res='a';
        int min=0;
        int max=letters.length-1;
        if(target>letters[letters.length-1])
        {
            return letters[0];
        }
        else{
        while(min<=max)
        {
          int  mid= min + (max-min)/2;
            if(target<letters[mid])
            {   res=letters[mid];
                max=mid-1;
            }
            else 
            min=mid+1;
        }
        if(res<=target)
        {
            return letters[0];
        }
        else
        {
            return res;
        }
        } 
    }
}
