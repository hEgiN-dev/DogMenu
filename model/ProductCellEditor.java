package model;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;


public class ProductCellEditor extends AbstractCellEditor implements TableCellEditor {

    private JSpinner editorPercentProduct;

    public ProductCellEditor() {

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return null;
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }
}
