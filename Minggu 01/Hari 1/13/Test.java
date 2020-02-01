/*

*/

public class Test {
    public void pupAge() {
       /* age harus diinisialisasi dengan nilai 0, kalau tidak akan error */
       int age = 0;
       age = age + 7;
       System.out.println("Puppy age is : " + age);
    }
 
    public static void main(String args[]) {
       Test test = new Test();
       test.pupAge();
    }
 }