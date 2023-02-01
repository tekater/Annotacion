public class New extends Other{
    @Override // Это аннотация
    public int sum() {
        return number / 2;
    }

    /*@Override
    public int sum(float number) {
        return number / 2;
    }*/
    @Deprecated
    // Указывает что метод устарел и далее не будет поддерживаться
    public void oldMethod() {
    }
    @Deprecated(since = "5.3", forRemoval = true)
    // since = требует версию в которой аннотируемый элемент является не поддерживаемым.
    // Дефолтное значение - пустая строка
    // forRemoval - булевое значение, является индикатором что аннотируемый элемент
    // будет удалён в будущей версии. Дефолтное значение - false
    public void printHello2() {
        System.out.println("Hello!");
    }
    // Что означает, наш метод printHello2 не будет поддерживаться с версии
    // 5.3 нашей библиотеки, а также будет удалён в следующем релизе.


    @SuppressWarnings("unused")
    public void printHello() {
        System.out.println("Hello!");
    }
    @SuppressWarnings("all") //@SuppressWarnings(value = "all") // //@SuppressWarnings("all","unused")
    // подавили предупреждение о делении на ноль
    public int divide() {
        return 2 / 0 ;
    }



}
