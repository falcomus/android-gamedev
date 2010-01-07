package com.badlogic.gamedev.tutorial;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;


public class Code1 extends Activity implements GLSurfaceView.Renderer
{
	/** GLSurfaceView **/
	private GLSurfaceView glSurface;
	
	/** with and height of the viewport **/
	private int width, height;
	
	/**
	 * Called on creation of the Activity
	 */
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		glSurface = new GLSurfaceView( this );
		glSurface.setRenderer( this );
		this.setContentView( glSurface );
	}
	
	/**
	 * Called each Frame
	 */
	@Override
	public void onDrawFrame(GL10 gl) 
	{		
		// here goes the main loop body
	}

	/**
	 * Called when the surface size changed, e.g. due to tilting
	 */
	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) 
	{	
		this.width = width;
		this.height = height;
	}

	/**
	 * Called when the GLSurfaceView has finished initialization
	 */
	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) 
	{	
		// we ignore this for now
	}
	
	public int getViewportWidth( )
	{
		return width;
	}
	
	public int getViewportHeight( )
	{
		return height;
	}
}
