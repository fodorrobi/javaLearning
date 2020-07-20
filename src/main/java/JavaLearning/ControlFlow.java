package JavaLearning;

/**
 * Created by U299874 on 2016.10.20..
 */
public class ControlFlow {
        public static void main(String[] args) {

            String copyFromMe = "Copy this string until you " +
                    "encounter the letter 'g'.";
            StringBuffer copyToMe = new StringBuffer();

            int i = 0;
            char c = copyFromMe.charAt(i);

            while (c != 'g') {
                copyToMe.append(c);
                c = copyFromMe.charAt(++i);
            }
            System.out.println(copyToMe);
        }

    }

