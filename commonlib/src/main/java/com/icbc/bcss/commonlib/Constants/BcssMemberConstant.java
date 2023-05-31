package com.icbc.bcss.commonlib.Constants;

import android.os.Environment;

import java.io.File;

/**
 * 都是一些常量
 */
public class BcssMemberConstant {
    public static final String RETURN_CODE = "return_code";
    public static final String RETURN_MSG = "return_msg";
    public static final String EXCODE = "exCode";
    public static final String EXMSG = "exMsg";
    public static final String CLIENTTRANSNO = "clientTransNo";
    public static final String RETCODE = "retCode";
    public static final String RETMSG = "retMsg";

    //默认的存储人脸阈值的字段名和默认值
    public static final String BCSS_MEMBER_FACE_RECOGNIZE_THRESHOLD = "bcss_member_face_recognize_threshold";
    public static final int BCSS_MEMBER_FACE_RECOGNIZE_THRESHOLD_DEAFUTL = 70;

    public static final String COMMON_SUCC = "0";
    public static final String COMMON_FAIL = "1";
    public static final String COMMON_EXCEPTION = "-1";

    //调式开关--控制是否全部图片存储--true:保留所有图片，false不保留图片
    public static final String DEBUG_PICTURE_SWITCH = "debug_picture_switch";
    public static final boolean DEBUG_PICTURE_SWITCH_DEFAULT = false;

    //记录最后更新的时间--初始化专用---废弃
    @Deprecated
    public static final String UPDATE_LOCAL_REGISTERINFO_DATATIME = "update_local_registerinfo_datetimme";
    @Deprecated
    public static final String UPDATE_LOCAL_DELETEINFO_DATATIME = "update_local_deleteinfo_datetimme";

    //下载cw文件的http地址--对应存储本地的keyname，以及defaultvalue
    public static final String BCSS_CW_FILE_DOWNLOAD_URL = "bcss_cw_file_download_url";
    public static final String BCSS_CW_FILE_DOWNLOAD_URL_DEFAULT = "http://114.255.225.51:18444/newbcss/cw";
    public static final String BCSS_CW_FILE_PREFIX_TRUE_NAME = "auth_client";
    //眼神授权文件的后缀名
    public static final String BCSS_CW_FILE_SUFFIX_TRUE_NAME = ".cw";
    //旷视授权文件的后缀名
    public static final String BCSS_CERT_FILE_SUFFIX_TRUE_NAME = ".cert";

    // //记录最后更新的时间--注册人脸和删除人脸
    public static final String RECORD_LAST_REGISTERINFO_DATATIME = "record_last_registerinfo_datetimme";
    public static final String RECORD_LAST_DELETEINFO_DATATIME = "record_last_deleteinfo_datetimme";
    public static final String UPDATE_LOCAL_REGISTERINFO_DATETIME_DEFAULT = "2019-01-01 00:00:00";
    public static final String UPDATE_LOCAL_DELETEINFO_DATETIME_DEFAULT = "2019-01-01 00:00:00";
    //会员卡下载信息
    public static final String RECORD_LAST_MEM_CARD_INFO_DATETIME = "record_last_memCardInfo_datetime";
    public static final String UPDATE_LOCAL_MEM_CARD_INFO_DATETIME_DEFAULT = "2019-01-01 00:00:00";
    //  以下参数用于删除会员销卡信息后本地删除的流程
    //  最后一次本地删除操作的时间
    public static final String RECORD_LAST_MEM_CARD_INFO_DELETE_DATETIME = "record_last_memCardInfo_delete_datetime";
    //  没取到值时的默认时间
    public static final String UPDATE_LOCAL_MEM_CARD_INFO_DELETE_DATETIME_DEFAULT = "2019-01-01 00:00:00";


    //注册人脸线程控制标志
    public static final String EXTRACT_FEATURE_OR_DOWNLOAD_IMAGE_FLAG = "extract_feature_or_download_image_flag";
    //删除线程控制标志
    public static final String DELETE_FACE_INFO_FLAG = "delete_face_info_flag";
    //下载会员卡信息的线程标识
    public static final String MEM_CARD_INFO_FLAG = "mem_card_info_flag";
    //  下载删除会员信息的线程标识
    public static final String MEM_CARD_INFO_DELETE_FLAG = "mem_card_info_delete_flag";


    //api四要素-
    public static final String MY_PRIVATE_KEY = "my_private_key";
    public static final String APIGW_PUBLIC_KEY = "apigw_public_key";
    public static final String APP_ID = "app_id";
    public static final String RSA_MODEL = "rsa_model";
    public static final String URL = "url";
    public static final String BCSS_MEMBER_CORP_ID = "bcss_member_corp_id";
    //关键参数
    public static final String BCSS_INDUSTRY_FLAG = "bcss_industry_flag";
    public static final String MER_AES_KEY = "aes_key";
    public static final String MY_PUBLIC_KEY = "my_public_key";

    //api四要素
    public static final String MY_PRIVATE_KEY_DEFAULT = "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";
    public static final String APIGW_PUBLIC_KEY_DEFAULT = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
    public static final String APP_ID_DEFAULT = "10000000000004097413";
    public static final String RSA_MODEL_DEFAULT = "RSA2";
    public static final String URL_DEFAULT = "http://114.255.225.36:8081/api/bcss/member/feature/querymemberinfo/V1";
    public static final String BCSS_MEMBER_CORP_ID_DEFAULT = "2000000067";
    //关键参数
    public static final String BCSS_INDUSTRY_FLAG_DEFAULT = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,999";
    public static final String MER_AES_KEY_DEFAULT = "MpQAEKr3lyR7rVeI+xsmodZ/azhcvzqBTPsgrwuMpgk=";
    public static final String MY_PUBLIC_KEY_DEFAULT = "Oc2kMCsOiHZ42xNKxl2NIkAmtjn+NZkCjKwJn+0pTtDI6+vta5/8lJSM1DYljWgAvg7Q2W4xKcnX/dwFD9ngxv8ppZrbGC/fLagbF28ug8z1lE8FJB5IP1YaJdwNWwPwgZ2pFJxdB1Ps/6JWX9kVI4t+MnX2y2JnSF9UJDIkD78Gskf19+iJXi/d08+KxFexsr875VnUjPoH4acwrlyKOdCDUW1g47jA6UKbC1G0PB7BPn6EzKpPHm0TWffEhcGFHf5hoGd6IxDULHELs7oWlvp4s1i4YxpxCX9bBCPIlAweoF3yUclQjln8Xci8Iojo6eydR/Uro9S8puF6oYSm+k0/NCoNPhPLor3S8S1ldIJe+pdkucHmFWCyWZNYJ+Gtp62MTSPkC6KOQFApV6yxd8nw4pOZ1pBBcn/2jju+JAKTGW7qGS+MsHpM8hjyPpQzmtupbXGZpOPfehh7cYGeLkJe9jmIUSky7FV/9xLG22HqzdBRpzaZaqLcPc3UmmWhTg2Y5QTP3gm6g53+Y3DHuw==";


    //api下载人脸的关键参数
    public static final String BCSS_MEMBER_STARTNUM = "bcss_member_startnum";
    public static final String BCSS_MEMBER_ENDSUM = "bcss_member_endnum";
    public static final String BCSS_MEMBER_STARTNUM_DEFAULT = "1";
    public static final String BCSS_MEMBER_ENDNUM_DEFAULT = "10";

    /*新增url地址*/
    public static final String BCSS_MEMBER_FRONT_INTO_URL_PART = "api/bcss/member/feature/queryfrontinfo/V1";
    public static final String BCSS_MEMBER_FRONT_INTO_URL = "bcss_member_front_info_url";
    public static final String BCSS_MEMBER_FRONT_INTO_URL_DEFAULT = "http://114.255.225.36:8081/api/bcss/member/feature/queryfrontinfo/V1";

    //默认人脸数据数量的处理阈值为：
//    public static final String BCSS_MEMBER_DEAL_FACE_THRESHOLD="bcss_member_deal_face_threshold";
    public static final String BCSS_MEMBER_DEAL_FACE_THRESHOLD_DEFAULT = "500";

    //随机位数
    public static final String BCSS_CLIENTTRANSNO_RANDOM_NUM = "bcss_clientTransNo_random_num";
    public static final int BCSS_CLIENTTRANSNO_RANDOM_NUM_DEFAULT = 5;

    //以下两个变量在上送参数中，无实际意义，仅为了通过校验
    public static final String BCSS_MEMBER_FEATURETYPE = "bcss_member_featuretype";
    public static final String BCSS_MEMBER_FEATURETYPE_DEFAULT = "1";//默认值-此变量基本不使用
    public static final String BCSS_MEMBER_CHANNEL = "bcss_member_channel";
    public static final String BCSS_MEMBER_CHANNEL_DEFAULT = "";

    //文件大小的容量(单位：Byte)
    public static final long BCSS_LOG_FILE_MAX_LIMIT = 15 * 1024 * 1024L;

    //运行日志存储位置
    public static final String LOCALLOG_PATH = "logPath";//key,存储全路径
    public static final String LOCALLOG_PATH_DEFAULT = "cw";
    public static final String LOCALLOG_PATH_DEFAULT_FULL = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + BcssMemberConstant.LOCALLOG_PATH_DEFAULT;

    public static final String ZONECLEANDATALOCK_PATH = "zoneCleanDataLock.txt";
    public static final String ZONECLEANDATA_PATH = "zoneCleanData.txt";
    public static final String ZONEADDDATALOCK_PATH = "zoneAddDataLock.txt";
    public static final String ZONEADDDATA_PATH = "zoneAddData.txt";
    //  父级文件夹 ->>>>cw/file
    public static final String MEMBER_ZONE_CHANGE_DATA_PARENT_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator +
            BcssMemberConstant.LOCALLOG_PATH_DEFAULT + File.separator + "file";

    //存储成功提取特征的目录
    public static final String LOCALTEMPIMAGE_PATH = "tempImagePath";//key,存储全路径
    public static final String LOCALTEMPIMAGE_PATH_DEFAULT = "succ";
    public static final String LOCALTEMPIMAGE_PATH_DEFAULT_FULL = LOCALLOG_PATH_DEFAULT_FULL + File.separator + BcssMemberConstant.LOCALTEMPIMAGE_PATH_DEFAULT;
    //默认下载后就存储这个位置
    public static final String LOCALIMAGE_PATH = "imagePath";
    public static final String LOCALIMAGE_PATH_DEFAULT = "bas";
    public static final String LOCALIMAGE_FULL_PATH = LOCALLOG_PATH_DEFAULT_FULL + File.separator + BcssMemberConstant.LOCALIMAGE_PATH_DEFAULT;

    public static final String IMAGE_SUFFIX_NAME = ".jpg";
    public static final String TXT_SUFFIX_NAME=".txt";

    //人脸分数标识
    public static final String LIVE_SIM_STANDARD = "85";
    public static final String DETECT_SIM_STANDARD = "90";
    public static final int DELETE_RECORD_DATA_BEFORE_DAYS = 90;

    //旷世文件夹名称
    public static final String MEGVII_PATH = "megviiPath";//key,存储全路径
    public static final String MEGVII_PATH_DEFAULT = "MEGVII";

    //激活线程控制锁--只允许一个线程做
    public static final String BCSS_SDK_ACTIVATE_FLAG = "bcss_sdk_activate_flag";

    //拉取人脸结果的表示
//    public static final String REQUEST_FACE_RETURN_CODE = null;
//    public static final String REQUEST_FACE_RETURN_MSG=null;
    private static final String TIMETASK_BREAKFLAG = "timetask_breakflag";

    //定时任务-标识
    //开启定时任务
    public static final int TIMETASK_REQUEST_FACE_SWITCH_ON = 0;
    //关闭定时任务
    public static final int TIMETASK_REQUEST_FACE_SWITCH_OFF = 1;
    //注册人脸
    public static final String TIMETASK_REQUEST_FACE_SWITCH = "bcss_member_timetask_request_face_switch"; //
    public static final String TIMETASK_FIRST_STARTTIME_MILLIS = "timetask_first_starttime_millis";
    public static final long TIMETASK_FIRST_STARTTIME_MILLIS_DEFAULT = 8 * 60 *  1000L; //--第一次执行为10分钟后
    public static final int TIMETASK_REQUEST_FACE_ID = 0; //闹铃标识符，标识操作的具体哪一个闹铃
    public static final String TIMETASK_INTERVAL_MILLIS = "timetask_interval_millis"; //定时任务的间隔时间
    public static final long TIMETASK_INTERVAL_MILLIS_DEFAULT = 30 * 60 *  1000L;//4个小时

    //删除人脸定时任务相关
    public static final String TIMETASK_REQUEST_FACE_DELETE_SWITCH = "bcss_member_timetask_request_face_delete_switch";
    public static final String TIMETASK_DELETE_FIRST_STARTTIME_MILLIS = "timetask_delete_first_starttime_millis";
    public static final long TIMETASK_DELETE_FIRST_STARTTIME_MILLIS_DEFAULT = 14 * 60 *  1000L; //--第一次执行为5分钟后
    public static final int TIMETASK_REQUEST_FACE_DELETE_ID = 1; //闹铃标识符，标识操作的具体哪一个闹铃--删除人脸定时任务是1
    public static final String TIMETASK_DELETE_INTERVAL_MILLIS = "timetask_delete_interval_millis"; //定时任务的间隔时间
    public static final long TIMETASK_DELETE_INTERVAL_MILLIS_DEFAULT = 2 * 60 * 60 *  1000L;//4个小时

    //下载会员卡信息
    public static final String TIMETASK_MEMBER_CARD_INFO_SWITCH = "timetask_member_card_info_switch";
    public static final String TIMETASK_MEMBER_CARD_INFO_FIRST_STARTTIME_MILLIS = "timetask_member_card_info_first_starttime_millis";
    public static final long TIMETASK_MEMBER_CARD_INFO_FIRST_STARTTIME_MILLIS_DEFAULT = 25 * 60 *  1000L; //--第一次执行为5分钟后
    public static final int TIMETASK_MEMBER_CARD_INFO_ID = 2; //闹铃标识符，标识操作的具体哪一个闹铃--下载会员卡信息人脸定时任务是2
    public static final String TIMETASK_MEMBER_CARD_INFO_INTERVAL_MILLIS = "timetask_member_card_info_interval_millis"; //定时任务的间隔时间
    public static final long TIMETASK_MEMBER_CARD_INFO_INTERVAL_MILLIS_DEFAULT = 1 * 60 * 60 *  1000L;//4个小时
    //输入默认需要下载的信息
    public static final String BCSS_MEMBER_CARD_TYPE_LIST = "bcss_member_card_type_list";
    //    public static final String BCSS_MEMBER_CARD_TYPE_LIST_DEFAULT="000001|000002";
//    public static final String BCSS_MEMBER_CARD_TYPE_LIST_DEFAULT="000002";
    public static final String BCSS_MEMBER_CARD_TYPE_LIST_DEFAULT = "000002|000003";
    public static final String BCSS_MEMBER_CARD_TYPE_LIST_000002 = "000002";
    public static final String BCSS_MEMBER_CARD_TYPE_LIST_000003 = "000003";


    //  以下定义用于删除会员销卡和三方卡删除的定时任务的开关和时间的设置
    //  开关key
    public static final String TIMETASK_MEMBER_CARD_INFO_DELETE_SWITCH = "timetask_member_card_info_delete_switch";
    public static final String TIMETASK_MEMBER_CARD_INFO_DELETE_FIRST_STARTTIME_MILLIS = "timetask_member_card_info_delete_first_starttime_millis";
//    public static final long TIMETASK_MEMBER_CARD_INFO_DELETE_FIRST_STARTTIME_MILLIS_DEFAULT = 1 * 60 * 1 * 1000;
    public static final long TIMETASK_MEMBER_CARD_INFO_DELETE_FIRST_STARTTIME_MILLIS_DEFAULT =  30 * 60 *  1000L;
    //  闹铃标识符,3为删除会员卡信息的标识(下载会员卡信息的标识为2)
    public static final int TIMETASK_MEMBER_CARD_INFO_DELETE_ID = 3;
    //  定时任务间隔时间
    public static final String TIMETASK_MEMBER_CARD_INFO_DELETE_INTERVAL_MILLIS = "timetask_member_card_info_delete_interval_millis";
    public static final long TIMETASK_MEMBER_CARD_INFO_DELETE_INTERVAL_MILLIS_DEFAULT = 2 * 60 * 60 *  1000L;
    //输入默认输入下载信息
    public static final String BCSS_MEMBER_CARD_DELETE_OPER_TYPE_LIST = "bcss_member_card_delete_oper_type_list";
    public static final String BCSS_MEMBER_CARD_DELETE_OPER_TYPE_LIST_DEFAULT = "4|22";


    //时间
    public static final long COMMON_ONE_DAY_LONG = 24 * 60 * 60 * 1000l;//单位毫秒
    //PersonId和seqNo的分隔符
    public static final String DEFAULT_SEPARATOR_FROM_PERSONID_TO_SEQNO = "_";
    public static final String DEFAULT_SEPARATOR_FROM_FACENO = ",";

    //错误码
    public static final int MEMBER_REQUEST_FACEINFO_SUCCESS = 0;
    public static final int MEMBER_REQUEST_FACEINFO_COMMON_FAIL = 1;
    public static final int MEMBER_REQUEST_FACEINFO_FAIL = 2;
    public static final int MEMBER_REQUEST_FACEINFO_EXCEPTION_FAIL = -1;


    public static final int MSG_MEMBER_REQUEST_RESULT = 2000;
    public static final int MSG_MEMBER_DEAL_RESULT = 2001;
    public static final int MSG_MEMBER_COMMON_RESULT = 2002;
    public static final int MSG_MEMBER_FULL_PULL_FACE_FLAG = 2003;
    public static final int MSG_MEMBER_EXTRACT_FLAG = 2004;
    public static final int MSG_MEMBER_DEAL_FAIL_RESULT = 2005;
    public static final int MSG_MEMBER_EMPTY_DIR_FOR_DOWNLOAD_FACE = 2006;

    //消息
    public static final int MSG_FACE_DATABASE_EMPTY = 20;
    public static final int MSG_JPGIMAGE_NOT_FOUND = 21;
    public static final int MSG_INIT_FEATURE_RESULT_FAIL = 22;

    //零动作
    public static String faceserverdefault = "请配置后台地址";
    public static String licencedefault = "请填写云从授权码(测试授权有时间限制,生产必须使用永久授权)";
    /**
     * 检测超时时间
     */
    public static int liveTimedefault = 8;
    public static final float yuzdefault = 0.8f;
    public static int liveCountdefault = 8;
    public static boolean hackswitchdefault = false;

    //对比和零动作
    //compare(true) && detect(false) ---1:N对比（含活体检测）
    //compare(false) && detect(fasle) --没有识别、对比所有操作
    //compare(false) && detect(frue)--零动作（活体）检测,没有对比
    //compare(true) && detect(true)--禁止，因为1：n对比中已经包含活体检测，而零动作也是活体检测，不能同时用两次活体检测
    public static final String BCSS_MEMBER_FACE_COMPARE_FLAG = "bcss_member_face_compare_flag";
    public static final boolean BCSS_MEMBER_FACE_COMPARE_FLAG_DEFAULT = true;
    public static final String BCSS_MEMBER_FACE_DETECT_FLAG = "bcss_member_face_detect_flag";
    public static final boolean BCSS_MEMBER_FACE_DETECT_FLAG_DEFAULT = false;

    //眼神算法appid默认为空值--EYECOOL_FACE_APPID
    public static final String BCSS_MEMBER_EYECOOL_FACE_APPID = "bcss_member_eyecool_face_appid";
    public static final String BCSS_MEMBER_EYECOOL_FACE_APPID_DEFAULT = "UXLL5JOUTTVHL2I4";

    //初始化--拉取人脸数据成功，或者不拉去数据的，表示操作成功代码为
    public static final int BCSS_MEMBER_REQUEST_FACE_OPERATION_SUCC = 999;
    public static final int BCSS_MEMBER_REQUEST_FACE_OPERATION_FAIL = 998;

    //复制云丛的key name
    public static final String PREF_MODEL_COPY_FLAG = "pref_model_copy";
    public static final String PREF_SERVER = "pref_server";
    public static final String PREF_CHANNAL = "pref_channal";
    public static final String PREF_CAMERA_ROTATION = "pref_camera_rotation";
    public static final String PREF_CAMERA_COUNT = "pref_camera_count";
    public static final String PREF_CAMERA_POSITION = "pref_camera_position";
    public static final String PREF_AUTH = "pref_auth";
    public static final String PREF_SHOW_DIALOG = "pref_show_dialog";
    public static final String PREF_CALLBACK_RIGHT_NOW = "pref_callback_rightnow";
    //活体检测后，是否回调
    public static final boolean ICBC_SHOW_DIALOG_DEFAULT = true;
    //比对后，是否回调
    public static final boolean ICBC_CALLBACK_RIGHT_NOW_DEFAULT = true;

    public static final String DEFAULT_SERVER = "http://10.128.134.88:9080/deviceauth";
    public static final String DEFAULT_CHANNEL = "";
    public static final int DEFAULT_CAMERA_ROTATION = 90;
    public static final int CAMERA_POSITION_FRONT = 1;
    public static final int CAMERA_POSITION_BACK = 0;
    public static final int AUTH_BY_SERVER = 0;
    public static final int AUTH_BY_CLIENT = 1;


    /*部分初始化参数的key*/
    public static final String MAP_KEY_DEFAULT_SERVER = "map_key_default_server";
    public static final String MAP_KEY_DEFAULT_CHANNEL = "map_key_default_channel";
    public static final String MAP_KEY_DEFAULT_CAMERA_ROTATION = "map_key_default_camera_rotation";
    public static final String MAP_KEY_DEFAULT_CAMERA_COUNT = "map_key_default_camera_count";
    public static final String MAP_KEY_CAMERA_POSITION_FRONT = "map_key_camera_posiiton_front";
    public static final String MAP_KEY_AUTH_BY_CLIENT = "map_key_auth_by_client";
    public static final String MAP_KEY_ICBC_SHOW_DIALOG_DEFAULT = "map_key_icbc_show_dialog_default";
    public static final String MAP_KEY_ICBC_CALLBACK_RIGHT_NOW_DEFAULT = "map_key_icbc_callback_right_now_default";

    /*自定义的初始化key*/
    public static final String REGISTERTIMEINIT = "registerTimeInit";
    public static final String DELETETIMEINIT = "deleteTImeInit";
    public static final String LOCALLOGPATH = "lcoalLogPath";
    public static final String LOCALTEMPIMAGEPATH = "localTempImagePath";
    public static final String LOCALIMAGEPATH = "localImagePath";
    public static final String FACETHRESHOLD = "faceThresHold";




    /*记录失败的请求*/
    public static final String REGISTER_DETAIL_FILENAME = "register_detail.txt";
    public static final String REGISTER_COUNT_FILENAME = "register_count.txt";
    public static final String DELETE_DETAIL_FILENAME = "delete_detail.txt";
    public static final String DELETE_COUNT_FILENAME = "delete_count.txt";

    /*记录失败的请求*/
    public static final String REGISTER_DETAIL_FILENAME_WITH_NEW_PROGRESS = "register_detail_with_new_progress.txt";

    //记录提取特征失败的客户id
    public static final String REGISTER_EXTRACT_FAIL_INFO = "register_extract_fail_info.txt";

    //记录请求api失败的文本名称
    public static final String MEMCARD_INFO_API_DOWN_RECORD = "memcard_info_api_down_record.txt";
    public static final String MEMCARD_INFO_ADD_DETAIL_FAILED_RECORD = "memcard_info_add_detail_failed_record.txt";
    //  记录销卡的文本名称
    public static final String MEMCARD_INFO_DELETE_API_DOWN_RECORD = "memcard_info_delete_api_down_record.txt";

    //长度限制
    public static final int MAX_LENGTH_CORPID = 10;

    /*
     * 旅游场景
     * */
    // //记录最后更新的时间
    public static final String TRIP_RECORD_LAST_REGISTERINFO_DATATIME = "trip_record_last_registerinfo_datetimme";
    public static final String TRIP_RECORD_LAST_DELETEINFO_DATATIME = "trip_record_last_deleteinfo_datetimme";
    //地址
    public static final String TRIP_FACE_SERVICE_URL = "trip_face_service_url";
//    public static final String TRIP_FACE_SERVICE_URL_DEFAULT = "http://114.255.225.52:8091/faceTicket/changeInfo";
    public static final String TRIP_FACE_SERVICE_URL_DEFAULT = "/faceTicket/changeInfo";
    //人脸注册
    public static final String TRIP_TIMETASK_REQUEST_FACE_SWITCH = "trip_timetask_request_face_switch"; //
    public static final String TRIP_TIMETASK_FIRST_STARTTIME_MILLIS = "trip_timetask_first_starttime_millis";
    public static final long TRIP_TIMETASK_FIRST_STARTTIME_MILLIS_DEFAULT =10*60*1*1000; //--第一次执行为10分钟后
    public static final int TRIP_TIMETASK_REQUEST_FACE_ID = 20; //闹铃标识符，标识操作的具体哪一个闹铃
    public static final String TRIP_TIMETASK_INTERVAL_MILLIS = "trip_timetask_interval_millis";
    public static final long  TRIP_TIMETASK_INTERVAL_MILLIS_DEFAULT =15*60*1*1000;//4个小时
    //删除人脸定时任务相关
    public static final String TRIP_TIMETASK_REQUEST_FACE_DELETE_SWITCH = "trip_timetask_request_face_delete_switch";
    public static final String TRIP_TIMETASK_DELETE_FIRST_STARTTIME_MILLIS = "trip_timetask_delete_first_starttime_millis";
    public static final long  TRIP_TIMETASK_DELETE_FIRST_STARTTIME_MILLIS_DEFAULT =30*60*1*1000; //--第一次执行为5分钟后
    public static final int TRIP_TIMETASK_REQUEST_FACE_DELETE_ID = 21; //闹铃标识符，标识操作的具体哪一个闹铃--删除人脸定时任务是1
    public static final String TRIP_TIMETASK_DELETE_INTERVAL_MILLIS = "trip_timetask_delete_interval_millis";
    public static final long  TRIP_TIMETASK_DELETE_INTERVAL_MILLIS_DEFAULT =30*60*1*1000;//4个小时

    //人脸活体检测开关
    /*活体检测开关*/
    public static  final String BCSS_LIVENESS="liveness";
    //  默认开启
    public static  final boolean BCSS_LIVENESS_DEFAULT=true;

    //温度开关的key名---用于持久化的key
    public static final String TEMPRATURE_SWITCH = "temperature_switch";
    //  本机体温检测开关 ,"0"-关闭”, 1“-本地,"2"-联机
    public static final String TEMPRATURE_SWITCH_FOR_CLOSE = "0";
    public static final String TEMPRATURE_SWITCH_FOR_ON = "1";
//    public static final String TEMPRATURE_SWITCH_FOR_OFFLINE = "1";
//    public static final String TEMPRATURE_SWITCH_FOR_ONLINE = "2";


    //  本机体温检测阈值
    public static final String TEMPRATURE_VALUE = "temperature_value";
    public static final String TEMPRATURE_VALUE_DEFAUTL = "37.5";


    //  10/13 特征提取失败的业务需求加上的
    public static final String BCSS_UPLOAD_FACE_FEATURE_REGISTER_EXCEPTION_SWITCH="bcss_upload_face_feature_register_exception_switch";
    public static final Boolean BCSS_UPLOAD_FACE_FEATURE_REGISTER_EXCEPTION_SWITCH_DEFAULT=false;//默认不上送

    public static final String BCSS_LOCAL_SERVER_ADDRESS ="bcss_local_server_address";
    public static final String BCSS_LOCAL_SERVER_ADDRESS_DEFAULT="http://114.255.225.55:8484/";

    public static final String BCSS_DEVICEINFO_MANUFACTUREID="bcss_deviceinfo_manufactureId";
    public static final String BCSS_DEVICEINFO_MANUFACTUREID_DEFAULT="";

    public static final String BCSS_DEVICEINFO_IMEINO="bcss_deviceinfo_imeiNo";
    public static final String BCSS_DEVICEINFO_IMEINO_DEFAULT="";

    //信息来源
    public static final String BCSS_MESSAGE_SOURCE="bcss_message_source";
    public static final String BCSS_MESSAGE_SOURCE_DEFAULT="00000";//00000--未知

    //人脸sdk内部嵌入的算法底层类型（算法供应商）
    public static final String BCSS_SDK_ALGORITHM_VERSION="bcss_sdk_algorithm_version";
    public static final int BCSS_SDK_ALGORITHM_VERSION_DEFAULT=2;//1--云从和眼神组合，2--旷视

    //人脸sdk下载的人脸的来源位置
    public static final String BCSS_FACE_SOURCE="bcss_face_source";
    public static final int BCSS_FACE_SOURCE_DEFAULT=0;//0--会员云端（api接口）,1--人脸前置，2--旅游前置，其他值默认也是--会员云端（api接口）


    //bas随机数的
    public static final String BCSS_FACE_ENCRYPT_RANDOM="bcss_face_encrypt_random";
    public static final String BCSS_MEMBER_PARAM_CODE="bcss_member_param_code";
    public static final String BCSS_MEMBER_PARAM_VALUE="bcss_member_param_value";
    public static final String BCSS_MEMBER_PARAM_DESC="bcss_member_param_desc";
}
