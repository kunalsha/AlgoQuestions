//package com.practice;
//
//// N X N array of
//
////input  - isWinner(int[][])
////output -
//
//
//public class Test {
//    public static void main(String[] args) {
//        int[][] tictac = new int[][]{{1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1}
//        };
//        Test test = new Test();
//        test.isWinner(tictac);
//
//    }
//
//    public boolean isWinner(int[][] n){
//
//        boolean success = false;
//
//        if(n == 0) return false;
//
//        //1. a[x][y] = Keeping x constant , all values of y are same./ n-1 =2  i < 2
//        for(int i=0;i<n-1;i++) {
//            for(int j=0;j<n-1;j++) {
//                if(arr[i][j] != arr[i][j+1])  // 0-0  and 0,1 (X and 0)
//                    break;
//            }
//            success = true;
//        }
//
//        //0,0 and 0,1
//        //1,0 and 1,1, 1,1 = 1,2, 1,2 = 1,n
//
//
//        if(success) return true;
//
//        //2. a[y][x] = Keeping y constant, all value of x are same.
//        for(int i=0;i<n-1;i++) {
//            for(int j=0;j<n-1;j++) {
//                if(arr[j][i] != arr[j+1][i])
//                    break;
//            }
//            success = true;
//        }
//
//        if(success) return success;
//
//
//        //3. Diagnolly check that all values are same.
//        for(int i=0, j=0;i<n-1;i++,j++) {
//            if(arr[i][j] != arr[j+1][i+1])
//                break;
//
//        }
//
//        for(int i=n-1, j=n-1;i>0;i--,j--) {
//            if(arr[i][j] != arr[j-1][i-1])
//                success = false;
//
//        }
//
//
//        return success;
//        //4. check the other diagnolly on other side
//        //5. If any of the condition success becomes true, than it can return
//    }
//}
