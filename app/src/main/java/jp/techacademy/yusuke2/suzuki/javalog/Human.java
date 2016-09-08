package jp.techacademy.yusuke2.suzuki.javalog;

import android.util.Log;

/**
 * Created by yusus on 2016/09/07.
 */
class Human extends Animal implements Thinkable {

    //GitHubへの連携検証のためこめんと行作成

    String hobby; //趣味（←Humanクラス内にhobbyを宣言）

    // 引数付きコンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メソッド
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。");
        Log.d("javatest", "私の年齢は" + this.age + "歳です。");
//        Log.d("javatest", name + "は" + hobby + "について考える。"); //interfaceを使用しない場合は、本行を有効化することで同じ結果を得られる。
    }

    @Override
    public void think() {
        Log.d(" javatest", name + "は" + hobby + "について考える。");
    }

}
