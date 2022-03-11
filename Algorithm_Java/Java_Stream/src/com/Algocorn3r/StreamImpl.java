package com.Algocorn3r;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamImpl {

    public static void main(String[] args) {

        List<Integer> list = List.of(10, 3, 1, 6, 7);

        System.out.println(list);

        //filter
        List<Integer> evenlist = list
                .stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        evenlist.forEach(e->{
            System.out.println(e);
        });


        evenlist.forEach(System.out::println);


        IntStream number =Arrays.stream(new int[]{2, 3, 4}); // number stream used 1st time

        number.forEach(System.out::println);

        //map

        List<Integer> list1 = list.stream().map(e -> e * e).collect(Collectors.toList());
        System.out.println(list1);

        //sorted

        //IntStream sorted = number.sorted(); ---> number stream already used once : exception

//        sorted.forEach(e->{
//            System.out.println(e);
//        });


        List<Integer> sortedlist = list.stream().sorted().collect(Collectors.toList());

        sortedlist.forEach(System.out::println);

        Stream<String> stringStream = Stream.of();
        Optional<String> result1 = stringStream.findFirst();
        System.out.println(result1.get());

    }
}
