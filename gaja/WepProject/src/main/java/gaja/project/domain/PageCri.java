package gaja.project.domain;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageCri {

  private int totalCount;
  private int startPage;
  private int endPage;
  private boolean prev;
  private boolean next;
  
  private pageing page;
  
  private int displayPageNum = 10; //하단의 페이지 번호수 

  
  
public int getTotalCount() {
	return totalCount;
}

public void setTotalCount(int totalCount) {
	this.totalCount = totalCount;
	

	calData();
	
}

public int getStartPage() {
	return startPage;
}

public void setStartPage(int startPage) {
	this.startPage = startPage;
}

public int getEndPage() {
	return endPage;
}

public void setEndPage(int endPage) {
	this.endPage = endPage;
}

public boolean isPrev() {
	return prev;
}

public void setPrev(boolean prev) {
	this.prev = prev;
}

public boolean isNext() {
	return next;
}

public void setNext(boolean next) {
	this.next = next;
}

public pageing getPage() {
	return page;
}

public void setPage(pageing page) {
	this.page = page;
}

public int getDisplayPageNum() {
	return displayPageNum;
}

public void setDisplayPageNum(int displayPageNum) {
	this.displayPageNum = displayPageNum;
}


private void calData() {
	
	int num = (int)(Math.ceil(page.getPage()/(double) displayPageNum) * displayPageNum);
	System.out.println(num);
	
	endPage = (int)(Math.ceil(page.getPage()/(double) displayPageNum) * displayPageNum ); // 끝페이지 구하기 공식
	
	startPage = (endPage - displayPageNum) + 1;
	
	int tempEndPage = (int) (Math.ceil(totalCount/(double) page.getPerPageNum()));
	

    if (endPage > tempEndPage) {
      endPage = tempEndPage;
    }

    prev = startPage == 1 ? false : true;

    next = endPage * page.getPerPageNum() >= totalCount ? false : true;
   	
	
}



public String makeQuery(int pagenum) {

		UriComponents uri =
				UriComponentsBuilder.newInstance()
				.queryParam("page", pagenum) //현재 페이지값
				.queryParam("perPageNum", page.getPerPageNum())
				.queryParam("searchType", page.getSearchType())
				.queryParam("keyword", page.getKeyword())
				.build();
	

	
	return uri.toUriString();

	
	
}


}
