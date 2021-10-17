public class operators {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 0, i = 0;
        if(b>0){
            i = 1;
            c = 1;
            while(i<=b) {
                c = c * a;
                i++;
            }
        }
        else{
            if(b==0) {
                c = 1;
            }
            else{
                i = 1;
                c = 1;
                while(i<=Math.abs(b)){
                    c = c * a;
                    i++;
                }
                c = 1/c;
            }
        }
        System.out.println(c);
    }
}
