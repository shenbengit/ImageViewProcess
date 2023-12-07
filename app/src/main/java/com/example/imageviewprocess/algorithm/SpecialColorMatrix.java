package com.example.imageviewprocess.algorithm;

/**
 * @author Shenben
 * @date 2023/12/6 17:16
 * @description
 * @since
 */
public class SpecialColorMatrix {
    /**
     * 默认效果，不会改变图片
     */
    private static final float[] DEFAULT = new float[]{
            1, 0, 0, 0, 0,
            0, 1, 0, 0, 0,
            0, 0, 1, 0, 0,
            0, 0, 0, 1, 0
    };

    /**
     * 怀旧效果
     * <p>
     * R = 0.393*R + 0.769*G + 0.189*B;
     * G = 0.349*R + 0.686*G + 0.168*B;
     * B = 0.272*R + 0.534*G + 0.131*B;
     * A = A;
     * <p>
     */
    private static final float[] HUAIJIU = new float[]{
            0.393f, 0.769f, 0.189f, 0, 0,
            0.349f, 0.686f, 0.168f, 0, 0,
            0.272f, 0.534f, 0.131f, 0, 0,
            0, 0, 0, 1, 0
    };

    /**
     * 底片反转效果
     * <p>
     * R = 255 - 1*R;
     * G = 255 - 1*G;
     * B = 255 - 1*B;
     * A = A;
     * <p>
     */
    private static final float[] DIPIAN = new float[]{
            -1, 0, 0, 0, 255,
            0, -1, 0, 0, 255,
            0, 0, -1, 0, 255,
            0, 0, 0, 1, 0
    };

    /**
     * 灰度效果
     * <p>
     * R = 0.33*R + 0.59*G + 0.11*B;
     * G = 0.33*R + 0.59*G + 0.11*B;
     * B = 0.33*R + 0.59*G + 0.11*B;
     * A = A;
     * <p>
     */
    private static final float[] GRAY = new float[]{
            0.33f, 0.59f, 0.11f, 0, 0,
            0.33f, 0.59f, 0.11f, 0, 0,
            0.33f, 0.59f, 0.11f, 0, 0,
            0, 0, 0, 1, 0,
    };

    /**
     * 高亮，提高色彩饱和度
     * <p>
     * R =  1.438*R - 0.122*G - 0.016*B - 7.65;
     * G = -0.062*R + 1.378*G - 0.016*B + 12.75;
     * B = -0.062*R - 0.122*G + 1.483*B - 5.1;
     * A = A;
     * <p>
     */
    private static final float[] BRIGHT = new float[]{
            1.438f, -0.122f, -0.016f, 0, -7.65f,
            -0.062f, 1.378f, -0.016f, 0, 12.75f,
            -0.062f, -0.122f, 1.483f, 0, -5.1f,
            0, 0, 0, 1, 0,
    };

    public static float[] getDefault() {
        return DEFAULT.clone();
    }

    public static float[] getHuaiJiu() {
        return HUAIJIU.clone();
    }

    public static float[] getDiPian() {
        return DIPIAN.clone();
    }

    public static float[] getGray() {
        return GRAY.clone();
    }

    public static float[] getBright() {
        return BRIGHT.clone();
    }

    /**
     * 特殊效果的模式
     */
    public static class MODE {
        public static final int DEFAULT = 0;
        public static final int HUAIJIU = 1;
        public static final int DIPIAN = 2;
        public static final int GRAY = 3;
        public static final int BRIGHT = 4;
    }
}
