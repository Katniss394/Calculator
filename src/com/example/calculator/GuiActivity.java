package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GuiActivity extends Activity {
		float val1;
		float val2;
		boolean add;
		boolean sub;
		boolean mul, div;
		EditText et;
     Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bdiv,bdot,bmul,beq,bclr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui);
       
        b0=(Button)findViewById(R.id.bt0);
        b1=(Button)findViewById(R.id.bt1);
        b2=(Button)findViewById(R.id.bt2);
        b3=(Button)findViewById(R.id.bt3);
        b4=(Button)findViewById(R.id.bt4);
        b5=(Button)findViewById(R.id.bt5);
        b6=(Button)findViewById(R.id.bt6);
        b7=(Button)findViewById(R.id.bt7);
        b8=(Button)findViewById(R.id.bt8);
        b9=(Button)findViewById(R.id.bt9);
        badd=(Button)findViewById(R.id.ba);
        bsub=(Button)findViewById(R.id.bs);
        bdot=(Button)findViewById(R.id.bd);
        bmul=(Button)findViewById(R.id.bx);
        bdiv=(Button)findViewById(R.id.bv);
        beq=(Button)findViewById(R.id.be);
        bclr=(Button)findViewById(R.id.clr);
        et=(EditText)findViewById(R.id.tbox);
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				et.setText(et.getText()+"1");
			}
		});
        b0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				et.setText(et.getText()+"0");
				
			}
		});
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				et.setText(et.getText() + "2");
			}
		});
        b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				et.setText(et.getText()+"3");
			}
		});
        b4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				et.setText(et.getText()+"4");
				
			}
		});
        b5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			et.setText(et.getText()+"5");	
			}
		});
        b6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			et.setText(et.getText()+"6");	
			}
		});
        b7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			et.setText(et.getText()+"7");	
			}
		});
        b8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			et.setText(et.getText()+"8");	
			}
		});
        b9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			et.setText(et.getText()+"9");	
			}
		});
        bdot.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				et.setText(et.getText()+".");
			}
		});
        badd.setOnClickListener(new View.OnClickListener() {
        	  @Override
        	  public void onClick(View v) {
        			if(et.getText()==null){
    					Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_SHORT).show();}
        			else{
        	   val1=Float.parseFloat(et.getText()+"");
        	   add=true;
        	   et.setText(null);}
        	  }
        	 });
        bsub.setOnClickListener(new View.OnClickListener() {
      	  @Override
      	  public void onClick(View v) {
      	   val1=Float.parseFloat(et.getText()+"");
      	   sub=true;
      	   et.setText(null);
      	  }
      	 });
        bdiv.setOnClickListener(new View.OnClickListener() {
      	  @Override
      	  public void onClick(View v) {
      	   val1=Float.parseFloat(et.getText()+"");
      	   div=true;
      	   et.setText(null);
      	  }
      	 });
        bmul.setOnClickListener(new View.OnClickListener() {
        	  @Override
        	  public void onClick(View v) {
        	   val1=Float.parseFloat(et.getText()+"");
        	   mul=true;
        	   et.setText(null);
        	  }
        	 });
        beq.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(et.getText()==null){
					Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_SHORT).show();
					add=sub=mul=div=false;
				}
				if(et.getText()!=null){
				val2=Float.parseFloat(et.getText()+"");
	
				if(add==true){
					et.setText(val1+val2+"");
					add=false;
				}
				if(sub==true){
					et.setText(val1-val2+"");
					sub=false;
					
				}
				if(mul==true){
					et.setText(val1*val2+"");
					mul=false;
				}
				if(div==true){
					et.setText(val1/val2+"");
				}
				}
				
			}
		});
        bclr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				et.setText(null);
			}
		}); 

        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_gui, menu);
        return true;
    }
    
}
