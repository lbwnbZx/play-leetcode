# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

# BFS   
class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        queue, res =[root], 0
        if not root : return res
        while queue:
            temp = []
            for node in queue:
                if node.left: temp.append(node.left)
                if node.right: temp.append(node.right)
            queue = temp
            res += 1
        return res  
