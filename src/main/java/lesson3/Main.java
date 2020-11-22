package lesson3;



import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //creatPackageFile(); //создание
        //readFile(); //читаем байты
        //gluing(); // склеиваем все в один файл

        //book();// все очень как-то страноо получилось, не уверен что правильно
    }

    private static void book() throws IOException {
        Scanner in = new Scanner(System.in);
        int page = (1800*in.nextInt())-1800;

        try(RandomAccessFile book = new RandomAccessFile("123/test6.txt", "r")){
            book.seek(page);
            // while (page == (page+1800))
            // do {
            //book.seek(page);
            // System.out.println((char) book.read());
            //  page++;
             // }while (page == (page + 1800));
        for (int i = 0; i<=(page+1800); i++){System.out.println((char) book.read());}

       }
    }


    private static void gluing() throws IOException {
        ArrayList<InputStream> al = new ArrayList<>();//создали коллекцию
        //добавили файлы
        al.add(new FileInputStream("123/test1.txt"));
        al.add(new FileInputStream("123/test2.txt"));
        al.add(new FileInputStream("123/test3.txt"));
        al.add(new FileInputStream("123/test4.txt"));
        al.add(new FileInputStream("123/test5.txt"));
        FileOutputStream file = new FileOutputStream("123/test6.txt"); //файл для записи
        Enumeration<InputStream> e = Collections.enumeration(al);
        SequenceInputStream in = new SequenceInputStream(e);
        int x;
        while ((x = in.read()) != -1){
             file.write(x);
        }// склеили все в один
        in.close();
    }

    private static void creatPackageFile() throws IOException {
        File file = new File("123/test1.txt"); //создаем объект и путь к файлу и папке
        file.mkdirs();//создаем папки
        file.createNewFile();//создаем файл
    }

    private static void readFile() {
        try (FileInputStream in = new FileInputStream("123/test1.txt")){
            byte[] arr = new byte[50];
            int x;
            while ((x = in.read(arr)) > 0){
                System.out.println(new String(arr,0, x, "UTF-8"));
            }

        } catch (IOException e){
            e.printStackTrace();       }
    }
}
