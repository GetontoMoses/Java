public class LightSwitch {
    //from MySwitch
    public static void main(String[] args){
        MySwitch Socket=new MySwitch();
        System.out.println(Socket.on);
        Socket.switch_();
        System.out.println(Socket.isOn());
    }
}
