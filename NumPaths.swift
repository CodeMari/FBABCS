//solution using recursion
func getUniquePaths(m: Int, n: Int)->Int{
    retrun getUniquePathsHelper(x: 0, m:m, n:n)
}
func getUniquePathsHelper(x:Int, y:Int, m: Int, n:Int)->Int{
    //base cases
    if x<0 || y<0 || x>=m || y>=n {return 0}
    //checl
    if x==n-1 && y==n-1{return 1}

    return getUniquePathsHelper(x: x+1, y:y, m:m, n:n)+
    getUniquePathsHelper(x:x, y:y+1, m:m, n:n)

}