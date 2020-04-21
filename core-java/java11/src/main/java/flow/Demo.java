package flow;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.stream.IntStream;

/**
 * @author darcy
 * @since 2020/02/25
 **/
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher<Integer> feed = new SubmissionPublisher<>();
        feed.subscribe(new Flow.Subscriber<>() {
            private Flow.Subscription subscription;
            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                subscription.request(3);
            }

            @Override
            public void onNext(Integer item) {
                System.out.println(item);
                subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Done");
            }
        });

        IntStream.range(0,20).forEach(feed::submit);

        Thread.sleep(0x457);

    }

}
