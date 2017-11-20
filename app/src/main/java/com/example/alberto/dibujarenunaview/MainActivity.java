package com.example.alberto.dibujarenunaview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    class RenderView extends View {
        Paint paint;
        public RenderView(Context context){
            super(context);
            paint = new Paint();


        }

        protected void onDraw(Canvas canvas){

            float anchoCirculo;
            anchoCirculo = 0.4F;
            float radio;
            radio = this.getWidth()*anchoCirculo;
            classLinea linea = new classLinea(0,0, canvas.getWidth()-1, canvas.getHeight()-1);

            linea.setIniX(100);
        //    linea.setIniY(50);
            // linea.setFinX(30);
           // linea.setFinY(50);

            canvas.drawRGB(255,255,255);
            paint.setColor(Color.RED);
            canvas.drawLine(linea.getIniX(), linea.getIniY(), linea.getFinX(),linea.getFinY(), paint);

            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(0xff00ff00);
            canvas.drawCircle(canvas.getWidth() / 2 , canvas.getHeight() / 2,radio, paint);

            paint.setStyle(Paint.Style.FILL);
            paint.setColor(0x770000ff);
            canvas.drawRect(100,100,200,200,paint);
            invalidate();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new RenderView(this));
    }
}
