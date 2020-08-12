class QueueNode{
    let node: BinaryTreeNode
    let max: Int
    let min: Int 

    init(node: BinaryTreeNode, max: Int, min: Int){
        self.node=node 
        self.max = max
        self.min = min
    }

}
func isValid(_ root: BinaryTreeNode?) -> Bool{
    if root == nil{return true }
    var stack=[QueueNode(node: root!, min: Int.min, max: Int.max)]

    while !stack.isEmmpty{
        let curr=stack.popLast()!, currNode=curr.node
        if currNode.val < curr.min || currNode.val> curr.max{
            return false
        }
        if curr.left != nil{
            let left = currNode.left!
            stack.append(QueueNode(node: left, min: min(left.val, curr.min), max: currNode.val))


        }
        if curr.right != nil{
            let right = currNode.right!
            stack.append(QueueNode(node: right, min: min(left.val, curr.min), max: curr: currNode.val))

    }
}
return true 
}