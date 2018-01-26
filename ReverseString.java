 
class ReverseString
{
    public static void main(String[] args)
    {
        String input = "abcd efgh";
        char[] temparrayvariable = input.toCharArray();
        int left, right=0;
        right = temparrayvariable.length-1;
 
        for (left=0; left < right ; left++ ,right--)
        {
        	char temp = temparrayvariable[left];
            temparrayvariable[left] = temparrayvariable[right];
            temparrayvariable[right]=temp;
        }
 
        for (char c : temparrayvariable)
            System.out.print(c);
        System.out.println();
    }
}