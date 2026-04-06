class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;

        for (int i = 0; i < op.length; i++) {
            if (op[i].equals("+")) {

                int a = s.pop();
                int b = s.peek();
                s.push(a);
                s.push(a + b);
                sum += (a + b);

            } else if (op[i].equals("C")) {

                sum -= s.peek();
                s.pop();

            } else if (op[i].equals("D")) {

                int val = 2 * s.peek();
                s.push(val);
                sum += val;

            } else {

                int num = Integer.parseInt(op[i]);
                sum += num;
                s.push(num);
            }
        }

        return sum;
    }
}