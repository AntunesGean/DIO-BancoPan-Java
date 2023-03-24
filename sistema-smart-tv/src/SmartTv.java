public class SmartTv {
  boolean power = false;
  int channel = 1;
  int volume = 25;

  public void power() {
    power = !power;
  }

  public void channelUp() {
    channel++;
  }

  public void channelDown() {
    channel--;
  }

  public void channel(int channel) {
    this.channel = channel;
  }

  public void volumeUp() {
    volume++;
  }

  public void volumeDown() {
    volume--;
  }
}
