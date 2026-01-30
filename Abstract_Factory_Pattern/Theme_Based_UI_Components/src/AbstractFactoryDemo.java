public class AbstractFactoryDemo {

    public static void main(String[] args) {

        ThemeFactory factory;

        // Assume theme is chosen at runtime
        factory = new DarkThemeFactory();

        Button btn = factory.createButton();
        TextBox txt = factory.createTextBox();

        btn.render();
        txt.render();
    }
}