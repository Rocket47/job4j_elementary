package list;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = rows;
        int[][] array = new int[rows][cells];
        int cellsCount = 0;
        int rowsCount = 0;
        int listSize = list.size();
        if (listSize % rows != 0) {
            for (int j = 0; j < listSize / rows; j++) {
                list.add(0);
            }
        }
        for (Integer i : list
        ) {
            if (cellsCount < rows) {
                array[rowsCount][cellsCount] = i;
                cellsCount++;
            } else if (cellsCount == rows) {
                rowsCount++;
                cellsCount = 0;
                array[rowsCount][cellsCount] = i;
                cellsCount++;
            }
        }
        return array;
    }
}


