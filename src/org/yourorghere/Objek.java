package org.yourorghere;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
public class Objek {
    
    static void Tiang(GL gl){
        float BODY_LENGTH=3.0f;
        float BODY_RADIUS=0.4f;
        GLU glu=new GLU();
        int SLICES=30;
        int STACKS=30;
        double clip_plane1[]={0.0, 0.0, -1.0, 0.0};
        gl.glColor3f(0,1,0);
        gl.glClipPlane(GL.GL_CLIP_PLANE1, clip_plane1,0);
        gl.glEnable(GL.GL_CLIP_PLANE1);
        GLUquadric qd=glu.gluNewQuadric();
        glu.gluSphere(qd, BODY_RADIUS, SLICES, STACKS);
        glu.gluDeleteQuadric(qd);
        gl.glDisable(GL.GL_CLIP_PLANE1);
        gl.glEnable(GL.GL_CLIP_PLANE2);
        GLUquadric qd1=glu.gluNewQuadric();
        glu.gluSphere(qd1, BODY_RADIUS, SLICES, STACKS);
        glu.gluDeleteQuadric(qd1);
        gl.glDisable(GL.GL_CLIP_PLANE2);
        glu.gluDisk(qd, 0.0f, BODY_RADIUS, SLICES, STACKS);
        GLUquadric q=glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS,BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }
    
    static void balingbaling(GL gl){
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(1.0f, 0.0f,0.0f); // Set the current drawing color to red
            gl.glVertex3f(0f, 0f, 0.0f);   // Top
            gl.glVertex3f(-0.75f, -1f, 0.0f); // Bottom Left
            gl.glVertex3f(0.75f, -1f , 0.0f);  // Bottom Right
        gl.glEnd();
            gl.glBegin(GL.GL_TRIANGLES);
            gl.glColor3f(1.0f, 0.0f,0.0f);
            gl.glVertex3f(0f, 0f, 0.0f);   // Top
            gl.glVertex3f(-0.75f, 1f, 0.0f); // Bottom Left
            gl.glVertex3f(0.75f, 1f, 0.0f);  // Bottom Right
        gl.glEnd();
    }
    static void Tombol(GL gl){
        float BODY_RADIUS=0.1f;
        int SLICES=50;
        int STACKS=50;
        GLU glu=new GLU();
        GLUquadric q=glu.gluNewQuadric();
        gl.glColor3f(0,0,0);
        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
            }

}
