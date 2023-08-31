public class SubString {
    public static void printSubStriung(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        // step 1 yes include
        printSubStriung(str,ans+str.charAt(i),i+1);
        //step 2 Not include
        printSubStriung(str,ans,i+1);
    }
    public static void main(String[] args) {
        String input="Srijit"; //no of substring =2^6 =64
        printSubStriung(input," ",0);
    }
}
