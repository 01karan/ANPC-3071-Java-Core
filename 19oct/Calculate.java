//Program to Calculate Power of a Number
//mr.karan Singh
//19-10-2022
public class Calculate {
    public static void main(String[] args) {
    	
        int number = 15, p = 9;
        long result = 1;
        
        
        int i = 5;
        for (;i != 0; --i)
        {
            result *= number;
        }
        
       
        System.out.println(number+"^"+p+" = "+result);
    }
}