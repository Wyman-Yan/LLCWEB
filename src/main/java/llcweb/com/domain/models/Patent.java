package llcweb.com.domain.models;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author tong
 * 专利的实体类
 *
 */
@Entity
@Table(name="patent")
public class Patent {
	   @Id
	   @GeneratedValue
	   public Integer id;
	   
	   //专利标题
	   @Column(name = "title", length = 64)
	   public String title;
	   
	   //申请日期
	   @Column(name = "application_date")
	   public Date appliDate;
	   
	   //文章简介
	   @Column(name = "introduction", length = 255)
	   public String introduction;
	   
	   //发明人，作者姓名列表，对应people表的姓名，也可以是外面合作人员
	   @Column(name = "author_list", length = 128)
	   public String authorList;
	   
	   //原文链接
	   @Column(name = "original_link", length = 64)
	   public String originalLink;
	   
	   //所属项目id
	   @Column(name = "belong_project", length = 11)
	   public String belongProject;
	   
	   //专利申请号
	   @Column(name = "appli_num", length = 11)
	   public String appliNum;
	   
	   //专利公开号
	   @Column(name = "public_num", length = 11)
	   public String publicNum;
	   
	   //公开日期
	   @Column(name = "public_date")
	   public Date publicDate;
	   
	   //代理机构
	   @Column(name = "agency", length = 128)
	   public String agency;
	   
	   //申请人（一般为广东工业大学）
	   @Column(name = "appli_people", length = 64)
	   public String appliPeople;
	   
	   public Patent() {
		   
	   }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getAppliDate() {
		return appliDate;
	}

	public void setAppliDate(Date appliDate) {
		this.appliDate = appliDate;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getAuthorList() {
		return authorList;
	}

	public void setAuthorList(String authorList) {
		this.authorList = authorList;
	}

	public String getOriginalLink() {
		return originalLink;
	}

	public void setOriginalLink(String originalLink) {
		this.originalLink = originalLink;
	}

	public String getBelongProject() {
		return belongProject;
	}

	public void setBelongProject(String belongProject) {
		this.belongProject = belongProject;
	}

	public String getAppliNum() {
		return appliNum;
	}

	public void setAppliNum(String appliNum) {
		this.appliNum = appliNum;
	}

	public String getPublicNum() {
		return publicNum;
	}

	public void setPublicNum(String publicNum) {
		this.publicNum = publicNum;
	}

	public Date getPublicDate() {
		return publicDate;
	}

	public void setPublicDate(Date publicDate) {
		this.publicDate = publicDate;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getAppliPeople() {
		return appliPeople;
	}

	public void setAppliPeople(String appliPeople) {
		this.appliPeople = appliPeople;
	}

	@Override
	public String toString() {
		return "Patent [id=" + id + ", title=" + title + ", appliDate=" + appliDate + ", introduction=" + introduction
				+ ", authorList=" + authorList + ", originalLink=" + originalLink + ", belongProject=" + belongProject
				+ ", appliNum=" + appliNum + ", publicNum=" + publicNum + ", publicDate=" + publicDate + ", agency="
				+ agency + ", appliPeople=" + appliPeople + "]";
	}
	   
	   
}