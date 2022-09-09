public class Pipe {
    private String type;
    private int column;
    private int row;
    private Pipe nextPipe;

    public Pipe(String type, int column, int row, Pipe nextPipe) {
        this.type = type;
        this.column = column;
        this.row = row;
        this.nextPipe = nextPipe;
    }

    @Override
    public String toString() {
        return "Pipe{" +
                "type='" + type + '\'' +
                ", column=" + column +
                ", row=" + row +
                ", nextPipe=" + nextPipe +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Pipe getNextPipe() {
        return nextPipe;
    }

    public void setNextPipe(Pipe nextPipe) {
        this.nextPipe = nextPipe;
    }
}
