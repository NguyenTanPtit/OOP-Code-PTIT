package J05079;

public class LopHocPhan implements Comparable<LopHocPhan> {
    private String id, name, groupId, proName;

    public LopHocPhan(String id, String name, String groupId, String proName) {
        this.id = id;
        this.name = name;
        this.groupId = groupId;
        this.proName = proName;
    }

    public String getId() {
        return id;
    }

    public String getProName() {
        return proName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + groupId;
    }

    @Override
    public int compareTo(LopHocPhan o) {
        if (this.id.equals(o.id))
            return this.groupId.compareTo(o.groupId);
        else
            return this.id.compareTo(o.id);
    }
}
