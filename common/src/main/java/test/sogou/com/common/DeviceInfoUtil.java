package test.sogou.com.common;

import android.content.Context;
import android.util.DisplayMetrics;

public class DeviceInfoUtil {
	/**
	 * 获取手机分辨率 480*800的格式输出
	 * @param context
	 * @return
	 */
	public static String getDeviceDisplayMetrics(Context context) {
		DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
		return String.valueOf(displayMetrics.widthPixels).concat("x")
				.concat(String.valueOf(displayMetrics.heightPixels));
	}
	
	/**
	 * 获取屏幕的宽度
	 * @param context
	 * @return
	 */
	public static int getScreenWidth(Context context){
		DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
		return displayMetrics.widthPixels;
	}

	/**
	 * 获取屏幕的高度
	 * @param context
	 * @return
	 */
	public static int getScreenHeight(Context context){
		DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
		return displayMetrics.heightPixels;
	}

	/** UA信息，设备型号 */
	public static String getProductType() {
		return android.os.Build.MODEL;
	}

	/** 生产厂商 */
	public static String getManufacturer() {
		return android.os.Build.MANUFACTURER;
	}

	/** 系统版本 */
	public static String getSystemVersion() {
		return android.os.Build.VERSION.RELEASE;
	}
}
