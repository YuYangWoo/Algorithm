import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class nhn1 {
    public static void main(String[] args) {
        Operation[] a = {new Operation(OperationType.branch,0),new Operation(OperationType.branch,0),
                new Operation(OperationType.branch,0),new Operation(OperationType.branch,0),new Operation(OperationType.merge,1),
                new Operation(OperationType.merge,4)};
        solution(6,a);
    }
    private static void solution(int numOfOperation, Operation[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i = numOfOperation; i>=1; i--) {
            stack.add(i);
        }
        stack.pop();
        for(int i=0; i< operations.length;i++) {
            if(operations[i].type == OperationType.branch) {
                stack.pop();
            }
            else {
                int num = operations[i].value;
                stack.add(num);
            }
        }
       for(int i =1; i<=numOfOperation;i++) {
           if(!stack.contains(i)) {
               System.out.print(i +" ");
           }
       }
    }
    private static class Operation {
        OperationType type;
        Integer value;
        public Operation(OperationType type, Integer value) {
            this.type = type;
            this.value = value;
        }
    }
    private static enum OperationType {
        branch,
        merge
    }
}
