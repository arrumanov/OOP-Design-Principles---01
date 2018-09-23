public class Aircraft {

    public void Transport(){
        this.Print("\n");
        this.Start();
        this.Move();
        this.End();
        this.Print("\n");
    }

    private void Print(String str){
        System.out.println(str);
    }

    private void Start() {
        this.Print("взлет");
    }

    private void Move() {
        this.Print("полет");
    }

    private void End() {
        this.Print("приземление");
    }
}
