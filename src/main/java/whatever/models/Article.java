package whatever.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import whatever.utils.DateSerialize;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 公众号文章
 * Created by lijc on 15/4/7.
 */
@Entity
@Table(name = "article")
//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Article extends BaseModel{

    @NotNull
    private String title;

    @NotNull
    private String url;

    @JsonIgnore
    private String imgLink;

    private String headImage;

    private String content168;

//    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")

    private Date pubDate;

    private Date lastModified;

    private String accountName;

    private int likeCount;

    private int dislikeCount;

    private int commentCount;


    private String largeImg;

    private String smallImg;

    @JsonIgnore
    private String originDate;

    //首要文章为大图显示，非首要为小图显示
    @NotNull
    private Boolean isChief;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="account_id", nullable=true)
//    @JsonIgnore
    private Long accountId;

    //manyToMany 以后留作tag之用
//    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinTable(name = "article_category",joinColumns = @JoinColumn(name = "article_id"),inverseJoinColumns = @JoinColumn(name = "category_id"))
//    @JsonManagedReference("cate")
//    private List<Category> categories = new ArrayList<>();

    @NotNull
    private Long categoryId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getContent168() {
        return content168;
    }

    public void setContent168(String content168) {
        this.content168 = content168;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    public long getAccountId() {
        return accountId == null ? 0 : accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getCategoryId() {
        return categoryId == null ? 0 : categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Boolean getIsChief() {
        return isChief == null ? false : isChief;
    }

    public void setIsChief(Boolean isChief) {
        this.isChief = isChief;
    }

    //    public void setCategories(List<Category> categories) {
//        this.categories = categories;
//    }
//
//    public List<Category> getCategories(){
//        return categories;
//    }


    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(int dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    public String getOriginDate() {
        return originDate;
    }

    public void setOriginDate(String originDate) {
        this.originDate = originDate;
    }



    public String getLargeImg() {
        return largeImg;
    }

    public void setLargeImg(String largeImg) {
        this.largeImg = largeImg;
    }

    public String getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(String smallImg) {
        this.smallImg = smallImg;
    }

    @JsonSerialize(using = DateSerialize.class)
    public Date getPubDate() {
        return pubDate;
    }


    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
}
