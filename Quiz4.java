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
public class Quiz4 {

    public static void main(String[] args) {

        //stack nesnesi olusturuluyor
        Stack<Customer> stack = new Stack<>(10);

        //5 adet customer nesnesi olusturuluyor
        Customer customer1 = new Customer("1111", "Leman");
        Customer customer2 = new Customer("2222", "Narmin");
        Customer customer3 = new Customer("3333", "Leyla");
        Customer customer4 = new Customer("4444", "Ahmet");
        Customer customer5 = new Customer("5555", "Mehmet");

        //customer nesneleri push metotu ile stacka ekleniyor
        stack.push(customer1);
        stack.push(customer2);
        stack.push(customer3);
        stack.push(customer4);
        stack.push(customer5);

            Customer removedItem;//stackdan cikartilacak elemani icin degisken
             while(true){
             
                 //en son elemana kadar yigittan cikartilma islemi yapiliyor
                 removedItem = stack.pop();
                 //eleman yigittan cikartilarak yazdiriliyor
                 System.out.println("\nPopped object is:\n" + removedItem );
                 stack.display();
             }
    }

}
