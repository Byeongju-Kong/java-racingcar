package racingcar.view.input.reader;

public class CustomReader implements Reader {

    private String text;

    public void initText(String text) {
        this.text = text;
    }

    @Override
    public String readLine() {
        return text;
    }

}