
        public class stringPrefix {
            public String longestCommonPrefix(String[] strs) {
                String result = "";
//                int smallLen;
                char present;
                for(int i = 0; i < strs[0].length(); i++){
    //                first = strs[i]
                    present= strs[0].charAt(i);
                    boolean matched = true;
    //                System.out.println(strs[0].length());
    //                System.out.println("First : " +first);
                    for(int j = 0; j < strs.length; j++){

    //                    second = strs[j];
    //                    System.out.println("Second: " + second);
    //                    smallLen = Math.min(first.length(), second.length());
    //                    checking string length
                        if (i >= strs[j].length()) {
                            matched = false;
                            break;
                        }
                        if(strs[j].charAt(i) != present){
                            matched = false;
                        }



    //                    for(int k = 0; k < smallLen; k++){

                                //if(first.charAt(i) != second.charAt(i)){
    //                                System.out.println(first.charAt(k));
    //                                System.out.println(second.charAt(k));
    //                                result = result + first.charAt(k);
    //                                System.out.println(result);
                                    //break;
                                //}else {
    //                                System.out.println(first.charAt(k));
    //                                System.out.println(second.charAt(k));
                                 //   result = result + first.charAt(i);
    //                                System.out.println(result);                            }
                            }
                    if(matched){
                        result = result + present;
                    }else {
                        break;
                    }
                        }
                return  result;

                    }

                }








