/**
 * Created by Riwaz on 12/16/16.
 */
public class MiniMax {

    public static final int MAX_TREE_DEPTH = 4;

    Node root;

    public MiniMax(Board board) {
        root = new Node(board, 0, true);
        root.generateChildren();
    }

    public Board getBestMove() {
        Board best = null;
        int maxVal = Integer.MIN_VALUE;
        for (Node n : root.children) {
            int val = n.getTreeValue();
            if (val > maxVal) {
                maxVal = val;
                best = n.board;
            }
        }
        return best;
    }

}
