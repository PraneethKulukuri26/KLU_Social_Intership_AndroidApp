package com.praneeth.works.projects.socialinternship.Test;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.pdf.PdfDocument;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.praneeth.works.projects.socialinternship.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class RenderXml {

    public static void exportToPdf(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View contentView = inflater.inflate(R.layout.test_layout1,null);

        contentView.measure(
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
        );
        contentView.layout(0,0,contentView.getMeasuredWidth(),contentView.getMeasuredHeight());

        int contentWidth=contentView.getMeasuredWidth();
        int contentHeight=contentView.getMeasuredHeight();

        int pageWidth=1080;
        int pageHeight=1920;

        PdfDocument pdfDocument=new PdfDocument();

        int currentTop=0;
        while (currentTop<contentHeight) {
            Bitmap bitmap=Bitmap.createBitmap(contentWidth, pageHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas=new Canvas(bitmap);

            canvas.translate(0,-currentTop);
            contentView.draw(canvas);

            PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(pageWidth, pageHeight, pdfDocument.getPages().size() + 1).create();
            PdfDocument.Page page =pdfDocument.startPage(pageInfo);

            page.getCanvas().drawBitmap(bitmap,0,0,null);
            pdfDocument.finishPage(page);

            bitmap.recycle();

            currentTop+=pageHeight;
        }

        File filePath=new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "output.pdf");
        try (FileOutputStream outputStream =new FileOutputStream(filePath)) {
            pdfDocument.writeTo(outputStream);
            Log.v("FilePath", filePath.getAbsolutePath());
            Toast.makeText(context, "PDF saved to: " + filePath.getAbsolutePath(), Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(context, "Error saving PDF: " + e.getMessage(), Toast.LENGTH_LONG).show();
        } finally {
            pdfDocument.close();
        }
    }
}
