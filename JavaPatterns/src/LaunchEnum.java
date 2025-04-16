enum Result
{
    PASS, FAIL, NO_RESULT;
}

public class LaunchEnum {
    
    public static void main(String[] args) {
        Result res= Result.FAIL;
        System.out.println(res);
        Result resArr[]= Result.PASS.values();
        //System.out.println(resArr[0]);
        for (Result result : resArr) {
            System.out.println(result.ordinal()+ " " + result.name());
            
        }
    }
    
}
