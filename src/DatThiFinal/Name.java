package DatThiFinal;

public class Name implements Comparable<Name> {
    private String name;

    public Name(String name) {
        this.name = name;
    }
    private String chuanHoa(){
        String name = this.name.trim().toLowerCase();
        String [] tu = name.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String value : tu) {
            res.append(Character.toUpperCase(value.charAt(0))).append(value.substring(1)).append(" ");
        }
        return res.toString().trim();
    }

    @Override
    public String toString() {
        return chuanHoa();
    }

    @Override
    public int compareTo(Name o) {
        String [] s1 = this.chuanHoa().split(" ");
        String [] s2 = o.chuanHoa().split(" ");
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        if(s1[s1.length-1].equals(s2[s2.length-1])){
            if(s1[0].equals(s2[0])){
                for (int i = 1 ; i < s1.length-1;i++){
                    res1.append(s1[i]).append(" ");
                }
                for (int i = 1 ; i < s2.length-1;i++){
                    res2.append(s2[i]).append(" ");
                }

                return res1.toString().trim().compareTo(res2.toString().trim());
            }
            return s1[0].compareTo(s2[0]);
        }
        return s1[s1.length-1].compareTo(s2[s2.length-1]);
    }
}
