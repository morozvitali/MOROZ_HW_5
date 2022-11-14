package HW5.Running;

    abstract class Member{

        double runLenght;
        double jumpHight;

        public double getRunLenght() {
            return runLenght;
        }

        public double getJumpHight() {
            return  jumpHight;
        }

        void run() {System.out.println("i'm member and i'm  run");}
    void jump() { System.out.println("i'm member and i'm  jump");}
}
