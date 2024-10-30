package entity;

import java.time.LocalDateTime;

public class User {
    private int id;

    private String account;

    private String username;

    private String password;

    private String phone;

    private String email;

    private String sex;

    private String idnumber;

    private Integer status;

    private boolean isvip;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createtime;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastlogtime;
}
