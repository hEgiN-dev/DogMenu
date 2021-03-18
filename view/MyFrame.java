package view;

import model.WeekDays;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 300;
    private static final int TEXT_FIELD_SIZE = 30;
    private static final WeekDays[] weekDays = WeekDays.values();

    private static final String WEIGHT_DOG_LABEL_TEXT = "Вес собаки:";
    private static final String PERCENT_LABEL_TEXT = "Процент от веса:";
    private static final String CALCULATE_BUTTON_TEXT = "Рассчитать";
    private static final String TITLE_ONE_PANEL = "Общее меню";
    private static final String TITLE_TWO_PANEL = "Меню на неделю";


    private JTextField weightDog;
    private JTextField percentWeightDog;
    private JButton buttonCalculatePortion;
    private JScrollPane scrollPane ;
    private JScrollPane jScrollPane;
    private JTable table ;
    private JTable tableWeekDay;
    private JComboBox<? extends WeekDays> week;

    public MyFrame() {
        super("Калькулятор");

        initView();
    }

    private void initView() {
        add(initPane());

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JTabbedPane initPane(){
        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.add(TITLE_ONE_PANEL, initPanel());
        jTabbedPane.add(TITLE_TWO_PANEL, initWeekMenuPanel());
        return jTabbedPane;

    }


    private JPanel initWeekMenuPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        week = new JComboBox<>(weekDays);
       // week.setSelectedIndex(0);
        tableWeekDay = new JTable();
        tableWeekDay.setPreferredScrollableViewportSize(new Dimension(400,80));
        tableWeekDay.setFillsViewportHeight(false);
        jScrollPane = new JScrollPane(tableWeekDay);

        panel.add(week);
        panel.add(jScrollPane);
        return panel;
    }

    private JPanel initPanel(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());

        JLabel weightDogLabel = new JLabel(WEIGHT_DOG_LABEL_TEXT);
        weightDog = new JTextField(TEXT_FIELD_SIZE);
        JLabel percentDogLabel = new JLabel(PERCENT_LABEL_TEXT);
        percentWeightDog = new JTextField(TEXT_FIELD_SIZE);
        buttonCalculatePortion = new JButton(CALCULATE_BUTTON_TEXT);
        table = new JTable();
        table.setPreferredScrollableViewportSize(new Dimension(400,80));
        table.setFillsViewportHeight(false);
        scrollPane = new JScrollPane(table);

        jPanel.add(weightDogLabel);
        jPanel.add(weightDog);
        jPanel.add(percentDogLabel);
        jPanel.add(percentWeightDog);
        jPanel.add(buttonCalculatePortion);
        jPanel.add(scrollPane);

        return jPanel;

    }

    public JTextField getWeightDog() {
        return weightDog;
    }

    public void setWeightDog(JTextField weightDog) {
        this.weightDog = weightDog;
    }

    public JTextField getPercentWeightDog() {
        return percentWeightDog;
    }

    public void setPercentWeightDog(JTextField percentWeightDog) {
        this.percentWeightDog = percentWeightDog;
    }

    public JButton getButtonCalculatePortion() {
        return buttonCalculatePortion;
    }

    public void setButtonCalculatePortion(JButton buttonCalculatePortion) {
        this.buttonCalculatePortion = buttonCalculatePortion;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JComboBox<? extends WeekDays> getWeek() {
        return week;
    }

    public void setWeek(JComboBox<? extends WeekDays> week) {
        this.week = week;
    }

    public JTable getTableWeekDay() {
        return tableWeekDay;
    }

    public void setTableWeekDay(JTable tableWeekDay) {
        this.tableWeekDay = tableWeekDay;
    }
}
