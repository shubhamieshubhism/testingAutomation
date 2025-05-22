package javaPracticeQuestions;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class CustomExceptionExample {

    public static void main(String[] args) {
        try {
            validAge(15);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validAge(int age) throws AgeException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
    }
}

class MultipleCatchException {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[6] = 10 / 20;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound index exception occurred");
        }
    }
}

class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int arr[] = new int[5];
                arr[5] = 10 / 2;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception has occurred");
            }
        } catch (Exception e) {
            System.out.println("Handled outer exception");
        }
    }
}

class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[7] = 10 / 2;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error occurred : " + e.getMessage());
        }
    }

}

class UncaughtExcepion{
    public static void main(String[] args) {

        divide(10,0);//will throw arithmetic exception
    }

    public static void divide(int a , int b){
        System.out.println(a/b);
    }
}

class ExcepionPropagationExample{
    public static void main(String[] args) {
        firstMethos();
    }
    public static void firstMethos(){
        secondMethod();
    }
    public static void secondMethod(){
        System.out.println(10/0);
    }
}

class RethrowExample{
    public static void main(String[] args) {

        try{
            checkNumber(-1);
        }catch (Exception e){
            System.out.println("Exception Rethrow : "+e.getMessage());
        }
    }
    public static void checkNumber(int a) throws Exception {
        try{
            if(a<0){
                throw new Exception("Number is negative");
            }
        }catch (Exception e ){
            System.out.println("Logging Excetion "+e.getMessage());
            throw e;
        }
    }
}

class ExceptionChaing{
    public static void main(String[] args) {
        try{
            methodA();
        }catch (CustomException e){
            System.out.println("Message : "+e.getMessage());
            System.out.println("Cause : "+e.getCause());
        }
    }
    public static void methodA() throws CustomException {

        try{
            int result = 10/0;
        }catch (ArithmeticException e ){
            throw new CustomException("Custom exception occurred",e);
        }
    }
}
class CustomException extends Exception{
    public CustomException(String message,Throwable cause){
        super(message,cause);
    }

}

class ConstructorExceptionHandling{
    private int age;
    public ConstructorExceptionHandling(int age) throws AgeException {
        if(age<18){
            throw new AgeException("Age must be at least 18");
        }
        this.age=age;
    }

    public static void main(String[] args) {
        try{
            ConstructorExceptionHandling obj = new ConstructorExceptionHandling(15);
        }catch (AgeException e){
            System.out.println("Caught exception : "+e.getMessage());
        }
    }
}

class CustomRuntimeException {
    public static void main(String[] args) {

        checkInput(-1);

    }
    public static void checkInput(int input){
        if(input<0){
            throw new InvalidExceptionHandling("Number must be positve");
        }
    }
}
class InvalidExceptionHandling extends RuntimeException{
    public InvalidExceptionHandling(String message){
        super(message);
    }
}
