package model;

import repository.DataBase;
import javax.swing.table.AbstractTableModel;

public class MenuTableModel extends AbstractTableModel {

    private int column = 3;
    private int row = 5;
    private DataBase dataBase = new DataBase();
    private Menu menu;

    public MenuTableModel() {
        menu = new Menu(dataBase.createGeneralLayoutProductDay());

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
        switch (column){
            case 0 : return "Продукт";
            case 1 : return "Вес";
            case 2 : return "Процент";

        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0 : return menu.getProducts().get(rowIndex).getTitle();
            case 1 : return menu.getProducts().get(rowIndex).getWeight();
            case 2 : return menu.getProducts().get(rowIndex).getPercent();
            default:
                throw new IllegalStateException("Unexpected value: " + columnIndex);
        }

   }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
