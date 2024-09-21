public class Tester {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.add(2);
        l1.add(3);

        ListNode l2 = new ListNode(4);
        l2.add(5);
        l2.add(6);

        Solution testing = new Solution();
        testing.addTwoNumbers(l1, l2);
    }
}
