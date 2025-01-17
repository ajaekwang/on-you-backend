package stg.onyou.model.network;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Header<T> {

    private String transactionTime;
    private String resultCode;
    private String description;
    private T data;

    //OK
    public static <T> Header<T> OK(){
        return (Header<T>)Header.builder()
                .transactionTime(String.valueOf(LocalDateTime.now()))
                .resultCode("OK")
                .description("OK")
                .build();
    }

    //DATA OK
    public static <T> Header<T> OK(T data){
        return (Header<T>)Header.builder()
                .transactionTime(String.valueOf(LocalDateTime.now()))
                .resultCode("OK")
                .description("OK")
                .data(data)
                .build();
    }

    public static <T> Header<T> ERROR(String description){
        return (Header<T>)Header.builder()
                .transactionTime(String.valueOf(LocalDateTime.now()))
                .resultCode("ERROR")
                .description(description)
                .build();
    }







}
