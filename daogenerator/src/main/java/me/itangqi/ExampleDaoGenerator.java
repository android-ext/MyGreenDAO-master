package me.itangqi;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class ExampleDaoGenerator {


    public static void main(String[] args) throws Exception {

        // 创建一个用于添加实体（Entity）的模式（Schema）对象。
        // TODO 生成目标文件的包名
        String packageStr = "me.itangqi.greendao";
        // 两个参数分别代表：数据库版本号与自动生成代码的包路径。
        Schema schema = new Schema(1, packageStr);
//      也可以分别指定生成的 Bean 与 DAO 类所在的目录，只要如下所示：
//      Schema schema = new Schema(1, "me.itangqi.bean");
//      schema.setDefaultJavaPackageDao("me.itangqi.dao");

        // 模式（Schema）同时也拥有两个默认的 flags，分别用来标示 entity 是否是 activie 以及是否使用 keep sections。
        // schema.enableActiveEntitiesByDefault();
        // schema.enableKeepSectionsByDefault();

        // 添加实体（Entities）
//        addNote(schema);
        addHomeRecommendEntity(schema);
        String basePath = Class.class.getClass().getResource("/").getPath().toString();
        // TODO 自动生成文件所在的module名
        int endIndex = basePath.indexOf("daogenerator");
        // TODO 自动生成文件所在的module下的文件目录
        String destPath = basePath.substring(0, endIndex) + "daotest/src/main/java-gen";

        // 最后我们将使用 DAOGenerator 类的 generateAll() 方法自动生成代码
        // 其实，输出目录的路径可以在 build.gradle 中设置，有兴趣的朋友可以自行搜索。
        new DaoGenerator().generateAll(schema, destPath);
    }

    private static void addHomeRecommendEntity(Schema schema) {

        // 一个实体（类）就关联到数据库中的一张表，此处表名为「Note」（既类名）
        Entity recommendEntity = schema.addEntity("HomeRecommendEntity");
        // 重新给表命名
        recommendEntity.setTableName("t_home_recommend");
        // greenDAO 会自动根据实体类的属性值来创建表字段，并赋予默认值
        // 接下来你便可以设置表中的字段：
        recommendEntity.addLongProperty("vId").primaryKey();
        recommendEntity.addIntProperty("subjectId");
        recommendEntity.addStringProperty("timeLength");
        recommendEntity.addStringProperty("channelTitle");
        recommendEntity.addStringProperty("createdTime");
        // 与在 Java 中使用驼峰命名法不同，默认数据库中的命名是使用大写和下划线来分割单词的。
        // For example, a property called “creationDate” will become a database column “CREATION_DATE”.
        recommendEntity.addStringProperty("description");
        recommendEntity.addStringProperty("team");
        recommendEntity.addIntProperty("sort");
        recommendEntity.addStringProperty("title");
        recommendEntity.addStringProperty("videoUrl");
        recommendEntity.addStringProperty("size");
        recommendEntity.addStringProperty("previewImageUrl");
        recommendEntity.addBooleanProperty("recommend");
        recommendEntity.addIntProperty("channelId");

        recommendEntity.addBooleanProperty("studyrecord");
        recommendEntity.addBooleanProperty("collect");
    }

    /**
     * @param schema
     */
    private static void addNote(Schema schema) {
        // 一个实体（类）就关联到数据库中的一张表，此处表名为「Note」（既类名）
        Entity note = schema.addEntity("Note");
        // 重新给表命名
        // note.setTableName("NODE");

        // greenDAO 会自动根据实体类的属性值来创建表字段，并赋予默认值
        // 接下来你便可以设置表中的字段：
        note.addIdProperty();
        note.addStringProperty("text").notNull();
        // 与在 Java 中使用驼峰命名法不同，默认数据库中的命名是使用大写和下划线来分割单词的。
        // For example, a property called “creationDate” will become a database column “CREATION_DATE”.
        note.addStringProperty("comment");
        note.addDateProperty("date");
    }
}