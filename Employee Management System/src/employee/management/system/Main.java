package employee.management.system;import javax.swing.*;import java.awt.*;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import static java.awt.Color.white;public class Main extends JFrame {    Main(){        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/EmployeeImg.jpg"));        Image i2 = i1.getImage().getScaledInstance(900,400,Image.SCALE_DEFAULT);        ImageIcon i3 = new ImageIcon(i2);        JLabel img = new JLabel(i3);        img.setBounds(0,0,900,400);        add(img);        JLabel heading = new JLabel("Employee Management System");        heading.setForeground(Color.yellow);        heading.setBounds(270,155,390,40);        heading.setFont(new Font("Raleway",Font.BOLD,25));        img.add(heading);        JButton add = new JButton("Add Employee Here");        add.setForeground(Color.yellow);        add.setBounds(300,270,150,40);        add.setBackground(Color.blue);        add.addActionListener(new ActionListener() {            @Override            public void actionPerformed(ActionEvent e) {                new AddEmp();                setVisible(false);            }        });        img.add(add);        JButton view = new JButton("View Employee Here");        view.setForeground(Color.yellow);        view.setBounds(465,270,150,40);        view.setBackground(Color.blue);        view.addActionListener(new ActionListener() {            @Override            public void actionPerformed(ActionEvent e) {                new ViewEmp();                setVisible(false);            }        });        img.add(view);        setSize(900,450);        setLocation(250,100);        setLayout(null);        setVisible(true);    }    public static void main(String[] args) {        new Main();    }}