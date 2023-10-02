class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = 0;
        int j = matrix.length - 1;

        while(i <= j)
        {
            int midArr = (i + j) / 2;
            if(matrix[midArr][0] <= target && target <= matrix[midArr][matrix[0].length - 1])
            {
                int k = 0;
                int l = matrix[0].length - 1;
                while(k <= l)
                {
                    System.out.println("inner");
                    int mid = (k + l) / 2;
                    if(matrix[midArr][mid] == target)
                    {
                        return true;
                    }
                    else if(matrix[midArr][mid] < target)
                    {
                        k = mid + 1;
                    }
                    else if(matrix[midArr][mid] > target)
                    {
                        l = mid - 1;
                    }
                }
                return false;
            }
            else if(matrix[midArr][0] > target)
            {
                j = midArr - 1;
            }
            else if(matrix[midArr][matrix[0].length - 1] < target)
            {
                i = midArr + 1;
            }
        }
        return false;
    }
}