import java.util.concurrent.ThreadLocalRandom;

public class OpenClosedPrinciple {

    public void MainMethod() {
        Transportation transportation = this.GetTransportation();
        transportation.Transport();
    }

    public Transportation GetTransportation(){
        Transportation transportation;
        if (Math.random() > 0.5){
            transportation = new Aircraft();
        }else {
            transportation = new Train();
        }
        return transportation;
    }

    abstract class Transportation {
        public void Transport(){
            this.Print("\n");
            this.Start();
            this.Move();
            this.End();
            this.Print("\n");
        }

        protected void Print(String str){
            System.out.println(str);
        }

        protected abstract void Start();
        protected abstract void Move();
        protected abstract void End();
    }

    public class Aircraft extends Transportation{

        @Override
        protected void Start() {
            this.Print("взлет");
        }

        @Override
        protected void Move() {
            this.Print("полет");
        }

        @Override
        protected void End() {
            this.Print("приземление");
        }
    }

    public class Train extends Transportation{

        @Override
        protected void Start() {
            this.Print("тронутся");
        }

        @Override
        protected void Move() {
            this.Print("двигаться");
        }

        @Override
        protected void End() {
            this.Print("остановиться");
        }
    }


}
