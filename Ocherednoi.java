package Ocherednoi;

class Ochen { // Объявление класса "Очередь"
    private int M[]; // Объявление массива
    private int max; // Объявление максимальной длинны массива
    private int el; // Объявление кол-ва элементов
    private int a;
    private int z;
    
    public Ochen(int m) 
    {
        this.max = m;
        M = new int[m];
        a=0;
        el=0; // Первый эл в очереди
        z=-1; // Проверка, не выходит ли программа массив
    }
    
    public void enqueue(int a) // Метод ввода значений эл-ов
    {
        if(z == max-1) 
        {
            z = -1;
        }
        M[++z]=a; // Добавяется последний элемент очереди
        el++; // Переход на следующую позицию в очереди
    }
   
    public int dequeue() // Метод удаления эл
    {
        int p = M[a++]; // Получение первого элемента из очереди
        if (a == max) 
        { 
          a = 0;
        }
        el--; // Уменьшение числа элементов в очереди
        return p; // Возврат первого элемента из очереди

    }
    
    public boolean emp() //Метод проверки, пуст ли массив
    {
        return(el == 0);
    }
    
    public boolean ful() 
    {
        return(el == max-1); //Метод проверки, является ли текущий эл массива последним
    }
}

public class Ocherednoi 
{
    public static void main(String[] args) {
        Ochen ochered = new Ochen(10); // Создание очереди
        ochered.enqueue(7);
        ochered.enqueue(81);
        ochered.enqueue(109);
        ochered.enqueue(-612);
        ochered.enqueue(300);
        ochered.enqueue(89);
        ochered.enqueue(1488);
        ochered.dequeue();
        ochered.dequeue();
        ochered.enqueue(900);
        ochered.dequeue();
        System.out.println("Numbers: ");
        while(!ochered.emp()) //Пока массив не закончится, выводятся его элементы
        {
            int i=ochered.dequeue();
            System.out.println(+i);
        }
    }
    
}
