
public class Test {
	public static void main(String[] args){
		Person taro= new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="090-1122-3344";
		taro.address="taro@email.com";
		
		
		Person jiro= new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="090-4455-6677";
		jiro.address="jiro@email.com";
		
		Person hanako= new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="080-1122-3344";
		hanako.address="hanako@email.com";
		
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
	}
}