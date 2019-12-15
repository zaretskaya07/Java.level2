package Lesson_2.homework;

class MyArraySizeException extends Exception{

    private int RowSize;
    private int ColumnSize;
    public int getRowSize(){return RowSize;}
    public int getColumnSize(){return ColumnSize;}
    public MyArraySizeException(String message, int rowSize, int columnSize){

        super(message);
        RowSize=rowSize;
        ColumnSize=columnSize;
    }
}

class MyArrayDataException extends NumberFormatException{

    private int Row;
    private int Column;
    public int getRow(){return Row;}
    public int getColumn(){return Column;}
    public MyArrayDataException(String message, int row, int column){

        super(message);
        Row=row;
        Column=column;
    }
}

class Arr{
    private static int n=4;
    public static void setN(int N) {n=N;};
    public static void Array(String[][] input) throws MyArraySizeException{

        if ((input.length!=n)||(input[0].length!=n)) throw new MyArraySizeException("Размер массива должен быть" + n + "х"+n+"!",input.length,input[0].length);
        System.out.println( "Size - ok");
        Arr.CheckElements(input);
    }
    public static boolean checkString(String string) {
        if (string == null || string.length() == 0) return false;

        int i = 0;
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return false;
            }
            i = 1;
        }

        char c;
        for (; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static void CheckElements(String[][] input) throws MyArrayDataException{
        int[][] out=new int[input.length][input[0].length];
        int sum=0;

        for (int i=0;i<input.length;i++ ){
            for(int j=0;j<input[0].length;j++){
                if (!checkString(input[i][j])) throw new MyArrayDataException("Неверный тип данных в ячейке!", i,j);
                else{
                    sum=sum+Integer.parseInt(input[i][j]);
                }

                }

            }
        System.out.println("Cheking element - ok");
        System.out.println("Сумма элементов: "+ sum);
    }

    public static void main(String[] args){
        Arr.setN(3); //  по умолчанию ограничение на размер массива стоит 4х4, но можно заменить, к примеру, на 5х5
        String[][] test= {{"3","4","5"},{"77","6","54"},{"32","25","89"}};
        try{
            Arr.Array(test);
        }
        catch(MyArraySizeException ex){

            System.out.println(ex.getMessage());
            System.out.println("Количество строк: "+ex.getRowSize());
            System.out.println("Количество столбцов: "+ ex.getColumnSize());
        }
        catch (MyArrayDataException ex){
            System.out.println(ex.getMessage());
            System.out.println("Строка: " + ex.getRow());
            System.out.println("Столбец: " + ex.getColumn());
        }
    }
}
