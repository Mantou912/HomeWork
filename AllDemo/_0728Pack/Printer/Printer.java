package HomeWork.AllDemo._0728Pack.Printer;

public class Printer implements InkBox, Paper {
    public void Print1() {
        System.out.println("使用" + box1 + "在" + paper1 + "纸张上打印");
    }

    public void Print2() {
        System.out.println("使用" + box2 + "在" + paper2 + "纸张上打印");
    }

    public void Print3() {
        System.out.println("使用" + box2 + "在" + paper3 + "纸张上打印");
    }
}
