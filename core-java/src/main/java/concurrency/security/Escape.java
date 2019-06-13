package concurrency.security;

import concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: fresh-languages
 * @Date: 2019/6/2 13:46
 * @Author: Ling Chen
 * @Description: 可能出现Escape没有完全构造完成时候，私有属性就以及被发布出来，导致溢出
 */
@NotThreadSafe
@Slf4j
public class Escape {
    private int thisCanBeEscape = 0;

    public Escape() {
        new InnnerClass();
    }

    private class InnnerClass {

        public InnnerClass() {
            log.info("{}", Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
