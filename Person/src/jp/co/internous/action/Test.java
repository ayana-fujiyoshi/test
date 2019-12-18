package jp.co.internous.action;

public class Test {
	public static void main(String[] args){
		Person taro = new Person();
		taro.name="山田 太郎";
		taro.age=20;
		taro.phoneNumber="080-0000-0000";
		taro.address="東京都";
		taro.talk();
		taro.walk();
		taro.run();

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);

		Person jiro = new Person();
		jiro.name="木村 次郎";
		jiro.age=18;
		jiro.phoneNumber="090-1234-5678";
		jiro.address="埼玉県";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);

		Person hanako = new Person();
		hanako.name="鈴木 花子";
		hanako.age=16;
		hanako.phoneNumber="070-9876-5432";
		hanako.address="千葉県";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		Robot aibo = new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
