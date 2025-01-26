/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class BST {

    /*  **insert
        traverse
            pre-order
            **in order
            post order
            level order??????
        search
     */
    BTNode root = null;

    public void insert(int o) {
        // if x<node go to lson else goto rson
        BTNode n = new BTNode(o);
        if (root == null) {
            root = n;
        } else {
            BTNode temp = root;
            boolean isInserted = false;
            while (!isInserted) {
                if (n.info < temp.info) {
                    //goto left
                    if (temp.lson == null) {
                        temp.lson = n;
                        isInserted = true;
                    } else {
                        temp = temp.lson;
                    }
                } else if (n.info > temp.info) {
                    //goto right
                    if (temp.rson == null) {
                        temp.rson = n;
                        isInserted = true;
                    } else {
                        temp = temp.rson;
                    }
                } else {
                    System.out.println("element " + n.info + "  already in the Tree");
                    isInserted = true;
                }
            }
        }
    }

    private String inOrder(BTNode temp) {
        String result = "";

        //traverse left
        if (temp.lson != null) {
            result += inOrder(temp.lson);
        }
        //tranver node
        result += temp.info + ", ";

        //traverse right
        if (temp.rson != null) {
            result += inOrder(temp.rson);
        }

        return result;
    }

    public String traverInOrder() {
        return inOrder(root);
    }

    public String postOrder(BTNode temp) {
        String result = "";
        if (temp.lson != null) {
            result += inOrder(temp.lson);
        }

        //traverse right
        if (temp.rson != null) {
            result += inOrder(temp.rson);
        }
        //tranver node
        result += temp.info + ", ";

        return result;
    }

    public String traversepostOrder() {
        return postOrder(root);
    }

    public String preOrder(BTNode temp) {
        String result = "";

        //tranver node
        result += temp.info + ", ";

        //traverse left
        if (temp.lson != null) {
            result += inOrder(temp.lson);
        }

        //traverse right
        if (temp.rson != null) {
            result += inOrder(temp.rson);
        }

        return result;
    }

    public String traversepreOrder() {
        return preOrder(root);
    }

    public String levelOrder(BTNode temp) {
        String result = "";
        return result;
    }

    private boolean FUNCsearch(BTNode root, int data) {
        if (root == null) {
            return false;
        } else if (root.info == data) {
            return true;
        } else if (root.info > data) {
            return FUNCsearch(root.lson, data);
        }
        return FUNCsearch(root.rson, data);
    }

    public boolean search(int key) {
        return FUNCsearch(this.root, key);
    }
}
