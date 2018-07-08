package org.yourorghere;
import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

public class The_fan implements GLEventListener,MouseListener,MouseMotionListener {
    public static void main(String[] args) {
            Frame frame = new Frame("Pertemuan 4 - Objek 3 Dimensi");
            GLCanvas canvas = new GLCanvas();
            canvas.addGLEventListener(new The_fan());
            frame.add(canvas);
            frame.setSize(1280, 800);
            final Animator animator = new Animator(canvas);
            frame.addWindowListener(new WindowAdapter() {
            @Override
    
    public void windowClosing(WindowEvent e) {
            new Thread(new Runnable() {
            public void run() {
            animator.stop();
            System.exit(0);
            }
            }).start();
        }
    });
            // Center frame
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            animator.start();
            }
   float angle = 1;
   float direction = 1;
    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        gl.glShadeModel(GL.GL_3D_COLOR);
        gl.glEnable(GL.GL_LIGHTING);
        gl.glEnable(GL.GL_LIGHT0);
        gl.glEnable(GL.GL_COLOR_MATERIAL);
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glEnable(GL.GL_NORMALIZE);
    }
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
            GL gl = drawable.getGL();
            GLU glu = new GLU();
            if (height <= 0) {
            height = 1;
            }
        final float h = (float) width / (float) height;
            gl.glViewport(0, 0, width, height);
            gl.glMatrixMode(GL.GL_PROJECTION);
            gl.glLoadIdentity();
            glu.gluPerspective(45.0f, h, 1.0, 20.0);
            gl.glMatrixMode(GL.GL_MODELVIEW);
            gl.glLoadIdentity();
            }
    public void display(GLAutoDrawable drawable) {
            GL gl = drawable.getGL();
            GLU glu = new GLU();
            Objek Objek = new Objek();
            // Clear the drawing area
            gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
            // Reset the current matrix to the "identity"
            gl.glLoadIdentity();
<<<<<<< HEAD
//            gl.glTranslatef(0.0f, 0.5f, -10.0f);
//            gl.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
//            gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
            
           
            
            gl.glTranslatef(0.0f, 2.5f, -20.0f);
            gl.glRotatef(0f, 0f, 0f, 0.0f);
//            gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);

            gl.glPushMatrix();
            gl.glTranslatef(0f, 0f, 0.0f);
            gl.glRotatef(90f, 1.0f, 0.0f, 0.0f);
=======
           
            
            gl.glTranslatef(0.0f, 0.5f, -20.0f);
            gl.glRotatef(0f, 1.0f, 0.0f, 0.0f);
//            gl.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);

            gl.glPushMatrix();
>>>>>>> 3f53cff663b3ca244eaa10924eccd57fc422fe0e
            Objek.setengahlingkaran(gl);
            gl.glPopMatrix();

            gl.glPushMatrix();
            Objek.tabung(gl);
            gl.glPopMatrix();

            gl.glTranslatef(0f, 0f, 0.0f);
            gl.glRotatef(90f, 1.0f, 0.0f, 0.0f);
            gl.glPushMatrix();
            Objek.Tiang(gl);
            gl.glPopMatrix();

            gl.glPushMatrix();
            gl.glTranslatef(0f, 5f, -0f);
            gl.glRotatef(90f, 1.0f, 0.0f, 0.0f);
            gl.glRotatef(angle, 0f, 0f, 5.0f);
            Objek.balingbaling(gl);
            gl.glPopMatrix();

            gl.glTranslatef(0f, 0f, 0.0f);
            gl.glRotatef(90f, 1.0f, 0.0f, 0.0f);
            gl.glPushMatrix();
<<<<<<< HEAD
            //Objek.tabung(gl);
            gl.glPopMatrix();
            angle +=direction;
            if(angle>10){
                direction=-direction;
            }else if(angle<-50){
                direction=-direction;
            }
            angle += 1f;

            gl.glPushMatrix();
            gl.glTranslatef(0f, 4f, -2f);
            Objek.Tombol(gl);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
            gl.glTranslatef(0f, 5f, -2f);
=======
            
            //Objek.bawah(gl);
            gl.glPopMatrix();
            angle +=direction;
            if(angle>10){
                direction=-direction;
            }else if(angle<-50){
                direction=-direction;
            }
            angle += 1f;

            gl.glPushMatrix();
            gl.glTranslatef(0f, 2f, -2f);
>>>>>>> 3f53cff663b3ca244eaa10924eccd57fc422fe0e
            Objek.Tombol(gl);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
<<<<<<< HEAD
            gl.glTranslatef(0f, 6f, -2f);
            Objek.Tombol(gl);
            gl.glPopMatrix();
            
            //alas tabung tipis
            gl.glPushMatrix();
            gl.glTranslatef(0f, -1.0f, 0f);
            gl.glRotatef(90f, 1.0f, 0.0f, 0.0f);
            Objek.Tombol(gl);
            gl.glPopMatrix();
            
            gl.glTranslatef(0f, 7.5f, -1.0f);
            gl.glRotatef(90f, 1.0f, 0.0f, 0.0f);
            gl.glPushMatrix();
            Objek.bawah(gl);
            gl.glPopMatrix();
=======
            gl.glTranslatef(0f, 3f, -2f);
            Objek.Tombol(gl);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
            gl.glTranslatef(0f, 4f, -2f);
            Objek.Tombol(gl);
            gl.glPopMatrix();
>>>>>>> 3f53cff663b3ca244eaa10924eccd57fc422fe0e
            gl.glFlush();
}
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
            }
    public void mouseClicked(MouseEvent e){
            }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){
            }
    public void mouseReleased(MouseEvent e){
            }
    
    public void mouseDragged(MouseEvent e){
    }
    public void mouseMoved(MouseEvent e){
            }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}