package test.sogou.com.common;

import android.database.Cursor;

public class CursorUtils {
	private Cursor mCursor;

	public CursorUtils(Cursor cursor){
		mCursor = cursor;
	}
	
	public String getString(String columnName){
		int id = mCursor.getColumnIndex(columnName);
		if(id != -1){
			return mCursor.getString(id);
		}
		return null;
	}
	
	public int getInt(String columnName){
		int id = mCursor.getColumnIndex(columnName);
		if(id != -1){
			return mCursor.getInt(id);
		}
		return -9999;
	}
	
	public double getDouble(String columnName){
		int id = mCursor.getColumnIndex(columnName);
		if(id != -1){
			return mCursor.getDouble(id);
		}
		return -9999;
	}
	
	public long getLong(String columnName){
		int id = mCursor.getColumnIndex(columnName);
		if(id != -1){
			return mCursor.getLong(id);
		}
		return -9999;
	}
	
}
