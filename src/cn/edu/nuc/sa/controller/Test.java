package cn.edu.nuc.sa.controller;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="上海^上海市@闵行区#吴中路";
		String[] splitAddress=address.split("\\^|@|#");
		System.out.println(splitAddress[0]+splitAddress[1]+splitAddress[2]+splitAddress[3]); 
	}

}
