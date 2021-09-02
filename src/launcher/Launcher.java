package launcher;

import gui.SimplePresentationScreen;
import entities.Student;
import java.awt.EventQueue;


public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		EventQueue.invokeLater(new Runnable() {
            public void run() {
            	try {
            		
            		
            		Student stud1 = new Student(127574, "Ferrante", "Agust\u00edn Bautista",
            				"agusferrantee@hotmail.com", "https://github.com/Agustin-Bautista-Ferrante",
            				"/images/foto.png");
            		
            		new SimplePresentationScreen(stud1);
            		
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
    }
}