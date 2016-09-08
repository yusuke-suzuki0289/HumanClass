package jp.techacademy.yusuke2.suzuki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("鈴木", 30, "ダンス");     // 名前を鈴木、年齢30歳で、Humanのインスタンスを作る（=Human Classの呼び出し）

            human.say() ;
            human.think();

    }

}
//        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
//
//        dog.move();
//
//        dog.say();  // ポチが吠えます（ログ出力）
//        Log.d("javatest", "犬の名前は" + dog.name + "です。");
//        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");
//
//        BigDog bigdog = new BigDog("ヨーゼフ", 15);     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る
//
//        bigdog.say();
//        Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
//        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。");

//        Dog.introduce();
//        Log.d("javatest", Dog.to_jp + "のクラス変数です。");

//        Dog dog2 = new Dog("ハチ", 10);   // 名前をハチ、年齢10歳で、Dogインスタンスを作る
//        dog2.say();  // ハチが吠えます（ログ出力）
//        Log.d("javatest", "犬の名前は" + dog2.name + "です。");
//        Log.d("javatest", "犬の年齢は" + dog2.age + "歳です。");


//        int t = total(100, 1000);   // ここでtotalからsumを返してもらう
//        Log.d("javatest", String.valueOf(t));
////        total(50, 1000);
//    }
//
//    private int total(int first, int last) {
//        int sum = 0;
//        for (int i = first; i <= last; i++)  {
//            sum = sum + i;
//        }
//
//        return sum;
//
//        Log.d("javatest", String.valueOf(sum));

//        int[] points = new int[5];
//        points[0] = 10;
//        points[1] = 6;
//        points[2] = 15;
//        points[3] = 23;
//        points[4] = 17;
//
//        for (int i = 0; i < points.length; i++) {
//            Log.d("javatest", String.valueOf(points[i]));
//        }

//        for (int i = 1; i < 6; i++) {
//            Log.d("javatest", "for文の " + String.valueOf(i) + "回目");
//        }
//
//        int num = 1;
//
//        while (num < 6) {
//            Log.d("javatest", "while文の " + String.valueOf(num) + "回目");
//            num++;
//        }

//        for (int i = 0; i < 10; i++) {
//            Log.d("javatest", String.valueOf(i));
//        }

//        int drink = 1;
//
//        switch (drink) {
//        case 0:
//        Log.d("javatest", "コーヒーを注文しました");
//        break;
//        case 1:
//        Log.d("javatest", "紅茶を注文しました");
//        //break;
//        case 2:
//        Log.d("javatest", "ミルクを注文しました");
//        //break;
//        default:
//        Log.d("javatest", "オーダーミスです");
//        break;
//    }

        //int num = 60;

        //if (num >= 90) {
        //    Log.d("javatest", "優");
        //} else if (num >= 75) {
        //    Log.d("javatest", "良");
        //} else if (num >= 60) {
        //    Log.d("javatest", "可");
        //} else {
        //    Log.d("javatest", "不可");
        //}

        //int num1 = 10 + 5 - 2 * 4 / 2;
        //Log.d("javatest", "10 + 5 - 2 * 4 / 2 = " + String.valueOf(num1));

        //boolean flag1 = true;
        //boolean flag2 = false;
        //Log.d("javatest", "flag1 && flag2 = " + String.valueOf(flag1 && flag2));
        //Log.d("javatest", "flag1 || flag2 = " + String.valueOf(flag1 || flag2));

        //int num2 = 10;
        //int num3 = 20;
        //Log.d("javatest", "num2 < num3 = " + String.valueOf(num2 < num3));

        // 整数型の変数をnumという名前で作成して、10を代入する
        //int num = 10;
        //Log.d("javatest", String.valueOf(num));

        // numに50を代入する
        //num = 50;
        //Log.d("javatest", String.valueOf(num));

        //Log.d("javatest", "ログへの出力テスト");    // ここを追加
