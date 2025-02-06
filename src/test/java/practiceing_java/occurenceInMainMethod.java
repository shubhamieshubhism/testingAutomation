package practiceing_java;

public class occurenceInMainMethod {
    public static void main(String[] args) {
        String str = "hello world";

        char a []= str.toCharArray();
        for(int i = 0 ; i<str.length();i++){
            int count = 1;
            for(int j = i+1 ; j<str.length();j++){
                if(a[i]==a[j]){
                    a[j]= '1';
                    count++;
                }
            }
            if(a[i]!= '1'){
                System.out.println(a[i]+"-->"+count);
            }
        }
    }

}
