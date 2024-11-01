
class Solution {

    public ListNode reverseListNode(ListNode listNode){
        if(listNode == null){
            return null;
        }

        StringBuilder sb = new StringBuilder();

        while(listNode != null){
            sb.append(listNode.val);
            listNode = listNode.next;
        }


        String reversed = sb.reverse().toString();

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(char c : reversed.toCharArray()){
            current.next = new ListNode(c - '0');
            current = current.next;
        }

        return dummy.next;
    }

    public int listNodeToNumber(ListNode listNode){
        if(listNode == null){
            return 0;
        }

        StringBuilder sb = new StringBuilder();

        while (listNode != null){
            sb.append(listNode.val);
            listNode =listNode.next;
        }

        return Integer.parseInt(sb.toString());
    }

    public ListNode numberToListNode(int number){
        String s = String.valueOf(number);

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(char c : s.toCharArray()){
            current.next = new ListNode(c - '0');
            current = current.next;
        }

        return dummy.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode rl1 = reverseListNode(l1);
        ListNode rl2 = reverseListNode(l2);

        int i1 = listNodeToNumber(rl1);
        int i2 = listNodeToNumber(rl2);

        int sum = i1 + i2;

        ListNode sumNode = numberToListNode(sum);
        
        return reverseListNode(sumNode);
    }

}