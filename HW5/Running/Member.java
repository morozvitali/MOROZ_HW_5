package HW5.Running;

    abstract class Member{
// якщо не буде доступа к макс длине то треба зробити геттери (в батьківському класі стоїть протектед!
        protected int maxLenght;
        protected int maxHight;

        public int getMaxLenght() {return maxLenght;}
        public int getMaxHight() {return  maxHight;}

        abstract void run();
        abstract void jump();
}
