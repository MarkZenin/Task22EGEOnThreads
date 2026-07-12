

public class TimerThreads extends Thread {
    private ID id;
    private int name;
    private long time;
    private boolean fulfilled;
    public TimerThreads(Integer name, ID id, boolean fulfilled) {
        this.name = name;
        setName(name.toString());
        this.id = id;
        this.fulfilled = fulfilled;
    }

    @Override
    public void run() {
        setTime(getRootFollowedID(name, 0));
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getRootFollowedID(int key, int sum, int max) {
        if (id.getNextFollowedID(key) != 0)
            return getRootFollowedID(id.getNextFollowedID(key), sum += id.getTime(key), );
        return sum + id.getTime(key);
    }
}
