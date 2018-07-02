package org.yourorghere;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
public class Objek {
    
   static void Tiang(GL gl){
        float BODY_LENGTH=6f;
        float BODY_RADIUS=1f;
        GLU glu=new GLU();
        int SLICES=30;
        int STACKS=30;
        double clip_plane1[]={0.0, 0.0, -1.0, 0.0};
        gl.glColor3f(0,1,1);
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
   //kepala
   static void setengahlingkaran(GL gl){
        float BODY_RADIUS=0.2f;
        int SLICES=10;
        int STACKS=10;
        GLU glu=new GLU();
        gl.glColor3f(1,0,0);
        GLUquadric q=glu.gluNewQuadric();
         glu.gluDisk(q, 0.0f, 1.0f, SLICES, STACKS);
        double clip_plane1[]={0.0,0.0,-1.0,0.0};
        gl.glClipPlane(GL.GL_CLIP_PLANE1,clip_plane1,0);
        gl.glEnable(GL.GL_CLIP_PLANE1);
        // drawing a sphere
        GLUquadric qd=glu.gluNewQuadric();
        glu.gluSphere(qd,1f,20,20);
        glu.gluDeleteQuadric(qd);
        gl.glDisable(GL.GL_CLIP_PLANE1);
    }
   static void tabung(GL gl){
float BODY_LENGTH=2.0f;
float BODY_RADIUS=1.0f;
int SLICES=30;
int STACKS=30; 
GLU glu=new GLU();
gl.glColor3f(1,1,0);
GLUquadric q=glu.gluNewQuadric();
glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, 
BODY_LENGTH, SLICES, STACKS);
glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
//lingkaran untuk tutup atas
gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
//lingkaran untuk tutup bawah
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
//   static void bawah(GL gl){
//       gl.glBegin(GL.GL_LINES);
//       gl.glVertex3f(-4.0f, 0f, 0f);
//       gl.glVertex3f(4f, 0f, 0f);
//       gl.glVertex3f(4.0f, 4f, 0f);
//              gl.glVertex3f(4f, 0f, 0f);
//
//       gl.glVertex3f(-4.0f, -4f, 0f);
//       gl.glVertex3f(-4.0f, 0f, 0f);
//              gl.glVertex3f(4f, 0f, 0f);
//
//   }
   static void Tombol(GL gl){
        float BODY_RADIUS=0.2f;
        int SLICES=50;
        int STACKS=50;
        GLU glu=new GLU();
        GLUquadric q=glu.gluNewQuadric();
        gl.glColor3f(0,0,0);
        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    }
}
