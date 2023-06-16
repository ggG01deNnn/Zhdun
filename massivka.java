package massivka;

class ArrayMass // Объявление класса "сортировка и вывод массива"
{
    private double M[];
    private int a;
    public ArrayMass(int max)
    {    
        a=max; // Ввод в класс числа элементов массива
    }
   
    public void times() throws InterruptedException //Метод для подсчета времени выполнения программы
    {
       long start = System.nanoTime(); // Старт счётчика времени
        Thread.sleep(1000); // Счётчика времени в наносекундах
        long finish = System.nanoTime(); // Конец счётчика времени
        float elapsed = finish - start; // Разница между начальным и конечным показателями времени
        System.out.println( + elapsed/1000000000);
    }
    public void rab() // Метод для работы с массивом
    {
        int i;
        double [] M = new double[a]; // Выделение памяти под массив
        double d;
        System.out.println("1st Massiv:");
        for(i=0; i<a ;i++)
        {
            M[i] = Math.random()*100; // Массив случайных чисел
            System.out.println(M[i]);
        }
        for (int out = a - 1; out >= 1; out--) // Пузырьковый метод сортировки
        {
            for (int in = 0; in < out; in++)
            {
                if(M[in] > M[in + 1]) 
                {
                    d = M[in];      
                    M[in] = M[in+1];      
                    M[in+1] = d;
                }                        
            }
        }
        System.out.println("2nd Massiv:");
        for(i=0; i<a ;i++){
            System.out.println(M[i]); // Вывод обработанного массива
        }
    }
}

public class massivka
{
    public static void main(String[] args) throws InterruptedException 
    {
        ArrayMass array = new ArrayMass(10);
        array.rab(); //Вызов метода для обработки массива
        System.out.println("Times: ");
        array.times(); //Вызов метода для вывода на экран времени выполнения программы
    }    
}

// При вводе 10 эл-ов время работы программы будет 1.0042279 секунд 
// При вводе 100000 эл-ов время работы программы будет 1.0096956 секунд
// Более, чем с 10000000 программа не может работать 