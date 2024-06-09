package com.io.interview_practice;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String str = "India       Is   My       Country";

        //Ist Way
        String noSpaceStr = str.replaceAll("\\s", "");//Using inbuilt method
        System.out.println(noSpaceStr);
        //2nd way
        char[] strArray = str.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                buffer.append(strArray[i]);

            }
        }
        String noSpaceStr2 = buffer.toString();
        System.out.println(noSpaceStr2);
    }
}
