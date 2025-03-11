package generics;

import java.util.Arrays;
/**
 * 1) Базовый Пример показывает как можно использовать Generics для создания классов и подстановку типов данных
 */
public class GenericsClass {
    public static void main(String[] args) {

        System.out.println("--" );
        // Матрица Double
        Matrix<Double> doubleMatrix = new Matrix<>(new Double[]{1.0,2.0} );
        System.out.println(doubleMatrix);
        //Матрица Integer
        Matrix<Integer> integerMatrix = new Matrix<>(new Integer[]{1,2,3,4});
        System.out.println(integerMatrix);
        //матрица Byte
        Matrix<Byte> byteMatrix = new Matrix<>(new Byte[]{1,2,3,4,5,6});
        System.out.println(byteMatrix);
    }
}
// Заменим на <T extends Integer>
class Matrix<T>{
    private final T[] array;
    //Конструктор
    public Matrix(T[] array) {
        this.array = array.clone();
    }
    //Переопределение метода вывода в строку
    @Override
    public String toString() {
        return "Matrix [array=" + Arrays.toString(array) + "] - " + array.getClass();
    }
}



