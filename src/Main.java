public class Main {

    public static void main(String[] args) {
        var str = "Hello World!";
        var s = new SingleResponsibilityPrinciple();
        //нарушение принципа (две обязанности: редактирование полученной строки и ее вывод)
        s.ViolateS(str);
        //обязанности разделены, что упростит дальнейшее возможное изменение кода при изменении требований
        s.NotViolateS(str);


        var oc = new OpenClosedPrinciple();
        oc.MainMethod();
        //а это уже нарушение принципа
        //а так уже будет нарешение принципа, так как уже придется изменять код самого класса
        //если изменится принцип транспартировки
        Aircraft aircraft = new Aircraft();
        aircraft.Transport();


        //при подстановке подтипа нарушается работа приложения => принцип нарушен
        var l = new LiskovSubstitutionPrinciple();
        l.MainMethod();

        //доступно слишком много разнообразных действий для одного интерфейса
        //лучше разделить на несколько интерфейсов, и при необходимости их реализовывать
        var god = new InterfaceSegregationPrinciple().GetGodObject();
    }

    //Dependency Inversion Principle
    public class Book {

        private String text;
        //нарушение инверсии зависимостей, так как нет отделения от конкретной реализации
        //необходимо отделить абстракцию от реализации (через интерфейс)
        private ConsolePrinter printer;

        public ConsolePrinter getConsolePrinter() {
            return printer;
        }

        public void setConsolePrinter(ConsolePrinter cp) {
            printer = cp;
        }

        {
            text = "Hello World!";
        }

        public void Print() {
            this.getConsolePrinter().Print(this.text);
        }
    }

    class ConsolePrinter
    {
        public void Print(String text)
        {
            System.out.println(text);
        }
    }
}
