package jp.techacademy.yusuke2.suzuki.javalog;

/**
 * Created by yusus on 2016/09/07.
 */
import android.util.Log;

class Dog extends Animal implements Movable  {

    // クラス変数
    static String to_jp = "犬";

//    // 変数
//    String name;      // 名前
//    int age;    // 年齢

    // コンストラクタ
//    public Dog() {
//        name = "";
//        age = 0;
//    }
    // 引数付きコンストラクタ
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    // メソッド
    public void say() {
        Log.d("javatest", name + "(" + age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }

}