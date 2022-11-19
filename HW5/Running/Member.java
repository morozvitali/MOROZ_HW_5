package HW5.Running;

    abstract class Member{

        protected String nameOfMember;
        protected int maxLenght;
        protected int maxHight;


        public int getMaxLenght() {return maxLenght;}
        public int getMaxHight() {return  maxHight;}
        public String getNameOfMember () {return nameOfMember;}
        abstract void run();
        abstract void jump();
}
