package dev.mvc.faq;

import java.util.HashMap;
import java.util.List;

import dev.mvc.notice.NoticeVO;

public interface FaqDAOInter {
  
  /**
   * <xmp>
   * FAQ 등록 처리
   * <insert id="create" parameterType="FaqVO"> 
   * @param faqVO
   * @return
   * </xmp>
   */
  public int create(FaqVO faqVO);
  
  /**
   * <xmp>
   * 출력 순서 내림차순 전체 목록
   * <select id="list" resultType="FaqVO">
   * @return
   * </xmp>
   */
  public List<FaqVO> list_seqno_desc();
  
  /**
   * <xmp>
   * FAQ 조회
   * <select id="read" resultType="FaqVO" parameterType="int">  
   * @param faqno FAQ 번호
   * @return
   * </xmp>
   */
  public FaqVO read(int faqno);
    
  /**
   * <xmp>
   * 수정 폼
   * <update id="update" parameterType="FaqVO">
   * @param faqno
   * @return
   * </xmp>
   */
  public FaqVO update(int faqno);
  
  /**
   * <xmp>
   * 수정 처리
   * <update id="update" parameterType="FaqVO">
   * @param faqno
   * @return
   * </xmp>
   */
  public int update(FaqVO faqVO);
  
  /**
   * 패스워드 검사
   * <select id="passwd_check" parameterType="HashMap" resultType="int">
   * @param hashMap
   * @return
   */
  public int passwd_check(HashMap hashMap);
  
  /**
   * 삭제
   * <delete id="delete" parameterType="int"> 
   * @param noticeno
   * @return
   */
  public int delete(int faqno);
  
  /**
   * 출력 순서 상향
   * <xmp>
   * <update id="update_seqno_up" parameterType="int">
   * </xmp>
   * @param faqno
   * @return 처리된 레코드 갯수
   */
  public int update_seqno_up(int faqno);
 
  /**
   * 출력 순서 하향
   * <xmp>
   * <update id="update_seqno_down" parameterType="int">
   * </xmp>
   * @param faqno
   * @return 처리된 레코드 갯수
   */
  public int update_seqno_down(int faqno); 
    
  /**
   * <xmp>
   * FAQ 검색 목록
   * <select id="list_by_faq_search" resultType="FaqVO" parameterType="HashMap">
   * </xmp>
   * @param hashMap
   * @return
   */
  public List<FaqVO> list_by_faq_search(HashMap<String, Object> hashMap);
  
  /**
   * <xmp>
   * FAQ 검색 레코드 갯수
   * <select id="faq_search_count" resultType="int" parameterType="HashMap">
   * </xmp>
   * @param hashMap
   * @return
   */
  public int faq_search_count(HashMap<String, Object> hashMap);
   
  /**
   * <xmp>
   * 검색 + 페이징 목록
   * <select id="list_by_faq_search_paging" resultType="FaqVO" parameterType="HashMap">
   * </xmp>
   * @param map
   * @return
   */
  public List<FaqVO> list_by_faq_search_paging(HashMap<String, Object> map);
  
  
}
