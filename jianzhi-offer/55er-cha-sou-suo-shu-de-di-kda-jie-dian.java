﻿/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /*
 二叉搜索树的中序遍历为有序递增序列
 */
class Solution {
    int k ,res;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.right);
        if(k==0)return;
        if(--k == 0) res=root.val;
        dfs(root.left);
    }
}