public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static String toString(ListNode list) {
        String result = "";
        ListNode cur = list;
        while (cur != null) {
            result += cur.val;
            if (cur.next != null) {
                result += ", ";
            }
            cur = cur.next;

        }
        return "List : " + result;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cur = root;
        ListNode l1Cur = l1;
        ListNode l2Cur = l2;
        int val = 0;
        int quotient = 0;
        int remainder = 0;
        while (l1Cur != null || l2Cur != null) {
            if(l1Cur == null)
                l1Cur = new ListNode(0);
            if(l2Cur == null)
                l2Cur = new ListNode(0);
            val += l1Cur.val + l2Cur.val;
            remainder = val%10;
            quotient = val/10;
            cur.next = new ListNode(remainder);
            cur = cur.next;
            if (quotient != 0)
                cur.next = new ListNode(quotient);
            val = quotient;
            l1Cur = l1Cur.next;
            l2Cur = l2Cur.next;
        }
        return root.next;
    }
//            if (l1Cur == null) {
//                val += l2Cur.val;
//                quotient = val/10;
//                remainder = val%10;
//                ListNode res = new ListNode(remainder);
//                cur.next = res;
//                cur = cur.next;
//                ListNode next = new ListNode(quotient);
//                if (next.val != 0)
//                    cur.next = next;
//                l2Cur = l2Cur.next;
//                val = next.val;
//            } else if (l2Cur == null) {
//                val += l1Cur.val;
//                quotient = val/10;
//                remainder = val%10;
//                ListNode res = new ListNode(remainder);
//                cur.next = res;
//                cur = cur.next;
//                ListNode next = new ListNode(quotient);
//                if (next.val != 0)
//                    cur.next = next;
//                l1Cur = l1Cur.next;
//                val = next.val;
//            } else {
//                val += l1Cur.val + l2Cur.val;
//                quotient = val/10;
//                remainder = val%10;
////                ListNode res = new ListNode(remainder);
//                cur.next = new ListNode(remainder);
//                cur = cur.next;
//                if (quotient != 0)
//                    cur.next = new ListNode(quotient);
//                l1Cur = l1Cur.next;
//                l2Cur = l2Cur.next;
//                val = quotient;
//            }

    public static void main(String args[]) {
        ListNode test1 = new ListNode (2);
        test1.next = new ListNode(4);
        test1.next.next = new ListNode(3);
        ListNode test2 = new ListNode(5);
        test2.next = new ListNode(6);
        test2.next.next = new ListNode(4);
        test2.next.next.next = new ListNode(4);
        System.out.print(toString(addTwoNumbers(test1,test2)));
    }
}

