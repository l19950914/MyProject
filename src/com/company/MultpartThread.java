package com.company;

public class MultpartThread {

    public static void main(String[] args) {
          class TestThreadState extends  Thread{
            @Override
            public void run() {
                State state = Thread.currentThread().getState();
                System.out.println(state);
            }
        }
        new TestThreadState().start(); // start new thread of main thread
        // 线程中的状态  new 出来为新建状态 start 之后为就绪状态  拿到cpu的执行权 running （ready running 统称为 runnable） waiting timewaing terminate
        // 在线程中 被加入synchronized 将会进入blocking 状态所以线程的状态  new runnable waiting timewaiting block terminated
        // synchrionzed 关键字的本质是对象头的markwork 。
        // mysql 中批量插入数据  insert into tableName values （），（）
        // insert into table <foreach list = list itme= item index =index ,speartor=','>(item.id,item,name,item.birth_date) </foreach>

    }

    // 这个方法锁定的是类锁  java文件编译之后的class文件被 classloader 加载如jvm内存中 会生成一个java.lang.class这个对象 所以静态代码块或者是加入synchrionezd的
    // 静态方法锁的是 类锁
    // 锁可以是任何对象也可以是this自己 但是要保证是同一个对象才能保证锁的互斥如果每次都new对象那么每次都锁的是不同对象 这样无法实现锁的互斥 那么锁也就没有类意义
    public synchronized static void mm(){
    }
    public void m(){
        synchronized (this){}
    }
    public static void m1(){
        // 加static代表这是一个类锁 这里不能使用this 或者是一个对象 因为他们都不是类锁
        synchronized (MultpartThread.class){}
    }



    static class Test{

        //类锁
        public synchronized static void t(){
            System.out.println("我是类对象的锁，锁的是整个类");
        }
        // this 对象锁如果每次都是同一个this对象存在锁竞争 但是每次自己new一个对象将不会发生锁竞争 因为获取锁的时候发现获取的是不同的锁不存在锁竞争
        public synchronized void tt(){
            System.out.println("我是this对象锁，锁的是this对象");
            ttt();
        }
        public void ttt(){
            System.out.println("我是非同步方法，可以在同步方法中执行");
        }
        //  同步方法和非同步方法可以同时执行 非同步方法在执行的时候就没有获取锁这一步
        public static void main(String[] args) {
            System.out.println("main thread name: "+Thread.currentThread().getName());
        }

    }
}
