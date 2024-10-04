package javapgm;

public class Even {
	static int num,flag=1;
	public static int checknum(int n) {
		num=n;
		if(n%2!=0) {
			flag=0;
		}
		return flag;
	}

}
