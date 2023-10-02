package Secao13.Exercicios.Aplications;

import Secao13.Exercicios.Entities.Comment;
import Secao13.Exercicios.Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Comment cm1 = new Comment("Have a nice trip!");
        Comment cm2 = new Comment("Wow that's awesome!");

        Post post = new Post(sdf1.parse("21/06/2018 13:05:44"),"Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        post.addComment(cm1);
        post.addComment(cm2);

        Comment cm3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post post2 = new Post(
                sdf1.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        post2.addComment(cm3);
        post2.addComment(c4);

        System.out.println(post);
        System.out.println(post2);
    }
}
