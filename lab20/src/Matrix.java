public class Matrix<T extends Number> {
    private final T[][] matrix;
    private final int rows;
    private final int cols;

    @SuppressWarnings({"unchecked"})
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = (T[][]) new Object[rows][cols];
    }

    public Matrix(int rows, int cols, T[][] matrix) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = matrix;
    }


    public boolean isSquare() {
        return rows == cols;
    }

    private void add(T number, int col, int row) {
        matrix[col][row] = number;
    }

    public void display() {
        System.out.print("[");
        for (int row = 0; row < rows; ++row) {
            if (row != 0) {
                System.out.print(" ");
            }

            System.out.print("[");

            for (int col = 0; col < cols; ++col) {
                System.out.printf("%8.3f", matrix[row][col].doubleValue());

                if (col != cols - 1) {
                    System.out.print(" ");
                }
            }

            System.out.print("]");

            if (row == rows - 1) {
                System.out.print("]");
            }

            System.out.println();
        }
    }

    public Matrix<T> transpose() {
        Matrix<T> result = new Matrix<>(cols, rows);

        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                result.matrix[col][row] = matrix[row][col];
            }
        }

        return result;
    }

    public static <T extends Number> Matrix<T> subMatrix(Matrix<T> matrix, int exclude_row, int exclude_col) {
        Matrix<T> result = new Matrix<>(matrix.rows - 1, matrix.cols - 1);

        for (int row = 0, p = 0; row < matrix.rows; ++row) {
            if (row != exclude_row - 1) {
                for (int col = 0, q = 0; col < matrix.cols; ++col) {
                    if (col != exclude_col - 1) {
                        result.matrix[p][q] = matrix.matrix[row][col];

                        ++q;
                    }
                }

                ++p;
            }
        }

        return result;
    }

    public double determinant() {
        if (rows != cols) {
            return Double.NaN;
        } else {
            return _determinant(this);
        }
    }

    private double _determinant(Matrix<T> MT) {
        if (MT.cols == 1) {
            return MT.matrix[0][0].doubleValue();
        } else if (MT.cols == 2) {
            return (MT.matrix[0][0].doubleValue() * MT.matrix[1][1].doubleValue() - MT.matrix[0][1].doubleValue() * MT.matrix[1][0].doubleValue());
        } else {
            double result = 0.0;

            for (int col = 0; col < MT.cols; ++col) {
                Matrix<T> sub = subMatrix(MT, 1, col + 1);

                result += (Math.pow(-1, 1 + col + 1) * MT.matrix[0][col].doubleValue() * _determinant(sub));
            }

            return result;
        }
    }

    public Matrix<T> inverse() {
        double det = determinant();

        if (rows != cols || det == 0.0) {
            return null;
        } else {
            Matrix<T> result = new Matrix<>(rows, cols);

            for (int row = 0; row < rows; ++row) {
                for (int col = 0; col < cols; ++col) {
                    Matrix<T> sub = subMatrix(this, row + 1, col + 1);
                    Number v = 1.0 / det * Math.pow(-1, row + col) * _determinant(sub);
                    result.add((T)v, col, row);
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Matrix<Integer> matrix1 = new Matrix<>(2, 2, new Integer[][]{{1, 2}, {3, 4}});
        System.out.println("Matrix is Square: " + matrix1.isSquare());
        System.out.println("Determinant: " + matrix1.determinant());
        //matrix1 = matrix1.inverse();
        //matrix1.display();
    }
}