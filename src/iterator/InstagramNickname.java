package iterator;

public class InstagramNickname implements ContainerIterator {

    public String[] nicknames = {
            "mr.orange____",
            "tertychnaya_k",
            "stitless",
            "oleg_koshkovsky_",
            "vissefy",
            "bradlot",
            "morgan.flexer"
    };

    @Override
    public Iterator getIterator() {
        return new NicknameIterator();
    }

    private class NicknameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < nicknames.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return nicknames[index++];
            }

            return null;
        }
    }
}
