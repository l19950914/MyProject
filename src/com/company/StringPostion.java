package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * referen ：一个referen的数值类型指向一个内存地址即为应用 但是这种引用只有引用和无引用无法描述 类似：cache无法描述
 *
 * 在jdk中有四种常用的reference  storlyReference softReference weakReference phantomReference
 * 普通对象的创建过程就是storyReference 强引用一般是不会回收 除非是引用指向为null
 * softReference 软引用：是一种有用但是没有必要的存在的一些对象 比如cache 缓存是有用的但是不是必须的 没有了我再去数据库中也可以再次查到
 * 所以softReference一般都是用在缓存中 只有内存不够的时候才会回收软引用
 * weakReference 弱引用就是每次gc的时候都会被回收
 * threadLocal 将是使用的weakReference threadLocal将是本地想成绑定 底层是数据存在 threadLocalMap中这是本地线程的成员变量 存的将是实际的数据
 * thradLocalMap是一个map 存的是 key value 键值对 （key value 被封装为一个Entry对象这个Entry对象是继承WeakReference）之所以设置为弱引用为了防止内存显露
 *
 * pantomReference 这是是虚引用 这个引用无法得到这个对象实例 这个引用也无法对这个对象的生命周期造成影响
 * 这个引用是管理堆外内存（在gc的时候给一个通知 其实将是将这堆外的对象内存下方到queue中 之后进行清除）
 *
 */
public class StringPostion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputParamsArray = br.readLine().split(";");
        List<String> stringList = new ArrayList<String>();

        for (String str : inputParamsArray) {
            if (!(str.startsWith("A") || str.startsWith("S") || str.startsWith("W") || str.startsWith("D"))) {
               continue;
            }
            Pattern pattern = Pattern.compile("\\d+$");
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()){
                stringList.add(str);
            }else {
                continue;
            }
            }
    }

}
