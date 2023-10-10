package StudentInfo;

public class Students {
public void getStudentInfo(int id,String name) {
	System.out.println(id+"\n" +name);
}
public void getStudentInfo(String Email,int Number) {
	System.out.println(Email+"\n" +Number);
}
public static void main(String[] args) {
	Students info=new Students();
	info.getStudentInfo(52,"Malini");
	info.getStudentInfo("abc@gamil.com", 636925603);
}

}
