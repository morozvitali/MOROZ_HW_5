package src.main.java.hillel.hw.running.member;

    public abstract class Member{

        private String nameOfMember;
        private double maxLenght;
        private double maxHight;

        public Member (String nameOfMember, double maxLenght, double maxHight) {
            this.nameOfMember = nameOfMember;
            this.maxHight = maxHight;
            this.maxLenght = maxLenght;
        }

        public double getMaxLenght() {return maxLenght;}
        public double getMaxHight() {return  maxHight;}
        public String getNameOfMember () {return nameOfMember;}

        abstract void run();
        abstract void jump();

        public void setMaxLenght() {this.maxLenght = maxLenght;}
        public void setMaxHight() {this.maxHight = maxHight;}
        public void setNameOfMember () {this.nameOfMember = nameOfMember;}

    }
