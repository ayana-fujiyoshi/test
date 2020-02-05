
public class FizzBuzz {
public static void main (String[] args) throws java.lang.Exception

{

for(int i=1; i<=100; i++){

//3の倍数かつ5の倍数のときFizzBuzzと表示する
if((i % 3 == 0) && (i % 5 == 0)){

System.out.println("FizzBuzz");

//3の倍数の時Fizzと表示する
}
else if(i % 3 == 0){

System.out.println("Fizz");

//5の倍数の時Buzzと表示する
}
else if(i % 5 == 0){
System.out.println("Buzz");

}
else{

System.out.println(i);
}

}

}

}
/*
 * このプログラム言語を選択したのはなぜですか。
→私が最も勉強している言語であるからです。

*作成時に工夫した点、苦労した点は何ですか。
→できるだけ簡潔になるようにまとめました。
また、他の人が見ても分かりやすくなるようにコメントを追記致しました。

*作成時に参考にしたものがあれば記載してください。
→internousで過去に制作した物を復習で参考に致しました。
*/