package SoftServe.CodeWars.BinaryTreeTraverseByLevel;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    public Node left;
    public Node right;
    public int value;

    public Node(Node l, Node r, int v) {
        left = l;
        right = r;
        value = v;
    }

    public static List<Integer> treeByLevels(Node node) {

        if(node == null){
            return new LinkedList<>();
        }

        Queue<Node> queue = new LinkedList<>();
        List<Integer> traverseByOrder = new LinkedList<>();

        queue.offer(node);
        while(!queue.isEmpty())
        {
            Node tempNode = queue.poll();
            traverseByOrder.add(tempNode.value);

            if(tempNode.left!=null)
                queue.offer(tempNode.left);
            if(tempNode.right!=null)
                queue.offer(tempNode.right);
        }

        return traverseByOrder;
    }

}
