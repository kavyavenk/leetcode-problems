class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            // handle ascii case so subtract value of char 0 to get int vals
            int ad = (i >= 0) ? a.charAt(i) - '0': 0;
            int bd = (j >= 0) ? b.charAt(j) - '0': 0;
            int sum = ad + bd + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        return sb.reverse().toString();


        // int ad = 0, bd = 0;
        // String x = a, y = b;
        // int cd = 0, carry = 0;
        // List<Integer> c = new ArrayList<>();
        // String fin = "";
        // int pwr = 0;
        // while (!x.equals("") || !y.equals("")) {
        //     ad = x.charAt(x.length()-1) - '0'; // ints instead of ascii values
        //     bd = y.charAt(y.length()-1) - '0';
        //     if (ad == 1 && bd == 1) {
        //         if (carry == 0) cd = 0;
        //         else cd = 1;
        //         carry = 1;
        //     } else if (ad == 1 || bd == 1) {
        //         if (carry == 0) {
        //             cd = 1;
        //             carry = 0;
        //         } else {
        //             cd = 0;
        //             carry = 1;
        //         }
        //     } else {
        //         if (carry == 0) cd = 0;
        //         else cd = 1;
        //         carry = 0;
        //     }
        //     // c.addToFront(cd);
        //     fin = fin + cd;
        //     x = x.substring(0,x.length()-1);
        //     y = y.substring(0,y.length()-1);
        // }
        // System.out.println(fin);
        // return fin;
    }
}