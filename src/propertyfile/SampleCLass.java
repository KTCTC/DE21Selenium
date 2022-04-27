package propertyfile;

public class SampleCLass {

	public static void main(String[] args) {

PropertyHelper pr = new PropertyHelper("DE21Prop.properties");

System.out.println(pr.getPropertyValue("passWord"));
System.out.println(pr.getPropertyValue("userName"));

	}

}
