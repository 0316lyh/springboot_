package com.itheima.domain;

/**
 * @author :liangyuhang1
 * @className :Book
 * @date :2023/3/19/14:41
 */
public class Book {
    private int id;
    private String type;
    private String name;
    private String description;

    public Book(String type, String name, String description) {
        this.type = type;
        this.name = name;
        this.description = description;
    }

    public Book(int id, String type, String name, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
