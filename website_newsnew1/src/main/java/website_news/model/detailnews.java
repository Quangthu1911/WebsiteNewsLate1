package website_news.model;

import java.util.Comparator;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="detailnews")
public class detailnews implements Comparable<detailnews> {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int iddetailnews;
	private int idcategory;
	private String title;
	private String quote;
	private String image1;
	private String content;
	@Temporal(TemporalType.TIMESTAMP)
	private Date create_time;
	private String countseen;
	
	public int getIddetailnews() {
		return iddetailnews;
	}
	public void setIddetailnews(int iddetailnews) {
		this.iddetailnews = iddetailnews;
	}
	public int getIdcategory() {
		return idcategory;
	}
	public void setIdcategory(int idcategory) {
		this.idcategory = idcategory;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getCountseen() {
		return countseen;
	}
	public void setCountseen(String countseen) {
		this.countseen = countseen;
	}
	public detailnews(int iddetailnews, int idcategory, String title, String quote, String image1,
			String content, Date create_time, String countseen) {
		super();
		this.iddetailnews = iddetailnews;
		this.idcategory = idcategory;
		this.title = title;
		this.quote = quote;
		this.image1 = image1;
		this.content = content;
		this.create_time = create_time;
		this.countseen = countseen;
	}
	public detailnews()
	{}
	public int compareTo(detailnews o) {
		if(this.countseen==null)
		{
			return 0;
		}
		else
		{
			return this.countseen.compareTo(o.countseen);
		}
		
	}
}
