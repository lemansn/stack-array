/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev4;

/**
 *
 * @author leman
 */
public class Stack<T> {

    private Object array[]; //object tipinde veri tutacak dizi
    static int index = 0; //dizideki elemanlarin indexi icin parametre, dizide eleman sayisini belirlemek icin kullanilacak

    public Stack(int MAX_CAPACITY)//yapici metot, icinde object tipinde veri tutan dizi yaratiliyor 
    {
        array = new Object[MAX_CAPACITY];
        
    }

    public void push(T object)//yigita eleman eklemek icin push metotu 
    {
        index++; //her bir eleman eklendikden sonra eleman sayisi artiriliyor

        //yigittaki her eleman bir sonraki indexe kaydiriliyor 
        for (int i = index; i >= 1; i--) {
            array[i] = array[i - 1];
        }
        //eleman en basa ekleniyor
        array[0] = object;

    }
    

    public T pop() //yigittan eleman cikarmak icin pop metotu. En son eklenen ilk cikartiliyor
    {

        T removedItem = null; //cikartilacak eleman icin parametre tanimlaniyor

        //hic bir eleman kalmadiysa EMPTY yazdirilarak sistemden cikiyor
        if (isEmpty()) {
            System.out.println("EMPTY");
            System.exit(0);
        } else {

            removedItem = (T) array[0];//silinecek eleman en basdaki yani en son eklenen elaman oluyor
            //daha sonra geride kalan elemanlar bir onceki indexe kaydiriliyor
            for (int i = 0; i < index; i++) {
                array[i] = array[i + 1];
            }
        }
        index--; //cikarma islemi tamamlandiktan sonra eleman sayisi 1 azaltiliyor

        return removedItem;
        
    }

    
    //bos olup olmadigi kontrol edilmesi icin isEmpty metotu
    public boolean isEmpty() {

        //icindeki eleman sayisi 0 oldugunda true aksi halde false donduruyor
        if (index == 0) {
            return true;
        } else {
            return false;
        }

    }

    
    public void display() {
        //eleman null olmadigi surece dizideki elemanlarin yazdirilmasi saglaniyor

        System.out.println("\nThe stack is:");
        for (Object i : array) {
            if (i != null) {
                System.out.println(i);

            }

        }
    }

}
