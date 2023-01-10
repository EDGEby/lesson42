package lesson42;



public class Log {
    String type;
    int count;

    public Log(String type, int count) {
        this.type = type;
        this.count = count;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Log{" +
                "type='" + type + '\'' +
                ", count=" + count +
                '}';
    }






}




