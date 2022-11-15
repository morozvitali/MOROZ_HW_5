package HW5.Running;

    abstract class Member{
        String name;
        private double runLenght;
        private double jumpHight;
        public double getRunLenght() {
            return runLenght;
        }
        public double getJumpHight() {
            return  jumpHight;
        }
        void run() {System.out.print("i'm "+ this.name + " and i run over ");}
        void jump() { System.out.print("i'm "+ this.name + " and i jump over ");}
}
