package com.example.retrofit.demo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        Call<Integer> get = service.addUser(new User("zzzz", 111));
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
        Call<Integer> get = service.addUser(new User("zzzz", 111));
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

    public static void main(String[] args) {
        Test.case1();
        Test.case2();
        Test.case3();
        Test.case4();
    }
}
