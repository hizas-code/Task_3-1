/*Hizas Sabilal Rasyad
  1301140251
  IF3801
 */
public class Driver
{
	public static void main(String[] args)
	{
		AppStore aps = new AppStore();
		aps.createNewApp( "app1" , 100 );
		aps.createNewApp( "app2" , 200 );
		aps.createNewApp( "app3" , 300 );
		aps.createNewApp( "app4" , 400 );
		System.out.println( aps.toString() );
		System.out.println( aps.getApp( 2 ).toString());
		SmartPhone sm = new SmartPhone();
		sm.setMemory(300);
		System.out.println( sm.toString());
		sm.addApplication( aps, 0 );
		System.out.println(sm.toString());
	}
}
