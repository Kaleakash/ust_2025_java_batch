package adapter;
class Volt {
	int volts;
	public Volt(int volts) {
		this.volts=volts;
	}
	public int getVolts() {
		return volts;
	}
	public void setVolts(int volts) {
		this.volts = volts;
	}
}
class Socket {
	public Volt getVolts() {
		return new Volt(120);
	}
}
interface SocketAdpater {
	public Volt get120Volts();
	public Volt get12Volts();
	public Volt get3Volts();
}
class SocketAdapterImp implements SocketAdpater{
	Socket ss = new Socket();
	@Override
	public Volt get120Volts() {
				return ss.getVolts();
	}
	@Override
	public Volt get12Volts() {
		Volt vv = ss.getVolts();		//vv hold 120 
		return new Volt(vv.getVolts()/10);	// 12 volts 
	}
	@Override
	public Volt get3Volts() {
		Volt vv = ss.getVolts();		// vv hold 120 
		return new Volt(vv.getVolts()/40);	// 3 volts 
	}
}
public class AdapterDesignTest {

	public static void main(String[] args) {
		SocketAdpater adpater = new SocketAdapterImp();
		Volt v1 = adpater.get120Volts();
		Volt v2 = adpater.get12Volts();
		Volt v3 = adpater.get3Volts();
		System.out.println("volt "+v1.getVolts());
		System.out.println("volt "+v2.getVolts());
		System.out.println("volt "+v3.getVolts());

	}

}
