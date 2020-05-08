package pl.coderslab.domain.model;

import org.hibernate.mapping.ToOne;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200)
    private String title;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private Author author;
    @OneToMany
    private List<Category> category =
            new ArrayList<>();
    @Column(columnDefinition = "text")
    private String content;
    @Column(name = "created_on")
    private LocalDateTime created;
    @Column(name = "updated_on")
    private LocalDateTime updated;

    public Article(Long id, String title,
                   Author author, List<Category> category,
                   String content, LocalDateTime created,
                   LocalDateTime updated) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.content = content;
        this.created = created;
        this.updated = updated;
    }

    public Article() {
    }

    @PrePersist
    public void prePersist(){
        created = LocalDateTime.now();
    }
    @PreUpdate
    public void preUpdate(){
        updated = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(id, article.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", category=" + category +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
