package jp.techacademy.yusuke2.suzuki.javalog;

/**
 * Created by yusus on 2016/09/07.
 */
abstract class Animal {
    // メンバ変数
    String name;  // 名前
    int age;    // 年齢
//    String hobby; //趣味（←レビュー指摘により、animalクラスには保持しない）

    abstract public void say();
}