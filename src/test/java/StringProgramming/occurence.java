package StringProgramming;

public class occurence {
    public static void main(String[] args) {
        String input = "hello world";
        occurencinstring(input);

    }
    public static void occurencinstring(String str){
        char[]a = str.toCharArray();
        for (int i = 0; i < a.length ; i++) {
            int count = 1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                    a[j]='1';
                }
            }
            if(a[i]!='1'){
                System.out.println(a[i]+"-->"+count);
            }

        }
    }


}
