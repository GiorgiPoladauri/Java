class Main {
    public static void main(String[] args) {
        System.out.println("Gio Gaumarjos");
    }
}

class AnotherClass {
    public static void main(String[]args) {
        System.out.println("Hello World");
    }
}

class HelloWorld {
    public static void main(String[] args) {
        int age;
        age=27;
        System.out.println("I am " + age + " years old");
    }
}

//This is comment
/*This is multiline comment */
 
class NumbeReview {
    static Long aLargeNumber=123456789L;
    public static void main(String[] args) {
        System.out.println(aLargeNumber);
    }
}

class Vaja {
    public static void main(String[] args) {
        int a=123;
        int b=321;
        if (a>b) {
            System.out.println("a is higher than b");
        }
        if (a==b) {
            System.out.println("a equals to b");
        }
        else {
            System.out.println("a is less than b");
        }
    }
}
class Giorgi {
    public static void main(String[] args) {
        int qeti=43;
        int vaja=45;
        int elene=19;
        if(qeti+vaja==elene){
            System.out.println("Their age is equal");
        }
        if(qeti+vaja>elene){
            System.out.println("Qeti's and Vaja's age is more than Elenes age!");
        }
        else{
            System.out.println("Elenes age is more than those two children's age");
        }
    }
}

class David {
    public static void main(String[] args) {  
            int MyMoney=44000;
            int HousePrice=39000;
            int CarPrice=7000;
            if(MyMoney>=HousePrice+CarPrice){
                System.out.println("You can buy a house and a car,because you can afford them both!");
            }
            if(MyMoney<HousePrice+CarPrice){
                if(MyMoney<HousePrice){
                    if(MyMoney<CarPrice){
                        System.out.println("Sorry,you can't buy either....You are poor");
                    }
                }
            }
            if(MyMoney<HousePrice+CarPrice){
                if(MyMoney<HousePrice){
                    if(MyMoney>CarPrice){
                        System.out.println("Congrats,you can only buy a new car!");
                    }
                }
            }
            if(MyMoney<HousePrice+CarPrice){
                if(MyMoney>HousePrice){
                    if(MyMoney<CarPrice){
                        System.out.println("Congrats,you can only buy a brand new house!");
                    }
                }
            }
            if(MyMoney<HousePrice+CarPrice){
                if(MyMoney>CarPrice){
                    if(MyMoney>HousePrice){
                        System.out.println("You can afford only one,either a house or a car! ");
                    }
                }
            }

    }
}

class Giorgio {
    public static void main(String[] args) {
        
    }
}
