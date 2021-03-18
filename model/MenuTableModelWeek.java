package model;

import repository.DataBase;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class MenuTableModelWeek extends AbstractTableModel {

    private int column = 3;
    private int row = 5;
    private WeekDays weekDays;
    private DataBase dataBase = new DataBase();
    private Menu menu;

    public MenuTableModelWeek(WeekDays weekDays) {
      menu = new Menu(dataBase.createMenuWeek(weekDays));
    }


    @Override
    public int getRowCount() {
        return row;
    }

    @Override
    public int getColumnCount() {
        return column;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Продукт";
            case 1:
                return "Вес";
            case 2:
                return "Процент";

        }
        return "";
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return menu.getProducts().get(rowIndex).getTitle();
            case 1:
                return menu.getProducts().get(rowIndex).getWeight();
            case 2:
                return menu.getProducts().get(rowIndex).getPercent();
            default:
                throw new IllegalStateException("Unexpected value: " + columnIndex);
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
            case 2:
                return Double.class;
            default:
                return Object.class;
        }
    }

//    @Override
//    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//        switch (columnIndex) {
//            case 0:
//                menu.setProducts((List<Product>) aValue);
//            case 1:
//                menu.setProducts((List<Product>+ " + columnIndex);
//        }
//    }


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

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public WeekDays getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(WeekDays weekDays) {
        this.weekDays = weekDays;
    }


}
