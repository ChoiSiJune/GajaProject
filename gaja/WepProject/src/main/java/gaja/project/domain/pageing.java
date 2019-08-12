package gaja.project.domain;

public class pageing {
	
	
	private int page;  //현재 목록 페이지번호
	private int perPageNum;  // 몇개씩 보여줄껀지의 번호 
	
	
	private String searchType;
	private String keyword;
	
	
	public pageing() {
		
		this.page = 1;
		this.perPageNum = 10;
		
	}
	
	
	public int getPage() {
		return page;
	}
	
	
	public void setPage(int page) {
		
		if(page <=0) {
			
			this.page=1;
			
			return;
		}
	
		this.page=page;
		
	}
	public int getPerPageNum() {
		return perPageNum;
	}
	
	
	public void setPerPageNum(int perPageNum) {
	
		
		if(perPageNum<=0 || perPageNum>100) {
			
			this.perPageNum = 10;
			
			return;
			
		}
		
		
		this.perPageNum = perPageNum;
	}
	
	
	
	public int getPageStart() {
		
		
		
		
		return (this.page - 1) * perPageNum;	
	}


	public String getSearchType() {
		return searchType;
	}


	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}


	public String getKeyword() {
		return keyword;
	}


	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
	
	
	
	
	
	
	
	
	

}
