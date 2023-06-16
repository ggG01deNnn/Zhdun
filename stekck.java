package steka; 

class Steck // объявление класса "Стeк"
{ 
    public int n; // кол-во эл в стеке
    public int A[]; // элементы стека
    public int i; // счётчик стека

    public Steck(int m) // конструктор класса "Стeк" с одним параметром - количеством элементов
    { 
        this.n = m; // инициализация кол-ва эл-ов
        A = new int[n]; // выделение памяти под массив эл-ов стека
        i = -1; // начальное значение индекса -1
    }

    public void push(int ch) // метод добавления эл в стек
    { 
        if (full()) // проверка, переполнен ли стек
        { 
            System.out.println("Stek is full!"); 
            return; 
        }
        A[++i] = ch; // добавляем эл в стек
    }

    public int pop() // метод удаления эл из стека
    { 
        if (emp()) // проверка, пуст ли стек
        { 
            System.out.println("Stek is empty!"); 
            return -1;
        }
        return A[i--]; // возвращаем последний эл и удаляем его
    }
    public boolean full() // метод проверки заполнения стека
    { 
        return i == n-1; // если индекс верхнего элемента стека равен кол-ву эл-ов минус один, значит стек полон, возвращаем true, иначе false
    }
    public boolean emp() // метод проверки наличия элементов в стеке
    { 
        return i == -1; // если индекс верхнего элемента стека равен -1, значит стек пуст, возвращаем true, иначе false
    }


public class stekck 
{
    public static void main(String[] args) {
        Steck s = new Steck(5); // создание стека 

        s.push(13); 
        s.push(77); 
        s.push(8); 
        s.push(321); 
        s.push(24); 
        s.push(998);

        System.out.println("Stack:"); // выводим сообщение
        int a;
        while (!s.emp()) { // пока стек не пуст
            a = s.pop(); // присваиваем значение последнено добавленного эл переменной rez и удаляем эл
            System.out.println(a);
        }
    }
}
}
