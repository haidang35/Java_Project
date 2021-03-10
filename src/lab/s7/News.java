package lab.s7;

import java.util.ArrayList;

public class News implements INews{
    public int id;
    public String title;
    public String publishDate;
    public String author;
    public String content;
    public float averageRate;
    ArrayList<Integer> RateList;

    public News() {
        RateList=new ArrayList<>(3);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
         System.out.println("Title: "+getTitle());
         System.out.println("PublishDate: "+getPublishDate());
         System.out.println("Author: "+getAuthor());
         System.out.println("Content: "+getContent());
         System.out.println("AverageRate: "+getAverageRate());
    }
    public float Calculate(){
        int count=0;
        int c=0;
        for(int s: RateList){
            count++;
            c+=s;

        }
        return this.averageRate=c/count;

    }



}
