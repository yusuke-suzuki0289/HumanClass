package jp.techacademy.yusuke2.suzuki.javalog;

/**
 * Created by yusus on 2016/09/07.
 */
import android.util.Log;

class BigDog extends Dog {
    // クラス変数
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}