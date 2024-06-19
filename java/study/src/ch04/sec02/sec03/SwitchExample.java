package ch04.sec02.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = ((int) (Math.random() * 5)+1);
        switch (num) {
            case 1:
                System.out.println("I'm 1!");
                break;
                case 2:
                    System.out.println("I'm 2!");
                    break;
                    case 3:
                        System.out.println("I'm 3!");
                        break;
                        case 4:
                            System.out.println("I'm 4!");
                            break;
                            case 5:
                                System.out.println("I'm 5!");
                                break;
                                case 6:
                                    System.out.println("I'm 6!");
                                    break;
            default:
                System.out.println("I'm default!");
                break;
        }
    }
}
