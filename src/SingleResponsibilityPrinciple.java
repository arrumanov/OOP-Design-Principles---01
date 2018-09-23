public class SingleResponsibilityPrinciple {
    public void ViolateS(String str){
        System.out.println(this.EditStr(str));
    }

    public void NotViolateS(String str){
        this.PrintSomewhere(this.EditStr(str));
    }

    private void PrintSomewhere(String str){
        System.out.println(str);
    }

    private String EditStr(String str){
        return str.toUpperCase();
    }
}
