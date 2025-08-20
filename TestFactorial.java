public class TestFactorial{
    public static void main(String args[]){
        try{
            if(Factorial.Compute(5)!=120){
                throw new AssertionError("test failed for input 5");
            }
            if(Factorial.Compute(0)!=1){
                throw new AssertionError("test failed for input 1");

            }
            System.out.pritnln("All tests passed");
        }
        catch(Exception e){
            System.out.pritnln("Tets Failed: "+e.getMessage());
        }
    }
}