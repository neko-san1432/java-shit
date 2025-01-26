public class go{
    public static void main(String[] args) {
        for (int i=1; i <=4; i++) {
            try {
                FinallyDemo.myMethod(i);
            } catch (Exception e){
                System.out.print("Exception caught: ");
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}
