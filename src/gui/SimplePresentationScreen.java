package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JFrame frame;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		frame = new JFrame();
		frame.setSize(new Dimension(615, 250));
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentaci\u00f3n");
		
		contentPane = new JPanel();
		contentPane.setVisible(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);

		
		frame.setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		
		
		
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(600, 275));
		tabbedPane.addTab("Informaci\u00f3n del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		JLabel lblMail = new JLabel("E-mail");
		lblMail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblLu = new JLabel("LU");
		lblLu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblGithubURL = new JLabel("Github URL");
		lblGithubURL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JTextPane jtpShowId = new JTextPane();
		jtpShowId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtpShowId.setText(String.valueOf(studentData.getId()));
		jtpShowId.setEditable(false);
		
		JTextPane jtpShowApellido = new JTextPane();
		jtpShowApellido.setText(studentData.getLastName());
		jtpShowApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtpShowApellido.setEditable(false);
		
		JTextPane jtpShowNombres = new JTextPane();
		jtpShowNombres.setText(studentData.getFirstName());
		jtpShowNombres.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtpShowNombres.setEditable(false);
		
		JTextPane jtpShowMail = new JTextPane();
		jtpShowMail.setText(studentData.getMail());
		jtpShowMail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtpShowMail.setEditable(false);
		
		JTextPane jtpShowGitHubUrl = new JTextPane();
		jtpShowGitHubUrl.setText(studentData.getGithubURL());
		jtpShowGitHubUrl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtpShowGitHubUrl.setEditable(false);
		
		
		JLabel lblImg = new JLabel("New label");
				
		lblImg.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		
		
		
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblNombres, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jtpShowNombres, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jtpShowApellido, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblMail, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jtpShowMail, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_tabInformation.createSequentialGroup()
									.addComponent(lblLu, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jtpShowId, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_tabInformation.createSequentialGroup()
									.addComponent(lblGithubURL, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jtpShowGitHubUrl, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblImg, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblImg, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLu, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(jtpShowId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
								.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(jtpShowApellido, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombres, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(jtpShowNombres, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMail, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(jtpShowMail, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGithubURL, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(jtpShowGitHubUrl, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addGap(15)))
					.addContainerGap())
		);
		gl_tabInformation.setHonorsVisibility(false);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane, BorderLayout.WEST);
	}
}
