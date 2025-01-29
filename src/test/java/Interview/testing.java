package Interview;

public class testing {
    public static void countDuplicatesCharacter(String str){
        char [] a = str.toCharArray();
        int n = a.length;
        for(int i = 0 ; i<n ; i++){
            int count = 1;
            for(int j =i+1 ; j<n ; j++){
                if(a[i]==a[j]){
                    a[j]='1';
                    count++;

                }
            }
            if(a[i]!='1'){
                //System.out.println(a[i]+"-->"+count);
                System.out.print(a[i]+"-->"+count);
            }
        }
    }

    public static void main(String[] args) {
        String input = "Testing this thing";
        countDuplicatesCharacter(input);
    }
}
