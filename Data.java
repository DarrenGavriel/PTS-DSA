public class Data {
    private String title;
    private String singer;
    private int year;
    private int duration;

    public Data(String title,String singer,int year,int duration){
    setTitle(title);
    setSinger(singer);
    setYear(year);
    setDuration(duration);
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
    public String getSinger(){
        return singer;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void cetakData(){
            System.out.printf("| %-15s | %-15s | %-6d | %-5d detik |%n", getTitle(), getSinger(), getYear(), getDuration()); 
        //System.out.println(title + " - " + singer + " , " + year +  " [" + duration + " detik]" );
    }
}

