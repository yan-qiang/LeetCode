package com.yq.leetcode.tree;

/**
 * @ClassName :  BinaryTree
 * @Author :  Yanqinag
 * @Date :  2019-07-24 15:06
 * @Description :  初识普通二叉树
 *
 *  之前只是知道二叉树的这种结构，没有自己动手去写过，
 *  上周四的时候我做梦，梦到我在 Google 面试，面试官让我自己实现一个二叉树，
 *  就是徒手撸代码，我很蒙，后面的就不记得了，
 *  后来想想反正我又没去，老子就要自己实现一个二叉树！！！
 *
 *  这些算法里面有好多巧妙之处，真的很值得学习,加油鸭，会越来越好的！
 */
public class BinaryTree {

    /**
     *  根节点
     */
    private Node root = null;

    /**
     *  内部类
     *  构造树节点
     */
    class Node {

        //左子树
        Node leftChild;
        //右子树
        Node rightChild;
        //当前值
        int data;
        //是否删除
        boolean isDelete;

        Node(int newData) {
            leftChild = null;
            rightChild = null;
            data = newData;
            isDelete = false;
        }
    }

    /**
     * @Author : Yanqiang
     * @Date : 2019-07-24
     * @Params : [data]
     * @Return : boolean
     * @Description : 向二叉树添加节点
     */
    private boolean insertNode(int data){
        //先创建当前节点
        Node node = new Node(data);
        //如果根节点为空，把当前节点赋值给根节点
        if (root == null){
            root = node;
            return true;
        }else {
            //当前节点
            Node current = root;
            //父节点
            Node parent;
            //循环一直找到最底下为空的节点
            while (true){
               parent = current;
               //二叉树的特点，左子树比当前树的值小，右子树比当前树的值大
               if (current.data > data){
                   //将左子树 当做 当前节点
                   current = current.leftChild;
                   //直到找到左子树为 null，将值放入当前树下的左子树
                   if (current == null){
                       parent.leftChild = node;
                       return true;
                   }
               }else {
                    //将右子树 当做 当前节点
                   current = current.rightChild;
                   //直到找到右子树为 null，将值放入当前树下的右子树
                   if (current == null){
                       parent.rightChild = node;
                       return true;
                   }
               }
            }
        }
    }


    /**
     * @Author : Yanqiang
     * @Date : 2019-07-24
     * @Params : [data]
     * @Return : com.yq.leetcode.tree.BinaryTree.Node
     * @Description : 查找node节点
     *
     * 这个比较好理解，符合哪边的条件就往哪边走
     */
    private Node getNode(int data){
        Node current = root;
        while (null != current){
            if (root.data > data){
                current = root.leftChild;
            }else {
                current = root.rightChild;
            }
            if (current.data == data){
                return current;
            }
        }
        return null;
    }


    /**
     * @Author : Yanqiang
     * @Date : 2019-07-24
     * @Params : []
     * @Return : com.yq.leetcode.tree.BinaryTree.Node
     * @Description : 获取最大值 --下面一个为优化后的
     */
 /*   private Node getMaxNode(){
        if (root.rightChild == null){
            return root;
        }
        Node current = root;
        while (current != null){
            current = current.rightChild;
            if (current.rightChild == null){
                return current;
            }
        }
        return null;
    }*/

    private Node getMaxNode(){
        //初始化两个 node
        Node current = root;
        Node maxNode = current;
        //如果根节点 root 为空，那么返回依然为空，这块之前没有想到
        while (current != null){
            //将当前的节点给 maxNode
            maxNode = current;
            //将右节点给 current，如果current == null，会跳出这个循环，返回的还是最大值
            current = current.rightChild;
        }
        return maxNode;
    }



    /**
     * @Author : Yanqiang
     * @Date : 2019-07-25
     * @Params : [key]
     * @Return : boolean
     * @Description : 删除节点
     *
     *    删除节点是二叉搜索树中最复杂的操作，
     *    删除的节点有三种情况，前两种比较简单，但是第三种却很复杂。
     *
     * 　　1、该节点是叶节点（没有子节点）
     *
     * 　　2、该节点有一个子节点
     *
     * 　　3、该节点有两个子节点
     */
    private boolean delete(int key){

        return false;
    }


    public static void main(String[] args) {
       /* BinaryTree binaryTree = new BinaryTree();
        boolean b = binaryTree.insertNode(3);
        boolean c = binaryTree.insertNode(2);
        boolean d = binaryTree.insertNode(5);
        boolean e = binaryTree.insertNode(9);
        boolean f = binaryTree.insertNode(1);
        boolean g = binaryTree.insertNode(6);

        Node node = binaryTree.getNode(5);
        Node node2 = binaryTree.getMaxNode();
        System.out.println(node.data);
        System.out.println(node2.data);*/
    }



}
