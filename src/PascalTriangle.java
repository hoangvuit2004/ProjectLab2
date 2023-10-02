import java.util.Arrays;

public class PascalTriangle {
    public static int[] getPascalTriangle(int n) {
        if (n <= 0) {
            return null;
        } else if (n == 1) {
            int[] row = {1};
            return row;
        } else {
            int[] prevRow = getPascalTriangle(n - 1);
            int[] row = new int[n];
            row[0] = 1;
            row[n - 1] = 1;
            for (int i = 1; i < n - 1; i++) {
                row[i] = prevRow[i - 1] + prevRow[i];
            }
            return row;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] row = getPascalTriangle(n);
        if (row != null) {
            for (int value : row) {
                System.out.print(value + " ");
            }
        } else {
            System.out.println("Input không hợp lệ. n phải lớn hơn 0.");
        }
        System.out.println();
        int[] prevRow = {1, 3, 3, 1}; // Hàng trước đó
        int[] nextRow = generateNextRow(prevRow); // Lấy hàng tiếp theo
        for (int value : nextRow) {
            System.out.print(value + " ");
        }
    }
    public static int[] generateNextRow(int[] prevRow) {
        if (prevRow == null || prevRow.length == 0) {
            return new int[]{1}; // Trường hợp đặc biệt, nếu hàng trước đó là null hoặc trống, trả về hàng đầu tiên {1}.
        }

        int[] nextRow = new int[prevRow.length + 1];
        nextRow[0] = 1; // Phần tử đầu tiên luôn là 1.

        if (prevRow.length == 1) {
            nextRow[1] = 1; // Trường hợp đặc biệt khi hàng trước đó chỉ có một phần tử, phần tử thứ hai cũng là 1.
        } else {
            int[] previousRow = generateNextRow(Arrays.copyOfRange(prevRow, 1, prevRow.length));
            for (int i = 1; i < nextRow.length - 1; i++) {
                nextRow[i] = previousRow[i - 1] + previousRow[i];
            }
        }

        nextRow[nextRow.length - 1] = 1; // Phần tử cuối cùng luôn là 1.

        return nextRow;
    }
}
