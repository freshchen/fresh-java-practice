package com.example.retrofit.demo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.time.OffsetDateTime;

public class Test {

    public static void case1() {
        DemoService service = DemoService.getInstance();
        Call<User> get = service.getUser();
        get.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.code() == 200) {
                    System.out.println("case1 " + response.body());
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable throwable) {

            }
        });
    }

    public static void case2() {
        DemoService service = DemoService.getInstance();
        Call<Integer> get = service.addUser(new User());
        get.enqueue(new Callback<Integer>() {
            @Override
            public void onResponse(Call<Integer> call, Response<Integer> response) {
                System.out.println("case2 " + response.body());
            }

            @Override
            public void onFailure(Call<Integer> call, Throwable throwable) {

            }
        });
    }

    public static void case3() {
        DemoService service = DemoService.getInstance();
        Call<User> get = service.getUser();
        get.enqueue(new CallbackFunction.Builder<User>()
                .onResponse(((userCall, userResponse) -> {
                    if (userResponse.code() == 200) {
                        System.out.println("case3 " + userResponse.body());
                    }
                }))
                .onFailure(((userCall, throwable) -> {
                }))
                .build()
        );
    }

    public static void case4() {
        DemoService service = DemoService.getInstance();
        Call<Integer> get = service.addUser(new User());
        get.enqueue(new CallbackFunction.Builder<Integer>()
                .onResponse(((call, response) -> {
                    if (response.code() == 200) {
                        System.out.println("case4 " + response.body());
                    }
                }))
                .onFailure(((userCall, throwable) -> {
                }))
                .build()
        );
    }


    public static void case5() throws IOException {
        DemoService service = DemoService.getInstance();
        User user = new User();
        user.setName("wang");
        user.setAge(11);
        user.setStartTime(java.util.Optional.of(OffsetDateTime.now()));
        user.setEndTime(java.util.Optional.of(OffsetDateTime.now()));
        Call<Integer> get = service.addUser(user);
        Response<Integer> execute = get.execute();
        System.out.println(execute);
    }

    public static void main(String[] args) throws IOException {
//        Test.case1();
//        Test.case2();
//        Test.case3();
//        Test.case4();
        Test.case5();
    }
}
