package Mar07;

public class TwoDArray {
    int row;
    int col;
    int [][] arr ;

    public TwoDArray(int row, int col) {
        this.row = row;
        this.col = col;
//        this.arr = new int[row][col];
    }



    void display(){
        arr = new int[row][col];
//        int [][] arr = new int[row][col];
    }


    void show(){
        System.out.println(this.arr.length);

    }
}
