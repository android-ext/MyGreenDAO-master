package me.itangqi.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import me.itangqi.greendao.HomeRecommendEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table t_home_recommend.
*/
public class HomeRecommendEntityDao extends AbstractDao<HomeRecommendEntity, Long> {

    public static final String TABLENAME = "t_home_recommend";

    /**
     * Properties of entity HomeRecommendEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property VId = new Property(0, Long.class, "vId", true, "V_ID");
        public final static Property SubjectId = new Property(1, Integer.class, "subjectId", false, "SUBJECT_ID");
        public final static Property TimeLength = new Property(2, String.class, "timeLength", false, "TIME_LENGTH");
        public final static Property ChannelTitle = new Property(3, String.class, "channelTitle", false, "CHANNEL_TITLE");
        public final static Property CreatedTime = new Property(4, String.class, "createdTime", false, "CREATED_TIME");
        public final static Property Description = new Property(5, String.class, "description", false, "DESCRIPTION");
        public final static Property Team = new Property(6, String.class, "team", false, "TEAM");
        public final static Property Sort = new Property(7, Integer.class, "sort", false, "SORT");
        public final static Property Title = new Property(8, String.class, "title", false, "TITLE");
        public final static Property VideoUrl = new Property(9, String.class, "videoUrl", false, "VIDEO_URL");
        public final static Property Size = new Property(10, String.class, "size", false, "SIZE");
        public final static Property PreviewImageUrl = new Property(11, String.class, "previewImageUrl", false, "PREVIEW_IMAGE_URL");
        public final static Property Recommend = new Property(12, Boolean.class, "recommend", false, "RECOMMEND");
        public final static Property ChannelId = new Property(13, Integer.class, "channelId", false, "CHANNEL_ID");
        public final static Property Studyrecord = new Property(14, Boolean.class, "studyrecord", false, "STUDYRECORD");
        public final static Property Collect = new Property(15, Boolean.class, "collect", false, "COLLECT");
    };


    public HomeRecommendEntityDao(DaoConfig config) {
        super(config);
    }
    
    public HomeRecommendEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'t_home_recommend' (" + //
                "'V_ID' INTEGER PRIMARY KEY ," + // 0: vId
                "'SUBJECT_ID' INTEGER," + // 1: subjectId
                "'TIME_LENGTH' TEXT," + // 2: timeLength
                "'CHANNEL_TITLE' TEXT," + // 3: channelTitle
                "'CREATED_TIME' TEXT," + // 4: createdTime
                "'DESCRIPTION' TEXT," + // 5: description
                "'TEAM' TEXT," + // 6: team
                "'SORT' INTEGER," + // 7: sort
                "'TITLE' TEXT," + // 8: title
                "'VIDEO_URL' TEXT," + // 9: videoUrl
                "'SIZE' TEXT," + // 10: size
                "'PREVIEW_IMAGE_URL' TEXT," + // 11: previewImageUrl
                "'RECOMMEND' INTEGER," + // 12: recommend
                "'CHANNEL_ID' INTEGER," + // 13: channelId
                "'STUDYRECORD' INTEGER," + // 14: studyrecord
                "'COLLECT' INTEGER);"); // 15: collect
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'t_home_recommend'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, HomeRecommendEntity entity) {
        stmt.clearBindings();
 
        Long vId = entity.getVId();
        if (vId != null) {
            stmt.bindLong(1, vId);
        }
 
        Integer subjectId = entity.getSubjectId();
        if (subjectId != null) {
            stmt.bindLong(2, subjectId);
        }
 
        String timeLength = entity.getTimeLength();
        if (timeLength != null) {
            stmt.bindString(3, timeLength);
        }
 
        String channelTitle = entity.getChannelTitle();
        if (channelTitle != null) {
            stmt.bindString(4, channelTitle);
        }
 
        String createdTime = entity.getCreatedTime();
        if (createdTime != null) {
            stmt.bindString(5, createdTime);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(6, description);
        }
 
        String team = entity.getTeam();
        if (team != null) {
            stmt.bindString(7, team);
        }
 
        Integer sort = entity.getSort();
        if (sort != null) {
            stmt.bindLong(8, sort);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(9, title);
        }
 
        String videoUrl = entity.getVideoUrl();
        if (videoUrl != null) {
            stmt.bindString(10, videoUrl);
        }
 
        String size = entity.getSize();
        if (size != null) {
            stmt.bindString(11, size);
        }
 
        String previewImageUrl = entity.getPreviewImageUrl();
        if (previewImageUrl != null) {
            stmt.bindString(12, previewImageUrl);
        }
 
        Boolean recommend = entity.getRecommend();
        if (recommend != null) {
            stmt.bindLong(13, recommend ? 1l: 0l);
        }
 
        Integer channelId = entity.getChannelId();
        if (channelId != null) {
            stmt.bindLong(14, channelId);
        }
 
        Boolean studyrecord = entity.getStudyrecord();
        if (studyrecord != null) {
            stmt.bindLong(15, studyrecord ? 1l: 0l);
        }
 
        Boolean collect = entity.getCollect();
        if (collect != null) {
            stmt.bindLong(16, collect ? 1l: 0l);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public HomeRecommendEntity readEntity(Cursor cursor, int offset) {
        HomeRecommendEntity entity = new HomeRecommendEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // vId
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // subjectId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // timeLength
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // channelTitle
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // createdTime
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // description
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // team
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // sort
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // title
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // videoUrl
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // size
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // previewImageUrl
            cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0, // recommend
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13), // channelId
            cursor.isNull(offset + 14) ? null : cursor.getShort(offset + 14) != 0, // studyrecord
            cursor.isNull(offset + 15) ? null : cursor.getShort(offset + 15) != 0 // collect
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, HomeRecommendEntity entity, int offset) {
        entity.setVId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSubjectId(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setTimeLength(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setChannelTitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCreatedTime(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDescription(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTeam(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSort(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setTitle(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setVideoUrl(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setSize(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setPreviewImageUrl(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setRecommend(cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0);
        entity.setChannelId(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
        entity.setStudyrecord(cursor.isNull(offset + 14) ? null : cursor.getShort(offset + 14) != 0);
        entity.setCollect(cursor.isNull(offset + 15) ? null : cursor.getShort(offset + 15) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(HomeRecommendEntity entity, long rowId) {
        entity.setVId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(HomeRecommendEntity entity) {
        if(entity != null) {
            return entity.getVId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
