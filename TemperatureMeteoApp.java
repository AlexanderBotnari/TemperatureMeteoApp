import java.util.Random;
public class TemperatureMeteoApp {

	public static void main(String[] args) {
		PrivateMeteoProvider.getCurrentTemperature(100);
		PrivateMeteoProvider.getCurrentHumidity(100);
		PrivateMeteoProvider.getCurrentTemperature(036);
		PrivateMeteoProvider.getCurrentHumidity(036);
		PrivateMeteoProvider.getCurrentTemperature(156);
		PrivateMeteoProvider.getCurrentHumidity(156);
		PrivateMeteoProvider.getCurrentTemperature(276);
		PrivateMeteoProvider.getCurrentHumidity(276);
		PrivateMeteoProvider.getCurrentTemperature(643);
		PrivateMeteoProvider.getCurrentHumidity(643);
		PrivateMeteoProvider.getCurrentTemperature(373);
		PrivateMeteoProvider.getCurrentHumidity(373);
		/*OpenMeteoProvider.getCurrentTemperature(100);
		PrivateMeteoProvider.getCurrentHumidity(100);
		OpenMeteoProvider.getCurrentTemperature(036);
		PrivateMeteoProvider.getCurrentHumidity(036);
		OpenMeteoProvider.getCurrentTemperature(156);
		PrivateMeteoProvider.getCurrentHumidity(156);
		OpenMeteoProvider.getCurrentTemperature(276);
		PrivateMeteoProvider.getCurrentHumidity(276);
		OpenMeteoProvider.getCurrentTemperature(643);
		PrivateMeteoProvider.getCurrentHumidity(643);
		OpenMeteoProvider.getCurrentTemperature(373);
		PrivateMeteoProvider.getCurrentHumidity(373);*/
	}
}
class OpenMeteoProvider {
    static double getCurrentTemperature( int countryCode ){
    	int min = -50;
    	int max = 50;
    	int diff = max - min;
    	Random random = new Random();
    	int t = random.nextInt(diff + 1);
    	t += min;
    	if(countryCode == 100) {//bulgaria
    		System.out.println("The temperature in Bulgary is : " + t + "°C");
    	}else if(countryCode == 036) {//australia
    		System.out.println("The temperature in Australia is : " + t + "°C");
    	}else if(countryCode == 156) {//china
    		System.out.println("The temperature in China is : " + t + "°C");
    	}else if(countryCode == 276) {//germany
    		System.out.println("The temperature in Germany is : " + t + "°C");
    	}else if(countryCode == 643) {// russia
    		System.out.println("The temperature in Russian Federation is : " + t + "°C");
    	}else {
    		System.out.println( "Error! Can't provide data for this country!");
    	}
    	return t;
    }
}
class  PrivateMeteoProvider extends OpenMeteoProvider{
	static byte getCurrentHumidity( int countryCode ) {
		int min = 0;
		int max = 100;
		int diff = max - min;
		Random random = new Random();
		byte h = (byte) random.nextInt(diff + 1);
    	h += min;
    	if(countryCode == 100) {
    		System.out.println("The humidity in Bulgary is : " + h + " % ");
    	}else if(countryCode == 036) {
    		System.out.println("The humidity in Australia is : " + h + " % ");
    	}else if(countryCode == 156) {
    		System.out.println("The humidity in China is : " + h + " % ");
    	}else if(countryCode == 276) {
    		System.out.println("The humidity in Germany is : " + h + " % ");
    	}else if(countryCode == 643) {
    		System.out.println("The humidity in Russian Federation is : " + h + " % ");
    	}else {
    		System.out.println( "Error! Can't provide data for this country!");
    	}
    	return h;
	}
}
