package Interview_question;

public class ex_interview1 {

    public static void main(String[] args) {
        String str = "vision without action is day dream";
        String[] wordArr = str.split(" ");

            for(int i=0; i< wordArr.length; i++) {
//            System.out.println(wordArr[i]);
                for (int j = i + 1; j < wordArr.length; j++) {
                    if (wordArr[i].length() > wordArr[j].length()) {
                        String tempStr;
                        tempStr = wordArr[i];
                        wordArr[i] = wordArr[j];
                        wordArr[j] = tempStr;
                    }
                }
            }
            for(int i = 0; i< wordArr.length;i++) {
                System.out.println(wordArr[i]);
            }
            System.out.println("the smallest = " + wordArr[0]);
            System.out.println("the largest = " + wordArr[wordArr.length - 1]);
        }


    }
