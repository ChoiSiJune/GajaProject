package gaja.project.domain;


public class Criteria {  

  private int page;
  private int perPageNum;

  public Criteria() {
    this.page = 1;
    this.perPageNum = 10;
  }

  public void setPage(int page) {

    if (page <= 0) {
      this.page = 1;
      return;
    }

    this.page = page;
  }

  public void setPerPageNum(int perPageNum) {  // 한페이지당 보여지는 갯수 

    if (perPageNum <= 0 || perPageNum > 100) {
      this.perPageNum = 10;
      return;
    }

    this.perPageNum = perPageNum;
  }

  public int getPage() {
    return page;
  }

  // method for MyBatis SQL Mapper -
  public int getPageStart() {      //시작하는 데이터 번호 

    return (this.page - 1) * perPageNum;
  }

  // method for MyBatis SQL Mapper
  public int getPerPageNum() {  // 한페이지당 보여지는 갯수 

    return this.perPageNum;
  }

  @Override
  public String toString() {
    return "Criteria [page=" + page + ", "
        + "perPageNum=" + perPageNum + "]";
  }
}
