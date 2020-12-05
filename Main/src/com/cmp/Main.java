package com.cmp;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
                JFrame frame = new JFrame("Application");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {
        private IntMatrix intMatrix;
        private JTable table;
        private DefaultTableModel model;
        private JSpinner fldRows;
        private JSpinner fldColumns;
        private boolean created = false;

        public TestPane() {

            setLayout(new BorderLayout());

            fldRows = new JSpinner(new SpinnerNumberModel(1, 1, 999999, 1));
            fldColumns = new JSpinner(new SpinnerNumberModel(1, 1, 999999, 1));

            JPanel options = new JPanel(new GridBagLayout());
            options.add(new JLabel("Rows: "));
            options.add(fldRows);
            options.add(new JLabel("Columns: "));
            options.add(fldColumns);

            JButton update = new JButton("Update");
            options.add(update);

            update.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int rows = (int) fldRows.getValue();
                    int cols = (int) fldColumns.getValue();
                    table.setModel(new DefaultTableModel(rows, cols));
                    intMatrix = new IntMatrix(new int[rows * cols], rows, cols);
                    created = true;
                }
            });
            JButton random = new JButton("Random");
            options.add(random);
            random.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(created) {
                        int rows = (int) fldRows.getValue();
                        int cols = (int) fldColumns.getValue();
                        TableModel model = intMatrix.fillMatrixByRandomValues(rows,cols);
                        table.setModel(model);
                    }
                }
            });
            model = new DefaultTableModel();
            table = new JTable();
            add(new JScrollPane(table));
            add(options, BorderLayout.NORTH);

            JPanel sortirovka = new JPanel(new GridBagLayout());
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.fill = GridBagConstraints.HORIZONTAL;

            constraints.gridy   = 0  ;
            constraints.insets = new Insets(5, 0, 0, 0);
            JButton sort1 = new JButton("QuickSort");
            sortirovka.add(sort1,constraints);

            sort1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(created) {
                        int rows = (int) fldRows.getValue();
                        int cols = (int) fldColumns.getValue();
                        for(int i = 0;i < 2; i++) {
                            TableModel model = intMatrix.gradientMatrix(rows, cols, 1);
                            table.setModel(model);
                        }

                    }
                }
            });

            JButton sort2 = new JButton("Selection Sort");
            constraints.gridy   = 1  ;
            sortirovka.add(sort2,constraints);

            sort2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(created) {
                        int rows = (int) fldRows.getValue();
                        int cols = (int) fldColumns.getValue();
                        for(int i = 0;i < 2; i++) {
                            TableModel model = intMatrix.gradientMatrix(rows, cols, 2);
                            table.setModel(model);
                        }
                    }
                }
            });

            JButton sort3 = new JButton("Merge Sort");
            constraints.gridy   = 2  ;
            sortirovka.add(sort3,constraints);

            sort3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(created) {
                        int rows = (int) fldRows.getValue();
                        int cols = (int) fldColumns.getValue();
                        for(int i = 0;i < 2; i++) {
                            TableModel model = intMatrix.gradientMatrix(rows, cols, 3);
                            table.setModel(model);
                        }
                    }
                }
            });

            JButton sort4 = new JButton("Insertion Sort");
            constraints.gridy   = 3  ;
            sortirovka.add(sort4,constraints);

            sort4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(created) {
                        int rows = (int) fldRows.getValue();
                        int cols = (int) fldColumns.getValue();
                        for(int i = 0;i < 2; i++) {
                            TableModel model = intMatrix.gradientMatrix(rows, cols, 4);
                            table.setModel(model);
                        }
                    }
                }
            });

            JButton sort5 = new JButton("Bubble Sort");
            constraints.gridy   = 4  ;
            sortirovka.add(sort5,constraints);

            sort5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(created) {
                        int rows = (int) fldRows.getValue();
                        int cols = (int) fldColumns.getValue();
                        for(int i = 0;i < 2; i++) {
                            TableModel model = intMatrix.gradientMatrix(rows, cols, 5);
                            table.setModel(model);
                        }
                    }
                }
            });

            JButton sort6 = new JButton("Метод сортировки 6");
            constraints.gridy   = 5  ;
            sortirovka.add(sort6,constraints);

            sort6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int rows = (int) fldRows.getValue();
                    int cols = (int) fldColumns.getValue();
                    table.setModel(new DefaultTableModel(rows, cols));
                }
            });

            JButton sort7 = new JButton("Метод сортировки 7");
            constraints.gridy   = 6  ;
            sortirovka.add(sort7,constraints);

            sort7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int rows = (int) fldRows.getValue();
                    int cols = (int) fldColumns.getValue();
                    table.setModel(new DefaultTableModel(rows, cols));
                }
            });

            JButton sort8 = new JButton("Метод сортировки 8");
            constraints.gridy   = 7  ;
            sortirovka.add(sort8,constraints);

            sort8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int rows = (int) fldRows.getValue();
                    int cols = (int) fldColumns.getValue();
                    table.setModel(new DefaultTableModel(rows, cols));
                }
            });

            JButton sort9 = new JButton("Метод сортировки 9");
            constraints.gridy   = 8  ;
            sortirovka.add(sort9,constraints);

            sort9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int rows = (int) fldRows.getValue();
                    int cols = (int) fldColumns.getValue();
                    table.setModel(new DefaultTableModel(rows, cols));
                }
            });

            JButton sort10 = new JButton("Метод сортировки 10");
            constraints.gridy   = 9  ;
            sortirovka.add(sort10,constraints);

            sort10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int rows = (int) fldRows.getValue();
                    int cols = (int) fldColumns.getValue();
                    table.setModel(new DefaultTableModel(rows, cols));
                }
            });

            add(sortirovka, BorderLayout.WEST);
        }
    }
}