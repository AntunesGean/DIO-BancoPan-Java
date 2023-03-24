public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("SmartTv is on: " + smartTv.power);
        System.out.println("SmartTv channel: " + smartTv.channel);
        System.out.println("SmartTv volume: " + smartTv.volume);

        smartTv.power();
        System.out.println("SmartTv is on: " + smartTv.power);
        
        smartTv.channel(13);
        System.out.println("SmartTv channel: " + smartTv.channel);

        smartTv.power();
        System.out.println("SmartTv is on: " + smartTv.power);
    }
}
