package create_and_destory;

import java.util.Stack;

/**
 * @anthor LingChen
 * @create 8/9/2019 2:53 PM
 * @Description
 */
public class OOMStack {

    /**
     * 内存泄漏
     * 1
     * 类似于栈这个数据结构，内存的管理权不属于JVM而属于栈本身，所有被pop掉的index上还存在着过期的引用
     * Stack.pop()的源码中手动清除了过期引用
     * elementData[elementCount] = null; /* to let gc do its work
     *
     * 2
     * 将对象引用放入了缓存，可以用WeakHashMap作为引用外键
     *
     * 3
     * 监听器和其他回调，可以用WeakHashMap作为引用外键
     *
     */
}
