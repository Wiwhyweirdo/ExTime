//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        }
    public static boolean isPrime(int n){

        for(int i=0; i<n;i++){
            if(i==1||i==2){
                return true;
            } else if (n % i == 0) {
                return false;
            }
        }
    }
}