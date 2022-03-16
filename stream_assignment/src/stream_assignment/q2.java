package stream_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
    @Override
    public String toString() {
		return "News{" +
                "newsId=" + newsId +
                ", postedByUser='" + postedByUser + '\'' +
                ", commentByUser='" + commentByUser + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    	
    }
}

public class q2 {
    public static int maxComments(List<News> news) {
    	int max=0;
    	List<News> news1=news.stream()
    	.filter(news2->news.stream()
                .anyMatch(one->one.getNewsId()==news2.getNewsId() && one!=news2)).collect(Collectors.toCollection(ArrayList::new));
    	Map<Integer,Integer>mp=new HashMap<>();
        for(News news2:news){
               if(mp.containsKey(news2.getNewsId())){
                   mp.put(news2.getNewsId(),mp.get(news2.getNewsId())+1);
               }
               else{
                   mp.put(news2.getNewsId(),1);
               }
        }
        Set s1 = mp.entrySet();
        Iterator itr = s1.iterator();

        int id=0;
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if(max<(int)m1.getValue()) {
                max = (int) m1.getValue();
                id = (int)m1.getKey();
            }

        }
        System.out.println(max);
        return id;

    }

    public static int budgetCount (List < News > news) {
    	String budget="budget";
        long budgtC=news.stream()
                .filter(p->p.getComment().contains(budget)).count();
        System.out.println(budgtC);
        return (int)budgtC;
    	
    }
    public static String maxCommentsByUser (List < News > news) {
    	List<News> news1=news.stream()
    			.filter(news2->news.stream()
                        .anyMatch(one->one.getCommentByUser()==news2.getCommentByUser() && one!=news2)).collect(Collectors.toCollection(ArrayList::new));

        Map<String,Integer>mp=new HashMap<>();
        for(News news2:news){
            if(mp.containsKey(news2.getCommentByUser())){
                mp.put(news2.getCommentByUser(),mp.get(news2.getCommentByUser())+1);
            }
            else{
                mp.put(news2.getCommentByUser(),1);
            }
        }

        Set s1 = mp.entrySet();
        Iterator itr = s1.iterator();

        String id="";
        int max=0;
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if(max<(int)m1.getValue()) {
                max = (int) m1.getValue();
                id = (String)m1.getKey();
            }

        }
        System.out.println(id);

        return id;
    	
    	
    }

    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {
    	Map<String,Long>mp1=new HashMap<>();
        mp1=news.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));


        List<Map.Entry<String, Long> > list =
                new LinkedList<Map.Entry<String, Long> >(mp1.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Long> >() {
            public int compare(Map.Entry<String, Long> o1,
                               Map.Entry<String, Long> o2)
            {
                return -(o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Long> aa : list) {
            temp.put(aa.getKey(), (int) (long)aa.getValue());
        }
        return temp;
    	
    }

    public static void main(String[] args) {
    	
    	List<News> news=new ArrayList<>();
        news.add(new News(1,"adarsh","rudra","budget"));
        news.add(new News(2,"rudra","ravindra","ojbdhvjhbcj,jhjhgjhg"));
        news.add(new News(4,"yuvraj","chotu","ahhaaa"));
        news.add(new News(3,"bittu","bunty","budget"));
        news.add(new News(8,"rudransh","chicha","jhbjfhvb"));
        news.add(new News(6,"mota","bhaukali","budget"));
        maxComments(news);
        budgetCount(news);
        maxCommentsByUser(news);
        System.out.println(sortMaxCommentsByUser(news));
        
    }
}