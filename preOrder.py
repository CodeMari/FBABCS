def preOrder(root):
    if root is None: 
        return
    print(root.info, end=' ')
    preOrder(root.left)
    preOrder(root.right)