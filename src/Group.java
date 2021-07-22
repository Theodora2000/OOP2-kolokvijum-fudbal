public enum Group {

    A("Group A"),
    B("Group B"),
    C("Group C"),
    D("Group D"),
    E("Group E"),
    F("Group F"),
    G("Group G"),
    H("Group H"),
    ROUND("Round of 16"),
    QUARTER("Quarer-finals"),
    SEMI("Semi-finals"),
    THIRD("Match for third place"),
    FINAL("Final");

    String desc;

    private Group(String desc){
        this.desc = desc;
    }

    public static Group fromString(String desc){
        for(Group g : Group.values()){
            if(desc.equalsIgnoreCase(g.desc)){
                return g;
            }
        }
        return null;
    }

    public String toString(){
        return desc;
    }
}
