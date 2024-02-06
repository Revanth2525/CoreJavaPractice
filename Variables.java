public class Variables {
    public static void main(String args[]) {

            byte b1 = 10;
            // byte b2=128;  // range -128  to 127

            short s1 = 200;
            // short s2 = 32768;   // range -32768 to 32767

            int a1 = 40000;
            // int a2 = 21474836478;   // range -2147483648 to 2147483647

            long l1 = 21474836478l ;
            // long l2 = 9223372036854775808l;     // ranger -9223372036854775808 to 9223372036854775807

            char ch1 = 'a';
            // char ch2 = 'ab';  // char is unicode, consists of single letter

            boolean boo1 = false;
            // boolean boo2 = 1; // only accepts true or false

            float f1 = 0.213858456000f;
            // float f2;
            // f2 =  1234567.89;    // Since the suffix is not with .f it takes double by default
            double d = 43253241.0024542141000;
    
            System.out.println(b1);
            System.out.println(s1);
            System.out.println(l1);
            System.out.println(a1);
            System.out.println(ch1);
            System.out.println(boo1);
            System.out.println(f1);
            System.out.println(d);
    }
}