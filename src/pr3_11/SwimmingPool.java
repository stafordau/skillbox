package pr3_11;

public class SwimmingPool {
    public static void main(String[] args) {
        int volume = 1200;

        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int nowVolume = 0;
        int minutes =0;

        while (nowVolume < volume) {
            nowVolume = nowVolume + fillingSpeed - devastationSpeed;
            minutes++;
        }
        System.out.println("ВРемя в минутах: " + minutes);

    }
}
