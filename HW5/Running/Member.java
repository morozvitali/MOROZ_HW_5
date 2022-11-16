package HW5.Running;

    abstract class Member{
// якщо не буде доступа к макс длине то треба зробити геттери (в батьківському класі стоїть протектед!
        protected double maxLenght;
        protected double maxHight;

        public double getMaxLenght() {return maxLenght;}
        public double getMaxHight() {return  maxHight;}

        abstract void run();
        abstract void jump();
}
