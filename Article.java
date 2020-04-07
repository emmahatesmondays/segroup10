public class Article {
    
    private String title = "";
    private String body = "";
    private String name = "";
    private String date = "";
    private String category = "";
    
    public Article(String title2, String body2,String name2, String date2, String category2){
        title = title2;
        body = body2;
        name = name2;
        date = date2;
        category = category2;
    }
    public void articleEdit(String title2, String body2,String name2, String date2, String category2){
        title = title2;
        body = body2;
        name = name2;
        date = date2;
        category = category2; 
    }
}
