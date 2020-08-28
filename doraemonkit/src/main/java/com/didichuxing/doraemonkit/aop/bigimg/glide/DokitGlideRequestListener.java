//package com.didichuxing.doraemonkit.aop.bigimg.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

import com.blankj.utilcode.constant.MemoryConstants;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.ImageUtils;
//import com.bumptech.glide.request.RequestListener;
//import com.bumptech.glide.request.target.Target;
//import com.didichuxing.doraemonkit.config.PerformanceSpInfoConfig;
//import com.didichuxing.doraemonkit.kit.largepicture.LargePictureManager;
//
///**
// * ================================================
// * 作    者：jint（金台）
// * 版    本：1.0
// * 创建日期：2020/3/20-18:23
// * 描    述：
// * 修订历史：
// * ================================================
// */
//public class DokitGlideRequestListener<R> implements RequestListener {
//    private static final String TAG = "DokitGlideListener";
//
//    @Override
//    public boolean onException(Exception e, Object model, Target target, boolean isFirstResource) {
//        return false;
//    }
//
//    @Override
//    public boolean onResourceReady(Object resource, Object model, Target target, boolean isFromMemoryCache, boolean isFirstResource) {
//        try {
//            if (PerformanceSpInfoConfig.isLargeImgOpen()) {
//                Bitmap bitmap;
//                if (resource instanceof Bitmap) {
//                    bitmap = (Bitmap) resource;
//                    double imgSize = ConvertUtils.byte2MemorySize(bitmap.getByteCount(), MemoryConstants.MB);
//                    LargePictureManager.getInstance().saveImageInfo(model.toString(), imgSize, bitmap.getWidth(), bitmap.getHeight(), "Glide");
//                } else if (resource instanceof BitmapDrawable) {
//                    bitmap = ImageUtils.drawable2Bitmap((BitmapDrawable) resource);
//                    double imgSize = ConvertUtils.byte2MemorySize(bitmap.getByteCount(), MemoryConstants.MB);
//                    LargePictureManager.getInstance().saveImageInfo(model.toString(), imgSize, bitmap.getWidth(), bitmap.getHeight(), "Glide");
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return false;
//    }
//}
