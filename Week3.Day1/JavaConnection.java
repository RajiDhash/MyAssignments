package week3.Day1;

public class JavaConnection extends MySqlConnection   {
    @Override
	public void connect()
	{
		System.out.println("The database is connected");
	}
	@Override
	public void disconnect()
	{
		System.out.println("The database is didconnected");
		}
	@Override
	public void executeUpdate()
	{
		System.out.println("The database is updated");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();

	}

}
