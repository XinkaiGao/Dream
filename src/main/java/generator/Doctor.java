package generator;

import java.io.Serializable;
import java.util.Date;

/**
 * doctor
 * @author 
 */
public class Doctor implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private Long uid;

    /**
     * 名字
     */
    private String name;

    /**
     * 120*120小头像
     */
    private String smallImage;

    /**
     * 原图
     */
    private String head;

    /**
     * 专家对应的二维码，扫一扫关注服务号【壹点灵】并关注该专家
     */
    private String scene;

    /**
     * 800*800大头像
     */
    private String bigImage;

    /**
     * 职称
     */
    private String title;

    /**
     * 医院
     */
    private Integer hospitalId;

    /**
     * 医院名称
     */
    private String hospitalName;

    private String address;

    /**
     * 科室
     */
    private Integer departmentId;

    /**
     * 科室
     */
    private String departmentName;

    /**
     * 推荐指数
     */
    private Integer recommendIndex;

    /**
     * 服务态度
     */
    private Integer serviceIndex;

    /**
     * 医术水平
     */
    private Integer physicLevel;

    /**
     * 咨询功能 1开启2关闭
     */
    private Boolean isAllowConsult;

    /**
     * 1显示 2不显示
     */
    private Byte isShow;

    /**
     * 是否热门 1，是2，不是
     */
    private Boolean isHot;

    private Integer replyNum;

    private Integer fansNum;

    /**
     * 标签1
     */
    private String tag1;

    /**
     * 标签2
     */
    private String tag2;

    /**
     * 标签3
     */
    private String tag3;

    /**
     * 身份证正面照图片地址
     */
    private String imageIdcard;

    /**
     * 身份证正面照缩略图
     */
    private String imageIdcardThumb;

    /**
     * 身份证正面大图
     */
    private String imageIdcardBig;

    /**
     * 身份证反面照图片地址
     */
    private String imageIdcardr;

    /**
     * 身份证反面照缩略图
     */
    private String imageIdcardrThumb;

    /**
     * 身份证反面照大图
     */
    private String imageIdcardrBig;

    /**
     * 证件证明号码
     */
    private String imageProfessNo;

    /**
     * 专业资格证图片地址
     */
    private String imageProfess;

    /**
     * 专业资格证缩略图
     */
    private String imageProfessThumb;

    /**
     * 专业资格证大图
     */
    private String imageProfessBig;

    /**
     * 学历证书图片地址
     */
    private String imageEdu;

    /**
     * 学历证书缩略图
     */
    private String imageEduThumb;

    /**
     * 学历证书大图
     */
    private String imageEduBig;

    /**
     * 婚姻咨询证书
     */
    private String imageMarital;

    /**
     * 累计证明原图
     */
    private String imageTotal;

    /**
     * 累计证明缩略图
     */
    private String imageTotalThumb;

    /**
     * 累计证明大图
     */
    private String imageTotalBig;

    /**
     * 培训证书原图
     */
    private String imageTrain;

    /**
     * 培训证书缩略图
     */
    private String imageTrainThumb;

    /**
     * 培训证书大图
     */
    private String imageTrainBig;

    /**
     * 收费标准：默认为2,8表示免费；8，0元；1，10元；2，30元；3，50元；4，100元；5，200元；6，300元；7，500元
     */
    private Byte feeStandard;

    /**
     * 是否已经认证，默认1未认证；1，未认证；2，已认证
     */
    private Byte isAuth;

    /**
     * 微信号
     */
    private String wecharNum;

    /**
     * 学历，默认1，1小学；2初中；3高中；6大专；4本科；5研究生；7硕士；8博士及以上
     */
    private Byte edu;

    /**
     * 个人铭言
     */
    private String famousRemark;

    /**
     * 累计咨询个案时长,以小时为单位存储
     */
    private Integer askTotalTime;

    /**
     * 排序
     */
    private Integer orderNum;

    /**
     * 是否推荐到首页，1否 2是，默认为否
     */
    private Byte isTjIndex;

    /**
     * 推荐到首页的理由
     */
    private String tjIndexReason;

    /**
     * 是否督导 1不是 2是， 默认1不是
     */
    private Byte isSupervisor;

    /**
     * 审核状态，默认已审核；1已审核，2未审核，3审核失
败
     */
    private Byte status;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否入住电话聆听 1不入驻 2入驻 默认不入驻
     */
    private Byte isJoinListen;

    /**
     * 排序，前台取
     */
    private Integer orderZan;

    /**
     * 差评次数
     */
    private Integer nohelpNum;

    /**
     * 排序-咨询师回复时间
     */
    private Integer orderAns;

    /**
     * 排序-咨询师平均回复时间
     */
    private Integer orderAvaAnsTime;

    /**
     * 从业年数
     */
    private Byte workYears;

    /**
     * 咨询师对应的临时二维码，有效期30天，30天过后，脚本自动更新
     */
    private String tempScene;

    /**
     * 在线咨询默认回复
     */
    private String lineDefaultContent;

    /**
     * 家庭地址
     */
    private String homeAddress;

    /**
     * 咨询室类型：1、暂无；2、自有场地；3、学校提供；4、机构提供；5、外部租用；6、壹点灵提供；
     */
    private Byte consultRoomType;

    /**
     * 面对面咨询地址
     */
    private String faceConsultAddress;

    /**
     * 特殊推送的专家，规则：近5日没有订单，但是近5天有回复心事的，脚本每天更新该字段，1不推荐 2推荐
     */
    private Byte specialPush;

    /**
     * 显示位置：1专家和电话倾诉 2仅电话倾诉
     */
    private Byte showPosition;

    /**
     * 专家对应的云之讯id
     */
    private String yunClientId;

    /**
     * 所属代理机构：1、非代理；2、湖州代理机构
     */
    private Integer agent;

    /**
     * 平台收取的佣金百分比
     */
    private Integer feeRate;

    /**
     * 通过专家微信下单的佣金比例
     */
    private Integer feeRateWechat;

    /**
     * 所属心理机构id
     */
    private Integer organizeId;

    /**
     * 推荐人
     */
    private String referrer;

    /**
     * 是否参加淘宝星期天：1否；2是
     */
    private Byte isTaobaoSunday;

    /**
     * 设置私聊在线：1在线，2离线
     */
    private Boolean isChatOnline;

    /**
     * 在线/离线时间戳
     */
    private Integer setOnlineTime;

    /**
     * 不在线时候自动回复内容
     */
    private String chatAutoReply;

    /**
     * 工作性质：1未定义；2全职；3兼职
     */
    private Byte jobCat;

    /**
     * 工作性质备注
     */
    private String jobRemark;

    /**
     * 推荐到对应app:0原app,1情感app
     */
    private Byte recApp;

    /**
     * 专属推荐语
     */
    private String recRemark;

    /**
     * 专家分组：1、无；2、主站；3、淘宝；4、400；5、情感
     */
    private Integer group;

    /**
     * 自动回复是否违规：1.是 2.否
     */
    private Boolean replyViolate;

    /**
     * 笔名
     */
    private String pseudonym;

    /**
     * 等级：1、A；2、B；3、C；
     */
    private Byte level;

    /**
     * 能力等级，默认为0，1.实习咨询师；2.初级咨询师；3.中级咨询师；4.高级咨询师；5.精英咨询师
     */
    private Byte abilityLevel;

    /**
     * 业务等级，默认为0，1.一星；2.二星；3.三星；4.四星；5.五星
     */
    private Byte businessLevel;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getRecommendIndex() {
        return recommendIndex;
    }

    public void setRecommendIndex(Integer recommendIndex) {
        this.recommendIndex = recommendIndex;
    }

    public Integer getServiceIndex() {
        return serviceIndex;
    }

    public void setServiceIndex(Integer serviceIndex) {
        this.serviceIndex = serviceIndex;
    }

    public Integer getPhysicLevel() {
        return physicLevel;
    }

    public void setPhysicLevel(Integer physicLevel) {
        this.physicLevel = physicLevel;
    }

    public Boolean getIsAllowConsult() {
        return isAllowConsult;
    }

    public void setIsAllowConsult(Boolean isAllowConsult) {
        this.isAllowConsult = isAllowConsult;
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public Integer getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(Integer replyNum) {
        this.replyNum = replyNum;
    }

    public Integer getFansNum() {
        return fansNum;
    }

    public void setFansNum(Integer fansNum) {
        this.fansNum = fansNum;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    public String getImageIdcard() {
        return imageIdcard;
    }

    public void setImageIdcard(String imageIdcard) {
        this.imageIdcard = imageIdcard;
    }

    public String getImageIdcardThumb() {
        return imageIdcardThumb;
    }

    public void setImageIdcardThumb(String imageIdcardThumb) {
        this.imageIdcardThumb = imageIdcardThumb;
    }

    public String getImageIdcardBig() {
        return imageIdcardBig;
    }

    public void setImageIdcardBig(String imageIdcardBig) {
        this.imageIdcardBig = imageIdcardBig;
    }

    public String getImageIdcardr() {
        return imageIdcardr;
    }

    public void setImageIdcardr(String imageIdcardr) {
        this.imageIdcardr = imageIdcardr;
    }

    public String getImageIdcardrThumb() {
        return imageIdcardrThumb;
    }

    public void setImageIdcardrThumb(String imageIdcardrThumb) {
        this.imageIdcardrThumb = imageIdcardrThumb;
    }

    public String getImageIdcardrBig() {
        return imageIdcardrBig;
    }

    public void setImageIdcardrBig(String imageIdcardrBig) {
        this.imageIdcardrBig = imageIdcardrBig;
    }

    public String getImageProfessNo() {
        return imageProfessNo;
    }

    public void setImageProfessNo(String imageProfessNo) {
        this.imageProfessNo = imageProfessNo;
    }

    public String getImageProfess() {
        return imageProfess;
    }

    public void setImageProfess(String imageProfess) {
        this.imageProfess = imageProfess;
    }

    public String getImageProfessThumb() {
        return imageProfessThumb;
    }

    public void setImageProfessThumb(String imageProfessThumb) {
        this.imageProfessThumb = imageProfessThumb;
    }

    public String getImageProfessBig() {
        return imageProfessBig;
    }

    public void setImageProfessBig(String imageProfessBig) {
        this.imageProfessBig = imageProfessBig;
    }

    public String getImageEdu() {
        return imageEdu;
    }

    public void setImageEdu(String imageEdu) {
        this.imageEdu = imageEdu;
    }

    public String getImageEduThumb() {
        return imageEduThumb;
    }

    public void setImageEduThumb(String imageEduThumb) {
        this.imageEduThumb = imageEduThumb;
    }

    public String getImageEduBig() {
        return imageEduBig;
    }

    public void setImageEduBig(String imageEduBig) {
        this.imageEduBig = imageEduBig;
    }

    public String getImageMarital() {
        return imageMarital;
    }

    public void setImageMarital(String imageMarital) {
        this.imageMarital = imageMarital;
    }

    public String getImageTotal() {
        return imageTotal;
    }

    public void setImageTotal(String imageTotal) {
        this.imageTotal = imageTotal;
    }

    public String getImageTotalThumb() {
        return imageTotalThumb;
    }

    public void setImageTotalThumb(String imageTotalThumb) {
        this.imageTotalThumb = imageTotalThumb;
    }

    public String getImageTotalBig() {
        return imageTotalBig;
    }

    public void setImageTotalBig(String imageTotalBig) {
        this.imageTotalBig = imageTotalBig;
    }

    public String getImageTrain() {
        return imageTrain;
    }

    public void setImageTrain(String imageTrain) {
        this.imageTrain = imageTrain;
    }

    public String getImageTrainThumb() {
        return imageTrainThumb;
    }

    public void setImageTrainThumb(String imageTrainThumb) {
        this.imageTrainThumb = imageTrainThumb;
    }

    public String getImageTrainBig() {
        return imageTrainBig;
    }

    public void setImageTrainBig(String imageTrainBig) {
        this.imageTrainBig = imageTrainBig;
    }

    public Byte getFeeStandard() {
        return feeStandard;
    }

    public void setFeeStandard(Byte feeStandard) {
        this.feeStandard = feeStandard;
    }

    public Byte getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(Byte isAuth) {
        this.isAuth = isAuth;
    }

    public String getWecharNum() {
        return wecharNum;
    }

    public void setWecharNum(String wecharNum) {
        this.wecharNum = wecharNum;
    }

    public Byte getEdu() {
        return edu;
    }

    public void setEdu(Byte edu) {
        this.edu = edu;
    }

    public String getFamousRemark() {
        return famousRemark;
    }

    public void setFamousRemark(String famousRemark) {
        this.famousRemark = famousRemark;
    }

    public Integer getAskTotalTime() {
        return askTotalTime;
    }

    public void setAskTotalTime(Integer askTotalTime) {
        this.askTotalTime = askTotalTime;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Byte getIsTjIndex() {
        return isTjIndex;
    }

    public void setIsTjIndex(Byte isTjIndex) {
        this.isTjIndex = isTjIndex;
    }

    public String getTjIndexReason() {
        return tjIndexReason;
    }

    public void setTjIndexReason(String tjIndexReason) {
        this.tjIndexReason = tjIndexReason;
    }

    public Byte getIsSupervisor() {
        return isSupervisor;
    }

    public void setIsSupervisor(Byte isSupervisor) {
        this.isSupervisor = isSupervisor;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsJoinListen() {
        return isJoinListen;
    }

    public void setIsJoinListen(Byte isJoinListen) {
        this.isJoinListen = isJoinListen;
    }

    public Integer getOrderZan() {
        return orderZan;
    }

    public void setOrderZan(Integer orderZan) {
        this.orderZan = orderZan;
    }

    public Integer getNohelpNum() {
        return nohelpNum;
    }

    public void setNohelpNum(Integer nohelpNum) {
        this.nohelpNum = nohelpNum;
    }

    public Integer getOrderAns() {
        return orderAns;
    }

    public void setOrderAns(Integer orderAns) {
        this.orderAns = orderAns;
    }

    public Integer getOrderAvaAnsTime() {
        return orderAvaAnsTime;
    }

    public void setOrderAvaAnsTime(Integer orderAvaAnsTime) {
        this.orderAvaAnsTime = orderAvaAnsTime;
    }

    public Byte getWorkYears() {
        return workYears;
    }

    public void setWorkYears(Byte workYears) {
        this.workYears = workYears;
    }

    public String getTempScene() {
        return tempScene;
    }

    public void setTempScene(String tempScene) {
        this.tempScene = tempScene;
    }

    public String getLineDefaultContent() {
        return lineDefaultContent;
    }

    public void setLineDefaultContent(String lineDefaultContent) {
        this.lineDefaultContent = lineDefaultContent;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Byte getConsultRoomType() {
        return consultRoomType;
    }

    public void setConsultRoomType(Byte consultRoomType) {
        this.consultRoomType = consultRoomType;
    }

    public String getFaceConsultAddress() {
        return faceConsultAddress;
    }

    public void setFaceConsultAddress(String faceConsultAddress) {
        this.faceConsultAddress = faceConsultAddress;
    }

    public Byte getSpecialPush() {
        return specialPush;
    }

    public void setSpecialPush(Byte specialPush) {
        this.specialPush = specialPush;
    }

    public Byte getShowPosition() {
        return showPosition;
    }

    public void setShowPosition(Byte showPosition) {
        this.showPosition = showPosition;
    }

    public String getYunClientId() {
        return yunClientId;
    }

    public void setYunClientId(String yunClientId) {
        this.yunClientId = yunClientId;
    }

    public Integer getAgent() {
        return agent;
    }

    public void setAgent(Integer agent) {
        this.agent = agent;
    }

    public Integer getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(Integer feeRate) {
        this.feeRate = feeRate;
    }

    public Integer getFeeRateWechat() {
        return feeRateWechat;
    }

    public void setFeeRateWechat(Integer feeRateWechat) {
        this.feeRateWechat = feeRateWechat;
    }

    public Integer getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(Integer organizeId) {
        this.organizeId = organizeId;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public Byte getIsTaobaoSunday() {
        return isTaobaoSunday;
    }

    public void setIsTaobaoSunday(Byte isTaobaoSunday) {
        this.isTaobaoSunday = isTaobaoSunday;
    }

    public Boolean getIsChatOnline() {
        return isChatOnline;
    }

    public void setIsChatOnline(Boolean isChatOnline) {
        this.isChatOnline = isChatOnline;
    }

    public Integer getSetOnlineTime() {
        return setOnlineTime;
    }

    public void setSetOnlineTime(Integer setOnlineTime) {
        this.setOnlineTime = setOnlineTime;
    }

    public String getChatAutoReply() {
        return chatAutoReply;
    }

    public void setChatAutoReply(String chatAutoReply) {
        this.chatAutoReply = chatAutoReply;
    }

    public Byte getJobCat() {
        return jobCat;
    }

    public void setJobCat(Byte jobCat) {
        this.jobCat = jobCat;
    }

    public String getJobRemark() {
        return jobRemark;
    }

    public void setJobRemark(String jobRemark) {
        this.jobRemark = jobRemark;
    }

    public Byte getRecApp() {
        return recApp;
    }

    public void setRecApp(Byte recApp) {
        this.recApp = recApp;
    }

    public String getRecRemark() {
        return recRemark;
    }

    public void setRecRemark(String recRemark) {
        this.recRemark = recRemark;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Boolean getReplyViolate() {
        return replyViolate;
    }

    public void setReplyViolate(Boolean replyViolate) {
        this.replyViolate = replyViolate;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Byte getAbilityLevel() {
        return abilityLevel;
    }

    public void setAbilityLevel(Byte abilityLevel) {
        this.abilityLevel = abilityLevel;
    }

    public Byte getBusinessLevel() {
        return businessLevel;
    }

    public void setBusinessLevel(Byte businessLevel) {
        this.businessLevel = businessLevel;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Doctor other = (Doctor) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSmallImage() == null ? other.getSmallImage() == null : this.getSmallImage().equals(other.getSmallImage()))
            && (this.getHead() == null ? other.getHead() == null : this.getHead().equals(other.getHead()))
            && (this.getScene() == null ? other.getScene() == null : this.getScene().equals(other.getScene()))
            && (this.getBigImage() == null ? other.getBigImage() == null : this.getBigImage().equals(other.getBigImage()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getHospitalId() == null ? other.getHospitalId() == null : this.getHospitalId().equals(other.getHospitalId()))
            && (this.getHospitalName() == null ? other.getHospitalName() == null : this.getHospitalName().equals(other.getHospitalName()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getDepartmentName() == null ? other.getDepartmentName() == null : this.getDepartmentName().equals(other.getDepartmentName()))
            && (this.getRecommendIndex() == null ? other.getRecommendIndex() == null : this.getRecommendIndex().equals(other.getRecommendIndex()))
            && (this.getServiceIndex() == null ? other.getServiceIndex() == null : this.getServiceIndex().equals(other.getServiceIndex()))
            && (this.getPhysicLevel() == null ? other.getPhysicLevel() == null : this.getPhysicLevel().equals(other.getPhysicLevel()))
            && (this.getIsAllowConsult() == null ? other.getIsAllowConsult() == null : this.getIsAllowConsult().equals(other.getIsAllowConsult()))
            && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()))
            && (this.getIsHot() == null ? other.getIsHot() == null : this.getIsHot().equals(other.getIsHot()))
            && (this.getReplyNum() == null ? other.getReplyNum() == null : this.getReplyNum().equals(other.getReplyNum()))
            && (this.getFansNum() == null ? other.getFansNum() == null : this.getFansNum().equals(other.getFansNum()))
            && (this.getTag1() == null ? other.getTag1() == null : this.getTag1().equals(other.getTag1()))
            && (this.getTag2() == null ? other.getTag2() == null : this.getTag2().equals(other.getTag2()))
            && (this.getTag3() == null ? other.getTag3() == null : this.getTag3().equals(other.getTag3()))
            && (this.getImageIdcard() == null ? other.getImageIdcard() == null : this.getImageIdcard().equals(other.getImageIdcard()))
            && (this.getImageIdcardThumb() == null ? other.getImageIdcardThumb() == null : this.getImageIdcardThumb().equals(other.getImageIdcardThumb()))
            && (this.getImageIdcardBig() == null ? other.getImageIdcardBig() == null : this.getImageIdcardBig().equals(other.getImageIdcardBig()))
            && (this.getImageIdcardr() == null ? other.getImageIdcardr() == null : this.getImageIdcardr().equals(other.getImageIdcardr()))
            && (this.getImageIdcardrThumb() == null ? other.getImageIdcardrThumb() == null : this.getImageIdcardrThumb().equals(other.getImageIdcardrThumb()))
            && (this.getImageIdcardrBig() == null ? other.getImageIdcardrBig() == null : this.getImageIdcardrBig().equals(other.getImageIdcardrBig()))
            && (this.getImageProfessNo() == null ? other.getImageProfessNo() == null : this.getImageProfessNo().equals(other.getImageProfessNo()))
            && (this.getImageProfess() == null ? other.getImageProfess() == null : this.getImageProfess().equals(other.getImageProfess()))
            && (this.getImageProfessThumb() == null ? other.getImageProfessThumb() == null : this.getImageProfessThumb().equals(other.getImageProfessThumb()))
            && (this.getImageProfessBig() == null ? other.getImageProfessBig() == null : this.getImageProfessBig().equals(other.getImageProfessBig()))
            && (this.getImageEdu() == null ? other.getImageEdu() == null : this.getImageEdu().equals(other.getImageEdu()))
            && (this.getImageEduThumb() == null ? other.getImageEduThumb() == null : this.getImageEduThumb().equals(other.getImageEduThumb()))
            && (this.getImageEduBig() == null ? other.getImageEduBig() == null : this.getImageEduBig().equals(other.getImageEduBig()))
            && (this.getImageMarital() == null ? other.getImageMarital() == null : this.getImageMarital().equals(other.getImageMarital()))
            && (this.getImageTotal() == null ? other.getImageTotal() == null : this.getImageTotal().equals(other.getImageTotal()))
            && (this.getImageTotalThumb() == null ? other.getImageTotalThumb() == null : this.getImageTotalThumb().equals(other.getImageTotalThumb()))
            && (this.getImageTotalBig() == null ? other.getImageTotalBig() == null : this.getImageTotalBig().equals(other.getImageTotalBig()))
            && (this.getImageTrain() == null ? other.getImageTrain() == null : this.getImageTrain().equals(other.getImageTrain()))
            && (this.getImageTrainThumb() == null ? other.getImageTrainThumb() == null : this.getImageTrainThumb().equals(other.getImageTrainThumb()))
            && (this.getImageTrainBig() == null ? other.getImageTrainBig() == null : this.getImageTrainBig().equals(other.getImageTrainBig()))
            && (this.getFeeStandard() == null ? other.getFeeStandard() == null : this.getFeeStandard().equals(other.getFeeStandard()))
            && (this.getIsAuth() == null ? other.getIsAuth() == null : this.getIsAuth().equals(other.getIsAuth()))
            && (this.getWecharNum() == null ? other.getWecharNum() == null : this.getWecharNum().equals(other.getWecharNum()))
            && (this.getEdu() == null ? other.getEdu() == null : this.getEdu().equals(other.getEdu()))
            && (this.getFamousRemark() == null ? other.getFamousRemark() == null : this.getFamousRemark().equals(other.getFamousRemark()))
            && (this.getAskTotalTime() == null ? other.getAskTotalTime() == null : this.getAskTotalTime().equals(other.getAskTotalTime()))
            && (this.getOrderNum() == null ? other.getOrderNum() == null : this.getOrderNum().equals(other.getOrderNum()))
            && (this.getIsTjIndex() == null ? other.getIsTjIndex() == null : this.getIsTjIndex().equals(other.getIsTjIndex()))
            && (this.getTjIndexReason() == null ? other.getTjIndexReason() == null : this.getTjIndexReason().equals(other.getTjIndexReason()))
            && (this.getIsSupervisor() == null ? other.getIsSupervisor() == null : this.getIsSupervisor().equals(other.getIsSupervisor()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsJoinListen() == null ? other.getIsJoinListen() == null : this.getIsJoinListen().equals(other.getIsJoinListen()))
            && (this.getOrderZan() == null ? other.getOrderZan() == null : this.getOrderZan().equals(other.getOrderZan()))
            && (this.getNohelpNum() == null ? other.getNohelpNum() == null : this.getNohelpNum().equals(other.getNohelpNum()))
            && (this.getOrderAns() == null ? other.getOrderAns() == null : this.getOrderAns().equals(other.getOrderAns()))
            && (this.getOrderAvaAnsTime() == null ? other.getOrderAvaAnsTime() == null : this.getOrderAvaAnsTime().equals(other.getOrderAvaAnsTime()))
            && (this.getWorkYears() == null ? other.getWorkYears() == null : this.getWorkYears().equals(other.getWorkYears()))
            && (this.getTempScene() == null ? other.getTempScene() == null : this.getTempScene().equals(other.getTempScene()))
            && (this.getLineDefaultContent() == null ? other.getLineDefaultContent() == null : this.getLineDefaultContent().equals(other.getLineDefaultContent()))
            && (this.getHomeAddress() == null ? other.getHomeAddress() == null : this.getHomeAddress().equals(other.getHomeAddress()))
            && (this.getConsultRoomType() == null ? other.getConsultRoomType() == null : this.getConsultRoomType().equals(other.getConsultRoomType()))
            && (this.getFaceConsultAddress() == null ? other.getFaceConsultAddress() == null : this.getFaceConsultAddress().equals(other.getFaceConsultAddress()))
            && (this.getSpecialPush() == null ? other.getSpecialPush() == null : this.getSpecialPush().equals(other.getSpecialPush()))
            && (this.getShowPosition() == null ? other.getShowPosition() == null : this.getShowPosition().equals(other.getShowPosition()))
            && (this.getYunClientId() == null ? other.getYunClientId() == null : this.getYunClientId().equals(other.getYunClientId()))
            && (this.getAgent() == null ? other.getAgent() == null : this.getAgent().equals(other.getAgent()))
            && (this.getFeeRate() == null ? other.getFeeRate() == null : this.getFeeRate().equals(other.getFeeRate()))
            && (this.getFeeRateWechat() == null ? other.getFeeRateWechat() == null : this.getFeeRateWechat().equals(other.getFeeRateWechat()))
            && (this.getOrganizeId() == null ? other.getOrganizeId() == null : this.getOrganizeId().equals(other.getOrganizeId()))
            && (this.getReferrer() == null ? other.getReferrer() == null : this.getReferrer().equals(other.getReferrer()))
            && (this.getIsTaobaoSunday() == null ? other.getIsTaobaoSunday() == null : this.getIsTaobaoSunday().equals(other.getIsTaobaoSunday()))
            && (this.getIsChatOnline() == null ? other.getIsChatOnline() == null : this.getIsChatOnline().equals(other.getIsChatOnline()))
            && (this.getSetOnlineTime() == null ? other.getSetOnlineTime() == null : this.getSetOnlineTime().equals(other.getSetOnlineTime()))
            && (this.getChatAutoReply() == null ? other.getChatAutoReply() == null : this.getChatAutoReply().equals(other.getChatAutoReply()))
            && (this.getJobCat() == null ? other.getJobCat() == null : this.getJobCat().equals(other.getJobCat()))
            && (this.getJobRemark() == null ? other.getJobRemark() == null : this.getJobRemark().equals(other.getJobRemark()))
            && (this.getRecApp() == null ? other.getRecApp() == null : this.getRecApp().equals(other.getRecApp()))
            && (this.getRecRemark() == null ? other.getRecRemark() == null : this.getRecRemark().equals(other.getRecRemark()))
            && (this.getGroup() == null ? other.getGroup() == null : this.getGroup().equals(other.getGroup()))
            && (this.getReplyViolate() == null ? other.getReplyViolate() == null : this.getReplyViolate().equals(other.getReplyViolate()))
            && (this.getPseudonym() == null ? other.getPseudonym() == null : this.getPseudonym().equals(other.getPseudonym()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getAbilityLevel() == null ? other.getAbilityLevel() == null : this.getAbilityLevel().equals(other.getAbilityLevel()))
            && (this.getBusinessLevel() == null ? other.getBusinessLevel() == null : this.getBusinessLevel().equals(other.getBusinessLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSmallImage() == null) ? 0 : getSmallImage().hashCode());
        result = prime * result + ((getHead() == null) ? 0 : getHead().hashCode());
        result = prime * result + ((getScene() == null) ? 0 : getScene().hashCode());
        result = prime * result + ((getBigImage() == null) ? 0 : getBigImage().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getHospitalId() == null) ? 0 : getHospitalId().hashCode());
        result = prime * result + ((getHospitalName() == null) ? 0 : getHospitalName().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getDepartmentName() == null) ? 0 : getDepartmentName().hashCode());
        result = prime * result + ((getRecommendIndex() == null) ? 0 : getRecommendIndex().hashCode());
        result = prime * result + ((getServiceIndex() == null) ? 0 : getServiceIndex().hashCode());
        result = prime * result + ((getPhysicLevel() == null) ? 0 : getPhysicLevel().hashCode());
        result = prime * result + ((getIsAllowConsult() == null) ? 0 : getIsAllowConsult().hashCode());
        result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
        result = prime * result + ((getIsHot() == null) ? 0 : getIsHot().hashCode());
        result = prime * result + ((getReplyNum() == null) ? 0 : getReplyNum().hashCode());
        result = prime * result + ((getFansNum() == null) ? 0 : getFansNum().hashCode());
        result = prime * result + ((getTag1() == null) ? 0 : getTag1().hashCode());
        result = prime * result + ((getTag2() == null) ? 0 : getTag2().hashCode());
        result = prime * result + ((getTag3() == null) ? 0 : getTag3().hashCode());
        result = prime * result + ((getImageIdcard() == null) ? 0 : getImageIdcard().hashCode());
        result = prime * result + ((getImageIdcardThumb() == null) ? 0 : getImageIdcardThumb().hashCode());
        result = prime * result + ((getImageIdcardBig() == null) ? 0 : getImageIdcardBig().hashCode());
        result = prime * result + ((getImageIdcardr() == null) ? 0 : getImageIdcardr().hashCode());
        result = prime * result + ((getImageIdcardrThumb() == null) ? 0 : getImageIdcardrThumb().hashCode());
        result = prime * result + ((getImageIdcardrBig() == null) ? 0 : getImageIdcardrBig().hashCode());
        result = prime * result + ((getImageProfessNo() == null) ? 0 : getImageProfessNo().hashCode());
        result = prime * result + ((getImageProfess() == null) ? 0 : getImageProfess().hashCode());
        result = prime * result + ((getImageProfessThumb() == null) ? 0 : getImageProfessThumb().hashCode());
        result = prime * result + ((getImageProfessBig() == null) ? 0 : getImageProfessBig().hashCode());
        result = prime * result + ((getImageEdu() == null) ? 0 : getImageEdu().hashCode());
        result = prime * result + ((getImageEduThumb() == null) ? 0 : getImageEduThumb().hashCode());
        result = prime * result + ((getImageEduBig() == null) ? 0 : getImageEduBig().hashCode());
        result = prime * result + ((getImageMarital() == null) ? 0 : getImageMarital().hashCode());
        result = prime * result + ((getImageTotal() == null) ? 0 : getImageTotal().hashCode());
        result = prime * result + ((getImageTotalThumb() == null) ? 0 : getImageTotalThumb().hashCode());
        result = prime * result + ((getImageTotalBig() == null) ? 0 : getImageTotalBig().hashCode());
        result = prime * result + ((getImageTrain() == null) ? 0 : getImageTrain().hashCode());
        result = prime * result + ((getImageTrainThumb() == null) ? 0 : getImageTrainThumb().hashCode());
        result = prime * result + ((getImageTrainBig() == null) ? 0 : getImageTrainBig().hashCode());
        result = prime * result + ((getFeeStandard() == null) ? 0 : getFeeStandard().hashCode());
        result = prime * result + ((getIsAuth() == null) ? 0 : getIsAuth().hashCode());
        result = prime * result + ((getWecharNum() == null) ? 0 : getWecharNum().hashCode());
        result = prime * result + ((getEdu() == null) ? 0 : getEdu().hashCode());
        result = prime * result + ((getFamousRemark() == null) ? 0 : getFamousRemark().hashCode());
        result = prime * result + ((getAskTotalTime() == null) ? 0 : getAskTotalTime().hashCode());
        result = prime * result + ((getOrderNum() == null) ? 0 : getOrderNum().hashCode());
        result = prime * result + ((getIsTjIndex() == null) ? 0 : getIsTjIndex().hashCode());
        result = prime * result + ((getTjIndexReason() == null) ? 0 : getTjIndexReason().hashCode());
        result = prime * result + ((getIsSupervisor() == null) ? 0 : getIsSupervisor().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsJoinListen() == null) ? 0 : getIsJoinListen().hashCode());
        result = prime * result + ((getOrderZan() == null) ? 0 : getOrderZan().hashCode());
        result = prime * result + ((getNohelpNum() == null) ? 0 : getNohelpNum().hashCode());
        result = prime * result + ((getOrderAns() == null) ? 0 : getOrderAns().hashCode());
        result = prime * result + ((getOrderAvaAnsTime() == null) ? 0 : getOrderAvaAnsTime().hashCode());
        result = prime * result + ((getWorkYears() == null) ? 0 : getWorkYears().hashCode());
        result = prime * result + ((getTempScene() == null) ? 0 : getTempScene().hashCode());
        result = prime * result + ((getLineDefaultContent() == null) ? 0 : getLineDefaultContent().hashCode());
        result = prime * result + ((getHomeAddress() == null) ? 0 : getHomeAddress().hashCode());
        result = prime * result + ((getConsultRoomType() == null) ? 0 : getConsultRoomType().hashCode());
        result = prime * result + ((getFaceConsultAddress() == null) ? 0 : getFaceConsultAddress().hashCode());
        result = prime * result + ((getSpecialPush() == null) ? 0 : getSpecialPush().hashCode());
        result = prime * result + ((getShowPosition() == null) ? 0 : getShowPosition().hashCode());
        result = prime * result + ((getYunClientId() == null) ? 0 : getYunClientId().hashCode());
        result = prime * result + ((getAgent() == null) ? 0 : getAgent().hashCode());
        result = prime * result + ((getFeeRate() == null) ? 0 : getFeeRate().hashCode());
        result = prime * result + ((getFeeRateWechat() == null) ? 0 : getFeeRateWechat().hashCode());
        result = prime * result + ((getOrganizeId() == null) ? 0 : getOrganizeId().hashCode());
        result = prime * result + ((getReferrer() == null) ? 0 : getReferrer().hashCode());
        result = prime * result + ((getIsTaobaoSunday() == null) ? 0 : getIsTaobaoSunday().hashCode());
        result = prime * result + ((getIsChatOnline() == null) ? 0 : getIsChatOnline().hashCode());
        result = prime * result + ((getSetOnlineTime() == null) ? 0 : getSetOnlineTime().hashCode());
        result = prime * result + ((getChatAutoReply() == null) ? 0 : getChatAutoReply().hashCode());
        result = prime * result + ((getJobCat() == null) ? 0 : getJobCat().hashCode());
        result = prime * result + ((getJobRemark() == null) ? 0 : getJobRemark().hashCode());
        result = prime * result + ((getRecApp() == null) ? 0 : getRecApp().hashCode());
        result = prime * result + ((getRecRemark() == null) ? 0 : getRecRemark().hashCode());
        result = prime * result + ((getGroup() == null) ? 0 : getGroup().hashCode());
        result = prime * result + ((getReplyViolate() == null) ? 0 : getReplyViolate().hashCode());
        result = prime * result + ((getPseudonym() == null) ? 0 : getPseudonym().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getAbilityLevel() == null) ? 0 : getAbilityLevel().hashCode());
        result = prime * result + ((getBusinessLevel() == null) ? 0 : getBusinessLevel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", name=").append(name);
        sb.append(", smallImage=").append(smallImage);
        sb.append(", head=").append(head);
        sb.append(", scene=").append(scene);
        sb.append(", bigImage=").append(bigImage);
        sb.append(", title=").append(title);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", hospitalName=").append(hospitalName);
        sb.append(", address=").append(address);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", departmentName=").append(departmentName);
        sb.append(", recommendIndex=").append(recommendIndex);
        sb.append(", serviceIndex=").append(serviceIndex);
        sb.append(", physicLevel=").append(physicLevel);
        sb.append(", isAllowConsult=").append(isAllowConsult);
        sb.append(", isShow=").append(isShow);
        sb.append(", isHot=").append(isHot);
        sb.append(", replyNum=").append(replyNum);
        sb.append(", fansNum=").append(fansNum);
        sb.append(", tag1=").append(tag1);
        sb.append(", tag2=").append(tag2);
        sb.append(", tag3=").append(tag3);
        sb.append(", imageIdcard=").append(imageIdcard);
        sb.append(", imageIdcardThumb=").append(imageIdcardThumb);
        sb.append(", imageIdcardBig=").append(imageIdcardBig);
        sb.append(", imageIdcardr=").append(imageIdcardr);
        sb.append(", imageIdcardrThumb=").append(imageIdcardrThumb);
        sb.append(", imageIdcardrBig=").append(imageIdcardrBig);
        sb.append(", imageProfessNo=").append(imageProfessNo);
        sb.append(", imageProfess=").append(imageProfess);
        sb.append(", imageProfessThumb=").append(imageProfessThumb);
        sb.append(", imageProfessBig=").append(imageProfessBig);
        sb.append(", imageEdu=").append(imageEdu);
        sb.append(", imageEduThumb=").append(imageEduThumb);
        sb.append(", imageEduBig=").append(imageEduBig);
        sb.append(", imageMarital=").append(imageMarital);
        sb.append(", imageTotal=").append(imageTotal);
        sb.append(", imageTotalThumb=").append(imageTotalThumb);
        sb.append(", imageTotalBig=").append(imageTotalBig);
        sb.append(", imageTrain=").append(imageTrain);
        sb.append(", imageTrainThumb=").append(imageTrainThumb);
        sb.append(", imageTrainBig=").append(imageTrainBig);
        sb.append(", feeStandard=").append(feeStandard);
        sb.append(", isAuth=").append(isAuth);
        sb.append(", wecharNum=").append(wecharNum);
        sb.append(", edu=").append(edu);
        sb.append(", famousRemark=").append(famousRemark);
        sb.append(", askTotalTime=").append(askTotalTime);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", isTjIndex=").append(isTjIndex);
        sb.append(", tjIndexReason=").append(tjIndexReason);
        sb.append(", isSupervisor=").append(isSupervisor);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isJoinListen=").append(isJoinListen);
        sb.append(", orderZan=").append(orderZan);
        sb.append(", nohelpNum=").append(nohelpNum);
        sb.append(", orderAns=").append(orderAns);
        sb.append(", orderAvaAnsTime=").append(orderAvaAnsTime);
        sb.append(", workYears=").append(workYears);
        sb.append(", tempScene=").append(tempScene);
        sb.append(", lineDefaultContent=").append(lineDefaultContent);
        sb.append(", homeAddress=").append(homeAddress);
        sb.append(", consultRoomType=").append(consultRoomType);
        sb.append(", faceConsultAddress=").append(faceConsultAddress);
        sb.append(", specialPush=").append(specialPush);
        sb.append(", showPosition=").append(showPosition);
        sb.append(", yunClientId=").append(yunClientId);
        sb.append(", agent=").append(agent);
        sb.append(", feeRate=").append(feeRate);
        sb.append(", feeRateWechat=").append(feeRateWechat);
        sb.append(", organizeId=").append(organizeId);
        sb.append(", referrer=").append(referrer);
        sb.append(", isTaobaoSunday=").append(isTaobaoSunday);
        sb.append(", isChatOnline=").append(isChatOnline);
        sb.append(", setOnlineTime=").append(setOnlineTime);
        sb.append(", chatAutoReply=").append(chatAutoReply);
        sb.append(", jobCat=").append(jobCat);
        sb.append(", jobRemark=").append(jobRemark);
        sb.append(", recApp=").append(recApp);
        sb.append(", recRemark=").append(recRemark);
        sb.append(", group=").append(group);
        sb.append(", replyViolate=").append(replyViolate);
        sb.append(", pseudonym=").append(pseudonym);
        sb.append(", level=").append(level);
        sb.append(", abilityLevel=").append(abilityLevel);
        sb.append(", businessLevel=").append(businessLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}