import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminUI {    public JFrame view;

    public JButton btnSystemConfig = new JButton("System Config");
    public JButton btnNewUser = new JButton("New User");
    public JButton btnDeleteUser = new JButton("Delete User");


    public AdminUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Admin View");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnSystemConfig);
        panelButtons.add(btnNewUser);
        panelButtons.add(btnDeleteUser);

        view.getContentPane().add(panelButtons);


//        btnSystemConfig.addActionListener(new ActionListener() {
//            @Override
////            public void actionPerformed(ActionEvent actionEvent) {
////                ManageProductUI ui = new ManageProductUI();
////                ui.run();
//            }
//        });
//
//        btnNewUser.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                ManageCustomerUI ui = new ManageCustomerUI();
//                ui.run();
//            }
//        });
//
//        btnDeleteUser.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                ManageCustomerUI ui = new ManageCustomerUI();
//                ui.run();
//            }
//        });

    }
}
