package Lesson8;

public class Lesson8 {

    public static void main(String[] args){
        int n = 5;//вертикаль
        int m = 5;//горизонталь
        int[][] matrix = new int[n][m];

        int n1 = n-1; // вертикаль которую будемуменьшать(длинна заполняемоного массива)
        int m1 = m-1; // горизонталь которую будем уменьшать(длинна заполняемоного массива)
        int a = 1;// число которое увеличивается и записываетмя в матрицу по спирали
        int b = 0;// индекс по вертикали
        int c = 0;// индекс по горизонтали
        int d = 0;// индекс для обратного отсчета


//      ВМЕСТО СПИРАЛИ СДЕЛАЛ ЗМЕЙКУ НИЧАЙНО

//        for (int i = 0; i< matrix.length; i++){
//                 System.out.println("");
//              if(b == 0) {
//                for (int j = 0; j <= matrix[i].length - 1; j++) {
//                    System.out.print((matrix[i][j] = a++) + " ");
//                    b = matrix.length;
//                }
//            }else if(b == matrix.length){
//                for ( int j = matrix[i].length-1; j>=0; j--){
//                    System.out.print((matrix[i][j]=a++) + "");
//                b = 0;
//                }
//            }
//
//          }


// попытка номер раз(МЫСЛЬ НЕ ЗАВЕРШЕНА)
//        for (int i = 0; i < matrix.length; i++){
//            if(a == 1){
//            for (int j = 0; j <= matrix[i].length-1; j++){
//                matrix[i][j] = a++;
//            }
//            }else if (a != 1){
//               matrix[i][matrix.length-1]= a++;
//            }else if(a == matrix.length*2-1){
//                for ( int j = matrix[i].length-1; j>=0; j--){
//                    matrix[i][j] = a++;
//                }
//            }
//       }

//        for (int i = matrix.length; i >= 0; i--){
//            if(a == matrix.length*2-1){
//                for (int j = matrix[i].length-1; j >= 0; j--){
//                    matrix[i][j] = a++;
//                }
//            }else if (a != 1){
//                 a++;
//            }
//        }

        // ОСНОВНОЕ РЕШЕНИЕ (НЕ ДОШЛО ПОЧЕМУ ПОСЛЕДНИЕ ДВА ЭЛЕМЕНТА НЕ ЗАПОЛНЯЮТСЯ)
        while (a < n*m-1){
            while (c < m1) { // заполняет по горизонтали верх
                matrix[b][c] = a++;
                c++;
            }
            while (b < n1){ // заполняем по вертикали последний столбец справа
                matrix[b][c] = a++;
                b++;
            }
            while (c > d){// по горизонтали в обратном порядке
                matrix[b][c] = a++;
                c--;
            }
            // уменьшаем колчество заполняемых ячеек(ограничение так сказать)
            n1--;
            m1--;
            d++;
            while (b > d){// по вертикали в обратном порядке
                matrix[b][c]=a++;
                b--;
            }
//            b--;
//            c--;




            //System.out.println(a++);
        }








        for (int i = 0; i< matrix.length; i++){
            System.out.println(" ");
            for (int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }

        }
    }

