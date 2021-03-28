package com.vti.academy.entity;
import java.util.Date;

public class Exam {
	int id;
    String code;
    String title;
    CategoryQuestion[] categoryQuestion;
    int duration;
    Account account;
    Date createDate;
    Question[] questions;
}
