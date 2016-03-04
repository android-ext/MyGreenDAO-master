package me.itangqi;

import android.content.Context;

import itangqi.me.mygreendao.BaseApplication;
import me.itangqi.greendao.DaoSession;
import me.itangqi.greendao.NoteDao;

public class DbHelper {
    private static Context mContext;
    private static DbHelper instance;
    private NoteDao noteDao;

    private DbHelper() {
    }

    public static DbHelper getInstance(Context context) {
        if (instance == null) {
            instance = new DbHelper();
            if (mContext == null) {
                mContext = context;
            }

            // 数据库对象
            DaoSession daoSession = BaseApplication.getDaoSession(mContext);
//            instance.noteDao = daoSession.getNoteDao();
        }
        return instance;
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }

//	/** 添加数据 */
//	public void addToUnitTable(ArrayList<Unit> units) {
//		for (Unit unit : units) {
//			unitDao.insert(unit);
//		}
//	}
//
//
//	/** 查询 */
//	public List<Unit> getUintInfo() {
//		return unitDao.loadAll();// 查找图片相册
//	}
//
//	/** 查询 */
//	public boolean isSaved(int Id) {
//		QueryBuilder<Unit> qb = unitDao.queryBuilder();
//		qb.where(Properties.CId.eq(Id));
//		qb.buildCount().count();
//		return qb.buildCount().count() > 0 ? true : false;// 查找收藏表
//	}
//
//	/** 删除 */
//	public void deleteUnit(int Id) {
//		QueryBuilder<Unit> qb = unitDao.queryBuilder();
//		DeleteQuery<Unit> bd = qb.where(Properties.CId.eq(Id)).buildDelete();
//		bd.executeDeleteWithoutDetachingEntities();
//	}
//
//	/** 删除 */
//	public void clearUnitInfo() {
//		unitDao.deleteAll();
//	}
//
//	/** 通过城市id查找其类型id */
//	public int getTypeId(int cityId) {
//		QueryBuilder<Unit> qb = unitDao.queryBuilder();
//		qb.where(Properties.CId.eq(cityId));
//		if (qb.list().size() > 0) {
//			return qb.list().get(0).getCId();
//		} else {
//			return 0;
//		}
//	}
//
//	/** 根据书本id查询单元列表  */
//	public ArrayList<Unit> getUnitsByParentId(String parentId) {
//		QueryBuilder<Unit> qb = unitDao.queryBuilder();
//		qb.where(Properties.ParentId.eq(parentId));
//		return (ArrayList<Unit>) qb.list();
//	}
//
//	public void addToCourseTable(ArrayList<Course> list) {
//		for (Course course : list) {
//			courseDao.insert(course);
//		}
//	}

//	/** 多重查询 */
//	public List<Unit> getIphRegionList(int cityId) {
//		QueryBuilder<Unit> qb = unitDao.queryBuilder();
//		qb.where(qb.and(Properties.CId.eq(cityId),
//				Properties.InfoType.eq(HBContant.CITYINFO_IR)));
//		qb.orderAsc(Properties.Id);// 排序依据
//		return qb.list();
//	}
}
