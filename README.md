# TitleBar
Android自定义标题栏

在Android开发中，我们常常需要在标题栏中增加返回按钮和提交按钮，并将标题文字居中这就需要自定义标题栏。
<img src="https://ww3.sinaimg.cn/large/006tNc79gy1fcmg3a61tqj30u00hhq33.jpg" width="400px"/>

## 使用方法
```java
//设置标题名称
setTitle("标题");
//设置返回按钮并显示
showBackwardView(R.string.text_back,true);
//设置提交按钮并显示
showForwardView(R.string.text_forward, true);      
```

```java
/**
 * 重写点击返回按钮操作,返回按钮点击后触发
 * @param backwardView
 */
@Override
protected void onBackward(View backwardView) {
    super.onBackward(backwardView);
}
```

```java
/**
 * 重写点击提交按钮操作,提交按钮点击后触发
 * @param forwardView
 */
@Override
protected void onForward(View forwardView) {
    super.onForward(forwardView);
}
```

## 交个朋友
欢迎右上角Start/Fork！
你也可以关注[我的博客](http://lns666.me/)，和我做朋友。
