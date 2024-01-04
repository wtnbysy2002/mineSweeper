public class initMineSweeper {
    // ゲームのマス数(行)
    int row ;
    // ゲームのマス数(列)
    int column ;
    // 地雷の数
    int mines;

    public initMineSweeper(int row, int column, int mines){
        this.row = row;
        this.column = column;
        this.mines = mines;
        System.out.println("行数="+row+", 列数="+column+", 地雷数="+mines+"で初期化しました。");
    }
}
